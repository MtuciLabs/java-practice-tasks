package lesson03.part01;

/**
 * Создать класс Cat (кот) с пятью конструкторами:
 * - Имя,
 * - Имя, вес, возраст
 * - Имя, возраст (вес стандартный)
 * - вес, цвет, (имя, адрес и возраст - неизвестные. Кот - бездомный)
 * - вес, цвет, адрес (чужой домашний кот)
 *
 * Задача конструктора - сделать объект валидным.
 * Например, если вес не известен, то нужно указать какой-нибудь средний вес.
 * Кот не может ничего не весить.
 * То же касательно возраста. А вот имени может и не быть (null). То же касается адреса: null.
 *
 * Требования:
 * 1.	У класса Cat должна быть переменная name с типом String.
 * 2.	У класса Cat должна быть переменная age с типом int.
 * 3.	У класса Cat должна быть переменная weight с типом int.
 * 4.	У класса Cat должна быть переменная address с типом String.
 * 5.	У класса Cat должна быть переменная color с типом String.
 * 6.	У класса должен быть конструктор, принимающий в качестве параметра
 * имя, но инициализирующий все переменные класса, кроме адреса.
 * 7.	У класса должен быть конструктор, принимающий в качестве параметров
 * имя, вес, возраст и инициализирующий все переменные класса, кроме адреса.
 * 8.	У класса должен быть конструктор, принимающий в качестве параметров
 * имя, возраст и инициализирующий все переменные класса, кроме адреса.
 * 9.	У класса должен быть конструктор, принимающий в качестве параметров
 * вес, цвет и инициализирующий все переменные класса, кроме имени и адреса.
 * 10.	У класса должен быть конструктор, принимающий в качестве параметров
 * вес, цвет, адрес и инициализирующий все переменные класса, кроме имени.
 */

public class Task14 {

    public static void main(String[] args) {
        //напишите тут ваш код
    }

    public static class Cat {
        String name = null;
        int age = 5;
        float weight = 5.0f;
        String color = "some color";
        String address = null;

        public Cat(String name){
            this.name = name;
        }
        public Cat(String name, float weight){
            this.name = name;
            this.weight =weight;
        }
        public Cat(String name, float weight, int age){
            this.name = name;
            this.weight = weight;
            this.age = age;
        }
        public Cat(float weight, String color){
            this.name = "homeless cat";
            this.weight =weight;
            this.color = color;
        }
        public Cat( float weight, String color,String address) {
            this.name = "neighbour cat";
            this.weight = weight;
            this.color = color;
            this.address = address;
        }



    }

}
