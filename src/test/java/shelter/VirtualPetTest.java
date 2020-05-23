package shelter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class VirtualPetTest {
    @Test
    public void shouldHaveADefaultHungerOf5() {
        VirtualPet underTest = new VirtualPet("",5,0,0);
        int hungerMeter = underTest.getHunger();
        assertEquals(5, hungerMeter);
    }
    @Test
    public void shouldHaveADefaultHungerOf7() {
        VirtualPet underTest = new VirtualPet("",7,0,0);
        int hungerMeter = underTest.getHunger();
        assertEquals(7, hungerMeter);
    }
    @Test
    public void shouldHaveADefaultThirstOf5() {
        VirtualPet underTest = new VirtualPet("",7,5,0);
        int thirstMeter = underTest.getThirst();
        assertEquals(5, thirstMeter);
    }
    @Test
    public void shouldHaveADefaultThirstOf4() {
        VirtualPet underTest = new VirtualPet("",7, 4,0);
        int thirstMeter = underTest.getThirst();
        assertEquals(4, thirstMeter);
    }
    @Test
    public void shouldHaveADefaultBoredomOf2() {
        VirtualPet underTest = new VirtualPet("",7, 4,2);
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



}
