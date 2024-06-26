package org.study.FactoryMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FactoryMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BlockFactorySystem factorySystem = new BlockFactorySystem();
        int productCount = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < productCount; ++i) {
            String[] productionInfo = scanner.nextLine().split(" ");
            String blockType = productionInfo[0];
            int quantity = Integer.parseInt(productionInfo[1]);
            if(blockType.equals("Circle")) {
                factorySystem.produceBlocks(new CircleBlockFactory(), quantity);
            } else if(blockType.equals("Square")) {
                factorySystem.produceBlocks(new SquareBlockFactory(), quantity);
            }
        }
    }
}
class BlockFactorySystem {
    private List<Block> blocks = new ArrayList<>();

    public void produceBlocks(BlockFactory factory, int quantity) {

        for(int i = 0; i < quantity; ++i) {
            Block block = factory.createBlock();
            blocks.add(block);
            block.produce();
        }
    }

    public List<Block> getBlocks() {
        return blocks;
    }
}
