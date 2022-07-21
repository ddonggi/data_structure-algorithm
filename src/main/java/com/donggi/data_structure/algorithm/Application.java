package com.donggi.data_structure.algorithm;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //🦊Q10. 두 변수 a,b 에 정수를 입력하고 b-a 를 출력하는 프로그램을 작성하세요. 단 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
        do_B_minus_A();
        
		/*🦊Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
				ex) 입력 : 135 / 출력 :  '그 수 자리는 3자리 입니다.'
					입력 : 1314 / 출력 : '그 수 자리는 4자리 입니다.'*/
        doDigit();


        //p165 팩토리얼을 재귀적으로 구현
        doFactorial();
    }

    private static void doDigit() {
        System.out.println("------------------자리수 구하기-------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("자리수를 알고싶은 숫자를 입력하세요");
        Long a = scan.nextLong();
        String strA = String.valueOf(a);
        int digit = strA.length();
        System.out.printf("그 수 자리는 %d 입니다",digit);
        System.out.println();
    }

    private static void do_B_minus_A() {
        System.out.println("-------------a,b 입력, b-a 출력 ----------------");
        //🦊Q10. 두 변수 a,b 에 정수를 입력하고 b-a 를 출력하는 프로그램을 작성하세요. 단 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.println("a 값을 입력하세요.");
        a = scan.nextInt();
        System.out.println("b 값을 입력하세요.");
        b = scan.nextInt();
        System.out.println("a의 값 : " + a);
        System.out.println("b의 값 : " + b);
        while (b <= a) {
            System.out.println("a보다 큰 값으로 다시 입력하세요");
            b = scan.nextInt();
            System.out.println("b의 값 : " + b);
        }
        System.out.println("b - a는 : " + (b - a) + "입니다.");
    }

    private static void doFactorial() {
        System.out.println("-------------Factorial----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("팩토리얼 값을 알고싶은 정수를 입력하세요:");
        int x = scanner.nextInt();
        System.out.println(x + "의 팩토리얼은 " + factorial(x) + " 입니다.");
        System.out.println();
    }

    static int factorial(int n){
        if(n>0)
            return n*factorial(n-1);
        else
            return 1;
    }

}
