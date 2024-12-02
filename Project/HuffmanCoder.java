package Project;

import java.io.*;
import java.util.*;

class HuffmanCoder {
    private final HuffmanTree tree = new HuffmanTree();

    public void encode(String inputFile, String outputFile) throws IOException {
        // Считываем текст
        String text = new String(Files.readAllBytes(new File(inputFile).toPath()));
        Map<Character, Integer> frequencyMap = buildFrequencyMap(text);

        // Построение дерева Хаффмана
        Node root = tree.buildTree(frequencyMap);
        tree.generateCodes(root, "");

        // Кодирование текста
        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(tree.getCharToCode().get(c));
        }

        // Запись данных в файл
        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(outputFile))) {
            out.writeUTF(frequencyMap.toString());
            out.writeUTF(encodedText.toString());
        }
    }

    public void decode(String inputFile, String outputFile) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(inputFile))) {
            String frequencyMap = in.readUTF();
            String encodedText = in.readUTF();

            // Декодирование
            Node root = tree.buildTree(parseFrequencyMap(frequencyMap));
            StringBuilder decodedText = new StringBuilder();
            Node current = root;
            for (char bit : encodedText.toCharArray()) {
                current = bit == '0' ? current.left : current.right;
                if (current.isLeaf()) {
                    decodedText.append(current.character);
                    current = root;
                }
            }

            // Запись результата
            Files.write(new File(outputFile).toPath(), decodedText.toString().getBytes());
        }
    }

    private Map<Character, Integer> buildFrequencyMap(String text) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        for (char c : text.toCharArray()) {
            frequencyMap.put(c, frequencyMap.getOrDefault(c, 0) + 1);
        }
        return frequencyMap;
    }

    private Map<Character, Integer> parseFrequencyMap(String mapString) {
        Map<Character, Integer> frequencyMap = new HashMap<>();
        // Реализация парсинга строки словаря
        return frequencyMap;
    }
}
