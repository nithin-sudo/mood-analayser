package com.bridgelabz.moodanalyser;

public class MoodAnalyser
{
    private String message;
    /**
     * Constructor for the class with parameter
     * @param message
     */
    public MoodAnalyser(String message)
    {
        this.message = message;
    }
    /**
     * Ability to check the given string in the given message.
     * @return
     */
    public String analyseMood() {
        if (message.contains("Sad")) {
            return "SAD";
        } else {
            return "HAPPY";
        }
    }
}
