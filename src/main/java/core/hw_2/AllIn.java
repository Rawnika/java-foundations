package core.hw_2;

public class AllIn {
    public static void main(String[] args) {
        Alien sementioniks = new Alien("Mars", "red", 5);
        Book harryPotter = new Book("Harry Potter", "J. Rowling");
        Book carrie = new Book("Carrie", 199, "S. King");
        Cup myLovelyCup = new Cup(15, "black&white");
        Man stepa = new Man("Stepa", 180.5, "blond");
        Notebook diary = new Notebook(200, "red");
        Shop myKingdom = new Shop("Shopping mall", "Ronika", "myKingdom");
        Telephone yasnyeZori = new Telephone("Zarya", 0, 700.0);
        Vegetable cucumber = new Vegetable("green", "extra fresh");

        System.out.println("myLovelyCup.getColour() = " + myLovelyCup.getColour());
        stepa.setName("Leonard");
        System.out.println("stepa.getName() = " + stepa.getName());
        System.out.println("myKingdom.getOwner() = " + myKingdom.getOwner());
        yasnyeZori.setPrice(750.0);
        System.out.println("yasnyeZori.getPrice() = " + yasnyeZori.getPrice());
        System.out.println("sementioniks.getColour() = " + sementioniks.getColour());
        sementioniks.setColour("yellow");
        System.out.println("sementioniks.getColour() = " + sementioniks.getColour());
    }
}
