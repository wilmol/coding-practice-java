package wilmol.leetcode.problemset.algorithms.easy;

import java.util.Arrays;

/**
 * Created by wilmol on 2020-06-09.
 *
 * <p><a
 * href=https://leetcode.com/problems/height-checker>https://leetcode.com/problems/height-checker/</a>
 *
 * <p>Runtime: O(n * log(n))
 *
 * <p>Extra space: O(n)
 *
 * <p>Key: Copy, sort and compare.
 */
class P1051HeightChecker {

  public int heightChecker(int[] heights) {
    int n = heights.length;
    int[] copy = Arrays.copyOfRange(heights, 0, n);
    Arrays.sort(copy);

    int count = 0;
    for (int i = 0; i < n; i++) {
      if (heights[i] != copy[i]) {
        count++;
      }
    }
    return count;
  }
}
