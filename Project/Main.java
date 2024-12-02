package Project;

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        if (args.length < 3) {
            System.out.println("Usage: java Main <encode/decode> <inputFile> <outputFile>");
            return;
        }

        HuffmanCoder coder = new HuffmanCoder();
        if (args[0].equalsIgnoreCase("encode")) {
            coder.encode(args[1], args[2]);
            System.out.println("Файл закодирован!");
        } else if (args[0].equalsIgnoreCase("decode")) {
            coder.decode(args[1], args[2]);
            System.out.println("Файл декодирован!");
        } else {
            System.out.println("Unknown command: " + args[0]);
        }
    }
}
