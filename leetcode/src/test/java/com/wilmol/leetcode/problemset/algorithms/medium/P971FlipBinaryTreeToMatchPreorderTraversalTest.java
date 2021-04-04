package com.wilmol.leetcode.problemset.algorithms.medium;

import static com.google.common.truth.Truth.assertThat;

import com.wilmol.leetcode.common.BinaryTreeNode;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * P971FlipBinaryTreeToMatchPreorderTraversalTest.
 *
 * @author <a href=https://wilmol.com>Will Molloy</a>
 */
class P971FlipBinaryTreeToMatchPreorderTraversalTest {

  private final P971FlipBinaryTreeToMatchPreorderTraversal
      p971FlipBinaryTreeToMatchPreorderTraversal = new P971FlipBinaryTreeToMatchPreorderTraversal();

  @ParameterizedTest
  @MethodSource
  void examples(BinaryTreeNode root, int[] voyage, List<Integer> expected) {
    assertThat(p971FlipBinaryTreeToMatchPreorderTraversal.flipMatchVoyage(root, voyage))
        .containsExactlyElementsIn(expected)
        .inOrder();
  }

  static Stream<Arguments> examples() {
    return Stream.of(
        Arguments.of(BinaryTreeNode.fromLevelOrder(1, 2), new int[] {2, 1}, List.of(-1)),
        Arguments.of(BinaryTreeNode.fromLevelOrder(1, 2, 3), new int[] {1, 3, 2}, List.of(1)),
        Arguments.of(BinaryTreeNode.fromLevelOrder(1, 2, 3), new int[] {1, 2, 3}, List.of()));
  }
}
