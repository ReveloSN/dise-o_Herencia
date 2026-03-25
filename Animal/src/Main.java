public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Generico");
        Mammal mammal = new Mammal("Mamifero");
        Cat cat = new Cat("Misu");
        Dog dog1 = new Dog("Firulais");
        Dog dog2 = new Dog("Max");

        System.out.println(animal);
        System.out.println(mammal);
        System.out.println(cat);
        System.out.println(dog1);

        cat.greets();
        dog1.greets();
        dog1.greets(dog2);
    }
}
