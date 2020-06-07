package com.suwadith.data.sructures.and.algorithms;

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

    }

}
