package com.algorithm.baekjoon;

public class Test {

    public long sum(int[] a) {
//        long sum(int[] a); (클래스 이름: Test)
//        a: 합을 구해야 하는 정수 n개가 저장되어 있는 배열 (0 ≤ a[i] ≤ 1,000,000, 1 ≤ n ≤ 3,000,000)
//        리턴값: a에 포함되어 있는 정수 n개의 합
        long s = 0;
        for ( int b : a ) {
            s += b;
        }
        return s;
    }



}
