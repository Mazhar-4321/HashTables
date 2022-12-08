package com.company;

public class Main {
    private HashTable<String, Integer> hashTable = new HashTable<>();

    public static void main(String[] args) {
        System.out.println("Welcome To HashTables Program");
        String sentence = "To be or to not be";
        Main main = new Main();
        main.splitAndFindFrequencyOfWords(sentence);

    }

    private void splitAndFindFrequencyOfWords(String sentence) {
        String[] words = sentence.toLowerCase().split(" ");
        for (String word : words) {
            if (hashTable.get(word) == null) {
                hashTable.add(word, 1);
            } else {
                hashTable.add(word, hashTable.get(word) + 1);
            }
        }
        printFrequencyOfWords(words);
    }

    private void printFrequencyOfWords(String[] words) {
        for (String word : words){
            System.out.println(word+"="+hashTable.get(word));
        }
    }
}
