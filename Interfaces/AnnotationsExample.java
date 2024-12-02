package Interfaces;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Объявление пользовательской аннотации
@Target(ElementType.TYPE) // Аннотация применяется только к классам
@Retention(RetentionPolicy.RUNTIME) // Аннотация доступна во время выполнения
@interface BaseAction {
    int level(); // Метод-член аннотации
}

@BaseAction(level = 2) // Применение аннотации к классу
class Base {
    public void doAction() {
        // Получение данных аннотации через рефлексию
        Class<?> clazz = Base.class;
        BaseAction action = clazz.getAnnotation(BaseAction.class);
        System.out.println("Уровень аннотации: " + action.level());
    }
}

public class AnnotationsExample {

    // Пример использования аннотации @Override
    static class Parent {
        public void display() {
            System.out.println("Метод суперкласса");
        }
    }

    static class Child extends Parent {
        @Override
        public void display() {
            System.out.println("Переопределённый метод подкласса");
        }
    }

    // Пример использования аннотации @Deprecated
    static class LegacyCode {
        @Deprecated
        public void oldMethod() {
            System.out.println("Устаревший метод");
        }

        public void newMethod() {
            System.out.println("Современный метод");
        }
    }

    // Пример использования аннотации @SuppressWarnings
    @SuppressWarnings("unchecked")
    public static void suppressWarningsExample() {
        // Подавляем предупреждение компилятора о необобщённом использовании
        java.util.List rawList = new java.util.ArrayList();
        rawList.add("Строка");
        System.out.println("Элемент из необобщённого списка: " + rawList.get(0));
    }

    public static void main(String[] args) {
        System.out.println("=== Пример с @Override ===");
        Parent parent = new Parent();
        Child child = new Child();
        parent.display();
        child.display();

        System.out.println("\n=== Пример с @Deprecated ===");
        LegacyCode code = new LegacyCode();
        code.oldMethod(); // Предупреждение компилятора
        code.newMethod();

        System.out.println("\n=== Пример с @SuppressWarnings ===");
        suppressWarningsExample();

        System.out.println("\n=== Пример пользовательской аннотации ===");
        Base base = new Base();
        base.doAction();
    }
}
