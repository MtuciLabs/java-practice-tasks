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
        String m = "Мыла";
        String n = "Мама";
        String k = "Раму";

        System.out.println(m+n+k);
        System.out.println(m+k+n);
        System.out.println(k+n+m);
        System.out.println(k+m+n);
        System.out.println(n+k+m);
        System.out.println(n+m+k);


    }
}
