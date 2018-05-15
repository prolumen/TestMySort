//package ua.ithillel.dnipro;
//
//import java.util.Random;
//
///**
// * Hello world!
// *
// */
//public class App {
//    int []array =new int[10];
//    Random rand = new Random();
//
//    App(){
//        for (int i=0; i<array.length; i++){
//            array[i] = rand.nextInt(21)-1;
//        }
//    }
//
//    public int[] sortArr(){
//        for (int i = 0; i < array.length-1; i++){
//            int nMin = i;
//            for (int j = i+1; j < array.length; j++){
//                if (array[j] < array[nMin]){
//                    nMin = j;
//                }
//            }
//            if (nMin !=i){
//                int tmp = array[i];
//                array[i] = array[nMin];
//                array[nMin] = tmp;
//            }
//        }
//        return array;
//    }
//
//    public static void main(String[] args )
//    {
//        System.out.println( "Hello World!" );
//    }
//}
