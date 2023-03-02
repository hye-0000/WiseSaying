package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        System.out.println("==명언 앱==");
        System.out.print("명령)");
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();

        while(cmd.equals("등록")){
//            if(){
                id;
                System.out.printf("명언 : ");
                sc.nextLine();
                System.out.printf("작가 : ");
                sc.nextLine();
                System.out.println(id + "번 명령이 등록되었습니다.");
                System.out.print("명령)");
                cmd = sc.nextLine();
        }
    }
}