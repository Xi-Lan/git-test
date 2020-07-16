package com.wyf;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ArrayList01 {

    public static void main(String[] args) {
        ArrayList<Integer> list01 = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i < 20; i++) {
           list01.add(random.nextInt(20) + 1);
        }
        System.out.println(list01.toString());
        ArrayList<Integer> list02 = ArrayList01.getList02(list01);
        System.out.println(list02.toString());

    }


    public static ArrayList<Integer> getList02(ArrayList<Integer> list){
        ArrayList<Integer> list02 = new ArrayList<>();
        for (int i = 0; i < 20; i++) {
            int num = list.get(i);
            if (num % 2==0){
                list02.add(list.get(i));
            }
        }
        return list02;
    }


}
