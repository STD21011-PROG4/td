package com.example.prog4;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class ClassSingletonTest {
  @Test
  void test() {
    ClassSingleton instance1 = ClassSingleton.getInstance();
    ClassSingleton instance2 = ClassSingleton.getInstance();
    instance1.setDescription("hello");
    assertEquals("hello", instance1.getDescription());
    assertEquals("hello", instance2.getDescription());
    //Instance1 and Instance2 is equals
  }
}
