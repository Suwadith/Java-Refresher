package com.suwadith.algorithms;

import java.sql.Array;

public class Arrays {

    private int[] numberArray = new int[50];

    private int arraySize = 10;

    public void generateArray() {
        for(int i = 0; i < arraySize; i++) {
            numberArray[i] = (int)(Math.random()*10) + 10;
        }
    }

    public void printArray() {
        System.out.println("----------");
        for(int i = 0; i < arraySize; i++){
            System.out.print("| " + i + " | ");
            System.out.println(numberArray[i] + " |");
            System.out.println("----------");
        }
    }

    public int searchByIndex(int index) {
        if(index < arraySize) {
            return numberArray[index];
        }
        return 0;
    }

    public boolean doesValueExist(int value) {
        for(int i=0; i<arraySize; i++) {
            if(numberArray[i] == value) {
                return true;
            }
        }
        return false;
    }

    public void deleteByIndexAndMoveUp(int index) {
        if(index < arraySize) {
            for(int i = index; i < (arraySize-1); i++) {
                numberArray[i] = numberArray[i+1];
            }
        }
        arraySize --;
    }

    public void insertValue(int value) {
        if(arraySize < 50) {
            numberArray[arraySize] = value;
            arraySize++;
        }
    }


    public String linearSearch(int value) {
        boolean valueInArray = false;
        String indexWithValue = "";
        System.out.println("The value was found in the following indexes: ");

        for(int i = 0; i < arraySize; i++) {
            if(numberArray[i] == value) {
                valueInArray = true;
                System.out.println(i + " ");
                indexWithValue += i + "";
            }
        }

        if(!valueInArray) {
            indexWithValue = "None";
            System.out.println(indexWithValue);
        }

        System.out.println();
        return indexWithValue;
    }

    public void bubbleSort() {
        for(int i = 0; i < arraySize-1; i++) {
            for(int j = 0; j < (arraySize-i-1); j++) {
                if(numberArray[j] > numberArray[j+1]) {
                    int large = numberArray[j];
                    numberArray[j] = numberArray[j+1];
                    numberArray[j+1] = large;
                }
            }
        }
    }

    public void binarySearch(int value) {
        boolean found = false;
        int minimumIndex = 0;
        int maximumIndex = arraySize-1;


            while(minimumIndex <= maximumIndex) {

                int middleIndex = (minimumIndex + maximumIndex) / 2;

                if(numberArray[middleIndex] > value) {
                    maximumIndex = middleIndex - 1;
                } else if(numberArray[middleIndex] < value) {
                    minimumIndex = middleIndex + 1;
                } else {
                    found = true;
                    System.out.println("The value " + value + " was found in the index " + middleIndex + " of the array");
                    minimumIndex = maximumIndex + 1;
                }

            }

            if (!found) {
                System.out.println("Value was not found");
            }
    }


    public static void main(String[] args) {

        Arrays newArray = new Arrays();

        newArray.generateArray();

        newArray.printArray();

        System.out.println(newArray.searchByIndex(3));

        System.out.println(newArray.doesValueExist(9));

        newArray.deleteByIndexAndMoveUp(5);
        newArray.printArray();

        newArray.insertValue(35);
        newArray.printArray();

        newArray.linearSearch(16);

        newArray.bubbleSort();
        newArray.printArray();

        newArray.binarySearch(18);

    }

}
