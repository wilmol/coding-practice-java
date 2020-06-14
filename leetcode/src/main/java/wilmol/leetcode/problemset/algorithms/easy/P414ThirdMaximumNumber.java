package wilmol.leetcode.problemset.algorithms.easy;

import java.util.HashSet;
import java.util.PriorityQueue;
import java.util.Set;

/**
 * Created by wilmol on 2020-06-09.
 *
 * <p><a
 * href=https://leetcode.com/problems/third-maximum-number>https://leetcode.com/problems/third-maximum-number/</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Extra space: O(n)
 *
 * <p>Key: Priority queue (heap) to track the 3 maximums. Place smallest at top of heap so it's
 * removed first.
 *
 * @see wilmol.leetcode.problemset.algorithms.medium.P692TopKFrequentWords
 * @see wilmol.leetcode.problemset.algorithms.medium.P973KClosestPointsToOrigin
 */
class P414ThirdMaximumNumber {

  public int thirdMax(int[] nums) {
    Set<Integer> distinctNums = new HashSet<>();
    for (int i : nums) {
      distinctNums.add(i);
    }

    PriorityQueue<Integer> heap = new PriorityQueue<>();
    for (int i : distinctNums) {
      heap.add(i);
      if (heap.size() > 3) {
        heap.remove();
      }
    }

    if (heap.size() < 3) {
      // if < 3 distinct nums then return the maximum (silly requirement)
      while (heap.size() > 1) {
        heap.remove();
      }
    }
    return heap.peek();
  }
}