package com.wilmol.hackerrank.regex.back_reference.easy;

import java.util.regex.Pattern;

import com.wilmol.hackerrank.regex.Regex;

/**
 * Created by Will on 2019-04-06 at 20:30
 * <p>
 * https://www.hackerrank.com/challenges/forward-references/problem
 */
class ForwardReferences
    implements
    Regex
{

  private static final Pattern PATTERN = Pattern.compile("^(\\2tic|(tac))+$");

  /**
   * forward reference -> back reference to a group that would appear later only useful if inside a repeated group (else
   * may be evaluated as back reference)
   * <p>
   * only match 'tic' after at least two 'tac' then only match non adjacent 'tic'
   * <p>
   * group 2 = 'tac' i.e. the \2 will repeat 'tac' therefore group 1 = 'tac' OR 'tactic' alternatively (and probably
   * preferred): ^tac(tac(tic)?)*$
   */
  @Override
  public Pattern pattern()
  {
    return PATTERN;
  }
}