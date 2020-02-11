package com.example.singtelassignment.test;

import com.example.singtelassignment.model.*;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

public class SolutionTest {
    private Bird bird;
    private Chicken chicken;
    private Duck duck;
    private Rooster rooster;
    private Shark shark;
    private Clownfish clownfish;
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    private Animal[] animals;
    private SolutionService solutionService;
    private Map<Language, String> roosterLangMap;

    @Before
    public void before() {
        System.setOut(new PrintStream(outContent));
        bird = new Bird();
        chicken = new Chicken();
        duck = new Duck();
        rooster = new Rooster();
        shark = new Shark();
        clownfish = new Clownfish();
        animals = new Animal[]{new Bird(),
                new Duck(),
                new Chicken(),
                new Rooster(),
                new Parrot(),
                new Fish(),
                new Shark(),
                new Clownfish(),
                new Dolphin(),
                new Frog(),
                new Dog(),
                Butterfly.instance(),
                new Cat()};
        solutionService = new SolutionService();
        roosterLangMap = new HashMap<>();
        roosterLangMap.put(Language.DEFAULT, "Cock-a-doodle-doo\n");
        roosterLangMap.put(Language.DANISH, "kykyliky\n");
        roosterLangMap.put(Language.DUTCH, "kukeleku\n");
        roosterLangMap.put(Language.FINNISH, "kukko kiekuu\n");
        roosterLangMap.put(Language.FRENCH, "cocorico\n");
        roosterLangMap.put(Language.GERMAN, "kikeriki\n");
        roosterLangMap.put(Language.GREEK, "kikiriki\n");
        roosterLangMap.put(Language.HEBREW, "coo-koo-ri-koo\n");
        roosterLangMap.put(Language.HUNGARIAN, "kukuriku\n");
        roosterLangMap.put(Language.ITALIAN, "chicchirichi\n");
        roosterLangMap.put(Language.JAPANESE, "ko-ke-kok-ko-o\n");
        roosterLangMap.put(Language.PORTUGUESE, "cucurucu\n");
        roosterLangMap.put(Language.RUSSIAN, "kukareku\n");
        roosterLangMap.put(Language.SWEDISH, "kuckeliku\n");
        roosterLangMap.put(Language.TURKISH, "kuk-kurri-kuuu\n");
        roosterLangMap.put(Language.URDU, "kuklooku\n");
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

    @Test
    public void testParrotSoundWithDog() {
        Parrot parrot = new Parrot(new Dog());
        parrot.sound();
        Assert.assertEquals("Woof, woof\n", outContent.toString());
    }

    @Test
    public void testParrotSoundWithCat() {
        Parrot parrot = new Parrot(new Cat());
        parrot.sound();
        Assert.assertEquals("Meow\n", outContent.toString());
    }

    @Test
    public void testParrotSoundWithRooster() {
        Parrot parrot = new Parrot(new Rooster());
        parrot.sound();
        Assert.assertEquals("Cock-a-doodle-doo\n", outContent.toString());
    }

    @Test
    public void testSharkSize() {
        Assert.assertEquals("large", shark.getSize());
    }

    @Test
    public void testSharkColor() {
        Assert.assertEquals("grey", shark.getColor());
    }

    @Test
    public void testClownfishSize() {
        Assert.assertEquals("small", clownfish.getSize());
    }

    @Test
    public void testClownfishColor() {
        Assert.assertEquals("orange", clownfish.getColor());
    }

    @Test
    public void testClownfishIsJoke() {
        Assert.assertTrue(clownfish.isJoke());
    }

    @Test
    public void testSharkIsEatFish() {
        Assert.assertTrue(shark.isEatFish());
    }

    @Test
    public void testCaterpillarWalk() {
        Caterpillar.instance().walk();
        Assert.assertEquals("I am walking\n", outContent.toString());
    }

    @Test
    public void testCaterpillarUpdateToButterfly() {
        ButterflyContext butterflyContext = new ButterflyContext(Caterpillar.instance());
        butterflyContext.update();
        MetamorphosisState butterflyState = butterflyContext.getMetamorphosisState();
        Assert.assertTrue(butterflyState instanceof Butterfly);
    }

    @Test
    public void countingFlyAnimals() {
        Assert.assertEquals(2, solutionService.countAnimalCanFly(animals));
    }

    @Test
    public void countingWalkAnimals() {
        Assert.assertEquals(2, solutionService.countAnimalCanWalk(animals));
    }

    @Test
    public void countingSingAnimals() {
        Assert.assertEquals(1, solutionService.countAnimalCanSing(animals));
    }

    @Test
    public void countingSwimAnimals() {
        Assert.assertEquals(6, solutionService.countAnimalCanSwim(animals));
    }

    @Test
    public void testLanguageForRoosterFunny() {
        Stream.of(Language.values()).forEach(language -> {
            Rooster rooster = new Rooster(language);
            rooster.sound();
            Assert.assertEquals(roosterLangMap.get(language), outContent.toString());
            outContent.reset();
        });
    }
}
