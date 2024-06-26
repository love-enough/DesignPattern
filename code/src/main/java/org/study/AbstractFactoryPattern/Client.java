package org.study.AbstractFactoryPattern;

public class Client {
    public static void main(String[] args) {
        EFactory factory = new TCLFactory();
        Television tv = factory.produceTelevision();
        tv.play();
        AirConditioner ac = factory.produceAirConditioner();
        ac.changeTemperature();
    }
}
