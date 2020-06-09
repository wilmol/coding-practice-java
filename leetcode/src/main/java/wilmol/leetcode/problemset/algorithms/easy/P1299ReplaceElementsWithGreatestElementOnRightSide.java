package wilmol.leetcode.problemset.algorithms.easy;

/**
 * Created by wilmol on 2020-06-09.
 *
 * <p><a
 * href=https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side>https://leetcode.com/problems/replace-elements-with-greatest-element-on-right-side/</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Extra space: O(1)
 *
 * <p>Key: Track max so far from right.
 */
class P1299ReplaceElementsWithGreatestElementOnRightSide {

  public int[] replaceElements(int[] arr) {
    int n = arr.length;

    int max = -1;
    for (int i = n - 1; i >= 0; i--) {
      // write max so far from right
      int temp = arr[i];
      arr[i] = max;
      // update max
      max = Math.max(max, temp);
    }
    return arr;
  }
}
