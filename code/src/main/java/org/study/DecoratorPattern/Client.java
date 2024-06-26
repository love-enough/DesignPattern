package org.study.DecoratorPattern;

public class Client {
    public static void main(String[] args) {
        Transform camaro;
        camaro = new Car();
        camaro.move();
        System.out.println("-------------------------");
        Robot bumblebee = new Robot(camaro);
        bumblebee.move();
        bumblebee.say();
        Airplane airplane = new Airplane(camaro);
        airplane.move();
        airplane.fly();
    }
}
