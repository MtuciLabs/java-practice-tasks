package lesson05.part01;

/**
 * Не забываем инкапсулировать
 * Посмотри внимательно на методы и добавь недостающие поля.
 * <p>
 * <p>
 * Требования:
 * 1. В классе Cat должно быть поле типа String с именем name.
 * 2. В классе Cat должно быть поле типа int с именем age.
 * 3. В классе Cat должно быть поле типа int с именем weight.
 * 4. В классе Cat должно быть поле типа int с именем speed.
 * 5. В классе Cat должны быть 4 поля.
 * 6. Все поля класса Cat должны быть private.
 */

public class Task10 {
    public static void main(String[] args) {
    }

    public class Cat {
            private String name;
            private  int age;
            private int speed;
            private int weight;
            private Cat(String name, int age, int weight) {

            }
            private String getName() {
                return name;
            }

            private int getAge() {
                return age;

            }
            private void setWeight(int weight) {

            }

        public void setSpeed(int speed) {

        }
    }
}
