package com.bridgelabz;

public class MoodAnalyzer {
    String message;

    public MoodAnalyzer() {
    }

    public MoodAnalyzer(String message) {
        super();
        this.message = message;
    }

    public String analyseability() {
        if (message.contains("Sad"))
            return "SAD";
        return "HAPPY";
    }
}
