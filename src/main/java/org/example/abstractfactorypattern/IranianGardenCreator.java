package org.example.abstractfactorypattern;

public class IranianGardenCreator extends GardenFactory {
    @Override
    public Tree createTree() {
        return new Chenar();
    }

    @Override
    public Flower createFlower() {
        return new Khatmi();
    }
}
