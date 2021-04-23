package lyh7712.algorithm.leetcode;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {

    public static void main(String[] args) {

        for (int i = 0; i < 2; i++) {
            System.out.println("result = " + twoSum(new int[]{3, 2, 4}, 6));
        }
    }


//    public static int[] twoSum(int[] nums, int target) {
//        int[] arr = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = i + 1; j < nums.length; j++) {
//                if (nums[i] + nums[j] == target) {
//                    arr[0] = i;
//                    arr[1] = j;
//                }
//            }
//        }
//        return arr;
//    }



    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {  // 3, 4, 2
                return new int[]{i, map.get(target - nums[i])};
            }
            map.put(nums[i], i);
        }
        return new int[0];
    }

}
