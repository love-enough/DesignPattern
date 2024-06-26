package org.study.AdapterMethod;

interface Target {
    void request();
}

class Adaptee {
    void specificRequest() {
        System.out.println("Specific request");
    }
}

class Adapter implements Target {
    private Adaptee adaptee;

    public Adapter(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void request() {
        adaptee.specificRequest();
    }
}

public class example {

    public static void main(String[] args) {
        Target target = new Adapter(new Adaptee());
        target.request();
    }
}
