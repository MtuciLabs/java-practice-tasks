package lesson03.part01;

/**
 * Создать статическую переменную int catCount в классе Cat. Создай конструктор [public Cat()], в котором увеличивай данную переменную на 1.
 * <p>
 * Требования:
 * 1.	Добавь в класс Cat конструктор.
 * 2.	Конструктор должен быть public.
 * 3.	Добавь в класс Cat поле catCount.
 * 4.	Поле catCount должно быть типа int.
 * 5.	Поле catCount должно быть статическим.
 * 6.	Конструктор класса должен на 1 увеличивать значение переменной catCount.
 */

public class Task20 {

  public static class Cat{
    static int catCount;
    public int Cat(int catCount){
      this.catCount=catCount++;
      return catCount;
    }
  }

  public static void main(String[] args) {
    Cat p=new Cat();
    int s =p.Cat(5);
    System.out.println(s);

      }

}
