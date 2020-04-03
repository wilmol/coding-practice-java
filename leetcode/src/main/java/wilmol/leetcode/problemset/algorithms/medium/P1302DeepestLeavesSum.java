package wilmol.leetcode.problemset.algorithms.medium;

import java.util.ArrayDeque;
import java.util.Objects;
import java.util.Queue;
import java.util.stream.Stream;
import wilmol.leetcode.common.BinaryTreeNode;

/**
 * Created by wilmol on 2020-04-03.
 *
 * <p><a
 * href=https://leetcode.com/problems/deepest-leaves-sum>https://leetcode.com/problems/deepest-leaves-sum</a>
 *
 * <p>Runtime: O(n)
 *
 * <p>Space: O(n)
 *
 * <p>Key: BFS traversal
 */
class P1302DeepestLeavesSum {

  public int deepestLeavesSum(BinaryTreeNode root) {
    // just find the deepest level with bfs
    Queue<BinaryTreeNode> queue = new ArrayDeque<>();
    queue.add(root);

    int deepestSum = root.val;
    while (!queue.isEmpty()) {
      int levelSize = queue.size();
      // traversed to a new level, reset the sum
      deepestSum = 0;
      for (int i = 0; i < levelSize; i++) {
        BinaryTreeNode node = queue.remove();
        deepestSum += node.val;
        Stream.of(node.left, node.right).filter(Objects::nonNull).forEach(queue::add);
      }
    }
    return deepestSum;
  }
}
