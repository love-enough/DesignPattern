package org.study.ObserverPattern;

public class Client {
    public static void main(String[] args) {
        MySubject subject = new Cat();

        MyObserver obs1, obs2, obs3, obs4;
        obs1 = new Mouse();
        obs2 = new Mouse();
        obs3 = new Dog();
        obs4 = new Pig();

        subject.attach(obs1);
        subject.attach(obs2);
        subject.attach(obs3);
        subject.attach(obs4);

        subject.cry();
    }
}
