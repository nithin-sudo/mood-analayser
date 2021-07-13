package com.bridgelabz.moodanalyser;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest
{
    @Test
    public void givenMessage_WhenSad_ShouldReturn_Sad() throws MoodAnalyserException{
        MoodAnalyser moodAnalyser = new MoodAnalyser("I am in Sad Mood");
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("SAD", mood);
    }
    @Test
    public void givenMessage_whenNotSad_shouldReturn_Happy()throws MoodAnalyserException {
        MoodAnalyser moodAnalyser = new MoodAnalyser(null);
        String mood = moodAnalyser.analyseMood();
        Assertions.assertEquals("HAPPY", mood);
    }
    @Test
    public void givenMessage_whenNull_shouldThrow_MoodAnalysisException() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser(null);
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals("Invalid", e.getMessage());
        }
    }
    @Test
    public void givenMessage_whenEmpty_shouldReturn_Null() {
        try {
            MoodAnalyser moodAnalyser = new MoodAnalyser("");
            moodAnalyser.analyseMood();
        } catch (MoodAnalyserException e) {
            Assertions.assertEquals(MoodAnalyserException.ExceptionType.ENTERED_EMPTY, e.exceptionType);
        }
    }
}

