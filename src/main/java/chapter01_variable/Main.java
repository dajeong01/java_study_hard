package chapter01_variable;

/*
    변수(variable) : 데이터를 담을 수 있는 바구니
 */

public class Main {
    public static void main(String[] args) {

        System.out.println(3.141592);

        // 원의 둘레를 구하는 공식 = 지름 * pi
        // 10번 라인에 있는 원주율을 이용하여 지름이 19인 원의 둘레를 구하시오
        // sout 쳐서 콘솔창에 출력해보세요

        System.out.println(19 * 3.141592);

        // 자료형 변수명 = 데이터;   -> 변수 선언 및 초기화 방법
        double pi = 3.141592;       // 초기화

        // 지름이 23인 원의 둘레를 구하시오
        System.out.println(pi*23);

        int age;                    // 변수 선언
        age = 38;                   // 초기화 -> 처음으로 변수에 데이터가 대입되는 것을 의미

    /*
        JAVA에서의 변수 표기 방식 :
        카멜 표기법(Camel Case) : 첫 문자는 소문자로 쓰고, 복수의 단어가 연결된 경우에는
                                두 번째 단어의 첫 문자만 대문자로 쓴다.
                                ex) 하나짜리 단어인 경우 String example
                                ex) 복수의 단어로 조합된 경우 String exampleOfKorean;
    */

        // 1. 논리 자료형 (boolean) 변수 : 참 / 거짓 -> true / false
        boolean checkFlag = false;              // 변수의 선언 및 초기화
        // checkFlag2 = true; -> 오류발생 : 처음 나오는데 자료형을 적지 않아서
        System.out.println(checkFlag);
        checkFlag = true;                       // 이미 선언된 변수는 자료형을 적지 않는다
        System.out.println(checkFlag);

        // 변수의 선언 및 초기화
        boolean checkFlag3 = true;
        // 변수의 선언 따로 초기화 따로
        boolean checkFlag4; // 변수의 선언
        checkFlag4 = false; // 초기화

        /*
        최초로 변수를 선언할 때 자료형(data type)을 명시하고 값을 대입하여 초기화 함,
        추후 해당 변수에 값을 재대입하는 경우 변수명 = (바뀐)값; 형태로 작성함.
         */

        // 2. 문자 자료형 변수
        char name1 = '제';       // 문자를 입력할때는 작은 따옴표로 감싼다
        char name2 = '다';       // char는 character의 축약어. 알파벳 / 한글 / 숫자 하나를 의미
        char name3 = '정';
        System.out.println(name1+name2+name3);  // 148245
        System.out.println(""+name1+name2+name3);  // 제다정

        /*
        이상의 코드에서 확인할 수 있는 것은 컴퓨터는 생각보다 멍청해서 개발자들이
        하나하나 전부다 지정을 해줘야한다는 점
        문자와 문자열은 서로 다른데 문자(하나짜리)를 세 번 더했을 경우 더이상 문자가 아니라
        문자열로 되어야한다.
        사람이라면 융퉁성있게 처리했겠지만 컴퓨터는 그렇지 않아서 자료형불일치가 이루어질시 생각한 결과값이 안 나옴
        그래서 문자열들을 합쳐 문자열로 만들어야함
        JAVA에서는 sout의 경우 괄호 맨 앞 부분의 자료형을 따라가는 경우가 많다
        즉, 큰 따옴표로 시작했을 경우 () 내에 있는 부분을 전부 문자열로 보기 때문에
        "제다정" 전체가 안정적으로 출력됐다.

         */
//        ex) 다른 이름으로

        char name4 = '박';
        char name5 = '효';
        char name6 = '신';
        System.out.println(""+name4+name5+name6);

        // 3. 정수 자료형 변수
        int width1 = 100;
        int width2 = 200;
        System.out.println(width1+width2);  // 숫자끼리는 연산이 가능하다

        /*
            int : Integer의 축약어로, 정수를 의미함.
            실수에 해당하는 자료형 double
         */

        // 4. 실수자료형변수
        double pi2 = 3.141592;
//      int pi3 = 3.141592;
//      int longNum = 12345678912;
        long longNum = 12345678912L;

        // 5. 문자열 자료형
        /*
            String : 문자들이 일정한 순서를 지니고 나열된 것을 의미함. (대문자로 시작한다는점)
         */

        String name = "제다정";
        int age1 = 25;
        System.out.println("제 이름은 " + name + "입니다. 제 나이는 " + age1 + "살입니다.");

    }
}
