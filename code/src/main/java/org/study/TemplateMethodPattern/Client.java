package org.study.TemplateMethodPattern;

public class Client {
    public static void main(String[] args) {
        BankTemplateMethod bank;
        bank = new Transfer();
        bank.process();
        System.out.println("-----------------------");
    }
}
