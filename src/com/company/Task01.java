package com.company;

public class Task01 {

    public static double sredArif(List list){
        Node nodeTmp = list.getHead();
        int sum = 0;
        int count = 0;
        while (nodeTmp != null) {
            sum += nodeTmp.getValue();
            count++;
            nodeTmp = nodeTmp.getNextNode();
            System.out.println(count + " " + sum);
        }
        return (double) sum/count;
    }
}
