package com.company;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {


       SmartPhone sp = new SmartPhone(12,10);
       SmartPhone sp2 = new SmartPhone(3, 6);
       SmartPhone sp3 = new SmartPhone(4, 7);
       SmartPhone sp4 = new SmartPhone(2, 9);
        ArrayList<SmartPhone> spList = new ArrayList<>();


        spList.add(sp);
        spList.add(sp2);
        spList.add(sp3);
        spList.add(sp4);

//        System.out.println(spList);
//
//        Collections.sort(spList);
//
//        System.out.println(spList);

        System.out.println(sp.totalTexts);

        sp.sendText();

        System.out.println(sp.totalTexts);


    }
}
