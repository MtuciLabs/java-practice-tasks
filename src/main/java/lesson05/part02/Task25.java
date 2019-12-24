package lesson05.part02;

/**
 * Посетители
 * Напиши метод, который определяет, какой объект передали в него.
 * Программа должна выводить на экран одну из надписей:
 * "Кот", "Тигр", "Лев", "Бык", "Корова", "Животное".
 * <p>
 * Замечание:
 * постарайся определять тип животного как можно более точно.
 * <p>
 * <p>
 * Требования:
 * 1. Класс задачи должен содержать классы Cat, Tiger, Lion, Bull, Cow, Animal.
 * 2. Класс задачи должен содержать метод String getObjectType(Object o).
 * 3. Метод getObjectType() должен возвращать строку "Кот", если передан объект типа Cat.
 * 4. Метод getObjectType() должен возвращать строку "Тигр", если передан объект типа Tiger.
 * 5. Метод getObjectType() должен возвращать строку "Лев", если передан объект типа Lion.
 * 6. Метод getObjectType() должен возвращать строку "Бык", если передан объект типа Bull.
 * 7. Метод getObjectType() должен возвращать строку "Корова", если передан объект типа Cow.
 * 8. Метод getObjectType() должен возвращать строку "Животное", если передан объект типа Animal.
 * 9. Программа должна выводить на экран результат метода getObjectType().
 */

public class Task25 {
    public static void main(String[] args) {
        System.out.println(getObjectType(new Cat()));
        System.out.println(getObjectType(new Tiger()));
        System.out.println(getObjectType(new Lion()));
        System.out.println(getObjectType(new Bull()));
        System.out.println(getObjectType(new Cow()));
        System.out.println(getObjectType(new Animal()));
    }

    public static String getObjectType(Object o) {
        if(o instanceof Cat ){
            return "Кот";
        } else if(o instanceof Tiger ){
            return "Тигр";
        }else if(o instanceof Lion ){
            return "Лев";
        }else if(o instanceof Bull ){
            return "Бык";
        }else if(o instanceof Cow ){
            return "Корова";
        }
        //напишите тут ваш код

        return "Животное";
    }

    public static class Cat extends Animal   //<--Классы наследуются!!
    {
    }

    public static class Tiger extends Animal {
    }

    public static class Lion extends Animal {
    }

    public static class Bull extends Animal {
    }

    public static class Cow extends Animal {
    }

    public static class Animal {
    }
}
