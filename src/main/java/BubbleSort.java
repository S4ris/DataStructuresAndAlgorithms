import java.util.Arrays;

public class BubbleSort {

    public String sort(int[] array){

        try {
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

            return Arrays.toString(array);
        } catch(Exception e){
            return "Something went wrong! Please check input value";
        }
    }
}
