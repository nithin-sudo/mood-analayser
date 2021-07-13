package com.bridgelabz.moodanalyser;

public class MoodAnalyser
{
    /**
     * Ability to check the given string in the given message
     * @param message
     * @return
     */
    public String analyseMood(String message) {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
