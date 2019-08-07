package wilmol.hackerrank.regex.introduction.easy;

import java.util.regex.Pattern;
import wilmol.hackerrank.regex.Regex;

/**
 * Created by Will on 2019-04-02 at 21:07.
 *
 * <p><a
 * href=https://www.hackerrank.com/challenges/matching-specific-string/problem>https://www.hackerrank.com/challenges/matching-specific-string/problem</a>
 */
class MatchSpecificString implements Regex {

  private static final Pattern PATTERN = Pattern.compile("hackerrank");

  /** only match this word. */
  @Override
  public Pattern pattern() {
    return PATTERN;
  }
}