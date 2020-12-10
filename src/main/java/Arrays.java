public class Arrays {

    public int findMinElementOfArray(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }


    public int findMaxElementOfArray(int[] array) {
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    public int findIndexMinElementOfArray(int array[]) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[result] > array[i]) {
                result = i;
            }
        }
        return result;
    }

    public int findIndexOfMaxElementOfArray(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[result] < array[i]) {
                result = i;
            }
        }
        return result;
    }

    public int countSumOfArray(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            if (i % 2 != 0) {
                result += a[i];
            }
        }
        return result;
    }

    public int[] reverseArray(int[] array) {
        int[] result = new int[array.length];
        int back = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            result[i] = array[back];
            back--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
        return array;
    }

    public int showNoEven(int[] array) {
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result += 1;
            }
        }
        return result;
    }

    public int[] changer(int[] array) {
        int[] result = new int[array.length];
        int half = array.length / 2;
        int firstHalf = 1;
        int secondHalf = (array.length + 1) / 2;
        for (int i = 0; i < array.length; i++) {
            if (i < half) {
                result[i] = array[secondHalf];
                secondHalf++;
            } else if (i == half) {
                result[i] = array[0];
            } else if (i > half) {
                result[i] = array[firstHalf];
                firstHalf++;
            }
        }

        for (int i = 0; i < array.length; i++) {
            array[i] = result[i];
        }
        return array;
    }

    public int[] bubbleSort(int[] array) {
        for (int i = array.length; i > 0; i--) {
            for (int j = 0; j < array.length - 1; j++) {
                if (array[j] > array[j + 1]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
            }
        }
        return array;
    }
}