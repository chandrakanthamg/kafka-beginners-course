package io.conduktor.demos.kafka;

public class WIP {
    public static void main(String[] args) {
        int[] arr1 = {3, 4, -5, 8, 9, 9, 2, -7};

        for (int i = 0; i < arr1.length; i++) {
            int smallNum = arr1[i];
            for (int j = i + 1; j < arr1.length; j++) {
                if (smallNum > arr1[j]) {
                    smallNum = arr1[j];
                    break;
                }
            }
            arr1[i] = smallNum;
        }
        for (int num:arr1
             ) {
        System.out.println("arr1 = " + num);

        }
    }
}
