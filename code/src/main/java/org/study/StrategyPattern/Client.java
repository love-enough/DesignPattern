package org.study.StrategyPattern;

public class Client {
    public static void main(String[] args) {
        int[] arr = {1,4,6,2,5,3,7,10,9};
        int[] result;
        ArrayHandler ah = new ArrayHandler();

        Sort sort;
        sort = new BubbleSort();

        ah.setSortObj(sort);
        result = ah.sort(arr);

        for (int j : result)
            System.out.println(j + ",");
    }
}
