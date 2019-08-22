package com.company;

import java.util.Scanner;

public class outputAlphabet {
    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int IN;
        while(true) {
            System.out.print("정수를 입력하시오: ");
            IN = scan.nextInt();
            if(IN == 1 || IN == 2){
                break;
            }
        }
        int IN1;
        while(true){
            System.out.print("출력할 알파벳 갯수를 입력하시오: ");
            IN1 = scan.nextInt();
            if(IN1 > 0){
                break;
            }
        }

        if(IN == 1){
            for(char i = 'a'; i <= IN1 + 97; i++){
                System.out.print(i);
            }
        }
        else {
            for (char i = 'A'; i <= IN1 + 65; i++){
                System.out.print(i);
            }
        }
    }
}
