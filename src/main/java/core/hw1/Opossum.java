package core.hw1;

public class Opossum {
    private final String name;
    private double height;

    public Opossum(String name, double height) {
        this.name = name;
        this.height = height;

    }

    public String getName(){
        return name;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void sayHi (){
        System.out.println(name + " :Hakuna Matata " + "Мой рост: " + height);
    }

}
