package geekbrains.java3.h1;

public abstract class Fruit {
    public Fruit(double weight) {
        this.weight = weight;
    }

    private final   double weight;

    public  double getWeight() {
        return weight;
    }
}
