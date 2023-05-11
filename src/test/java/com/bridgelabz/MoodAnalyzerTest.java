package com.bridgelabz;
import static org.junit.Assert.*;

import org.junit.Test;

public class MoodAnalyzerTest {
    static MoodAnalyzer mood;


    @Test
    public void testAnalyseAbilityMethod_thenAssertionHappy() {
        mood = new MoodAnalyzer("I am in Happy Mood");
        assertEquals("HAPPY", mood.analyseability());
        System.out.println("UC1: Test Case For Happy Passed");
    }

    @Test
    public void testAnalyseAbilityMethod_thenAssertionSad() {
        mood = new MoodAnalyzer("I am in Sad Mood");
        assertEquals("SAD", mood.analyseability());
        System.out.println("UC1: Test Case For Sad Passed");

    }

    @Test
    public void testgivenNullMoodShouldReturnHaappy_thenAssertionHappy() {
        mood = new MoodAnalyzer();
        assertEquals("HAPPY", mood.analyseability());
        System.out.println("UC2: Null PointerException Handling Test Case Passed");
    }
}
