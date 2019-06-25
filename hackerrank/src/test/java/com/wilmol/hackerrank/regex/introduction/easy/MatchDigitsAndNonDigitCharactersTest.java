package com.wilmol.hackerrank.regex.introduction.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

class MatchDigitsAndNonDigitCharactersTest {

  @Test
  void testMatches() {
    assertThat(new MatchDigitsAndNonDigitCharacters().matches("06-11-2015")).isTrue();
  }

  @Test
  void testDoesNotMatch() {
    assertThat(new MatchDigitsAndNonDigitCharacters().matches("06112015")).isFalse();
  }
}
