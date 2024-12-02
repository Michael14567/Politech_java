package Classes;

import java.util.ArrayList;
import java.util.List;

// Базовый класс Animal
class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

// Подкласс Dog
class Dog extends Animal {
    public Dog(String name) {
        super(name);
    }
}

// Подкласс Cat
class Cat extends Animal {
    public Cat(String name) {
        super(name);
    }
}

// Параметризованный класс Wrapper
class Wrapper<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return item;
    }
}

public class Main {
    public static void main(String[] args) {
        // Пример использования <? extends T>
        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("Buddy"));
        dogs.add(new Dog("Max"));

        List<Cat> cats = new ArrayList<>();
        cats.add(new Cat("Whiskers"));
        cats.add(new Cat("Fluffy"));

        System.out.println("Printing animal names using <? extends T>:");
        printAnimals(dogs);
        printAnimals(cats);

        // Пример использования <? super T>
        List<Animal> animals = new ArrayList<>();
        addAnimal(animals, new Dog("Rex"));
        addAnimal(animals, new Dog("Fido")); // Добавляем только Dog

        System.out.println("\nAnimals in the list using <? super T>:");
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }

        // Пример использования Wrapper с instanceof
        Wrapper<Dog> dogWrapper = new Wrapper<>();
        dogWrapper.setItem(new Dog("Rover"));

        checkType(dogWrapper);
    }

    // Метод, который принимает список и выводит имена животных
    public static void printAnimals(List<? extends Animal> animals) {
        for (Animal animal : animals) {
            System.out.println(animal.getName());
        }
    }

    // Метод для добавления животных в список
    public static void addAnimal(List<? super Dog> list, Dog dog) {
        list.add(dog); // Здесь мы можем добавлять только Dog
    }

    // Метод для проверки типа содержимого Wrapper
    public static void checkType(Wrapper<?> wrapper) {
        if (wrapper.getItem() instanceof Dog) {
            System.out.println("Wrapper содержит Dog");
        } else if (wrapper.getItem() instanceof Animal) {
            System.out.println("Wrapper содержит Animal");
        } else {
            System.out.println("Wrapper содержит неизвестный тип");
        }
    }
}

/*
Использование <? extends T> и <? super T> помогает создавать более гибкие и обобщенные методы, которые могут работать с различными типами данных,
сохраняя при этом безопасность типов. Эти конструкции позволяют контролировать, какие типы данных могут быть использованы в методах,
и обеспечивают более безопасную работу с обобщениями в Java.
*/