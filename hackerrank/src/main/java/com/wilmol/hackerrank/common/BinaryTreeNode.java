package com.wilmol.hackerrank.common;

import java.util.Objects;

/**
 * Created by Will on 24/03/2019
 */
public class BinaryTreeNode
{

  public final int data;

  public BinaryTreeNode left;

  public BinaryTreeNode right;

  private BinaryTreeNode(int data)
  {
    this.data = data;
  }

  public static BinaryTreeNode of(int data)
  {
    return new BinaryTreeNode(data);
  }

  @Override
  public boolean equals(Object o)
  {
    if (this == o)
      return true;
    if (o == null || getClass() != o.getClass())
      return false;
    BinaryTreeNode that = (BinaryTreeNode) o;
    return data == that.data &&
        Objects.equals(left, that.left) &&
        Objects.equals(right, that.right);
  }

  @Override
  public int hashCode()
  {
    return Objects.hash(data, left, right);
  }
}
