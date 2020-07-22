package core.hw1;

public class Lion {
    private final String name;
    private int power;

    public Lion(String name,int power){
        System.out.println("Мы создали нового льва");
        this.name = name;
        this.power = power;
    }   //конструктор (метод по созданию объекта)

    //поведение
    public void sayR(){
        System.out.println(name + ":R-R-R-R " +"Моя сила:" + power);
    }
    //геттеры

    public String getName() {
        return name;
    }

    public int getPower() {
        return power;
    }
    //сеттеры

 //   public void setName(String name) {
 //       this.name = name;
 //   }

    public void setPower(int power) {
        this.power = power;
    }
}
