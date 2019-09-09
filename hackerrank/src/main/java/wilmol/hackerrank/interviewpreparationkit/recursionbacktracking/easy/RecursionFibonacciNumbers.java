package wilmol.hackerrank.interviewpreparationkit.recursionbacktracking.easy;

/**
 * Created by wilmol on 2019-09-09.
 *
 * <p><a
 * href=https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking>https://www.hackerrank.com/challenges/ctci-fibonacci-numbers/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=recursion-backtracking</a>
 *
 * <p>Runtime: O(2^n) (~θ(1.6^n)) (<a href=https://stackoverflow.com/a/360773/6122976e>Computational
 * complexity of Fibonacci Sequence</a>)
 */
final class RecursionFibonacciNumbers {

  private RecursionFibonacciNumbers() {}

  static int fibonacci(int n) {
    if (n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }
}
