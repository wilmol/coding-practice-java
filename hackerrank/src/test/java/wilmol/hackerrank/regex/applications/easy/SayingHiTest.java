package wilmol.hackerrank.regex.applications.easy;

import static com.google.common.truth.Truth.assertThat;

import org.junit.jupiter.api.Test;

/** Created by wilmol on 2019-09-15. */
class SayingHiTest {

  @Test
  void valid() {
    assertThat(SayingHi.isCorrect("Hi Alex how are you doing")).isTrue();
  }

  @Test
  void invalid4thCharIsD() {
    assertThat(SayingHi.isCorrect("hI dave how are you doing")).isFalse();
  }

  @Test
  void invalidNoHi() {
    assertThat(SayingHi.isCorrect("Good by Alex")).isFalse();
  }

  @Test
  void invalid3rdCharIsNotSpace() {
    assertThat(SayingHi.isCorrect("hidden agenda")).isFalse();
  }

  @Test
  void invalidHiNotAtStart() {
    assertThat(SayingHi.isCorrect("Alex greeted Martha by saying Hi Martha")).isFalse();
  }
}
