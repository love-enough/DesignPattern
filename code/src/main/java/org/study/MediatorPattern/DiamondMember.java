package org.study.MediatorPattern;

public class DiamondMember extends Member{

    public DiamondMember(String name) {
        super(name);
    }

    @Override
    public void sendText(String to, String message) {
        System.out.println("钻石会员发送信息：");
        chatroom.sendText(name, to, message);
    }

    @Override
    public void sendImage(String to, String image) {
        System.out.println("普通会员发送图片：");
        chatroom.sendText(name, to, image);
    }
}
