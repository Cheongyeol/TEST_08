package com.company;

import java.util.Scanner;

public class multiLnAlphabet1 {
    public static void main(String[] args){
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
        char chr = 'a';
        for (int j = 0; j < 'z'; j++) {
            for (int i = 0; i < IN1; i++) {
                System.out.print(chr);
            }
            System.out.println();
            chr++;
        }
    }
}
