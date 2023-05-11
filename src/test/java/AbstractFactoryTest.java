import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
// importing GardenFactory, IranianGardenGene
import org.example.abstractfactorypattern.AbstractGardenCreator.*;

public class AbstractFactoryTest {
    @Test
    public void testCreateChenarTree() {
        GardenFactory gardenFactory = new IranianGardenCreator();
        Tree chenarTree = gardenFactory.createTree();
        Assertions.assertEquals("Chenar", chenarTree.getType());
    }

    @Test
    public void testCreateJ1Tree() {
        GardenFactory gardenFactory = new JapaneseGardenCreator();
        Tree j1Tree = gardenFactory.createTree();
        Assertions.assertEquals("J1", j1Tree.getType());
    }

    @Test
    public void testCreateKhatmiFlower() {
        GardenFactory gardenFactory = new IranianGardenCreator();
        Flower khatmiFlower = gardenFactory.createFlower();
        Assertions.assertEquals("Khatmi", khatmiFlower.getType());
    }

    @Test
    public void testCreateG1Flower() {
        GardenFactory gardenFactory = new JapaneseGardenCreator();
        Flower g1Flower = gardenFactory.createFlower();
        Assertions.assertEquals("G1", g1Flower.getType());
    }
}

