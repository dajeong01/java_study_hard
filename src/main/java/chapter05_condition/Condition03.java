package chapter05_condition;

import java.util.Scanner;

public class Condition03 {
    public static void main(String[] args) {

        /* 사용자에게 score 입력 받아 다음 조건 만족

         */

        Scanner scanner = new Scanner(System.in);


        String grade = "";

        System.out.println("점수를 입력하세요 : ");
        int score = scanner.nextInt();

        if (0 < score && score < 101){
            if(score > 90) {
                grade = "A";
            } else if(score > 80){
                grade = "B";
            } else if(score > 70){
                grade = "C";
            } else if(score > 60){
                grade = "D";
            } else if(score <60){
                grade = "F";
            }
            System.out.println("입력한 점수는 " + score + "점이며, 학점은 : " + grade + " 입니다." );
        }

        else {
            System.out.println("점수를 다시 입력하세요.");
        }
        scanner.close();


    }
}
