package org.study.FlyweightPattern.example2;

import java.io.StringReader;

public class Hub implements NetworkDevice{

    private String type;

    public Hub(String type) {
        this.type = type;
    }
    @Override
    public String getType() {
        return this.type;
    }

    @Override
    public void use(Port port) {
        System.out.println("Linked by Hub, type is " + this.type + ", port is " + port.getPort());
    }
}
