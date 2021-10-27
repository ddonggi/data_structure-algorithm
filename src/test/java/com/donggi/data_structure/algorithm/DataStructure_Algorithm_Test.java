package com.donggi.data_structure.algorithm;
/*
 * Created by 이동기 on 2021-10-06
 */

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class DataStructure_Algorithm_Test {

    //
    public void max3(int a, int b, int c){
        int max = a;
        if(max<b) max = b;
        if(max<c) max = c;

        System.out.println("세 수 최댓값:"+max);
    }
    public void max4(int a, int b, int c, int d){
        int max = a;
        if(max<b) max = b;
        if(max<c) max = c;
        if(max<d) max = d;

        System.out.println("네 수 최댓값:"+max);
    }
    public void min3(int a, int b, int c){
        int min = a;
        if(min>b) min = b;
        if(min>c) min = c;

        System.out.println("세 수 최솟값:"+min);
    }
    public void min4(int a, int b, int c, int d){
        int min = a;
        if(min>b) min = b;
        if(min>c) min = c;
        if(min>d) min = d;

        System.out.println("네 수 최솟값:"+min);
    }
    public int med3(int a, int b, int c){
        if(a>=b)
            if(b>=c)
                return b;
            else if (a<=c)
                return a;
            else
                return c;

        else if (a>c)
            return a;
        else if (b>c)
            return c;
        else
            return b;
    }
    public void sum(int n){// 1부터 n 까지의 합 구하기
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            if(i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i);
            sum += i;
        }
        System.out.println(" = " + sum);

    }

    @Test
    public void max3(){
        max3(1,4,6);
    }
    @Test
    public void max4(){
        max4(1,11,6,2);
    }
    @Test
    public void min3(){
        min3(6,22,3);
    }
    @Test
    public void min4(){
        min4(4,22,9,10);
    }
    @Test
    public void med3(){ // 세 수의 중앙값 구하기
        int middle = med3(3,3,2);
        System.out.println("중앙값 :"+middle);
    }
    @Test //Q7 1부터 n 까지 정수의 합 구하기
    public void sum(){
        int n = 10;
        sum(n);
    }

    @Test // 가우스 덧셈을 이용하여 1부터 n까지의 정수의 합
    public void gausSum(){
        int n = 10;
        gausSum(n);
    }
    public void gausSum(int n){
        int sum = 0;

        sum = (1+n)*(n/2)+(n%2==0?0:(1+n)/2); //만약 정수의 개수가 홀수라면 남은 1개의 홀수를 더한다

        System.out.println("1부터"+n+"까지의 합 :"+sum);
    }

    @Test//정수 a,b를 포함하여 그 사이의 모든 정수의 합을 반환하는 sumof 메서드를 작성하세요. a,b 의 대소에 상관없이
    public void sumof(){
        int a = 10;
        int b = 10;
        sumof(a,b);
    }
    public void sumof(int a, int b){
        int sum = 0;
        int min = 0;
        int max = 0;

        if(a>b){
            min = b;
            max = a;
        }
        else if(a==b){
            System.out.println("a와 b가 같습니다.");
            min = a;
            max = b;
        }else{
            min = a;
            max = b;
        }
        System.out.println("min: "+min+", max: "+max);
        for(int i = min; i<=max; i++){
            sum += i ;
        }
        if(a==b){
            sum=0;
        }

        System.out.println(min+"과"+ max+"의 사이의 정수의 합: "+sum);
    }
}
