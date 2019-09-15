package wilmol.hackerrank.regex.applications.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

/** Created by wilmol on 2019-09-15. */
class ValidPanFormatTest {

  @Test
  void testCase0() {
    assertThat(ValidPanFormat.isValid("ABCDS1234Y")).isTrue();
    // 5th place must be char
    assertThat(ValidPanFormat.isValid("ABAB12345Y")).isFalse();
    // lower case chars
    assertThat(ValidPanFormat.isValid("avCDS1234Y")).isFalse();
  }
}
