package Project;

import java.util.*;

class HuffmanTree {
    private final Map<Character, String> charToCode = new HashMap<>();

    public Node buildTree(Map<Character, Integer> frequencyMap) {
        PriorityQueue<Node> queue = new PriorityQueue<>();

        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            queue.add(new Node(entry.getKey(), entry.getValue()));
        }

        while (queue.size() > 1) {
            Node left = queue.poll();
            Node right = queue.poll();
            Node parent = new Node('\0', left.frequency + right.frequency);
            parent.left = left;
            parent.right = right;
            queue.add(parent);
        }

        return queue.poll();
    }

    public void generateCodes(Node root, String code) {
        if (root.isLeaf()) {
            charToCode.put(root.character, code);
        } else {
            generateCodes(root.left, code + "0");
            generateCodes(root.right, code + "1");
        }
    }

    public Map<Character, String> getCharToCode() {
        return charToCode;
    }
}
