package chapter05_condition;

import java.util.Scanner;

/*
    switch문
    형식 :
    switch(변수)
        case 조건 1 :
           실행문1
            break;
        case 조건 2 :
           실행문2
            break;
        case 조건 3 :
           실행문3
            break;
        case 조건 4 :
          실행문4
          break;
        default;
          실행문5

 */
public class Condition05Switch {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String selected = null;     // ""; 로 초기화해도 됩니다.

        System.out.println("[ 선택 프로그램 ] ");
        System.out.println("a. 메뉴1");
        System.out.println("b. 메뉴2");
        System.out.println("c. 메뉴3");
        System.out.println("d. 메뉴4");
        System.out.println("e. 메뉴5");
        System.out.println("메뉴를 선택하세요 : ");
        selected = scanner.nextLine();


        // 만약에 if문으로 작성한다면
//        if (selected == "a") {
//            System.out.println("메뉴1을 선택하셨습니다. ");
//        } else if (selected.equals("b")){
//            System.out.println("메뉴2를 선택하셨습니다.");
//        }
        // 가독성이 깨짐

        switch (selected) {
            case "a":
                System.out.println("메뉴1을 선택하셨습니다.");
                break;
            case "b":
                System.out.println("메뉴2을 선택하셨습니다.");
                break;
            case "c":
                System.out.println("메뉴3을 선택하셨습니다.");
                break;
            case "d":
                System.out.println("메뉴4을 선택하셨습니다.");
                break;
            case "e":
                System.out.println("메뉴5을 선택하셨습니다.");
                break;
            default:
                System.out.println("잘못 선택하셨습니다");
        }
        // default의 의미 : case에 해당되지않는 변수가 적용되었을 경우 실행되는 부분
        // break의 의미 : 해당 조건문 / 반복문을 그 자리에서 종료시키는 명령어

//        String menu = "";
//        switch (selected) {
//            case "a":
//                menu = "메뉴1"
//                break;
//            case "b":
//                 menu = "메뉴2"
//                break;
//            case "c":
//                menu = "메뉴3"
//                break;
//            case "d":
//                menu = "메뉴4"
//                break;
//            case "e":
//                menu = "메뉴5"
//                break;
//            default:
//                System.out.println("잘못 선택하셨습니다");
//        System.out.println(menu + "를 골랐습니다");

    }
}
