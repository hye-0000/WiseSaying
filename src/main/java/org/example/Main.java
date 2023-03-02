package org.example;

import java.util.*;

import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        int id = 0;
        List<Wise> list = new ArrayList<>();
        ListComparator comp = new ListComparator();
        System.out.println("==명언 앱==");
        System.out.print("명령)");
        Scanner sc = new Scanner(System.in);
        String cmd = sc.nextLine();
        String wise;
        String author;

        while(true){
            if(cmd.equals("종료")) break;
            else if(cmd.equals("등록")){
                id++;
                System.out.printf("명언 : ");
                wise = sc.nextLine();
                System.out.printf("작가 : ");
                author = sc.nextLine();
                System.out.println(id + "번 명언이 등록되었습니다.");
                list.add(new Wise(id, wise, author));
                System.out.print("명령)");
                cmd = sc.nextLine();
            } else if (cmd.equals("목록")) {
                Collections.sort(list, comp);
                System.out.println("번호 / 작가 / 명언");
                System.out.println("----------------------------");
                for(Wise wises : list){
                    System.out.printf("%d / %s / %s\n", wises.getWiseId(), wises.getWiseSaying(), wises.getAuthor());
                }
                System.out.print("명령)");
                cmd = sc.nextLine();
            } else if (cmd.contains("삭제?id=")) {
                int wiseId = parseInt(cmd.replaceAll("[^0-9]", ""));
                Wise wises_ = null;
                for(Wise wises : list){
                    if(wises.getWiseId() == wiseId){
                        wises_ = wises;
                    }
                }
                if(wises_ == null){
                    System.out.println("명언이 존재하지 않습니다.");
                }
                list.remove(wises_);
                System.out.print("명령)");
                cmd = sc.nextLine();
            } else if (cmd.contains("수정?id=")) {
                int wiseId = parseInt(cmd.replaceAll("[^0-9]", ""));
                int idx = 0;
                Wise wises_ = null;
                for(Wise wises : list){
                    if(wises.getWiseId() == wiseId){
                        wises_ = wises;
                    }
                }
                idx= list.indexOf(wises_);

                System.out.println("명언(기존) : " + wises_.getWiseSaying());
                System.out.printf("명언 : ");
                wise = sc.nextLine();
                System.out.println("작가(기존) : " + wises_.getAuthor());
                System.out.printf("작가 : ");
                author = sc.nextLine();
                list.set(idx, new Wise(wiseId, wise, author));
                System.out.print("명령)");
                cmd = sc.nextLine();
            }
        }
    }
}

class Wise{
    private int wiseId;
    private String wiseSaying;
    private String author;

    Wise(int wiseId, String wiseSaying, String author) {
        this.wiseId = wiseId;
        this.wiseSaying = wiseSaying;
        this.author = author;
    }

    public int getWiseId() {
        return wiseId;
    }

    public void setWiseId(int wiseId) {
        this.wiseId = wiseId;
    }

    public String getWiseSaying() {
        return wiseSaying;
    }

    public void setWiseSaying(String wiseSaying) {
        this.wiseSaying = wiseSaying;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }
}

class ListComparator implements Comparator<Wise>{
    @Override
    public int compare(Wise first, Wise second){
        int firstValue = first.getWiseId();
        int secondValue = second.getWiseId();

        if(firstValue>secondValue){
            return -1;
        }else if(firstValue<secondValue){
            return 1;
        }else{
            return 0;
        }
    }

}