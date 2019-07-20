package com.wilmol.leetcode.problemset.concurrency.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Timeout;

/** Created by will on 2019-07-17 at 9:04 PM. */
@Timeout(value = 1)
class P1114PrintInOrderTest {

  private P1114PrintInOrder object;

  private volatile String s;

  private Thread threadA;

  private Thread threadB;

  private Thread threadC;

  @BeforeEach
  void setUp() {
    object = new P1114PrintInOrder();
    s = "";
    threadA =
        new Thread(
            () ->
                object.first(
                    () -> {
                      synchronized (this) {
                        s += "first";
                      }
                    }));
    threadB =
        new Thread(
            () ->
                object.second(
                    () -> {
                      synchronized (this) {
                        s += "second";
                      }
                    }));
    threadC =
        new Thread(
            () ->
                object.third(
                    () -> {
                      synchronized (this) {
                        s += "third";
                      }
                    }));
  }

  @AfterEach
  void verifyCorrectOrder() throws InterruptedException {
    threadA.join();
    threadB.join();
    threadC.join();
    assertThat(s).isEqualTo("firstsecondthird");
  }

  @Test
  void abc() {
    threadA.start();
    threadB.start();
    threadC.start();
  }

  @Test
  void acb() {
    threadA.start();
    threadC.start();
    threadB.start();
  }

  @Test
  void bac() {
    threadB.start();
    threadA.start();
    threadC.start();
  }

  @Test
  void bca() {
    threadB.start();
    threadC.start();
    threadA.start();
  }

  @Test
  void cab() {
    threadC.start();
    threadA.start();
    threadB.start();
  }

  @Test
  void cba() {
    threadC.start();
    threadB.start();
    threadA.start();
  }
}
