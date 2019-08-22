package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // write your code here
        //대문자 A~Z : 65~91
        //소문자 a~z : 97~123

        Scanner scan = new Scanner(System.in);
        int IN;
        while(true) {
            System.out.print("정수를 입력하시오: ");
            IN = scan.nextInt();
            if(IN == 1 || IN == 2){
                break;
            }
        }
        char chr = 0;

        if(IN == 1) {
            for (char i = 65; i < 91; i++) {
                chr = i;
                System.out.print(chr);
            }
        }
        else if(IN == 2){
            for (char i = 97; i < 123; i++) {
                chr = i;
                System.out.print(chr);
            }
        }
    }
}