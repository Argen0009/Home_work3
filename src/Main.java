import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        double[] fractionalNums = {1.5, 2.4, 5.3, -2.5, 4.1, 6.1, 7.4, -1.8, 8.1, 7.4, -5.9, 7.5, 6.2, 4.6, 9.9};
        double average = 0.0;
        int count = 0;
        for (int a1 = 0; a1 < fractionalNums.length; a1++) {
            if (fractionalNums[a1] < 0) {
                for (int a2 = a1 + 1; a2 < fractionalNums.length; a2++) {
                    if (fractionalNums[a2] > 0) {
                        average = average + fractionalNums[a2];
                        count++;}
                }
                break;
            }
        }
        System.out.println("average  " + average);

        System.out.println("count  " + count);

        System.out.println("average/count " + average / count);

        int[] mas = {8,-7,9,-8,2,-9,7};

        for (int i = 0; i < mas.length; i++) {
            int min = mas[i];
            int minId = i;
            for (int j = i + 1; j < mas.length; j++) {
                if (mas[j] < min) {
                    min = mas[j];
                    minId = j;
                }
            }
            int temp = mas[i];
            mas[i] = min;
            mas[minId] = temp;
            System.out.println(Arrays.toString(mas));
        }
    }
}




