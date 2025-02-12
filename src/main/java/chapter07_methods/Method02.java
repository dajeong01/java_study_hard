package chapter07_methods;

import java.util.Scanner;

public class Method02 {
    // 메서드를 구현할 부분 -> getStar()
    public static String getStar(int rows, int select) {
        // 사용할 지역 변수 선언
        String result = "";

        // select에 따라서 서로 다른 결과값이 나오도록 조건문을 작성할 예쩡
        if (select == 1) {
            // 왼쪽으로 치우친 증가하는 별
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < i + 1; j++) {
                    result += "😍";
                }
                result += "\n";
            }
        } else if (select == 2) {
            // 오른쪽으로 치우치고 증가
            for (int i = 0; i < rows; i++) {
                // 공백삽입
                for (int j = 0; j < rows - i - 1; j++) {
                    result += "  ";
                }
                // 별 찍기
                for (int k = 0; k < i + 1; k++) {
                    result += "😍";
                }
                result += "\n";
            }
        } else if (select == 3) {
            // 왼쪽으로 감소하는 별 찍기
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < rows - i; j++) {
                    result += "😍";
                }
                result += "\n";
            }
        } else if (select == 4) {
            // 오른쪽으로 감소하는 별찍기
            for (int i = 0; i < rows; i++) {
                // 공백
                for (int j = 0; j < i; j++) {
                    result += "  ";
                }
                // 별찍기
                for (int k = 0; k < rows - i; k++) {
                    result += "😍";
                }
                //개행
                result += "\n";
            }
        } else {
            // 잘못된 선택 시 빈 문자열 반환
            result = "입력 오류입니다.";
        }
        return result;
    }

    // 메서드를 호출할 부분
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int rowOfStars;
        int choice;
        String starResult; // starResult 변수를 선언합니다.

        System.out.println("몇 줄 짜리 별을 생성할까요?");
        rowOfStars = scanner.nextInt();

        System.out.println("1. 왼쪽으로 치우친 증가하는별");
        System.out.println("2. 오른쪽으로 치우친 증가하는별");
        System.out.println("3. 왼쪽으로 치우친 감소하는별");
        System.out.println("4. 오른쪽으로 치우친 감소하는별");
        System.out.println("메뉴를 숫자로 선택하세요");
        choice = scanner.nextInt();

        starResult = getStar(rowOfStars, choice); // getStar 호출 후 결과를 starResult에 저장
        System.out.println(starResult); // 결과 출력
    }
}
