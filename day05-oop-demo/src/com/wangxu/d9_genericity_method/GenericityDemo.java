package com.wangxu.d9_genericity_method;

public class GenericityDemo {
    public static void main(String[] args) {
        String[] names = {"小明", "小帅", "小美"};
        printArray(names);
        Integer[] ages = {10, 20, 30};
        printArray(ages);
        Integer[] ages2 = getArr(ages);
        String[] names2 = getArr(names);

    }

    public static <T> T[] getArr(T[] arr){
        return arr;
    }
    public static <T> void printArray(T[] arr) {
        if (arr != null) {
            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length - 1 ? "" : ", ");
            }
            sb.append("]");
            System.out.println(sb);
        } else {
            System.out.println(arr);
        }
    }
}
