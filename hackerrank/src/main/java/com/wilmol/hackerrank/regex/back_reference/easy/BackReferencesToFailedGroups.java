package com.wilmol.hackerrank.regex.back_reference.easy;

import com.wilmol.hackerrank.regex.Regex;
import java.util.regex.Pattern;

/**
 * Created by Will on 2019-04-06 at 19:54
 *
 * <p>https://www.hackerrank.com/challenges/backreferences-to-failed-groups/problem
 */
class BackReferencesToFailedGroups implements Regex {

  private static final Pattern PATTERN = Pattern.compile("^\\d{2}(-?)(\\d{2}\\1){2}\\d{2}$");

  /**
   * \1 will match either '-' or ''
   *
   * <p>i.e. only match '-' if it occurred previously (perfect use case for back reference)
   */
  @Override
  public Pattern pattern() {
    return PATTERN;
  }
}
