package com.epam.training.student_Ekaterina_Moteva.fundamentals.main_task;

public class SumAndMultiplication {
    public static void main(String[] args) {
        //Ввести целые числа как аргументы командной строки, подсчитать их сумму (произведение) и вывести результат на консоль.
        int sum = 0;
        int mult = 1;
        for (int i = 0; i < args.length; i++){
            sum += Integer.parseInt(args[i]);
            mult *= Integer.parseInt(args[i]);
        }
        System.out.println(sum);
        System.out.println(mult);
    }
}
