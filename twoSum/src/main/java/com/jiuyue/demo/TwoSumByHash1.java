package com.jiuyue.demo;

/**
 * Create bySeptember
 * 2019/7/21
 * 17:22
 */

import java.util.HashMap;
import java.util.Map;

/**
 * 方法三:一遍哈希表
 * 解题思路：遍历目标值减去数组元素的差值同时判断该值在散列表中是否存在差值，如果存在，则返回。
 * 也就是我们可以一次完成，在进行迭代并将元素插入到表中的同时，我们还会回过头来检查表中是否已经存在当前元素所对应的目标元素。如果它存在，那我们已经找到了对应解，并立即将其返回。
 *
 */
public class TwoSumByHash1 {
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
            int key = target - nums[i];
            if (map.containsKey(key) && map.get(key) != i){
                return new int[] {map.get(key),i};
            }
            map.put(nums[i],i);
        }
        throw new IllegalArgumentException("No found the solution");
    }
}
