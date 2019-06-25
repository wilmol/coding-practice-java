package com.wilmol.hackerrank.interview_preparation_kit.greedy_algorithms.easy;

import static com.google.common.truth.Truth.assertThat;
import static com.wilmol.hackerrank.interview_preparation_kit.greedy_algorithms.easy.MinimumAbsoluteDifferenceInAnArray.minimumAbsoluteDifference;

import org.junit.jupiter.api.Test;

class MinimumAbsoluteDifferenceInAnArrayTest {

  @Test
  void sampleInput1() {
    assertThat(minimumAbsoluteDifference(new int[] {-59, -36, -13, 1, -53, -92, -2, -96, -54, 75}))
        .isEqualTo(1);
  }

  @Test
  void sampleInput2() {
    assertThat(minimumAbsoluteDifference(new int[] {1, -3, 71, 68, 17})).isEqualTo(3);
  }

  @Test
  void hasDuplicates() {
    assertThat(minimumAbsoluteDifference(new int[] {1, 17, 71, 68, 17})).isEqualTo(0);
  }
}
