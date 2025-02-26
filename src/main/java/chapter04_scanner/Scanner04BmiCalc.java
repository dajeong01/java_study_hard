package chapter04_scanner;

import java.util.Scanner;

/*
    Bmi 계산기를 작성합니다.

    1. 키를 cm로 입력 받습니다.
    2. 몸무게를 kg으로 입력 받습니다.
    3. bmi를 계산하는 방법 : 몸무게(kg) / (키(m)의 제곱)
    4. 콘솔창에 "당신의 bmi지수는 xx입니다."

실행 예
    당신의 키(cm)를 입력하세요 >>> 172.3
    당신의 몸무게(kg)를 입력하세요 >>> 70
    당신의 bmi 지수는 xx입니다.
 */
public class Scanner04BmiCalc {
    public static void main(String[] args) {

        // Scanner 클래스를 import
        Scanner scanner = new Scanner(System.in);

        double weight = 0;
//        double height = 0;
        int bmi = 0;

        System.out.print("키를 입력하세요 : ");
        double height = scanner.nextDouble();
        // cm -> m 로 변환할 필요가 있습니다. 172.3 -> 1.723으로 바꿔야한다는점
        System.out.println(height);
        height = height / 100;

        System.out.println("몸무게를 입력하세요 : ");
        weight = scanner.nextDouble();

        // bmi 공식 작성
        bmi = (int)(weight / (height*height));

        System.out.println("당신의 bmi지수는 " + bmi + " 입니다.");






    }
}