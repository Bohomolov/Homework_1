import utils.Constants;

public class Arrays {
    //#=====================================_1ST_===========================================
    public int findMinElementOfArray(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < result) {
                result = array[i];
            }
        }
        return result;
    }

    //#=====================================_2ND_==========================================
    public int findMaxElementOfArray(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > result) {
                result = array[i];
            }
        }
        return result;
    }

    //#=====================================_3RT_==========================================
    public int findIndexOFMinElementOfArray(int array[]) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[result] > array[i]) {
                result = i;
            }
        }
        return result;
    }

    //#=====================================_4TH_==========================================
    public int findIndexOfMaxElementOfArray(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[result] < array[i]) {
                result = i;
            }
        }
        return result;
    }

    //#=====================================_5TH_==========================================
    public int countSumOfArray(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0) {
                result += array[i];
            }
        }
        return result;
    }

    //#=====================================_6TH_==========================================
    public int[] reverseArray(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int[] tmp = new int[array.length];
        int back = array.length - 1;
        for (int i = 0; i < array.length; i++) {
            tmp[i] = array[back];
            back--;
        }
        for (int i = 0; i < array.length; i++) {
            array[i] = tmp[i];
        }
        return array;
    }

    //#=====================================_7TH_==========================================
    public int showNoEven(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        int result = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                result += 1;
            }
        }
        return result;
    }

    //#=====================================_8TH_==========================================
    public int[] changer(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
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

    //#=====================================_9TH_==========================================
    public int[] bubbleSort(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
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
    public int[] selectSort(int[] array) {
        if (array == null ){
            throw new IllegalArgumentException(Constants.ARRAY_CANNOT_BE_EMPTY);
        }
        for (int i = 0; i < array.length; i++) {
            int min = array[i];
            int minTmp = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < min) {
                    min = array[j];
                    minTmp = j;
                }
            }
            if (i != minTmp){
                int tmp = array[i];
                array[i] = array[minTmp];
                array[minTmp] = tmp;
            }
        }
        return array;
    }
    //#=====================================_10TH_==========================================
}