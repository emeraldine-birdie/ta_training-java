package com.epam.training.student_Ekaterina_Moteva.fundamentals.main_task;

import java.math.BigDecimal;
import java.util.Scanner;

public class HelloUser {
    public static void main(String[] args){
        //Приветствовать любого пользователя при вводе его имени через командную строку
        for (String user : args){
            System.out.println("Hello, " + user + "!");
        }
    }
}
