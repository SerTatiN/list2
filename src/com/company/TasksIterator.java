package com.company;

public class TasksIterator {
    //1.Найти среднее арифметическое значение элементов списка.
    public static double task1(ListIterator lstI){
        int sum = 0;
        while (lstI.hasNext()) {
            sum += lstI.next().getValue();
        }
        return (double) sum/ lstI.getList().getLength();
    }


    //2. Перенести в начало списка его последний элемент.
    public static void task2(List list){
        Node nodeTmp = list.getHead();
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        Node tmp = nodeTmp.getNextNode(); //последний
        tmp.setNextNode(list.getHead());
        list.setHead(tmp); // последний-голова
        nodeTmp.setNextNode(null); //предыдущий
    }
}
