package wilmol.leetcode.problemset.algorithms.easy;

import java.util.PriorityQueue;

/**
 * Created by wilmol on 2020-05-31.
 *
 * <p><a
 * href=https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array>https://leetcode.com/problems/maximum-product-of-two-elements-in-an-array/</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Extra space: O(1)
 *
 * <p>Key: Find largest two elements.
 */
class P1464MaximumProductOfTwoElementsInAnArray {

  // brute force would also work as max n = 500

  public int maxProduct(int[] nums) {
    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int i : nums) {
      heap.add(i);
      if (heap.size() > 2) {
        heap.remove();
      }
    }
    return (heap.remove() - 1) * (heap.remove() - 1);
  }
}