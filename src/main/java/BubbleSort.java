import java.util.Arrays;

public class BubbleSort {

    public String sort(int[] array){

            int size = array.length;

            for (int i = 0; i < size - 1; i++) {

                for (int j = 0; j < size - 1 - i; j++) {

                    if (array[j] > array[j + 1]) {
                        int tmp = array[j];
                        array[j] = array[j + 1];
                        array[j + 1] = tmp;
                    }
                }
            }

            //This one work only when method returns int[]
            //return array;

            //This one work only when method returns String
            return Arrays.toString(array);
    }
}
