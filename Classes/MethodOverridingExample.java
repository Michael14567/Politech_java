package Classes;

// Базовый класс
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound.");
    }
}

// Подкласс Dog
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}

// Подкласс Cat
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat meows.");
    }
}

public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal genericAnimal = new Animal();
        Animal dog = new Dog();   // Полиморфизм
        Animal cat = new Cat();   // Полиморфизм

        genericAnimal.makeSound(); // Вызывает метод базового класса
        dog.makeSound();           // Вызывает метод подкласса Dog
        cat.makeSound();           // Вызывает метод подкласса Cat
    }
}
