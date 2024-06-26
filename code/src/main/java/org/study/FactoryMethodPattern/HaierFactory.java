package org.study.FactoryMethodPattern;

public class HaierFactory implements TVFactory{

    @Override
    public TV produceTV() {
        System.out.println("海尔电视机工厂正在生产海尔");
        return new HaierTV();
    }
}
