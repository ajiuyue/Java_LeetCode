package com.jiuyue.demo;

/**
 * Create bySeptember
 * 2019/7/21
 * 16:53
 */
/**
 * 方法一：暴力破解法
 *解题思路：遍历每个元素 x，并查找是否存在一个值与目标 target-x相等的目标元素。
 */
public class TwoSum {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int  target = 9;
        int [] result = solution(nums, target);
        for (int i : result) {
            System.out.println(i);
        }

    }

    public static int [] solution(int [] nums,int target){
        for (int i= 0; i<nums.length; i++){
            for (int j = i+1; j<nums.length; j++){
                if (nums[j] == target - nums[i]){
                    return new int [] {i,j};
                }
            }
        }

        throw new IllegalArgumentException("No found the solution");
    }
}
