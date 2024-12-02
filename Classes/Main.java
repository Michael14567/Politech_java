package Classes;

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
        Wrapper<Integer> intWrapper = new Wrapper<>();
        intWrapper.setItem(10);

        Wrapper<String> stringWrapper = new Wrapper<>();
        stringWrapper.setItem("Hello");

        checkType(intWrapper);
        checkType(stringWrapper);
    }

    public static void checkType(Wrapper<?> wrapper) {
        if (wrapper.getItem() instanceof Integer) {
            System.out.println("Wrapper содержит Integer");
        } else if (wrapper.getItem() instanceof String) {
            System.out.println("Wrapper содержит String");
        } else {
            System.out.println("Wrapper содержит неизвестный тип");
        }
    }
}