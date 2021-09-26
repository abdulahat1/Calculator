package com.company;

public class Test {
    public static void main(String[] args) {
       int nums1[] = {1,-2,3,5,-1}; // 测试用例1 最大值8
       int nums2[] = {1,-2,3,-8,5,1};// 测试用例1 最大值6
        int nums[] = { 1, -2, 3, -2, 5, 1 }; // 测试用例1 最大值7
        Sum sum = new Sum();
        sum.sumParams(nums);
        sum.sumParams(nums1);
        sum.sumParams(nums2);
    }
}
