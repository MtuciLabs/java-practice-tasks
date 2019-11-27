package lesson03.part01;

/**
 * 1. В классе Task26 создать public static класс Idea.
 * 2. В классе Idea создать метод public String getDescription(), который будет возвращать любую строку.
 * 3. В классе Task26 создай статический метод public void printIdea(Idea idea),
 * который будет выводить на экран описание идеи - это то, что возвращает метод getDescription().
 *
 * Требования:
 * 1.	В классе Task26 создать public static класс Idea.
 * 2.	В классе Idea создать метод public String getDescription().
 * 3.	Метод getDescription должен возвращать любую строку.
 * 4.	В классе Task26 создайте метод public static void printIdea(Idea idea).
 * 5.	Метод printIdea должен выводить описание идеи на экран.
 */

public class Task26 {

  public static void main(String[] args) {
    printIdea(new Idea());
  }
  public static class Idea{
    public String getDescription(){
      return "description";
    }
  }
  public static void printIdea(Idea idea){
    System.out.println(idea.getDescription());
  }

}
