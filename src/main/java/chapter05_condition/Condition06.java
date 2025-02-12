package chapter05_condition;

import java.util.Scanner;

public class Condition06 {
    public static void main(String[] args) {

        /*
        사용자에게 score 입력 받아 다음 조건 만족

        socre 0보다 작거나 100보다 크면 grade x

         */

        Scanner scanner = new Scanner(System.in);

        System.out.println("점수를 입력하세요 : ");

        int score = 0;
        int changedScore;
        String grade = "";

        score = scanner.nextInt();
        changedScore = score / 10;

        // 점수 입력 및 변환이 끝났으므로 조건문 작성(if - switch 문을 혼합)
        if (score < 0 || score > 100){
            grade = "X";
        } else {
            switch (changedScore){
                case 10,9:
                    grade = "A";
                    break;
                case 8:
                    grade = "B";
                    break;
                case 7:
                    grade = "C";
                    break;
                case 6:
                    grade = "D";
                    break;
                default:
                    System.out.println("당신의 학점은 F입니다");
            }
        }

        System.out.println("당신의 점수는 " + score + "이고 당신의 학점은 " + grade + "입니다.");






    }
}
