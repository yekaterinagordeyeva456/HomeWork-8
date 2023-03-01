import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
    }

    public static void task1() {
        //задача 1.1
        System.out.println("Задача 1.1");
        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        int number1 = numbers[0];
        int number2 = numbers[1];
        int number3 = numbers[2];
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);

        //задача 1.2
        System.out.println("Задача 1.2");
        double[] number = {1.57, 7.654, 9.986};
        number[0] = 1.57;
        number[1] = 7.654;
        number[2] = 9.986;
        double number_1 = numbers[0];
        double number_2 = numbers[1];
        double number_3 = numbers[2];
        System.out.println(number[0]);
        System.out.println(number[1]);
        System.out.println(number[2]);

        //задача 1.3
        System.out.println("Задача 1.3");
        int[] numberIn = {5, 7, 56, 34, 89, 23, 34, 56, 12, 34, 56};
        for (int i = 0; i < numberIn.length; i++) {
            System.out.println(numberIn[i]);
        }
        //задача 2
        System.out.println("Задача 2");
        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(number));
        System.out.println(Arrays.toString(numberIn));
        // задача 3
        System.out.println("Задача 3");
        int[] reverse = new int[numbers.length];
        int count = 0;
        for (int i = 1; i <= numbers.length; i++) {
            reverse[count++] = numbers[numbers.length - i];
        }
        System.out.println(Arrays.toString(reverse));
        double[] reverse1 = new double[number.length];
        int count1 = 0;
        for (int i = 1; i <= number.length; i++) {
            reverse1[count1++] = number[number.length - i];
        }
        System.out.println(Arrays.toString(reverse1));
        int[] reverse2 = new int[numberIn.length];
        int count2 = 0;
        for (int i = 1; i <= numberIn.length; i++) {
            reverse2[count2++] = numberIn[numberIn.length - i];
        }
        System.out.println(Arrays.toString(reverse2));

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 != 0) {
                numbers[i] = numbers[i] + 1;
            }
        }
        System.out.print(Arrays.toString(numbers));
        System.out.println();
    }
}

