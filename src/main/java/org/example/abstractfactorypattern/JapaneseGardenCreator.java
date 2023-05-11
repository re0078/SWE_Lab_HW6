package org.example.abstractfactorypattern;

public class JapaneseGardenCreator extends GardenFactory {
    @Override
    public Tree createTree() {
        return new J1();
    }

    @Override
    public Flower createFlower() {
        return new G1();
    }
}
