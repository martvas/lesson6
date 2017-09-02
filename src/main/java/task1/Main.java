package task1;

/*
Написать метод, которому в качестве аргумента передается не пустой одномерный
целочисленный массив, метод должен вернуть новый массив, который получен путем
вытаскивания элементов из исходного массива, идущих после последней четверки. Входной
массив должен содержать хотя бы одну четверку, в противном случае в методе необходимо
выбросить RuntimeException.
Написать набор тестов для этого метода (варианта 3-4 входных данных)
вх: [ 1 2 4 4 2 3 4 1 7 ] -> вых: [ 1 7 ]
 */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] arr = {1, 2, 4, 4, 2, 3, 4, 1, 7};

        System.out.println(Arrays.toString(newArrAfterLast4(arr)));

    }

    public static int[] newArrAfterLast4(int[] arr) {
        int last4 = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 4) last4 = i;
        }
        if (last4 == 0) throw new RuntimeException();

        int newArrLength = arr.length - (last4 + 1);
        int[]  newArr = new int[newArrLength];
        for (int i = 0; i < newArrLength; i++) {
            newArr[i] = arr[last4 + i];
        }
        return newArr;
    }
}
