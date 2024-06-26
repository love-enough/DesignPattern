package org.study.ProxyMethod;


interface Subject {
    void request();
}

class RealSubject implements Subject {

    @Override
    public void request() {
        System.out.println("RealSubject handles the request");
    }
}

class Proxy implements Subject {
    private RealSubject realSubject;

    @Override
    public void request() {
        if(realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
public class example {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
