package org.study.VisitorPattern;

public class Apple implements Product{

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
