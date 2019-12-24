package lesson05.part02;

/**
 * Определимся с животным
 * Написать метод, который определяет, объект какого класса ему передали, и возвращает результат - одно значение из: "Корова", "Кит", "Собака", "Неизвестное животное".
 * <p>
 * <p>
 * Требования:
 * 1. Программа должна выводить текст на экран.
 * 2. В классе задачи должен быть статический класс Cow.
 * 3. В классе задачи должен быть статический класс Dog.
 * 4. В классе задачи должен быть статический класс Whale.
 * 5. В классе задачи должен быть статический класс Pig.
 * 6. Метод getObjectType() должен возвращать одно значение из:
 * "Корова", "Кит", "Собака", "Неизвестное животное" в зависимости от переданного объекта.
 * Например "Корова" для объектов типа Cow.
 */

public class Task05 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Dog()));
        System.out.println(getObjectType(new Whale()));
        System.out.println(getObjectType(new Pig()));
    }

    public static String getObjectType(Object o) {
        String obType = "Неизвестное животное";

        if (o instanceof Cow){
        }
        if (o instanceof Dog){
            obType = "Собака";
        }
        if (o instanceof Whale){
            obType = "Кит";
        }

        return obType;
    }

    public static class Cow {
    }

    public static class Dog {
    }

    public static class Whale {
    }

    public static class Pig {
    }
}
