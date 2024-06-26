package org.study.ProxyMethod;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

interface House {
    void request(int area);
}

class RealHouse implements House {

    @Override
    public void request(int area) {
        if(area > 100)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}

class HouseProxy implements House {

    private RealHouse realHouse;
    @Override
    public void request(int area) {
        if(realHouse == null)
            realHouse = new RealHouse();
        realHouse.request(area);
    }
}

public class code {
    public static void main(String[] args) {
        House proxy = new HouseProxy();
        Scanner scanner = new Scanner(System.in);
        int count = scanner.nextInt();
        scanner.nextLine();
        for(int i = 0; i < count; ++i) {
            int area = scanner.nextInt();
            proxy.request(area);
        }
        scanner.close();
    }
}
