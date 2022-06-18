import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {

    private SelectionSort selectionSort;

    @BeforeEach
    public void setUp(){
        selectionSort = new SelectionSort();
    }

    @Test
    void firstArray(){

        int[] testCase = {9,14,3,2,43,11,58,22};
        int[] results = {2, 3, 9, 11, 14, 22, 43, 58};

        assertEquals(Arrays.toString(results),selectionSort.sort(testCase));

    }


}