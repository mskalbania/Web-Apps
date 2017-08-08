package com.word;

public class WordsResponse {

    private Integer lettersCount;
    private Integer wordsCount;

    public WordsResponse() {
    }

    public WordsResponse(Integer lettersCount, Integer wordsCount) {
        this.lettersCount = lettersCount;
        this.wordsCount = wordsCount;
    }

    public Integer getLettersCount() {
        return lettersCount;
    }

    public void setLettersCount(Integer lettersCount) {
        this.lettersCount = lettersCount;
    }

    public Integer getWordsCount() {
        return wordsCount;
    }

    public void setWordsCount(Integer wordsCount) {
        this.wordsCount = wordsCount;
    }
}
