package com.company;

public class Main {


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

       /* Node node1 = new Node(5);
        List list = new List(node1);
        for (int i = 0; i < 6; i++){
            list.push((int) (Math.random() *25));
        }*/

       int[] array = new int[] {18, 43, 100, 4, 24, 6, 63};

        Node node1 = new Node(array[0]);
        List list = new List(node1);
        for (int i = 1; i < array.length; i++) {
            list.push(array[i]);
        }

       list.printList();
        System.out.println();
      //  System.out.println(Task01.sredArif(list));
        Task01.task041(list);
        list.printList();
        System.out.println();
        Task01.task2(list);
        list.printList();
        System.out.println(list.getLength());
        ListIterator lstI = new ListIterator(list);
//        while (lstI.hasNext()) {
//            System.out.println(lstI.next().getValue());
//        }
   //     lstI.forEachRemaining((node) -> System.out.println(node.getValue()));
        System.out.println(TasksIterator.task1(lstI));
       // String[] аrrayOfStrings = {"tube", "tube", "tube","alabama", "africa", "tube", "africau", "arctica", "arambler", "africa","tube"};
        // String[] arrayOfStrings = {"банк", "банан", "банка", "банкир", "банкирша" };
        String[] arrayOfStrings = {"станция", "станция", "станция"};
        // String[] arrayOfStrings = {"станция", "стационар", "станционный"};
        StringNode head = new StringNode(arrayOfStrings[0]);
        StringList listSt = new StringList(head);
        for (int i = 1; i < arrayOfStrings.length; i++) {
            listSt.push(arrayOfStrings[i]);
        }
        listSt.printStringList();
        System.out.println();
        System.out.println("Количество слов в списке, которые начинаются и заканчиваются на одну букву = " + Task01.task05(listSt));
        Task01.task06(listSt);
        System.out.println("Первое слово встречается " + Task01.task07(listSt) + "раз(а)");
        Task01.task08(listSt);
    }


}
