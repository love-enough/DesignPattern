package org.study.InterpreterPattern;

public class ValueNode implements Node{

    private int value;
    public ValueNode(int value) {
        this.value = value;
    }
    @Override
    public int interpret() {
        return this.value;
    }
}
