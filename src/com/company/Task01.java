package com.company;

public class Task01 {
//1.Найти среднее арифметическое значение элементов списка.
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
//2. Перенести в начало списка его последний элемент.
    public static void task2(List list){
        Node nodeTmp = list.getHead();
        while (nodeTmp.getNextNode().getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();
        }
        Node tmp = nodeTmp.getNextNode(); //последний
        tmp.setNextNode(list.getHead()); // последний ссылается на голову, которая теперь 2-ая
        list.setHead(tmp); // последний- теперь первый и голова
        nodeTmp.setNextNode(null); //предыдущий- теперь последний
    }
//list.push(nodeTemp.getValue(), 0);
//list.pop();
//4. Поменять местами первый и последний элементы списка.
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
    public static void task041(List list){

        Node nodeTmp = list.getHead();
        while (nodeTmp.getNextNode() != null) {
            nodeTmp = nodeTmp.getNextNode();// последний
        }
        int tmp = list.getHead().getValue();
        list.getHead().setValue(nodeTmp.getValue());
        nodeTmp.setValue(tmp);
    }
//5. Определить количество слов в списке, которые начинаются и заканчиваются на одну букву.

    public static int task05(StringList list) {
        StringNode temp = list.getHead();
        int couter = 0;
        while (temp != null ) {
            if (temp.getValue().charAt(0) == temp.getValue().charAt(temp.getValue().length()-1)) {
                couter ++;
            }
            temp = temp.getNextNode();
        }
        return couter;
    }
//6. Проверить, что каждое следующее слово в списке начинается с последней буквы предыдущего
    public static void task06(StringList list) {
        StringNode temp = list.getHead();
        boolean f = true;
        while (temp.getNextNode() != null ) {
            if (!isChar(temp, temp.nextNode)) {
                f = false;
                break;
            }
            temp = temp.getNextNode();
        }
        if (f) {
            System.out.println("Да! Cледующее слово в списке начинается с последней буквы предыдущего!");
            } else {
            System.out.println("Нет! Cледующее слово в списке не начинается с последней буквы предыдущего!");
        }
        }

    private static boolean isChar(StringNode sp1, StringNode sp2){
        return sp1.getValue().charAt(sp1.getValue().length()-1) == sp2.getValue().charAt(0);
    }
// 7.Определить количество слов в списке, которые совпадают с первым (последним) словом списка

    public static int task07(StringList list) {
        StringNode temp = list.getHead();
        int counter = 0;
        String fist = temp.getValue();
        while (temp.getNextNode() != null ) {
            if (isWord(fist, temp.nextNode)){
                counter++;
            }
            temp = temp.getNextNode();
        }
        return counter;
    }

    private static boolean isWord(String sp1, StringNode sp2){
        return sp1.equals(sp2.getValue());
        }
// 8. Проверить, упорядочены ли элементы списка по алфавиту.
    public static void task08(StringList list){
        StringNode temp = list.getHead();
        boolean f = true;
        while (temp.getNextNode() != null ) {
            if (!isAbc(temp, temp.nextNode)){
                f = false;
                System.out.println(f);
                break;
            }
            temp = temp.getNextNode();
        }
       if (f) {
           System.out.println("Да! Элементы списка упорядочены по алфавиту ");
       } else {
           System.out.println("Нет! Элементы списка не упорядочены по алфавиту ");
       }
    }
    private static boolean isAbc(StringNode sp1, StringNode sp2){
        boolean f = true;
        if (!isWord(sp1.getValue(), sp2)) {
            if (isAbcString(sp1.getValue(),sp2.getValue())){
                if (sp1.getValue().length() > sp2.getValue().length()) {
                    f = false;
                }
            } else {
                f = false;
            }
        }
        return f;
    }
    private static boolean isAbcString(String st1, String st2) {
        boolean f = true;
        int dl;
        if (st1.length() <= st2.length()) {
            dl = st1.length();

        } else {
            dl = st2.length();
        }
        int i = 0;
        while (i < dl && f) {
            if  ((int) st1.charAt(i) > (int) st2.charAt(i)) {
                System.out.println((int) st1.charAt(i) + " " + (int) st2.charAt(i));
                f = false;
            }
            i++;
        }
        return f;
    }
//9. Определить, входит ли список L1 в L2.

//10.  Перевернуть список наоборот.

}
