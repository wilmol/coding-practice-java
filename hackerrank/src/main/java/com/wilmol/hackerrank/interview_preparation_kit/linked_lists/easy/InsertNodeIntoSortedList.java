package com.wilmol.hackerrank.interview_preparation_kit.linked_lists.easy;

import com.wilmol.hackerrank.common.SinglyLinkedListNode;

/**
 * Created by Will on 28/03/2019
 *
 * <p>https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=linked-lists
 *
 * <p>Don't even need pointer to previous.. just track previous..
 *
 * <p>Runtime: O(n)
 */
class InsertNodeIntoSortedList {

  static SinglyLinkedListNode sortedInsert(SinglyLinkedListNode head, int data) {
    SinglyLinkedListNode nodeToInsert = SinglyLinkedListNode.of(data);

    SinglyLinkedListNode node = head;
    SinglyLinkedListNode prev = null;
    while (node != null && data > node.data) {
      prev = node;
      node = node.next;
    }
    if (prev == null) {
      // insert at start of list
      head = nodeToInsert;
    } else {
      // insert at middle or end of list
      prev.next = nodeToInsert;
    }
    nodeToInsert.next = node;
    return head;
  }
}
