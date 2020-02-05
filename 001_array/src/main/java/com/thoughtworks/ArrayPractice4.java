package com.thoughtworks;

public class ArrayPractice4 {

    /**
     * 完成本方法实现功能: 将一个数字插入到给定的已经排好序的数组中，要求插入以后数组依然是有序的
     */
    public static int[] insert(int number) {
        int[] array = new int[]{1, 20, 50, 100};
        int[] result = new int[array.length + 1];
        int i = 0;
        while(i < array.length && number > array[i]) {
            result[i] = array[i];
            ++i;
        }
        result[i] = number;
        while(i != result.length - 1) {
            result[i + 1] = array[i];
            i++;
        }
        return result;
    }
}
