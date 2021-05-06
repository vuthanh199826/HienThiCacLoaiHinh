package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;
        System.out.println("menu");
        System.out.println("1");
        System.out.println("2");
        System.out.println("3");
        System.out.println("nhap lua chon vao day");
        choice = sc.nextInt();
        switch (choice){
            case 1:
                for (int i = 0; i < 3; i++) {
                    for (int j = 0; j < 5; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 2:
                for (int i = 0; i < 5; i++) {
                    for (int j = 0; j < i; j++) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
            case 3:
                for (int i = 5; i > 0; i--) {
                    for (int j = i; j >0 ; j--) {
                        System.out.print("*");
                    }
                    System.out.println();
                }
                break;
        }


    }
}
