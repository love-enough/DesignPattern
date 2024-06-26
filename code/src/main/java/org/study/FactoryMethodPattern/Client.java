package org.study.FactoryMethodPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        TV tv;
        TVFactory factory = new HaierFactory();
        tv =  factory.produceTV();
        tv.play();
    }
}
