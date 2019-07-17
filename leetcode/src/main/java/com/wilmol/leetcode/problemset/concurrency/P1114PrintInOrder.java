package com.wilmol.leetcode.problemset.concurrency;

/**
 * Created by will on 2019-07-17 at 8:57 PM.
 *
 * <p><a
 * href=https://leetcode.com/problems/print-in-order>https://leetcode.com/problems/print-in-order</a>
 *
 * <p>Runtime: O(n)
 */
class P1114PrintInOrder {

  private volatile int ran;

  public void first(Runnable printFirst) throws InterruptedException {
    printFirst.run();
    ran = 1;
  }

  public void second(Runnable printSecond) throws InterruptedException {
    while (ran < 1) {}
    printSecond.run();
    ran = 2;
  }

  public void third(Runnable printThird) throws InterruptedException {
    while (ran < 2) {}
    printThird.run();
  }
}
