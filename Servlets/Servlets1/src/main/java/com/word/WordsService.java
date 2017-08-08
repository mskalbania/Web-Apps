package com.word;

import java.util.Arrays;
import java.util.Scanner;

public class WordsService {

    private String input;

    public WordsService(String input) {
        this.input = input;
    }

    public int countWords() {
        if (input != null) {
            int result = 0;
            Scanner sc = new Scanner(input);
            while (sc.hasNext()) {
                sc.next();
                result++;
            }
            return result;
        }
        return -1;
    }

    public int countLetters() {
        return Arrays
                .stream(input.split(" "))
                .reduce(0, (sum, word) -> sum += word.length(), (sum1, sum2) -> sum1 + sum2);
    }

}
