package org.study.SimpleFactoryPattern;

public class Client {
    public static void main(String[] args) throws Exception {
        TV tv = TVFactory.produceTV("Haier");
        tv.play();
    }
}
