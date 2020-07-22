package core.hw1;

public class Boar {
    private final String name;
    private double weight;

    public Boar(String name, double weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName(){
        return name;
    }

    public double getWeight(){
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void sayHr (){
        System.out.println(name + " :Hruk Hruk " + "Мой вес: " + weight);
    }
}
