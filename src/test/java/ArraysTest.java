import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class ArraysTest {
//#=============================_1st_method_start_===================================
    @Test
    public void testFindMinElementOfArray() {
        Arrays arrays = new Arrays();
        int[] a = {22, 223, 8, 2, 7, 42, 49, 577, 56};
        int expected = 2;
        int actual = arrays.findMinElementOfArray(a);
        assertEquals(expected, actual);
    }

//////////////////////////////_1st_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_2nd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void testFindMaxElementOfArray() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 7, 6, 5, 4, 3, 2, 10, 4, 3, 4, 2, 1, 3};
        int expected = 10;
        int actual = arrays.findMaxElementOfArray(array);
        assertEquals(expected, actual);

    }

//////////////////////////////_2nd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_3rd_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void testFindIndexOfMinElementOfArray() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 2, 3, 4, 5, 6, 7, 0, 9};
        int expected = 17;
        int actual = arrays.findIndexMinElementOfArray(array);
        assertEquals(expected, actual);
    }

//////////////////////////////_3rd_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_4th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void testFindIndexOfMaxElementOfArray(){
        Arrays arrays = new Arrays();
        int [] array = {1,2,3,4,5,6,7,8,9,10};
        int expected = 9;
        int actual = arrays.findIndexOfMaxElementOfArray(array);
        assertEquals(expected,actual);
    }
//////////////////////////////_4th_method_end_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
//////////////////////////////_5th_method_start_\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
    @Test
    public void countSumOfArray() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 4, 5, 3, 3};
        int expected = 10;
        int actual = arrays.countSumOfArray(array);
        assertEquals(expected, actual);
    }

    @Test
    public void testReverseArray_1() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 3, 4, 5};
        int[] expected = {5, 4, 3, 2, 1};
        int[] actual = arrays.reverseArray(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void showNoEven() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 3, 12, 6, 8, 10, 15};
        int expected = 3;
        int actual = arrays.showNoEven(array);
        assertEquals(expected, actual);
    }

    @Test
    public void changer() {
        Arrays arrays = new Arrays();
        int[] array = {1, 2, 3, 4, 5, 6};
        int[] expected = {4, 5, 6, 1, 2, 3};
        int[] actual = arrays.changer(array);
        assertArrayEquals(expected, actual);
    }

    @Test
    public void bubbleSort() {
        Arrays arrays = new Arrays();
        int[] arr = {9, 5, 2, 3, 1, 7, 8, 10};
        int[] actual = arrays.bubbleSort(arr);
        int[] expected = {1, 2, 3, 5, 7, 8, 9, 10};
        assertArrayEquals(expected, actual);
    }
}
