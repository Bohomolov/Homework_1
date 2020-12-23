import org.junit.Test;
import org.junit.jupiter.api.Assertions;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysTest {
    Arrays arrays = new Arrays();

    //#=============================_1st_method_start_===================================
    @Test
    public void testFindMinElementOfArray() {
        int[] a = {22, 223, 8, 2, 7, 42, 49, 577, 56};
        int expected = 2;
        int actual = arrays.findMinElementOfArray(a);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinElementOfArray_1() {
        int[] array = {1};
        int expected = 1;
        int actual = arrays.findMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinElementOfArray_1_1() {
        int[] array = {2};
        int expected = 2;
        int actual = arrays.findMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinElementOfArray_2() {
        int[] array = {0};
        int expected = 0;
        int actual = arrays.findMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinElementOfArray_3() {
        int[] array = {-1, 223, 8, -9, 7, 42, -49, -577, 56};
        int expected = -577;
        int actual = arrays.findMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMinElementOfArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.findMinElementOfArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_1st_method_end_=================================================
    //============================_2nd_method_start_===============================================
    @Test
    public void testFindMaxElementOfArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 10, 4, 3, 4, 2, 1, 3};
        int expected = 10;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMaxElementOfArray_1() {
        int[] array = {1};
        int expected = 1;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMaxElementOfArray_1_1() {
        int[] array = {2};
        int expected = 2;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindMaxElementOfArray_0() {
        int[] array = {0};
        int expected = 0;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxElementOfArray_2() {
        int[] array = {-2, -3, -4, -5, -6, -7, -8, -7, -6, -5, -4, -3, -2, -10, -4, -3, -4, -2, -1, -3};
        int expected = -1;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxElementOfArray_3() {
        int[] array = {-2, -3, -4, -5, -6, -7, -8, -0, -6, -5, -4, -3, -2, -10, -4, -3, -4, -2, -1, -3};
        int expected = 0;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindMaxElementOfArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.findMaxElementOfArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_2nd_method_end_==================================================
    // ============================_3rd_method_start_===============================================
    @Test
    public void testFindIndexOfMinElementOfArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 0, 9};
        int expected = 17;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindIndexOfMinElementOfArray_1() {
        int[] array = {1};
        int expected = 0;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindIndexOfMinElementOfArray_1_1() {
        int[] array = {2};
        int expected = 0;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindIndexOfMinElementOfArray_0() {
        int[] array = {0};
        int expected = 0;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testFindIndexOfMinElementOfArray_2() {
        int[] array = {0, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 10, 9};
        int expected = 0;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfMinElementOfArray_3() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 0, -9};
        int expected = 18;
        int actual = arrays.findIndexOFMinElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfMinElementOfArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.findIndexOFMinElementOfArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_3rd_method_end_===================================================
    //============================_4th_method_start_=================================================
    @Test
    public void testFindIndexOfMaxElementOfArray() {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 9;
        int actual = arrays.findIndexOfMaxElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfMaxElementOfArray_2() {
        int[] array = {111, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int expected = 0;
        int actual = arrays.findIndexOfMaxElementOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testFindIndexOfMaxElementOfArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.findIndexOfMaxElementOfArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_4th_method_end_==================================================
    //============================_5th_method_start_================================================
    @Test
    public void countSumOfArray() {
        int[] array = {1, 2, 4, 5, 3, 3};
        int expected = 10;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void countSumOfArray_1() {
        int[] array = {1};
        int expected = 0;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void countSumOfArray_1_1() {
        int[] array = {0,1};
        int expected = 1;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void countSumOfArray_1_2() {
        int[] array = {0,2};
        int expected = 2;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }  @Test
    public void countSumOfArray_1_3() {
        int[] array = {2};
        int expected = 0;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }
    @Test
    public void countSumOfArray_2() {
        int[] array = {0};
        int expected = 0;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void countSumOfArray_3() {
        int[] array = {1, 4, -5, -3};
        int expected = 1;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testCountSumOfArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.countSumOfArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_5th_method_end_==================================================
    //============================_6th_method_start_================================================
    @Test
    public void testReverseArray_0() {
        int[] array = {0};
        int[] expected = {0};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_1_1() {
        int[] array = {1};
        int[] expected = {1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_1_2() {
        int[] array = {2};
        int[] expected = {2};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_1_3() {
        int[] array = {1,2};
        int[] expected = {2,1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_1_4() {
        int[] array = {0,1,2};
        int[] expected = {2,1,0};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_1() {
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseArray_2() {
        int[] array = {1, 2, -1, -20, -3, 3, 4, 5};
        int[] expected = {5, 4, 3, -3, -20, -1, 2, 1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testReverseArray_3() {
        int[] array = {1, 2, -10, 20, -3, 3, 4, 5};
        int[] expected = {5, 4, 3, -3, 20, -10, 2, 1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testReverseArray_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.reverseArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_6th_method_end_==================================================
    //============================_7th_method_start_================================================
    @Test
    public void testShowNoEven() {
        int[] array = {1, 2, 3, 12, 6, 8, 10, 15};
        int expected = 3;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testShowNoEven_0() {
        int[] array = {0};
        int expected = 0;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testShowNoEven_1() {
        int[] array = {1};
        int expected = 1;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testShowNoEven_1_1() {
        int[] array = {2};
        int expected = 0;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }
    @Test
    public void testShowNoEven_1_2() {
        int[] array = {0,1,2};
        int expected = 1;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowNoEven_3() {
        int[] array = {1, 2, 3, 12, -1, -2, -5, 6, 8, 10, 15};
        int expected = 5;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testShowNoEven_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.reverseArray(null);
        }, "Array cannot be is empty.");
    }

    //============================_7th_method_end_==================================================
    //============================_8th_method_start_================================================
    @Test
    public void testChanger_0() {
        int[] array = {0};
        int[] expected = {0};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testChanger_1() {
        int[] array = {1};
        int[] expected = {1};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testChanger_2() {
        int[] array = {2};
        int[] expected = {2};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testChanger_2_1() {
        int[] array = {0,2};
        int[] expected = {2,0};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testChanger_3() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6, 1, 2, 3};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }
    @Test
    public void testChanger_4() {
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6, 1, 2, 3};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testChanger_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.changer(null);
        }, "Array cannot be is empty.");
    }

    //============================_8th_method_end_==================================================
    //============================_9th_method_start_================================================
    @Test
    public void bubbleSort_0() {
        int[] arr = {0};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void bubbleSort_1() {
        int[] arr = {1};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void bubbleSort_2() {
        int[] arr = {2};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {2};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void bubbleSort_3() {
        int[] arr = {1,2,3,4};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {1,2,3,4};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void bubbleSort() {
        int[] arr = {9, 5, 2, 3, 1, 7, 8, 10};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {1, 2, 3, 5, 7, 8, 9, 10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testBubbleSort_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.bubbleSort(null);
        }, "Array cannot be is empty.");
    }

    @Test
    public void selectSort_0() {
        int[] arr = {0};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {0};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort_1() {
        int[] arr = {1};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {1};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort_2() {
        int[] arr = {2};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {2};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort_3() {
        int[] arr = {0,1,2,3,4,5};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {0,1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort_4() {
        int[] arr = {-3,-2,-1,0,1,2,3,4,5};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {-3,-2,-1,0,1,2,3,4,5};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort_5() {
        int[] arr = {9, 5, -2,-3, -1, 7, 8, 10};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {-3, -2, -1, 5, 7, 8, 9, 10};
        assertArrayEquals(expected, actual);
    }
    @Test
    public void selectSort() {
        int[] arr = {9, 5, 2, 3, 1, 7, 8, 10};
        int[] actual = arrays.selectSort(arr);
        int[] expected = {1, 2, 3, 5, 7, 8, 9, 10};
        assertArrayEquals(expected, actual);
    }

    @Test
    public void testSelectSort_exception() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            arrays.selectSort(null);
        }, "Array cannot be is empty.");
    }
    //=============================_9th_method_end_==================================================
    //=============================_10th_method_start_===============================================
}
