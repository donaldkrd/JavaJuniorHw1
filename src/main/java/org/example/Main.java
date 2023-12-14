import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * 1. Напишите программу, которая использует Stream API для обработки списка чисел.
 * Программа должна вывести на экран среднее значение всех четных чисел в списке.
 */

public class Main {
    public static void main(String[] args) {
        System.out.printf("Version.1: %.2f\n",Stream.of(1, 4, 3, 33, 6)
                .filter(i -> i % 2 == 0)
                .mapToDouble(i -> i)
                .average()
                .getAsDouble());
    }
}