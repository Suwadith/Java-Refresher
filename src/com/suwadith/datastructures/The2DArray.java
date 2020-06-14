package com.suwadith.datastructures;

import java.util.Arrays;

public class The2DArray {

    public static void main(String[] args) {

        int[][] lotteryCard = {
                {15, 20, 85},
                {20, 25, 60},
                {70, 75, 65},
                {90, 40, 50}
        };

        int[][] lotteryCard2 = new int[4][3];

        lotteryCard2[0][0] = 15;
        lotteryCard2[0][1] = 20;
        lotteryCard2[0][2] = 85;
        lotteryCard2[1][0] = 20;
        lotteryCard2[1][1] = 25;
        lotteryCard2[1][2] = 60;
        lotteryCard2[2][0] = 70;
        lotteryCard2[2][1] = 75;
        lotteryCard2[2][2] = 65;
        lotteryCard2[3][0] = 90;
        lotteryCard2[3][1] = 40;
        lotteryCard2[3][2] = 50;


        for(int i = 0; i<lotteryCard.length; i++) {
            for(int j=0; j<lotteryCard[i].length; j++) {
                System.out.print(lotteryCard[i][j] + "\t");
            }
            System.out.println();
        }

    }

}
