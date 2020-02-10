package com.example.singtelassignment.test;

import com.example.singtelassignment.model.Bird;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionTest {
    private Bird bird;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void before() {
        System.setOut(new PrintStream(outContent));
        bird = new Bird();
    }

    @After
    public void after() {
        System.setOut(originalOut);
    }

    @Test
    public void testBirdWalk() {
        bird.walk();
        Assert.assertEquals("I am walking\n", outContent.toString());
    }

    @Test
    public void testBirdFly() {
        bird.fly();
        Assert.assertEquals("I am flying\n", outContent.toString());
    }

    @Test
    public void testBirdSing() {
        bird.sing();
        Assert.assertEquals("I am singing\n", outContent.toString());
    }
}
