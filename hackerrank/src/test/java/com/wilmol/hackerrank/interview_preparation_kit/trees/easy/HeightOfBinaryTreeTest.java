package com.wilmol.hackerrank.interview_preparation_kit.trees.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

import com.wilmol.hackerrank.common.BinaryTreeNode;

class HeightOfBinaryTreeTest
{

  @Test
  void heightOf3()
  {
    BinaryTreeNode root = BinaryTreeNode.of(3);
    root.left = BinaryTreeNode.of(2);
    root.right = BinaryTreeNode.of(5);
    root.left.left = BinaryTreeNode.of(1);
    root.right.left = BinaryTreeNode.of(4);
    root.right.right = BinaryTreeNode.of(6);
    root.right.right.right = BinaryTreeNode.of(7);
    assertThat(HeightOfBinaryTree.height(root)).isEqualTo(3);
  }

  @Test
  void heightOf0()
  {
    BinaryTreeNode root = BinaryTreeNode.of(3);
    assertThat(HeightOfBinaryTree.height(root)).isEqualTo(0);
  }

}