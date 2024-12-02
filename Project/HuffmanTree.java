package Project;

import java.util.*;

class HuffmanTree {
    private final Map<Character, String> charToCode = new HashMap<>();
    private final Map<String, Character> codeToChar = new HashMap<>();

    // Построение дерева
    public Node buildTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        // Создание узлов для каждого символа
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        // Построение дерева
        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node parent = new Node('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            queue.add(parent);
        }

        return queue.poll(); // Корень дерева
    }

    // Генерация кодов
    public void generateCodes(Node root, String code) {
        if (root.isLeaf()) {
            charToCode.put(root.character, code);
            codeToChar.put(code, root.character);
        } else {
            generateCodes(root.left, code + "0");
            generateCodes(root.right, code + "1");
        }
    }

    public Map<Character, String> getCharToCode() {
        return charToCode;
    }

    public Map<String, Character> getCodeToChar() {
        return codeToChar;
    }
}
