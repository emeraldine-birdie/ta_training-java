package com.epam.training.student_Ekaterina_Moteva.fundamentals.main_task;

public class ReverseArgs {
    public static void main(String[] args) {
        //Отобразить в окне консоли аргументы командной строки в обратном порядке.
        for (int i = args.length-1; i >= 0; i--){
            System.out.println(args[i]);
        }
    }
}
