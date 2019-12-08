package lesson03.part01;

/**
 * Создать класс Friend (друг) с тремя конструкторами:
 * - Имя
 * - Имя, возраст
 * - Имя, возраст, пол
 *
 * Требования:
 * 1.	У класса Friend должна быть переменная name с типом String.
 * 2.	У класса Friend должна быть переменная age с типом int.
 * 3.	У класса Friend должна быть переменная sex с типом char.
 * 4.	У класса должен быть конструктор, принимающий в качестве параметра
 * имя и инициализирующий соответствующую переменную класса.
 * 5.	У класса должен быть конструктор, принимающий в качестве параметров
 * имя, возраст и инициализирующий соответствующие переменные класса.
 * 6.	У класса должен быть конструктор, принимающий в качестве параметров
 * имя, возраст, пол и инициализирующий соответствующие переменные класса.
 */

public class Task13 {

    public static void main(String[] args) {
        Friend mike = new Friend("Misha", 18,  'M');
        Friend ann = new Friend("Anton", 'W');
        //напишите тут ваш код
    }

    public static class Friend {
        private String name;
        private int age;
        private char sex;


        public Friend(String name){

            this.name = name;
        }
        public Friend(String name, int age){
            this.name = name;
            this.age = age;
        }
        public Friend(String name, int age, char sex){
            this.name = name;
            this.age =age;
            this.sex =sex;
        }
        public Friend(String name, char sex){
            this.name = name;
            this.sex =sex;
        }
        //напишите тут ваш код
    }

}
