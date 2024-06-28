package org.study.TemplateMethodPattern;

public class Deposit extends BankTemplateMethod{
    public void transact() {
        System.out.println("存款");
    }
}
