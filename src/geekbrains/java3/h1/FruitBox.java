package geekbrains.java3.h1;

import java.util.ArrayList;

public class FruitBox<T extends Fruit>{
    private final ArrayList<T> fruits = new ArrayList<>();

    public double getFruitsWeight() {
        if(fruits.isEmpty())
            return 0;
        return fruits.get(0).getWeight() * fruits.size();
    }
    public void addFruit(T fruit){
        fruits.add(fruit);
    }
    public boolean compare(FruitBox<?> box){
        return Math.abs(getFruitsWeight() - box.getFruitsWeight()) < 1e-5; // Compare with EPS
    }
    public void moveFruits(FruitBox<T> box){
        fruits.forEach(box::addFruit);
        fruits.clear();
    }
}
