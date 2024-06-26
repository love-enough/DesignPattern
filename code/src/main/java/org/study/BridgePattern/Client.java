package org.study.BridgePattern;

public class Client {
    public static void main(String[] args) {
        Color color;
        Pen pen;

        color = new Black();
        pen = new BigPen();
        pen.setColor(color);
        pen.draw("鲜花");
    }
}
