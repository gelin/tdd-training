import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArrayReverser {
    public void reverse(int[] array) {
        int length = array.length;
        for (int i = 0; i < length / 2; i++) {
            int tmp = array[i];
            array[i] = array[length - i - 1];
            array[length -i - 1] = tmp;
        }
    }
}
