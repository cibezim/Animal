package animal_demo;

public class Animal {
    private String name;
    private int age;
    private String[] nicknames;

    public Animal(String name, int age, String[] nicknames) {
        this.name = name;
        this.age = age;
        this.nicknames = nicknames;
    }

    public void makeSound() {
        // You can customize this method for each animal type
        System.out.println(name + " makes a sound");
    }

    public void displayNicknames() {
        System.out.println(name + "'s nicknames:");
        for (String nickname : nicknames) {
            System.out.println(nickname);
        }
    }
}