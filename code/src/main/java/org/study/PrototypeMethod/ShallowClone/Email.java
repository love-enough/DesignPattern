package org.study.PrototypeMethod.ShallowClone;

public class Email implements Cloneable{
    private Attachment attachment = null;

    public Email() {
        this.attachment = new Attachment();
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Email clone = null;
        clone = (Email) super.clone();
        return clone;
    }

    public Attachment getAttachment() {
        return this.attachment;
    }

    public void display() {
        System.out.println("查看邮件");
    }
}
