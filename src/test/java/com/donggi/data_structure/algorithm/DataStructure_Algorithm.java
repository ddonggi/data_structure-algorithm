package com.donggi.data_structure.algorithm;
/*
 * Created by 이동기 on 2021-10-06
 */

import org.junit.jupiter.api.Test;

import java.util.Scanner;

public class DataStructure_Algorithm {

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
    public void med3(){
        int middle = med3(3,3,2);
        System.out.println("중앙값 :"+middle);
    }
}
