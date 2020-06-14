package wilmol.leetcode.problemset.algorithms.easy;

/**
 * Created by wilmol on 2020-06-14.
 *
 * <p><a
 * href=https://leetcode.com/problems/running-sum-of-1d-array>https://leetcode.com/problems/running-sum-of-1d-array/</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Extra space: O(n) (can be O(1) if you reuse input array)
 *
 * <p>Key: Running sum = cumulative sum (prefix sum).
 */
class P1480RunningSumOf1dArray {

  public int[] runningSum(int[] nums) {
    int n = nums.length;

    int[] a = new int[n];
    a[0] = nums[0];
    for (int i = 1; i < n; i++) {
      a[i] = a[i - 1] + nums[i];
    }
    return a;
  }
}
