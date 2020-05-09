package wilmol.leetcode.problemset.algorithms.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wilmol on 2020-05-09.
 *
 * <p><a
 * href=https://leetcode.com/problems/kids-with-the-greatest-number-of-candies>https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Extra space: O(1)
 *
 * <p>Key: Take all the candies.
 */
class P1431KidsWithTheGreatestNumberOfCandies {

  public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
    // compute max so know what is the 'greatest' number of candies
    int max = 0;
    for (int i : candies) {
      max = Math.max(max, i);
    }

    // note that the simulation (of distributing candies) runs for each kid
    List<Boolean> list = new ArrayList<>(candies.length);
    for (int i : candies) {
      // (greedy) see if taking all the extra candies would result in the greatest
      list.add(i + extraCandies >= max);
    }
    return list;
  }
}
