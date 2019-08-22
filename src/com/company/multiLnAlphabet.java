package com.company;

import java.util.Scanner;

public class multiLnAlphabet {
    public static void main(String []args){
        Scanner scan = new Scanner(System.in);
        int IN;
        while (true){
            System.out.print("정수를 입력하시오: ");
            IN = scan.nextInt();
            if(IN == 1 || IN == 2){
                break;
            }
        }
        int IN1;
        while (true){
            System.out.print("출력할 줄 수를 입력하세요: ");
            IN1 = scan.nextInt();
            if(IN1 > 0){
                break;
            }
        }
        if(IN == 1){
            for (int j = 0; j <= IN1; j++) {
                for (char i = 'a'; i < 123; i++) {
                    System.out.print(i);
                }
                System.out.println();
            }
        }
        else {
            for (int j = 0; j <= IN1; j++) {
                for (char i = 'A'; i < 91; i++){
                    System.out.print(i);
                }
                System.out.println();
            }
        }
    }
}
