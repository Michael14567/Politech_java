package Inheritance;

public class ja {
    private String name;
    private int age;

    // Конструктор
    public ja(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Переопределяем метод equals
    @Override
    public boolean equals(Object obj) {
        // Проверка на равенство ссылок
        if (this == obj) return true;

        // Проверка на null и совпадение классов
        if (obj == null || getClass() != obj.getClass()) return false;

        // Приведение объекта к типу Person
        ja person = (ja) obj;

        // Сравнение значений полей
        return age == person.age && (name != null ? name.equals(person.name) : person.name == null);
    }

    // Переопределяем метод toString для удобства вывода
    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }

    public static void main(String[] args) {
        ja person1 = new ja("John", 25);


        System.out.println("person1.equals(null): " + person1.equals(null));       // false
    }
}
