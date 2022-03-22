package com.epam.training.student_Ekaterina_Moteva.fundamentals.optional_task1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class ShortestAndLongestNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            list.add(n);
        }
        Collections.sort(list);
        System.out.println("The shortest number is " + list.get(0) + ", length is " + list.get(0).toString().length());
        System.out.println("The longest number is " + list.get(list.size()-1) + ", length is " +
                list.get(list.size()-1).toString().length());
    }
}
