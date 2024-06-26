package org.study.PrototypeMethod.DeepClone;

import java.io.IOException;

public class Client {
    public static void main(String[] args) {
        Email email, copyEmail = null;
        email = new Email();
        try {
            copyEmail = (Email) email.deepClone();
        } catch (IOException | ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
        System.out.println("email == copyEmail?");
        System.out.println(email == copyEmail);

        System.out.println("email.getAttachment() == copyEmail.getAttachment()?");
        System.out.println(email.getAttachment() == copyEmail.getAttachment());
    }
}
