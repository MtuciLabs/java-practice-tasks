package lesson05.part02;

import lesson05.part02.Task18.CanMove;

/**
 * Создаем человека
 * Есть public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавь эти интерфейсы классам Human(человек), Duck(утка), Penguin(пингвин), Airplane(самолет).
 * <p>
 * <p>
 * Требования:
 * 1. Класс задачи должен содержать интерфейс CanFly с одним методом fly().
 * 2. Класс задачи должен содержать интерфейс CanRun с одним методом run().
 * 3. Класс задачи должен содержать интерфейс CanSwim с одним методом swim().
 * 4. Человек должен уметь бегать и плавать.
 * 5. Утка должна уметь летать, плавать и бегать.
 * 6. Пингвин должен уметь плавать и бегать.
 * 7. Самолет должен уметь летать и ездить.
 */

public class Task19 {
    public static void main(String[] args) {

    }

    public interface CanFly {
        public void fly();
    }

    public interface CanRun {
        public void run();
    }

    public interface CanSwim {
        public void swim();
    }


    public class Human implements CanMove,CanFly {
      public void move(){

      }
      public void fly(){

      }
    }

    public class Duck implements CanFly, CanMove, CanSwim{
      public void move(){

      }
      public void swim(){

      }
      public void fly(){

      }
    }

    public class Penguin implements CanSwim, CanMove {
      public void move(){

      }
      public void swim(){

      }
    }

    public class Airplane implements CanFly,CanMove{
      public void move(){

      }
      public void fly(){

      }
    }
}
