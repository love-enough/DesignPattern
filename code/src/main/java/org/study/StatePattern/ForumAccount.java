package org.study.StatePattern;

public class ForumAccount {
    private AbstractState state;
    private String name;
    public ForumAccount(String name) {
        this.name = name;
        System.out.println(this.name + "注册成功!");
        System.out.println("------------------------");
    }

    public AbstractState getState() {
        return state;
    }

    public void setState(AbstractState state) {
        this.state = state;
    }

    public String getName() {
        return name;
    }

    public void downloadFile(int score) {
        state.downloadFile(score);
    }

    public void writeNote(int score) {
        state.writeNote(score);
    }

    public void replyNote(int score) {
        state.replyNote(score);
    }
}
