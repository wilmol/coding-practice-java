package wilmol.leetcode.problemset.algorithms.medium;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import org.junit.jupiter.api.Test;

/** Created by wilmol on 2020-06-14. */
class P368LargestDivisibleSubsetTest {

  private final P368LargestDivisibleSubset p368 = new P368LargestDivisibleSubset();

  @Test
  void example1() {
    assertThat(p368.largestDivisibleSubset(new int[] {1, 2, 3}))
        .isAnyOf(ImmutableList.of(1, 2), ImmutableList.of(1, 3));
  }

  @Test
  void example2() {
    assertThat(p368.largestDivisibleSubset(new int[] {1, 2, 4, 8})).containsExactly(1, 2, 4, 8);
  }
}
