package wilmol.hackerrank.regex.applications.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

/** Created by wilmol on 2019-09-15. */
class SplitThePhoneNumberTest {

  @Test
  void testCase10() {
    assertThat(SplitThePhoneNumber.splitNumber("1 877 2638277"))
        .isEqualTo("CountryCode=1,LocalAreaCode=877,Number=2638277");
    assertThat(SplitThePhoneNumber.splitNumber("91-011-23413627"))
        .isEqualTo("CountryCode=91,LocalAreaCode=011,Number=23413627");
  }
}
