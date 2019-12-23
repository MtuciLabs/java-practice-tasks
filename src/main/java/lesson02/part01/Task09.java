package lesson02.part01;



/**
 * Вывести на экран сумму чисел от 1 до 5 построчно (должно быть 5 строк):
 * 1
 * 1+2=3
 * 1+2+3=6
 * ...
 * Пример вывода:
 * 1
 * 3
 * 6
 * ...
 * <p>
 * <p>
 * Требования:
 * 1.	Программа должна выводить текст.
 * 2.	Выведенный текст должен содержать 5 строк.
 * 3.	Число в каждой новой строке должно быть больше предыдущего.
 * 4.	Выводимый текст должен соответствовать заданию.
 */

public class Task09 {
    public static void main(String[] args) {
        int sum=0;
        for (int i=1,j=0,l=-1,m=-2, n=-3;i<=5;i++,j++,l++,m++,n++){
            sum+=i;
            switch (i){
                case 1:
                    System.out.println(sum);
                    break;
                case 2:
                    System.out.println(j + "+" + i + "=" + sum);
                    break;
                case 3:
                    System.out.println(l + "+"  + j + "+" + i + "=" + sum);
                    break;
                case 4:
                    System.out.println(m + "+" + l + "+"  + j + "+" + i + "=" + sum);
                    break;
                case 5:
                    System.out.println(n + "+"  + m + "+" + l + "+"  + j + "+" + i + "=" + sum);
                    break;
            }

        }
        //напишите тут ваш код

    }
}
