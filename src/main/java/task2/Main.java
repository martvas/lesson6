package task2;
/*
Написать метод, который проверяет что массив состоит только из чисел 1 и 4. Если в массиве
нет хоть одной 4 или 1, то метод вернет false;
Написать набор тестов для этого метода (варианта 3-4 входных данных)
 */
public class Main {
    public static void main(String[] args) {
        int[] arrTrue = {1, 4, 1, 1};
        int[] arrFalse = {1, 4, 2, 1};

        System.out.println(checkArrFor1or4(arrTrue));
        System.out.println(checkArrFor1or4(arrFalse));
    }

    public static boolean checkArrFor1or4 (int[] arr) {
        boolean arrChecker = true;

        for (int i = 0; i < arr.length; i++) {
            if (!(arr[i] == 1) && !(arr[i] == 4)){
                arrChecker = false;
                break;
            }
        }
        return arrChecker;
    }

}
