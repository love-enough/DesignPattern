package org.study.FactoryMethodPattern;

public class HisenseFactory implements TVFactory{

    @Override
    public TV produceTV() {
        System.out.println("海信电视机工厂正在生产海信电视机");
        return new HisenseTV();
    }
}
