package shelter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    void shouldGetPetName() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 0, 0);
        String petName = underTest.getPetName();
        assertEquals("Tommy", petName);
    }

    @Test
    void shouldGetPetDescription() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 0, 0);
        String petDescription = underTest.getPetDescription();
        assertEquals("black cat with a fluffy tail", petDescription);
    }

    @Test
    public void shouldHaveADefaultHungerOf5() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 5, 0, 0);
        int hungerMeter = underTest.getHunger();
        assertEquals(5, hungerMeter);
    }

    @Test
    public void shouldHaveADefaultHungerOf7() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 0, 0);
        int hungerMeter = underTest.getHunger();
        assertEquals(7, hungerMeter);
    }

    @Test
    public void shouldHaveADefaultThirstOf5() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 5, 0);
        int thirstMeter = underTest.getThirst();
        assertEquals(5, thirstMeter);
    }

    @Test
    public void shouldHaveADefaultThirstOf4() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 4, 0);
        int thirstMeter = underTest.getThirst();
        assertEquals(4, thirstMeter);
    }

    @Test
    public void shouldHaveADefaultBoredomOf2() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 4, 2);
        int boredomMeter = underTest.getBoredom();
        assertEquals(2, boredomMeter);
    }

    @Test
    public void shouldDecreaseBoredomBy3WhenPlayedWith() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 4, 3);
        underTest.plays();
        int boredomMeter = underTest.getBoredom();
        assertEquals(0, boredomMeter);
    }

    @Test
    public void shouldDecreaseThirstForPetBy3WhenGivenWater() {
        VirtualPet underTest = new VirtualPet("Samantha", "Samantha?", 3, 4, 7);
        underTest.drink();
        int thirstMeter = underTest.getThirst();
        assertEquals(1, thirstMeter);
    }

    @Test
    public void shouldDecreaseHungerForPetBy3WhenFed() {
        VirtualPet underTest = new VirtualPet("Samantha", "Samantha?", 3, 4, 7);
        underTest.eat();
        int hungerMeter = underTest.getHunger();
        assertEquals(0, hungerMeter);
    }

}