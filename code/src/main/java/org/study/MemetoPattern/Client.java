package org.study.MemetoPattern;

public class Client {
    public static void main(String[] args) {
        UserInfoDTO user = new UserInfoDTO();
        Caretaker c = new Caretaker();

        user.setAccount("zhangsan");
        user.setPassword("123456");
        user.setTelNo("123455670000");
        System.out.println("状态一:");
        user.show();
        c.setMemento(user.saveMemento());
        System.out.println("-------------------");
        user.setPassword("111111");
        user.setTelNo("13100000000");
        user.show();
        System.out.println("--------------------");
        user.restoreMemento(c.getMemento());
        System.out.println("回到状态一:");
        user.show();
        System.out.println("--------------------");
    }
}
