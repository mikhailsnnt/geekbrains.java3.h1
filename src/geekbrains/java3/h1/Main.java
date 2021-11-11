package geekbrains.java3.h1;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here
        secondTaskDemo();


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

    public static void secondTaskDemo(){
        FruitBox<Apple> appleFruitBox = new FruitBox<>();
        FruitBox<Orange> orangeFruitBox = new FruitBox<>();
        appleFruitBox.addFruit(new Apple());
        appleFruitBox.addFruit(new Apple());
        appleFruitBox.addFruit(new Apple());
        orangeFruitBox.addFruit(new Orange());
        orangeFruitBox.addFruit(new Orange());
        System.out.println("FruitBoxes are equal: " + appleFruitBox.compare(orangeFruitBox));
        FruitBox<Apple> newFruitBox = new FruitBox<>();
        appleFruitBox.moveFruits(newFruitBox);
        System.out.printf("Old box size : %.1f , New box size : %.1f",
                appleFruitBox.getFruitsWeight(),newFruitBox.getFruitsWeight());
    }

}
