package com.example.prog4;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public final class ClassSingleton {
  private static ClassSingleton instance;
  private String description;

  public static ClassSingleton getInstance() {
    if(instance == null) {
      instance = new ClassSingleton();
    }
    return instance;
  }
}
