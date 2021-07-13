package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenNotSad_shouldReturn_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in any Mood"); //passed message to constructor
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
}
