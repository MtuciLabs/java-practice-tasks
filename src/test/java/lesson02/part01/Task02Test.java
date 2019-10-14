package lesson02.part01;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import static org.junit.jupiter.api.Assertions.fail;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

/**
 * @author Azamat_Abidokov Date: 09-Oct-19
 */
class Task02Test {

  private static final PrintStream originalOut = System.out;
  private static final ByteArrayOutputStream fakeOut = new ByteArrayOutputStream();

  @BeforeAll
  static void setUp() {
    System.setOut(new PrintStream(fakeOut));
  }

  @AfterAll
  static void restore() {
    System.setOut(originalOut);
  }

  @Test
  @DisplayName("Проверка существования метода")
  void printString_IsExist() {
    try {
      Task02.class.getDeclaredMethod("printString", String.class);
    } catch (Exception e) {
      fail("Метод printString не найден");
    }
  }

  @Test
  @DisplayName("Проверка возвращаемого типа")
  void printString_ValidateReturnType() {
    try {
      Method printString = Task02.class.getDeclaredMethod("printString", String.class);
      Class<?> returnType = printString.getReturnType();
      assertEquals(void.class, returnType, "Возвращаемый тип должен быть void");
    } catch (Exception e) {}
  }

  @Test
  @DisplayName("Проверка модификаторов")
  void printString_ValidateModifiers() {
    try {
      Method printString = Task02.class.getDeclaredMethod("printString", String.class);
      int modifiers = printString.getModifiers();
      assertTrue(Modifier.isStatic(modifiers), "Метод printString должен быть static");
      assertTrue(Modifier.isPublic(modifiers), "Метод printString должен быть public");
    } catch (Exception e) {}
  }

  @Test
  @DisplayName("Проверка модификаторов")
  void printString_ValidateOutput() {
    try {
      Method printString = Task02.class.getDeclaredMethod("printString", String.class);
      String testText = "random$text";
      printString.invoke(null, testText);
      assertEquals(testText, fakeOut.toString().strip(),
          "Метод printString должен выводить переданный текст на экран.");
    } catch (Exception e) {}
  }

  @Test
  @DisplayName("Проверка модификаторов")
  void main() {
    try {
      Method main = Task02.class.getDeclaredMethod("main", String[].class);
      main.invoke(null, null);
      assertEquals("Hello, Amigo!", fakeOut.toString().strip(), "Программа должна вывести \"Hello, Amigo!\"");
    } catch (Exception e) {}
  }
}