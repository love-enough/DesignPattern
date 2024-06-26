package org.study.CompositePattern;

import java.util.ArrayList;

public class Plate extends MyElement{

    private ArrayList<Object> list = new ArrayList<Object>();

    public void add(MyElement element) {
        list.add(element);
    }

    public void remove(MyElement element) {
        list.remove(element);
    }
    @Override
    public void eat() {
        for (Object object : list) {
            ((MyElement)object).eat();
        }
    }
}
