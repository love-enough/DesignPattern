package org.study.AbstractFactoryPattern;

public class HaierTelevision implements Television{

    @Override
    public void play() {
        System.out.println("海尔电视机播放中......");
    }
}
