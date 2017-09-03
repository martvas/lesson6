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

public class NewArrCreator {
           public int[] newArrAfterLast4(int[] arr) {
            int last4 = 0;
            boolean firstIndexIs4 = true;

            for (int i = 0; i < arr.length; i++) {
                if (arr[0] == 4) firstIndexIs4 = false;
                if (arr[i] == 4) last4 = i;
            }
            if (last4 == 0 && firstIndexIs4) throw new RuntimeException();

            int nextAfterLast4 = last4 + 1;
            int newArrLength = arr.length - nextAfterLast4;

            int[] newArr = new int[newArrLength];

            for (int i = 0; i < newArrLength; i++) {
                newArr[i] = arr[nextAfterLast4 + i];
            }
            return newArr;
        }
}
