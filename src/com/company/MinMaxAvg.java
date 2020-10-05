package com.company;
import com.company.RandomValue;
public class MinMaxAvg {
    public static void main(String[] args) {
        RandomValue rd = new RandomValue();
        Integer[] array = new Integer[rd.GetRandom(100)];
        for (int i = 0; i < array.length; i++){
            array[i] = rd.GetRandom(10);
        }
        int min = array[1];
        int max = array[2];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] < min){
                min = array[i];
            }
            if (array[i] > max){
                max = array[i];
            }
            sum += array[i];
        }
        System.out.format("MIN = %d MAX = %d AVG = "+Double.toString(sum/array.length),min,max);
    }
}
