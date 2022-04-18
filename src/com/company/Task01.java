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
    public static List task04(List list){
        Node nodeTmp = list.getHead();//первый
        Node nodeTmp1 = list.getHead();
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();// предпоследний
        }
        list.push(nodeTmp.getValue(),0);
        list.pop(1);
        list.pop();
        list.push(nodeTmp1.getValue());

        return list;
    }
    public static int task05(StringList list) {
        StringNode temp = list.getHead();
        int couter = 0;
        while (temp != null ) {
            if (temp.getValue().charAt(0) == temp.getValue().charAt(temp.getValue().length()-1)) {
                couter ++;
                System.out.println(temp.getValue());
            }
            temp = temp.getNextNode();
        }
        return couter;
    }
//    public static List Task04(List list){
//        Node nodeTmp1 = list.getHead();//первый
//        Node nodeTmp = list.getHead();
//        while (nodeTmp.getNextNode().getNextNode() != null) {
//            nodeTmp = nodeTmp.getNextNode();// предпоследний
//        }
//        Node nodeTmp2 = nodeTmp.getNextNode(); //последний
//        nodeTmp2.setNextNode(nodeTmp1);
//        nodeTmp1.setNextNode(null);
//        list.setHead(nodeTmp2);
//
//        return list;
//    }
}
