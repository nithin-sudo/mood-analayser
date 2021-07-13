package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood("I am in Sad Mood");
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenNotSad_shouldReturn_Happy() {
        MoodAnalyser moodAnalyser = new MoodAnalyser(); 
        String mood = moodAnalyser.analyseMood("I am in any Mood");
        Assertions.assertEquals("HAPPY", mood);
    }
}
