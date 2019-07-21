package com.wilmol.leetcode.problemset.algorithms.medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Will on 2019-07-21 at 14:02.
 *
 * <p><a href=https://leetcode.com/problems/3sum>https://leetcode.com/problems/3sum</a>
 *
 * <p>Runtime: O(n ^ 2)
 */
class P15ThreeSum {

  public List<List<Integer>> threeSum(int[] nums) {
    List<List<Integer>> result = new ArrayList<>();
    int length = nums.length;
    // initial sort since O(n log n) < O(n ^ 2)
    // can then take advantage of the fact smaller elements on left, larger on right
    Arrays.sort(nums);

    // outer loop: try each element (except for last two)
    // inner loop: two pointers, either side (left: beyond outer loop anchor, right: end of array)
    // move pointers inwards, keeping track of valid sums
    for (int i = 0; i < length - 2; i++) {
      while (i > 0 && i < length - 2 && nums[i - 1] == nums[i]) {
        i += 1; // skip over dupes (not for i=0, so the 'dupe' is used at least once)
      }
      int j = i + 1;
      int k = length - 1;
      while (j < k) {
        int sum = nums[i] + nums[j] + nums[k];
        if (sum == 0) {
          result.add(Arrays.asList(nums[i], nums[j], nums[k]));
          j += 1;
          k -= 1;
          while (j < k && nums[j - 1] == nums[j]) {
            j += 1; // skip over dupes
          }
          while (j < k && nums[k + 1] == nums[k]) {
            k -= 1; // skip over dupes
          }
        } else if (sum < 0) {
          j += 1; // sum too small, use larger numbers
        } else {
          k -= 1; // sum too big, use smaller numbers
        }
      }
    }
    return result;
  }
}
