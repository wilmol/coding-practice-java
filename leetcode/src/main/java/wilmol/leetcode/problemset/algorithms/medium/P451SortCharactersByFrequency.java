package wilmol.leetcode.problemset.algorithms.medium;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by wilmol on 2020-05-05.
 *
 * <p><a
 * href=https://leetcode.com/problems/sort-characters-by-frequency>https://leetcode.com/problems/sort-characters-by-frequency/</a>
 *
 * <p>Runtime: O(n log(n))
 *
 * <p>Extra space: O(n)
 *
 * <p>Key: Count char freqs.
 */
class P451SortCharactersByFrequency {

  // TODO can do O(n) (bucket sort)

  public String frequencySort(String s) {
    Map<Character, Integer> charFreqs = new HashMap<>();
    for (char c : s.toCharArray()) {
      charFreqs.put(c, charFreqs.getOrDefault(c, 0) + 1);
    }

    return charFreqs.entrySet().stream()
        .sorted(
            Comparator.comparingInt((Map.Entry<Character, Integer> e) -> e.getValue()).reversed())
        .map(
            e -> {
              char[] chars = new char[e.getValue()];
              Arrays.fill(chars, e.getKey());
              return new String(chars);
            })
        .collect(Collectors.joining());
  }
}