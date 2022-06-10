import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySort {
    static final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

    public static void main(String[] args) throws IOException {

        System.out.println("Input array size: ");

        int[] arrayNew = new int[Integer.parseInt(bufferedReader.readLine())];

        for (int i = 0; i < arrayNew.length; i++) {
            System.out.println("Input " + i + " element: ");
            arrayNew[i] = Integer.parseInt(bufferedReader.readLine());
        }

        System.out.println("Array before sorting: " + Arrays.toString(arrayNew));

        ArraySort.sortArray(arrayNew);

        System.out.println("Array after sorting: "+ Arrays.toString(arrayNew));
    }

    private static void sortArray(int[] arrayNew) {
        int n = arrayNew.length;
        int temp = 0;
        for(int i=0; i < n; i++){
            for(int j=1; j < n; j++){
                if (arrayNew[j-1] == 0 ){
                    continue;
                }
                if(arrayNew[j] == 0){
                    temp = arrayNew[j-1];
                    arrayNew[j-1] = arrayNew[j];
                    arrayNew[j] = temp;
                }
            }
        }
    }
}
