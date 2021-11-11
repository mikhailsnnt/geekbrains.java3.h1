package geekbrains.java3.h1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here



    }
    private static <T> void  swapElements(T[] array, int ind, int ind2)
    {
        if(Math.min(ind,ind2) < 0 || Math.max(ind,ind2) >= array.length)
            throw new IndexOutOfBoundsException();
        T el1 = array[ind];
        array[ind] = array[ind2];
        array[ind2] = el1;
    }
    private static <T> ArrayList<T> toArrayList(T[]array)
    {
        return new ArrayList<>(Arrays.asList(array));
    }

}
