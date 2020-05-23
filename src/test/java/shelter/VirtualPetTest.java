package shelter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    void getPetName() {
        VirtualPet underTest = new VirtualPet("Tommy", "black cat with a fluffy tail", 7, 0, 0);
        String petName = underTest.getPetName();
        assertEquals("Tommy", petName);
    }

    @Test
    void getPetDescription() {
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
    public void shouldAdmitNewPetToArrayListWithDescriptionPlusBoredomHungerAndThirst() {
        //arrange
        //act
        //assert
    }

    @Test
    public void shouldRemovePetFromArrayListWhenAdopted() {
        //arrange
        //act
        //assert
    }

    @Test
    public void shouldDecreaseBoredomWhenPlayedWith() {
        //arrange
        //act
        //assert
    }

    @Test
    public void shouldDecreaseThirstForAllPetsWhenGivenWater() {
        //arrange
        //act
        //assert
    }

    @Test
    public void shouldDecreaseHungerForAllPetsWhenFed() {
        //arrange
        //act
        //assert
    }


    @Test
    void adoptPet() {
    }

    @Test
    void getHunger() {
    }

    @Test
    void getThirst() {
    }

    @Test
    void getBoredom() {
    }

    @Test
    void eat() {
    }

    @Test
    void drink() {
    }

    @Test
    void plays() {
    }
}