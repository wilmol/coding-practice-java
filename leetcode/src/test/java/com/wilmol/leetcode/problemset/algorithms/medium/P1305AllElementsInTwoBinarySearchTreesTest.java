package com.wilmol.leetcode.problemset.algorithms.medium;

import static com.google.common.truth.Truth.assertThat;

import com.google.common.collect.ImmutableList;
import com.wilmol.leetcode.common.BinaryTreeNode;
import java.util.List;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

/**
 * P1305AllElementsInTwoBinarySearchTreesTest.
 *
 * @author <a href=https://wilmol.com>Will Molloy</a>
 */
class P1305AllElementsInTwoBinarySearchTreesTest {

  private final P1305AllElementsInTwoBinarySearchTrees p1305 =
      new P1305AllElementsInTwoBinarySearchTrees();

  @ParameterizedTest
  @MethodSource
  void examples(BinaryTreeNode root1, BinaryTreeNode root2, List<Integer> expected) {
    assertThat(p1305.getAllElements(root1, root2)).containsExactlyElementsIn(expected).inOrder();
  }

  static Stream<Arguments> examples() {
    return Stream.of(
        Arguments.of(
            BinaryTreeNode.fromLevelOrder(2, 1, 4),
            BinaryTreeNode.fromLevelOrder(1, 0, 3),
            ImmutableList.of(0, 1, 1, 2, 3, 4)),
        Arguments.of(
            BinaryTreeNode.fromLevelOrder(0, -10, 10),
            BinaryTreeNode.fromLevelOrder(5, 1, 7, 0, 2),
            ImmutableList.of(-10, 0, 0, 1, 2, 5, 7, 10)),
        Arguments.of(
            null, BinaryTreeNode.fromLevelOrder(5, 1, 7, 0, 2), ImmutableList.of(0, 1, 2, 5, 7)),
        Arguments.of(BinaryTreeNode.fromLevelOrder(0, -10, 10), null, ImmutableList.of(-10, 0, 10)),
        Arguments.of(
            BinaryTreeNode.fromLevelOrder(1, null, 8),
            BinaryTreeNode.fromLevelOrder(8, 1),
            ImmutableList.of(1, 1, 8, 8)));
  }
}
