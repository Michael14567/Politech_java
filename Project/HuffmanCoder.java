package Project;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

class HuffmanCoder {
    private final HuffmanTree tree = new HuffmanTree();

    public void encode(String inputFile, String outputFile) throws IOException {
        String text = new String(Files.readAllBytes(Paths.get(inputFile)));
        Map<Character, Integer> frequencyMap = buildFrequencyMap(text);

        Node root = tree.buildTree(frequencyMap);
        tree.generateCodes(root, "");

        StringBuilder encodedText = new StringBuilder();
        for (char c : text.toCharArray()) {
            encodedText.append(tree.getCharToCode().get(c));
        }

        try (DataOutputStream out = new DataOutputStream(new FileOutputStream(outputFile))) {
            out.writeUTF(frequencyMap.toString());
            out.writeUTF(encodedText.toString());
        }
    }

    public void decode(String inputFile, String outputFile) throws IOException {
        try (DataInputStream in = new DataInputStream(new FileInputStream(inputFile))) {
            // Читаем закодированные данные
            String frequencyMapString = in.readUTF();
            String encodedText = in.readUTF();
    
            // Восстанавливаем карту частот из строки
            Map<Character, Integer> frequencyMap = parseFrequencyMap(frequencyMapString);
    
            // Построение дерева Хаффмана
            Node root = tree.buildTree(frequencyMap);
    
            // Декодируем текст
            StringBuilder decodedText = new StringBuilder();
            Node current = root;
    
            for (char bit : encodedText.toCharArray()) {
                if (current == null) {
                    throw new IllegalStateException("Некорректная структура дерева Хаффмана");
                }
    
                current = (bit == '0') ? current.left : current.right;
    
                if (current != null && current.isLeaf()) {
                    decodedText.append(current.character);
                    current = root;
                }
            }
    
            // Сохраняем раскодированный текст в файл
            Files.write(Paths.get(outputFile), decodedText.toString().getBytes());
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
        // Реализация парсинга
        return frequencyMap;
    }
}
