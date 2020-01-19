package wilmol.leetcode.problemset.algorithms.hard;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

/** Created by wilmol on 2020-01-19. */
class P76MinimumWindowSubstringTest {

  private final P76MinimumWindowSubstring func = new P76MinimumWindowSubstring();

  @Test
  void smallestWindowAtEnd() {
    assertThat(func.minWindow("ADOBECODEBANC", "ABC")).isEqualTo("BANC");
  }

  @Test
  void smallestWindowAtStart() {
    assertThat(func.minWindow("ABCDEF", "ABC")).isEqualTo("ABC");
  }

  @Test
  void smallestWindowInMiddle() {
    assertThat(func.minWindow("123ABCDEF", "ABC")).isEqualTo("ABC");
  }

  @Test
  void smallestWindowDoesntExist() {
    assertThat(func.minWindow("123456", "ABC")).isEmpty();
  }

  @Test
  void multipleSmallestWindows() {
    assertThat(func.minWindow("AB1CXYZAB2CXYZAB3C", "ABC")).isEqualTo("AB1C");
  }

  @Test
  void requireMultipleOfSameCharacter() {
    assertThat(func.minWindow("ABCABCBDBB1", "BBB")).isEqualTo("BDBB");
  }
}
