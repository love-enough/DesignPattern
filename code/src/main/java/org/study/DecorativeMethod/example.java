package org.study.DecorativeMethod;

interface Component {
    void operation();
}

class ConcreteComponent implements Component {

    @Override
    public void operation() {
        System.out.println("ConcreteComponent operation");
    }
}

abstract class Decorator implements Component {
    protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }

    @Override
    public void operation() {
        component.operation();
    }
}

class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operation() {
        System.out.println("Before operation in ConcreteDecorator");
        super.operation();
        System.out.println("After operation in ConcreteDecorator");    }
}

public class example {
    public static void main(String[] args) {
        Component concreteComponent = new ConcreteComponent();
        Decorator decorator = new ConcreteDecorator(concreteComponent);
        decorator.operation();
    }
}
