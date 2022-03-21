package com.epam.training.student_Ekaterina_Moteva.fundamentals.main_task;

public class RandomNumbers {
    public static void main(String[] args) {
        //Вывести заданное количество случайных чисел с переходом и без перехода на новую строку.
        randomNumbersOnNewLine(5);
        randomNumbersOnOneLine(5);
    }

    public static void randomNumbersOnNewLine(int count){
        for (int i = 0; i < count; i++){
            System.out.println(Math.random());
        }
    }

    public static void randomNumbersOnOneLine(int count){
        for (int i = 0; i < count; i++){
            System.out.print(Math.random() + " ");
        }
    }
}
