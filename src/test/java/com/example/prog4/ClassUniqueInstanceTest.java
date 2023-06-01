package com.example.prog4;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class ClassUniqueInstanceTest {
  @Test
  void test() {
    ClassUniqueInstance instance1 = ClassUniqueInstance.INSTANCE.getInstance();
    ClassUniqueInstance instance2 = ClassUniqueInstance.INSTANCE.getInstance();
    instance1.setClick(1);
    assertEquals(1, instance1.getClick());
    assertEquals(1, instance2.getClick());
  }
}
