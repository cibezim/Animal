package animal_demo;

public class Main {
    public static void main(String[] args) {
        String[] wolfNicknames = {"Wolfie", "Alpha"};
        Animal wolf = new Animal("Wolf", 5, wolfNicknames);

        String[] duckNicknames = {"Ducky", "Quackers"};
        Animal duck = new Animal("Duck", 2, duckNicknames);

        String[] lionNicknames = {"Simba", "King"};
        Animal lion = new Animal("Lion", 8, lionNicknames);

        wolf.makeSound();
        wolf.displayNicknames();

        duck.makeSound();
        duck.displayNicknames();

        lion.makeSound();
        lion.displayNicknames();
    }
}
