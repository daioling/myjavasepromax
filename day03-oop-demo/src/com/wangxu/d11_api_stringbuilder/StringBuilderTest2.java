package com.wangxu.d11_api_stringbuilder;

public class StringBuilderTest2 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3};
    }
    public static String toString(int[] arr){
        if(arr != null){

            StringBuilder sb = new StringBuilder("[");
            for (int i = 0; i < arr.length; i++) {
                sb.append(arr[i]).append(i == arr.length-1 ? "" : " ,");
            }
            sb.append("]");
            return sb.toString();
        }else {
            return null;
        }
    }
}
