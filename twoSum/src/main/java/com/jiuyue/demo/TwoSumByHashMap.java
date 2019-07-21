package com.jiuyue.demo;

import java.util.HashMap;
import java.util.Map;

/**
 * Create bySeptember
 * 2019/7/21
 * 17:08
 */

/**
 * 方法二:两遍哈希表
 * 解题思路：先遍历数组将下标对应的元素存到散列表，然后同目标值减去的值去散列表中查看是否存在。
 */
public class TwoSumByHashMap {
    public static void main(String[] args) {
        int [] nums = {2, 7, 11, 15};
        int  target = 9;
        int [] result = solution(nums, target);
        for (int i : result) {
            System.out.println(i);
        }
    }
    public static int [] solution(int [] nums,int target){
        Map<Integer,Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i<nums.length; i++){
            map.put(nums[i],i);
        }
        for (int i = 0; i<nums.length; i++){
            int key = target - nums[i];
            if (map.containsKey(key) && map.get(key) != i){
                return new int[] {i,map.get(key)};
            }
        }
        throw new IllegalArgumentException("No found the solution");
    }
}
