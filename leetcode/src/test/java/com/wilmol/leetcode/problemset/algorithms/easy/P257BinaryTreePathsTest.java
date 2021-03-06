package com.wilmol.leetcode.problemset.algorithms.easy;

import static com.google.common.truth.Truth.assertThat;

import com.wilmol.leetcode.common.BinaryTreeNode;
import org.junit.jupiter.api.Test;

/**
 * P257BinaryTreePathsTest.
 *
 * @author <a href=https://wilmol.com>Will Molloy</a>
 */
class P257BinaryTreePathsTest {

  private final P257BinaryTreePaths p257 = new P257BinaryTreePaths();

  @Test
  void example() {
    assertThat(p257.binaryTreePaths(BinaryTreeNode.fromLevelOrder(1, 2, 3, null, 5)))
        .containsExactly("1->2->5", "1->3");
  }
}
