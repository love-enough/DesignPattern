package org.study.FactoryMethod;

public class CircleBlockFactory implements BlockFactory{

    @Override
    public Block createBlock() {
        return new CircleBlock();
    }
}
