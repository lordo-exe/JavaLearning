package com.company;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] ages = {50, 40, 30, 20};
        Arrays.sort(ages);
        int[] agesOther = Arrays.copyOfRange(ages, ages.length - 2, ages.length);
        System.out.println(Arrays.toString(agesOther));
    }

    static String echoString(String text) {
        return text + "\n" + text;
    }
}

