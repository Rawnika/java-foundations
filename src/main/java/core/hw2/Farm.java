package core.hw2;

public class Farm {
    public static void main(String[] args) {

        Cow murka = new Cow("Golshtinskaia", "white");
        Cow murochka = new Cow("Dzherseiskaia", "white and brown");
        Cow murochechka = new Cow("Simmentalskaia", "white and black");
        Cow murkenka = new Cow("Airshirskaia", "brown");
        Cow murkunya = new Cow("Yaroslavskaia", "black");

        murka.setColour("pink");
        murochechka.setColour("red");
        murkunya.setColour("yellow");

        System.out.println(murka.getColour());
        System.out.println(murochechka.getColour());
        System.out.println(murkunya.getColour());

        murochka.setNameBreed("Airshirskaia");
        System.out.println(murochka.getNameBreed());




    }

}
