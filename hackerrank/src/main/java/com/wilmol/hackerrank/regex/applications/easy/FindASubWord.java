package com.wilmol.hackerrank.regex.applications.easy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by Will on 2019-04-07 at 13:18
 * <p>
 * https://www.hackerrank.com/challenges/find-substring/problem
 * <p>
 * Runtime: O(nq) (n - num sentences, q - num queries)
 */
class FindASubWord
{

  static List<Long> occurrences(List<String> sentences, List<String> subWords)
  {
    return subWords.stream()
        .map(subWord -> occurrences(sentences, subWord))
        .collect(Collectors.toList());
  }

  private static long occurrences(List<String> sentences, String subWord)
  {
    // words occurring within another word
    Pattern p = Pattern.compile("\\w+" + subWord + "\\w+");
    return sentences.stream()
        .mapToInt(sentence ->
        {
          Matcher m = p.matcher(sentence);
          int sentenceCount = 0;
          while (m.find())
          {
            sentenceCount += 1;
          }
          return sentenceCount;
        }).sum();
  }

  public static void main(String[] args)
    throws IOException
  {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    List<String> sentences = new ArrayList<>();
    List<String> subWords = new ArrayList<>();

    int numSentences = Integer.valueOf(reader.readLine());
    for (int i = 0; i < numSentences; i++)
    {
      sentences.add(reader.readLine());
    }

    int numQueries = Integer.valueOf(reader.readLine());
    for (int i = 0; i < numQueries; i++)
    {
      subWords.add(reader.readLine());
    }

    occurrences(sentences, subWords).forEach(System.out::println);
  }

}