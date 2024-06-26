package org.study.SimpleFactoryPattern;

public class TVFactory {

    public static TV produceTV(String brand) throws Exception {
        if(brand.equalsIgnoreCase("Haier")) {
            System.out.println("电视机工厂正在生产海尔电视机");
            return new HaierTV();
        } else if (brand.equalsIgnoreCase("Hisense")) {
            System.out.println("电视机工厂正在生产海信电视机");
            return new HisenseTV();
        } else {
            throw new Exception("暂不生产该电视机");
        }
    }
}
