import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.EmptySource;
import org.junit.jupiter.params.provider.NullSource;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class BubbleSortTest {

    private BubbleSort bubbleSort;

    @BeforeEach
    public void setUp(){
        bubbleSort = new BubbleSort();

    }

    @Test
    void sortArray(){

        int[] testCase = {9,1,4,5,2,6,8,7,3};
        int[] result = {1,2,3,4,5,6,7,8,9};

        //This one work only when method returns String
        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));

        //This one work only when method returns int[]
        //assertArrayEquals(bubbleSort.sort(result), bubbleSort.sort(testCase));
    }

    @Test
    void sortOneNumberArray(){

        int[] testCase = {5};
        int[] result = {5};

        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));
    }

    @Test
    void sortSameNumbers(){

        int[] testCase = {1,1,1,1,1,1,1,1,1};
        int[] result = {1,1,1,1,1,1,1,1,1};

        assertEquals(Arrays.toString(result), bubbleSort.sort(testCase));
    }

    @ParameterizedTest
    @EmptySource
    void sortEmptyArray(int[] testCase){

        assertEquals(0,testCase.length);
    }

    @ParameterizedTest
    @NullSource
    void sortNullArray(int[] testCase){

        assertNull(testCase);
    }
}