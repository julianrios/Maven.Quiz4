package rocks.zipcode.quiz4.arrays;

import java.util.Arrays;

/**
 * @author leon on 01/01/2019.
 */
public class ArrayUtils {
    public static String getMiddleElement(String[] values) {
        return values[values.length/2];
    }

    public static String[] removeMiddleElement(String[] values) {
        for (int i = values.length/2; i < values.length-1; i++) {
            values[i] = values[i+1];
        }
        return Arrays.copyOf(values, values.length-1);
    }

    public static String getLastElement(String[] values) {
        return values[values.length-1];
    }

    public static String[] removeLastElement(String[] values) {
        return Arrays.copyOf(values, values.length-1);
    }
}