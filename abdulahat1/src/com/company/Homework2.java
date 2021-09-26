package com.company;

import org.junit.Test;

public class Homework2 {


    public class SumTest {
        @Test
        public void test() {
            /* int nums[] = {1,-2,3,5,-1}; */// 测试用例1 最大值8
            /* int nums[] = {1,-2,3,-8,5,1}; */// 测试用例1 最大值6
            int nums[] = { 1, -2, 3, -2, 5, 1 }; // 测试用例1 最大值7
            Sum sum = new Sum();
            sum.sumParams(nums);
        }


    }
}
