package chapter05_condition;

import java.util.Scanner;

public class Condition04BmiUpgraded {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double weight = 0;

        int bmi = 0;

        System.out.print("키를 입력하세요 : ");
        double height = scanner.nextDouble();
        // cm -> m 로 변환할 필요가 있습니다. 172.3 -> 1.723으로 바꿔야한다는점
        System.out.println(height);
        height = height / 100;
        System.out.println(height);

        System.out.println("몸무게를 입력하세요 : ");
        weight = scanner.nextDouble();
        System.out.println(weight);

        // bmi 공식 작성
        bmi = (int)(weight / (height*height));

        String grade = "";

        if(bmi > 25){
            grade = "비만";
        } else if(bmi > 23){
            grade = "과체중";
        } else if(bmi > 18){
            grade = "정상체중";
        } else {
            grade = "저체중:";
        }

        System.out.println("당신의 bmi지수는 " + bmi + " 입니다.");
        System.out.println("당신은 " + grade + "입니다.");


        }
}
