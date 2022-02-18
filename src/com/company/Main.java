package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        int arr[] = {23, 6, 7};
        try {
            System.out.println(arr[3]);
        } catch (Exception e) {
            System.out.println("Такого индекса в массиве нет" + e);
        }
    }
}