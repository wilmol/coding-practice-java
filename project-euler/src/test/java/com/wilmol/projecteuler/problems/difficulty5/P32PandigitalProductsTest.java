package com.wilmol.projecteuler.problems.difficulty5;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

/** Created by will on 2019-04-14 at 4:49 PM. */
class P32PandigitalProductsTest {

  @Test
  void digits1To3() {
    assertThat(P32PandigitalProducts.pandigitalProductsSum(3)).isEqualTo(0);
  }

  @Test
  void digits1To5() {
    // 13 * 4 = 52
    assertThat(P32PandigitalProducts.pandigitalProductsSum(5)).isEqualTo(52);
  }

  @Test
  void digits1To9() {
    // 39 * 186 = 7254, and few others
    assertThat(P32PandigitalProducts.pandigitalProductsSum(9)).isEqualTo(45228);
  }
}