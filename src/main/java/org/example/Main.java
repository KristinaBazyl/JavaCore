package org.example;


public class Main {
    public static void main(String[] args) {
    int [] arr = {2, 0, 2, 0, 4};
        System.out.println(countEvens(arr));
        System.out.println(differenceMaxMin(arr));
        System.out.println(adjacentElementZeros(arr));
    }
    static int countEvens(int [] array){
        int countElement =0;
        for (int item: array) {
            if(item % 2 == 0) countElement ++;
        }
        return countElement;
    }

    static int differenceMaxMin(int [] array){
        int max = array[0];
        int min = array[0];
        for (int item: array) {
            if(item> max) max = item;
            else if (item< min) min = item;
        }
        return max-min;
    }

    static boolean adjacentElementZeros(int [] array){
        for (int i = 0; i < array.length-1; i++) {
            if(array[i]==0 && array[i+2]==0) return true;
        }
        return false;
    }


}