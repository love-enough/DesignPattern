package org.study.StatePattern;

public class PrimaryState extends AbstractState{

    public PrimaryState(AbstractState state) {
        this.acc = state.acc;
        this.point = state.getPoint();
        this.stateName = "新手";
    }

    public PrimaryState(ForumAccount acc) {
        this.point = 0;
        this.acc = acc;
        this.stateName = "新手";
    }

    @Override
    protected void checkState(int score) {

    }
}
