package lesson05.part02;

/**
 * Лететь, бежать и плыть
 * Напиши public интерфейсы CanFly(летать), CanRun(бежать/ездить), CanSwim(плавать).
 * Добавить в каждый интерфейс по одному методу.
 * <p>
 * <p>
 * Требования:
 * 1. Класс задачи должен содержать интерфейс CanFly.
 * 2. Класс задачи должен содержать интерфейс CanRun.
 * 3. Класс задачи должен содержать интерфейс CanSwim.
 * 4. Интерфейс CanFly должен содержать один метод.
 * 5. Интерфейс CanRun должен содержать один метод.
 * 6. Интерфейс CanSwim должен содержать один метод.
 */

public class Task17 {
    public static void main(String[] args) {

    }

//add interfaces here - добавь интерфейсы тут
public interface CanFly{ void Height(int m);}
    public interface CanRun{ void Speed(int a);}
    public interface CanSwim{ void Speed(int n);}

}
