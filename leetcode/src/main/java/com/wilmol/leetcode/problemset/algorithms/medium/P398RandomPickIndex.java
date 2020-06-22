package com.wilmol.leetcode.problemset.algorithms.medium;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Created by wilmol on 2020-06-08.
 *
 * <p><a
 * href=https://leetcode.com/problems/random-pick-index>https://leetcode.com/problems/random-pick-index/</a>
 *
 * <p>Extra space: O(n)
 *
 * <p>Key: Store indices by num in map for O(1) lookup.
 *
 * @see P528RandomPickWithWeight
 */
class P398RandomPickIndex {

  static class Solution {

    private final Map<Integer, List<Integer>> numIndices = new HashMap<>();

    // O(n)
    Solution(int[] nums) {
      for (int i = 0; i < nums.length; i++) {
        numIndices.computeIfAbsent(nums[i], k -> new ArrayList<>()).add(i);
      }
    }

    // O(1)
    public int pick(int target) {
      List<Integer> indices = numIndices.get(target);
      int bound = indices.size();
      int rand = ThreadLocalRandom.current().nextInt(bound);
      return indices.get(rand);
    }
  }
}