package wilmol.leetcode.problemset.algorithms.medium;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;
import wilmol.leetcode.common.BinaryTreeNode;

/** Created by wilmol on 2020-04-03. */
class P1302DeepestLeavesSumTest {

  private final P1302DeepestLeavesSum fun = new P1302DeepestLeavesSum();

  @Test
  void example() {
    assertThat(
            fun.deepestLeavesSum(
                BinaryTreeNode.fromLevelOrder(
                    1, 2, 3, 4, 5, null, 6, 7, null, null, null, null, null, null, 8)))
        .isEqualTo(15);
  }

  @Test
  void singleNode() {
    assertThat(fun.deepestLeavesSum(BinaryTreeNode.fromLevelOrder(1))).isEqualTo(1);
  }

  @Test
  void twoNodes() {
    assertThat(fun.deepestLeavesSum(BinaryTreeNode.fromLevelOrder(1, 2))).isEqualTo(2);
  }

  @Test
  void deepestSumIsNotLargest() {
    assertThat(fun.deepestLeavesSum(BinaryTreeNode.fromLevelOrder(2, 1))).isEqualTo(1);
  }
}
