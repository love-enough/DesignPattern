package org.study.TemplateMethodPattern;

public class Transfer extends BankTemplateMethod{

    @Override
    public void transact() {
        System.out.println("转账");
    }
}
