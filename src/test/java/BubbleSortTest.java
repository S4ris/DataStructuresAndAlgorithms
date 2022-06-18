import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    @Test
    void sortFirstAttay(){

        int[] testCase = {1,2,2,1,0,0,2,1,0};
        int[] result = {0,0,0,1,1,1,2,2,2};

        var bubbleSort = new BubbleSort();

        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));

    }

    @Test
    void sortSecondAttay(){

        int[] testCase = {9,1,4,5,2,6,8,7,3};
        int[] result = {1,2,3,4,5,6,7,8,9};

        var bubbleSort = new BubbleSort();

        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));

    }

    @Test
    void sortThirdAttay(){

        int[] testCase = {32,25,67,12,1,0,15,98,124,56};
        int[] result = {0,1,12,15,25,32,56,67,98,124};

        var bubbleSort = new BubbleSort();

        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));

    }

}