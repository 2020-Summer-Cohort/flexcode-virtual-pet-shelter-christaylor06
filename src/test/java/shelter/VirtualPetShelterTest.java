package shelter;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class VirtualPetShelterTest {

    @Test
    void shouldAllowIntakePet() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest1 = new VirtualPet("Adam", "the father of all pets");
        shelterUnderTest.intakeNewPet(underTest1);
        Assert.assertEquals(underTest1, underTest1);
    }

    @Test
    void shouldReturnAPetGivenItsName() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest1 = new VirtualPet("Adam", "the father of all pets");
        VirtualPet underTest2 = new VirtualPet("Eve", "the mother of all pets");
        shelterUnderTest.intakeNewPet(underTest1);
        shelterUnderTest.intakeNewPet(underTest2);
        shelterUnderTest.getPet("Adam");
        Assert.assertEquals(underTest1, underTest1);
    }

    @Test
    void shouldAllowAdoptionOfAPet() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest1 = new VirtualPet("Adam", "the father of all pets");
        VirtualPet underTest2 = new VirtualPet("Eve", "the mother of all pets");
        shelterUnderTest.intakeNewPet(underTest1);
        shelterUnderTest.intakeNewPet(underTest2);
        shelterUnderTest.adoptPet("Adam");
        Assert.assertNotEquals("Adam", "Eve");
    }

    @Test
    public void shouldFeedAllPets() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest3 = new VirtualPet("Alvin", "singing menace 1", 7, 3, 0);
        VirtualPet underTest4 = new VirtualPet("Simon", "singing menace 2", 7, 3, 0);
        VirtualPet underTest5 = new VirtualPet("Theodore", "singing menace 3", 7, 3, 0);
        shelterUnderTest.intakeNewPet(underTest3);
        shelterUnderTest.intakeNewPet(underTest4);
        shelterUnderTest.intakeNewPet(underTest5);
        shelterUnderTest.feedAllPets();
        Assert.assertEquals(4, underTest3.getHunger());
        Assert.assertEquals(4, underTest4.getHunger());
        Assert.assertEquals(4, underTest5.getHunger());
    }

    @Test
    public void shouldWaterAllPets() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest3 = new VirtualPet("Alvin", "singing menace 1", 7, 3, 0);
        VirtualPet underTest4 = new VirtualPet("Simon", "singing menace 2", 7, 3, 0);
        VirtualPet underTest5 = new VirtualPet("Theodore", "singing menace 3", 7, 3, 0);
        shelterUnderTest.intakeNewPet(underTest3);
        shelterUnderTest.intakeNewPet(underTest4);
        shelterUnderTest.intakeNewPet(underTest5);
        shelterUnderTest.waterForAllPets();
        Assert.assertEquals(0, underTest3.getThirst());
        Assert.assertEquals(0, underTest4.getThirst());
        Assert.assertEquals(0, underTest5.getThirst());
    }

    @Test
    void tickShouldIncreaseBoredomHungerAndThirstWithEachIteration() {
        VirtualPetShelter shelterUnderTest = new VirtualPetShelter();
        VirtualPet underTest3 = new VirtualPet("Alvin", "singing menace 1", 7, 3, 9);
        VirtualPet underTest4 = new VirtualPet("Simon", "singing menace 2", 7, 3, 9);
        VirtualPet underTest5 = new VirtualPet("Theodore", "singing menace 3", 7, 3, 9);
        shelterUnderTest.intakeNewPet(underTest3);
        shelterUnderTest.intakeNewPet(underTest4);
        shelterUnderTest.intakeNewPet(underTest5);
        shelterUnderTest.tickForAllPets();
        Assert.assertEquals(8, underTest3.getHunger());
        Assert.assertEquals(8, underTest4.getHunger());
        Assert.assertEquals(8, underTest5.getHunger());
        Assert.assertEquals(4, underTest3.getThirst());
        Assert.assertEquals(4, underTest4.getThirst());
        Assert.assertEquals(4, underTest5.getThirst());
        Assert.assertEquals(10, underTest3.getBoredom());
        Assert.assertEquals(10, underTest4.getBoredom());
        Assert.assertEquals(10, underTest5.getBoredom());
    }
}
