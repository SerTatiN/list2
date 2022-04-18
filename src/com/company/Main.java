package com.company;


public class Main {

    public static double sredArif(List list){
        int sred = 0;
        Node nodeTmp = list.getHead();
        while (nodeTmp != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        return (double) sred/6;
    }
    public static void main(String[] args) {
	 /*  Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(27);

        node1.setNextNode(node2);
        node2.setNextNode(node3);
        node3.setNextNode(node4);

        List list1 = new List(node1);
       // list1.printList();
        list1.push(-4);
       // list1.printList();
        list1.push(1000,15);
       // list1.printList();
        list1.push(18,0);
         list1.printList();
        list1.pop(0);
        list1.printList();*/


//        System.out.println(node1.getValue());
//        System.out.println(node1.getNextNode().getValue());
//        System.out.println(node1.getNextNode().getNextNode().getValue());
        Node node1 = new Node(5);
        List list = new List(node1);
        for (int i = 0; i < 6; i++){
            list.push((int) (Math.random() *25));
        }

        System.out.println(sredArif(list));
    }


}
