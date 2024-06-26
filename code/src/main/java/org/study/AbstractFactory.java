package org.study;

import java.util.Scanner;

interface Chair {
    void showInfo();
}

class ModernChair implements Chair {

    @Override
    public void showInfo() {
        System.out.println("modern chair");
    }
}

class CLassicalChair implements Chair {

    @Override
    public void showInfo() {
        System.out.println("classical chair");
    }
}

interface Sofa {
    void displayInfo();
}

class ModernSofa implements Sofa {

    @Override
    public void displayInfo() {
        System.out.println("modern sofa");
    }
}

class ClassicalSofa implements Sofa {

    @Override
    public void displayInfo() {
        System.out.println("classical sofa");
    }
}

interface FurnitureFactory {
    Chair createChair();
    Sofa createSofa();
}

class ModernFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new ModernChair();
    }

    @Override
    public Sofa createSofa() {
        return new ModernSofa();
    }
}

class ClassicalFurnitureFactory implements FurnitureFactory {

    @Override
    public Chair createChair() {
        return new CLassicalChair();
    }

    @Override
    public Sofa createSofa() {
        return new ClassicalSofa();
    }
}


public class AbstractFactory {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        FurnitureFactory classicalFurnitureFactory = new ClassicalFurnitureFactory();
        FurnitureFactory modernFurnitureFactory = new ModernFurnitureFactory();

        int N = scanner.nextInt();
        scanner.nextLine();

        for(int i = 0; i < N; ++i) {
            String furnitureType = scanner.nextLine();
            FurnitureFactory factory = (furnitureType.equals("modern")) ? modernFurnitureFactory : classicalFurnitureFactory;
            Chair chair = factory.createChair();
            Sofa sofa = factory.createSofa();

            chair.showInfo();
            sofa.displayInfo();
        }
    }
}
