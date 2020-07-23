package core.hw1;

public class Jungle {
    public static void main(String[] args) {
        Lion simba = new Lion("Simba",5);
        Lion nala = new Lion("Nala",6);

        simba.sayR();
        nala.sayR();

        System.out.println("simba.getName() = " + simba.getName());
        System.out.println("nala.getPower() = " + nala.getPower());

 //       simba.setName("Король Симба");

        simba.sayR();

   //     nala.setName("Принцесса Нала");

        nala.setPower(8);
        nala.sayR();

        Lion mufasa = new Lion("Mufasa",5);
        Lion shram = new Lion("Shram",4);
        Hyena shenzi = new Hyena("Shenzi", 4);
        Hyena shenti = new Hyena("Shenti", 4);
        Hyena shenpi = new Hyena("Shenpi", 4);
        Opossum timon = new Opossum("Timon", 57.3);
        Boar pumba = new Boar("Pumba", 101);

        System.out.println("mufasa.getName() = " + mufasa.getName());
        System.out.println("mufasa.getPower() = " + mufasa.getPower());

        System.out.println("shram.getName() = " + shram.getName());
        System.out.println("shram.getPower() = " + shram.getPower());

        System.out.println("shenzi.getName() = " + shenzi.getName());
        System.out.println("shenzi.getLegsNum() = " + shenzi.getLegsNum());

        System.out.println("shenti.getName() = " + shenti.getName());
        System.out.println("shenti.getLegsNum() = " + shenti.getLegsNum());

        System.out.println("shenpi.getName() = " + shenpi.getName());
        System.out.println("shenpi.getLegsNum() = " + shenpi.getLegsNum());

        System.out.println("timon.getName() = " + timon.getName());
        System.out.println("timon.getHeight() = " + timon.getHeight());

        System.out.println("pumba.getName() = " + pumba.getName());
        System.out.println("pumba.getWeight() = " + pumba.getWeight());

        mufasa.setPower(6);

        shram.setPower(3);

        timon.setHeight(57.4);

        pumba.setWeight(107);

        mufasa.sayR();
        shram.sayR();
        shenzi.laugh();
        shenti.laugh();
        shenpi.laugh();
        timon.sayHi();
        pumba.sayHr();




    }
}
