package org.study.AdapterMethod;

import java.lang.reflect.Type;
import java.util.Scanner;

interface USB {
    void charge();
}

interface TypeC {
    void chargeWithTypeC();
}

class TypeCAdapter implements USB {
    private TypeC typeC;

    public TypeCAdapter(TypeC typeC) {
        this.typeC = typeC;
    }

    @Override
    public void charge() {
        typeC.chargeWithTypeC();
    }
}

class NewComputer implements TypeC {

    @Override
    public void chargeWithTypeC() {
        System.out.println("TypeC");
    }
}

class AdapterCharger implements USB {
    @Override
    public void charge() {
        System.out.println("USB Adapter");
    }
}

public class code {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < count; ++i) {
            int choice = scanner.nextInt();
            if(choice == 1) {
                TypeC newComputer = new NewComputer();
                newComputer.chargeWithTypeC();
            } else if( choice == 2) {
                USB usbAdapter = new AdapterCharger();
                usbAdapter.charge();
            }
        }
        scanner.close();
    }
}
