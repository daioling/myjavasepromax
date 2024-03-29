package com.wangxu.demo5;

public class Test {
    public static void main(String[] args) {
        // 目标: 二分查找算法的应用。
        int[] nums = {5, 7, 7, 7, 8, 8, 9};
        int leftIndex = getLestIndex(nums, 7);
        int rightIndex = getRightIndex(nums, 7);
        System.out.println(leftIndex);
        System.out.println(rightIndex);
    }

    private static int getRightIndex(int[] nums, int target) {
        // 二分查找该数据的位置。
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else{
                // 找到这个数据出现在middle
                rs = middle;
                // 继续二分往左边找找看
                start = middle + 1;
            }
        }
        return rs;
    }

    private static int getLestIndex(int[] nums, int target) {
        // 二分查找该数据的位置。
        int start = 0;
        int end = nums.length - 1;
        int rs = -1;
        while (start <= end) {
            int middle = (start + end) / 2;
            if (target > nums[middle]) {
                start = middle + 1;
            } else if (target < nums[middle]) {
                end = middle - 1;
            } else{
                // 找到这个数据出现在middle
                rs = middle;
                // 继续二分往左边找找看
                end = middle - 1;
            }
        }
        return rs;
    }
}
