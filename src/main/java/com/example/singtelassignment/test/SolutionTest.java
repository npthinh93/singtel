package com.example.singtelassignment.test;

import com.example.singtelassignment.model.Bird;
import com.example.singtelassignment.model.Chicken;
import com.example.singtelassignment.model.Duck;
import com.example.singtelassignment.model.Rooster;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class SolutionTest {
    private Bird bird;
    private Chicken chicken;
    private Duck duck;
    private Rooster rooster;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @Before
    public void before() {
        System.setOut(new PrintStream(outContent));
        bird = new Bird();
        chicken = new Chicken();
        duck = new Duck();
        rooster = new Rooster();
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

    @Test
    public void testDuckSound() {
        duck.sound();
        Assert.assertEquals("Quack, quack\n", outContent.toString());
    }

    @Test
    public void testDuckSwim() {
        duck.swim();
        Assert.assertEquals("I am swimming\n", outContent.toString());
    }

    @Test
    public void testChickenSound() {
        chicken.sound();
        Assert.assertEquals("Cluck, cluck\n", outContent.toString());
    }

    @Test
    public void testRoosterSound() {
        rooster.sound();
        Assert.assertEquals("Cock-a-doodle-doo\n", outContent.toString());
    }

}
