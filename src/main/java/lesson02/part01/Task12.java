package lesson02.part01;

/**
 * Вывести на экран все возможные комбинации слов «Мама», «Мыла», «Раму».
 * Подсказка: их 6 штук. Каждую комбинацию вывести с новой строки. Слова не разделять. Пример:
 * МылаРамуМама
 * РамуМамаМыла
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 6 строк.
 * 3.	Текст в каждой строке должен быть уникален.
 * 4.	Должны быть выведены все возможные комбинации.
 */

public class Task12 {
    public static void main(String[] args) {
        //напишите тут ваш код
        String a = "Мама";
        String s = "мыла";
        String d = "раму";
        System.out.println(a+s+d);
        System.out.println(a+d+s);
        System.out.println(s+a+d);
        System.out.println(s+d+a);
        System.out.println(d+a+s);
        System.out.println(d+s+a);
    }
}
