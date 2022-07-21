package com.donggi.data_structure.algorithm;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

		/*
		//🦊Q10. 두 변수 a,b 에 정수를 입력하고 b-a 를 출력하는 프로그램을 작성하세요. 단 변수 b에 입력한 값이 a 이하면 변수 b의 값을 다시 입력하세요.
		Scanner scan = new Scanner(System.in);
		int a;
		int b;

		a = scan.nextInt();
		b = scan.nextInt();
		System.out.println("a의 값 : "+a);
		System.out.println("b의 값 : "+b);
		while(b>=a) {
			System.out.println("a보다 큰 값을 입력하세요");
			b = scan.nextInt();
			System.out.println("b의 값 : "+b);
		}
		System.out.println("b - a는 : "+(b-a)+ "입니다.");
		*/

//		🦊Q11. 양의 정수를 입력하고 자릿수를 출력하는 프로그램을 작성하세요.
//				ex) 입력 : 135 / 출력 :  '그 수 자리는 3자리 입니다.'
//					입력 : 1314 / 출력 : '그 수 자리는 4자리 입니다.'

        Scanner scan = new Scanner(System.in);
        Long a = scan.nextLong();
        String strA = String.valueOf(a);
        int digit = strA.length();
        System.out.printf("그 수 자리는 %d 입니다",digit);


        Scanner scanner = new Scanner(System.in);
        System.out.println("정수를 입력하세요:");
        int x = scanner.nextInt();
        System.out.println(x + "의 팩토리얼은"+factorial(x)+"입니다.");
    }
    static int factorial(int n){
        if(n>0)
            return n*factorial(n-1);
        else
            return 1;
    }

}
