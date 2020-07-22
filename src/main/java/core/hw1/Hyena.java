package core.hw1;

public class Hyena {
    private final String name;
    private final int legsNum;

    public Hyena (String name, int legsNum) {
        this.name = name;
        this.legsNum = legsNum;
    }

    public String getName() {
        return name;
    }

    public int getLegsNum() {
        return legsNum;
    }

    public void laugh(){
        System.out.println(name + ":AHAHHAHAH " + "У меня " + legsNum + " ноги");
    }

}
