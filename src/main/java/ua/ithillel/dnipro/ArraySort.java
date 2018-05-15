package ua.ithillel.dnipro;

import java.util.Random;

public class ArraySort {
    Random rand = new Random();
    public static int [] arr = new int [10];

    public  int [] fill(){
        for (int i=0; i<arr.length; i++){
            int tmp = rand.nextInt(21) -1;
            arr[i] = tmp;
        }
        return arr;
    }
    public static int [] sort(){
        for (int i = 0; i < arr.length-1; i++){
            int nMin = i;
            for (int j = i+1; j < arr.length; j++){
                if (arr[j] < arr[nMin]){
                    nMin = j;
                }
            }
            if (nMin !=i){
                int tmp = arr[i];
                arr[i] = arr[nMin];
                arr[nMin] = tmp;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        ArraySort arraySort = new ArraySort();
    }
}
