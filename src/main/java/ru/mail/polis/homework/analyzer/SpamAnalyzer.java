package ru.mail.polis.homework.analyzer;

public class SpamAnalyzer implements TextAnalyzer {
    private final String[] spamWords;

    public SpamAnalyzer(String[] spamWords) {
        this.spamWords = spamWords;
    }

    @Override
    public boolean successfullyAnalyzed(String text) {
        for (String word : spamWords) {
            if (text.contains(word)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public FilterType getAnalyzerType() {
        return FilterType.SPAM;
    }
}
