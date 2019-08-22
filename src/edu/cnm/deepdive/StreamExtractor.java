package edu.cnm.deepdive;

import java.util.Arrays;
import java.util.Comparator;

public class StreamExtractor {

  public static void main(String[] args) {
    String source = (args.length > 0) ? args[0] : "Hello, World!";
    int[] codePoints = source.codePoints()
        .distinct()
        .boxed()
        .sorted(Comparator.comparingInt(Character::toUpperCase))
        .mapToInt(Integer::intValue)
        .toArray();
    char[] chars = new String(codePoints, 0, codePoints.length).toCharArray();
    System.out.println(Arrays.toString(chars));
  }

}
