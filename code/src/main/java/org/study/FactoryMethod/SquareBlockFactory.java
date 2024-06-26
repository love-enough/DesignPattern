package org.study.FactoryMethod;

public class SquareBlockFactory implements BlockFactory{

    @Override
    public Block createBlock() {
        return new SquareBlock();
    }
}
