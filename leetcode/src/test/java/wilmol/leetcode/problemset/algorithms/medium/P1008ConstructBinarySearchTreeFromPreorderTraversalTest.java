package wilmol.leetcode.problemset.algorithms.medium;

import static com.google.common.truth.Truth.assertThat;

import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import wilmol.leetcode.common.BinaryTreeNode;

/** Created by wilmol on 2020-04-21. */
class P1008ConstructBinarySearchTreeFromPreorderTraversalTest {

  @ParameterizedTest
  @MethodSource("p1008")
  void example(P1008ConstructBinarySearchTreeFromPreorderTraversal p1008) {
    assertThat(p1008.bstFromPreorder(new int[] {8, 5, 1, 7, 10, 12}))
        .isEqualTo(BinaryTreeNode.fromLevelOrder(8, 5, 10, 1, 7, null, 12));
  }

  @ParameterizedTest
  @MethodSource("p1008")
  void emptyArray(P1008ConstructBinarySearchTreeFromPreorderTraversal p1008) {
    assertThat(p1008.bstFromPreorder(new int[0])).isEqualTo(null);
  }

  static Stream<P1008ConstructBinarySearchTreeFromPreorderTraversal> p1008() {
    return Stream.of(
        new P1008ConstructBinarySearchTreeFromPreorderTraversal.SplitLeftAndRight(),
        new P1008ConstructBinarySearchTreeFromPreorderTraversal.ProvideUpperBound());
  }
}
