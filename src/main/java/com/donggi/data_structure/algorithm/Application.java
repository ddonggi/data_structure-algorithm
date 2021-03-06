package com.donggi.data_structure.algorithm;


import java.util.Scanner;

public class Application {

    public static void main(String[] args) {

        //π¦Q10. λ λ³μ a,b μ μ μλ₯Ό μλ ₯νκ³  b-a λ₯Ό μΆλ ₯νλ νλ‘κ·Έλ¨μ μμ±νμΈμ. λ¨ λ³μ bμ μλ ₯ν κ°μ΄ a μ΄νλ©΄ λ³μ bμ κ°μ λ€μ μλ ₯νμΈμ.
        do_B_minus_A();
        
		/*π¦Q11. μμ μ μλ₯Ό μλ ₯νκ³  μλ¦Ώμλ₯Ό μΆλ ₯νλ νλ‘κ·Έλ¨μ μμ±νμΈμ.
				ex) μλ ₯ : 135 / μΆλ ₯ :  'κ·Έ μ μλ¦¬λ 3μλ¦¬ μλλ€.'
					μλ ₯ : 1314 / μΆλ ₯ : 'κ·Έ μ μλ¦¬λ 4μλ¦¬ μλλ€.'*/
        doDigit();


        //p165 ν©ν λ¦¬μΌμ μ¬κ·μ μΌλ‘ κ΅¬ν
        doFactorial();
    }

    private static void doDigit() {
        System.out.println("------------------μλ¦¬μ κ΅¬νκΈ°-------------------");
        Scanner scan = new Scanner(System.in);
        System.out.println("μλ¦¬μλ₯Ό μκ³ μΆμ μ«μλ₯Ό μλ ₯νμΈμ");
        Long a = scan.nextLong();
        String strA = String.valueOf(a);
        int digit = strA.length();
        System.out.printf("κ·Έ μ μλ¦¬λ %d μλλ€",digit);
        System.out.println();
    }

    private static void do_B_minus_A() {
        System.out.println("-------------a,b μλ ₯, b-a μΆλ ₯ ----------------");
        //π¦Q10. λ λ³μ a,b μ μ μλ₯Ό μλ ₯νκ³  b-a λ₯Ό μΆλ ₯νλ νλ‘κ·Έλ¨μ μμ±νμΈμ. λ¨ λ³μ bμ μλ ₯ν κ°μ΄ a μ΄νλ©΄ λ³μ bμ κ°μ λ€μ μλ ₯νμΈμ.
        Scanner scan = new Scanner(System.in);
        int a;
        int b;
        System.out.println("a κ°μ μλ ₯νμΈμ.");
        a = scan.nextInt();
        System.out.println("b κ°μ μλ ₯νμΈμ.");
        b = scan.nextInt();
        System.out.println("aμ κ° : " + a);
        System.out.println("bμ κ° : " + b);
        while (b <= a) {
            System.out.println("aλ³΄λ€ ν° κ°μΌλ‘ λ€μ μλ ₯νμΈμ");
            b = scan.nextInt();
            System.out.println("bμ κ° : " + b);
        }
        System.out.println("b - aλ : " + (b - a) + "μλλ€.");
    }

    private static void doFactorial() {
        System.out.println("-------------Factorial----------------");
        Scanner scanner = new Scanner(System.in);
        System.out.println("ν©ν λ¦¬μΌ κ°μ μκ³ μΆμ μ μλ₯Ό μλ ₯νμΈμ:");
        int x = scanner.nextInt();
        System.out.println(x + "μ ν©ν λ¦¬μΌμ " + factorial(x) + " μλλ€.");
        System.out.println();
    }

    static int factorial(int n){
        if(n>0)
            return n*factorial(n-1);
        else
            return 1;
    }

}
