package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("==명언 앱==");
        System.out.print("명령)");
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        if(cmd.equals("등록")){
            System.out.printf("명언 : ");
            sc.nextLine();
            System.out.printf("작가 : ");
            sc.nextLine();
        }
        System.out.printf("명령) ");
        sc.nextLine();
//        while(true) {
//            String cmd = sc.nextLine();
//            if (cmd.equals("등록")) {
//                System.out.printf("명언) ");
//
//
//            }
//
//        }
    }
}