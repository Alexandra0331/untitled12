import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

// Пусть дан произвольный список целых чисел
// Нужно удалить из него четные числа
// Найти минимальное значение
// Найти максимальное значение
// Найти среднее значение


public class Main {
    // Пусть дан произвольный список целых чисел
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 7, 6, 9, 4));
        //ArrayList<String> number = new ArrayList();
        // number.add("1");
        // number.add("4");
        // number.add("3");
        // number.add("6");
        // number.add("12");
        // number.add("5");
        // number.add("7");

        //number.remove(1);
        //number.remove(2);
        //number.remove(2);


// Нужно удалить из него четные числа
       // public List<Integer> removeEvenValue(List<Integer> list){

        //    return new ArrayList<>();
       // }
        System.out.println(list);
        System.out.println("Min numbers " + findMin(list));
        System.out.println("Max numbers " + findMax(list));
        double avg = getAverage(list);
        System.out.println(avg);
    }

    public static Integer findMin(List<Integer> list) {
        return list.stream()                            // Stream<Integer>
                .mapToInt(v -> v)            // IntStream
                .min()                        // OptionalInt
                .orElse(Integer.MAX_VALUE);    // Integer
    }

    public static Integer findMax(List<Integer> list) {
        return list.stream()                            // Stream<Integer>
                .mapToInt(v -> v)            // IntStream
                .max()                        // OptionalInt
                .orElse(Integer.MIN_VALUE);    // Integer
    }

    // Найти среднее значение
    // public Integer getAverage(List<Integer> list){

    // return 0;
    // }

    private static double getAverage(List<Integer> list) {
        long sum = 0;
        for (int i : list) {
            sum += i;
        }
        return list.size() > 0 ? (double) sum / list.size() : 0;
    }
}















    // Найти среднее значение
    //public Integer getAverage(List<Integer> list){

       // return 0;












        //ArrayList<Integer> list = new ArrayList<Integer>();
        //ArrayList list = new ArrayList();

        //String s = "1, 5, 10, 6, 8, 3";

       // for (Integer s : list) {   // ввывод списка
       // System.out.println(s);


