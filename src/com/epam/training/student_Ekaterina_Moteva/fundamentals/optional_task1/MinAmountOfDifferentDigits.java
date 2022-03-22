package com.epam.training.student_Ekaterina_Moteva.fundamentals.optional_task1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MinAmountOfDifferentDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        int result = 0;
        int resultNumberOfDiffDigits = Integer.MAX_VALUE;

        while (scanner.hasNextInt()){
            int n = scanner.nextInt();
            list.add(n);
        }

        for (int i = 0; i < list.size(); i++){
            if (list.get(i).toString().length() == 1){
                result = list.get(i);
                resultNumberOfDiffDigits = 1;
            }
            else if (list.get(i).toString().length() > 1){
                int tmp;
                char[] ch = list.get(i).toString().toCharArray();
                tmp = ch.length;
                for (int j = 0; j < ch.length; j++){
                    for (int k = j+1; k < ch.length; k++){
                        if (ch[k]==ch[j]){
                            tmp--;
                        }
                    }
                }
                if (tmp<resultNumberOfDiffDigits){
                    resultNumberOfDiffDigits = tmp;
                    result = list.get(i);
                }

            }
            else{
                throw new NumberFormatException();
            }
        }
        System.out.println("The number with min amount of different digits is " + result + ". It has " + resultNumberOfDiffDigits
         + " different digits.");

    }
}
