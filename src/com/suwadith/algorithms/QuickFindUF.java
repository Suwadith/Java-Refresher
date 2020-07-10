package com.suwadith.algorithms;

import java.util.Arrays;

public class QuickFindUF {

    private int[] arr;

    public QuickFindUF(int N) {
        arr = new int[N];

        for(int i =0; i<N; i++) {
            arr[i] = i;
        }
    }

    public boolean connected(int p, int q) {
        return arr[p] == arr[q];
    }

    public void union(int p, int  q) {

        int pid = arr[p];
        int qid = arr[q];

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == pid) {
                arr[i] = qid;
            }
        }

    }

    public static void main(String[] args) {

        QuickFindUF qfuf = new QuickFindUF(10);

        System.out.println(qfuf.connected(5,6));

        System.out.println(Arrays.toString(qfuf.arr));

        qfuf.union(6,5);

        System.out.println(qfuf.connected(5,6));

        System.out.println(Arrays.toString(qfuf.arr));

    }

}
