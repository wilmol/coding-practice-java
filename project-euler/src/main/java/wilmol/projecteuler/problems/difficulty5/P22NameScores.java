package wilmol.projecteuler.problems.difficulty5;

import java.util.List;
import java.util.Locale;
import wilmol.projecteuler.common.Collections;

/**
 * Created by Will on 17/03/2019.
 *
 * <p><a href=https://projecteuler.net/problem=22>https://projecteuler.net/problem=22</a>
 *
 * <p>Runtime: O(n log n)
 */
class P22NameScores {

  public int apply(List<String> names) {
    return Collections.zipWithIndex(names.stream().sorted())
        .mapToInt((p) -> score(p.getLeft()) * (p.getRight() + 1))
        .sum();
  }

  private int score(String name) {
    return name.toUpperCase(Locale.getDefault()).chars().map(c -> c - 'A' + 1).sum();
  }
}