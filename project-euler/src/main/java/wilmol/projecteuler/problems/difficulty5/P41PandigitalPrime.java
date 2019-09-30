package wilmol.projecteuler.problems.difficulty5;

import com.google.common.math.IntMath;
import java.util.Comparator;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import wilmol.projecteuler.common.Strings;

/**
 * Created by will on 2019-04-19 at 9:47 PM.
 *
 * <p><a href=https://projecteuler.net/problem=41>https://projecteuler.net/problem=41</a>
 *
 * <p>Runtime: none
 */
final class P41PandigitalPrime {

  private P41PandigitalPrime() {}

  static int largestPandigitalPrime() {
    // iterate descending, guarantees the first prime found is the largest
    return IntStream.iterate(9, i -> i - 1)
        // findFirst() will indeed short-circuit the streams generated by flat map
        // https://stackoverflow.com/a/55769675/6122976
        .flatMap(
            numDigits -> {
              String digits =
                  IntStream.rangeClosed(1, numDigits)
                      .boxed()
                      // reverse so largest prime is found first
                      .sorted(Comparator.reverseOrder())
                      .map(String::valueOf)
                      .collect(Collectors.joining());
              return Strings.permutations(digits).stream()
                  .mapToInt(Integer::valueOf)
                  .filter(IntMath::isPrime);
            })
        .findFirst()
        .orElseThrow();
  }
}
