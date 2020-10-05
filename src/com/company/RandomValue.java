package com.company;
import java.util.Random;
public class RandomValue {
    public int GetRandom(int n){
        Random r = new Random();
        int val = r.nextInt(n);
        return val;
    }
}
