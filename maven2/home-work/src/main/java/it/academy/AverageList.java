package it.academy;


import java.util.ArrayList;
import java.util.List;

public class AverageList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<Integer>();
        list.add(10);
        list.add(15);
        list.add(20);
        list.add(25);
        list.add(30);
        double averageList = averageList(list);
    }


    public static double averageList(List<Integer> list) {

        List<Integer> listWork = list;
        int sum = 0;
        for (int i : list) {
            sum += i;
        }
        double averageList;
        if (listWork.isEmpty()) {
            System.out.println("Empty list");

            return averageList=0;
        } else {
            averageList = sum / (double) list.size();
            System.out.printf("Average = %6.2f", averageList);
            return averageList;
        }
    }
}


