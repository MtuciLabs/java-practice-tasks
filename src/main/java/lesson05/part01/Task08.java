package lesson05.part01;

/**
 * Неприступный кот
 * Скрыть все внутренние переменные класса Cat, а также методы, позволяющие менять внутреннее состояние объектов класса Cat.
 * <p>
 * <p>
 * Требования:
 * 1. Переменная name класса Cat должна быть скрыта.
 * 2. Переменная age класса Cat должна быть скрыта.
 * 3. Переменная weight класса Cat должна быть скрыта.
 * 4. В Cat должны быть private и public методы.
 */

public class Task08 {
    public static void main(String[] args) {
    }

    class Cat {
        public String name;
        public int speed;
        private String name;
        private int speed;

        public Cat(String name, int speed) {
            this.name = name;
            this.speed = speed;
        }

        public String getName() {
            private String getName() {
                return name;
            }

            @@ -47,15 +47,15 @@ public boolean isDogNear(Dog dog) {
            }

            class Dog {
                public String name;
                public int speed;
                private String name;
                private int speed;

                public Dog(String name, int speed) {
                    this.name = name;
                    this.speed = speed;
                }

                public String getName() {
                    private String getName() {
                        return name;
                    }
