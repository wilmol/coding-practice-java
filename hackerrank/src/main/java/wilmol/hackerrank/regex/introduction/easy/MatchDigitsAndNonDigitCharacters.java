package wilmol.hackerrank.regex.introduction.easy;

import java.util.regex.Pattern;
import wilmol.hackerrank.regex.Regex;

/**
 * Created by Will on 2019-04-02 at 21:08.
 *
 * <p><a
 * href=https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem>https://www.hackerrank.com/challenges/matching-digits-non-digit-character/problem</a>
 */
class MatchDigitsAndNonDigitCharacters implements Regex {

  private static final Pattern PATTERN = Pattern.compile("\\d\\d\\D\\d\\d\\D\\d\\d\\d\\d");

  /**
   * \d -> digit [0-9].
   *
   * <p>\D -> non digit.
   */
  @Override
  public Pattern pattern() {
    return PATTERN;
  }
}