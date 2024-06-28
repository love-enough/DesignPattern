package org.study.VisitorPattern;

public interface Product {
    void accept(Visitor visitor);
}
