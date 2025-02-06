package com.example.project;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Runner {
    public static void main(String[] args) {
        String[] stringList = {"hi", "hello", "world", "willow"};
        ArrayList<String> strList = new ArrayList<>(Arrays.asList(stringList));
        System.out.println(Main.insertAfterI(strList, "new"));

        String[] stringList2 = {"cat", "dog", "elephant", "fox"};
        ArrayList<String> strList2 = new ArrayList<>(Arrays.asList(stringList2));
        System.out.println(Main.removeThree(strList2));

        int[] intArray = {1, 2, 3, 4};
        System.out.println(Main.reverseArray(intArray));

        String[] stringList3 = {"hello", "world"};
        ArrayList<String> strList3 = new ArrayList<>(Arrays.asList(stringList3));
        System.out.println(Main.duplicateUpperEnd(strList3));

        String str = "This is a test";
        System.out.println(Main.parseSentence(str));

        String[] stringList4 = {"apple", "banana", "cherry", "Bagel"};
        ArrayList<String> strList4 = new ArrayList<>(Arrays.asList(stringList4));
        System.out.println(Main.moveBWords(strList4));

        Integer[] intList = {1, 2, 5, 4, 2, 2, 1, 6, 4, 4, 8, 1, 7, 4, 2};
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(intList));
        System.out.println(Main.removeDuplicates(numList));

        Integer[] intList2 = {1, 2, 3, 1};
        ArrayList<Integer> numList2 = new ArrayList<>(Arrays.asList(intList2));
        System.out.println(Main.sameFirstLast(numList2));

        Integer[] intList3 = {1, 2, 3};
        ArrayList<Integer> numList3 = new ArrayList<>(Arrays.asList(intList3));
        System.out.println(Main.sameFirstLast(numList3));

        Integer[] intList4 = {1, 2, 3, 4};
        ArrayList<Integer> numList4 = new ArrayList<>(Arrays.asList(intList4));
        System.out.println(Main.swapEnds(numList4));

        Integer[] intList5 = {1, 0, 2, 0, 3};
        ArrayList<Integer> numList5 = new ArrayList<>(Arrays.asList(intList5));
        System.out.println(Main.zeroFront(numList5));

        Integer[] intList6 = {1, 2, 3, 2, 5, 2};
        ArrayList<Integer> numList6 = new ArrayList<>(Arrays.asList(intList6));
        System.out.println(Main.notAlone(numList6,2));

        Integer[] intList7 = {1, 2, 3, 4};
        ArrayList<Integer> numList7 = new ArrayList<>(Arrays.asList(intList7));
        System.out.println(Main.shiftLeft(numList7));

        Integer[] intList8 = {1, 3, 1, 4, 4, 3, 1};
        ArrayList<Integer> numList8 = new ArrayList<>(Arrays.asList(intList8));
        System.out.println(Main.fix34(numList8));

        int[] intList9 = {1, 2, 3, 4, 5, 6, 1, 2, 3, 4, 5, 6, 7, 1, 2, 3, 4, 5, 6};
        System.out.println(Main.modes(intList9));

        ArrayList<Integer> list = new ArrayList<Integer>();
        Collections.addAll(list,1,0,0,1);
        ArrayList<Integer> expected = new ArrayList<>();
        Collections.addAll(expected,0,0,1,1);
        System.out.print(expected);
        System.out.println(Main.zeroFront(list));
        list.clear();expected.clear();

        Collections.addAll(list,0,1,1,0,1);
        Collections.addAll(expected,0,0,1,1,1);
        System.out.print(expected);
        System.out.println(Main.zeroFront(list));
        list.clear();expected.clear();

        Collections.addAll(list,1,0);
        Collections.addAll(expected,0,1);

        System.out.print(expected);
        System.out.println(Main.zeroFront(list));
    }
}