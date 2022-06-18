import java.util.Arrays;

public class SelectionSort {

    public String sort(int[] arr){

        int size = arr.length;

        for(int i = 0; i < size - 1; i++){

            int index = i;

            for(int j = i +1; j< size; j++){
                if(arr[j] < arr[index]){
                    index = j;
                }
            }

            int smallerNumber = arr[index];
            arr[index] = arr[i];
            arr[i] = smallerNumber;
        }

        return Arrays.toString(arr);
    }
}
