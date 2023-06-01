package com.example.prog4;

public enum ClassUniqueInstance {
  INSTANCE(0);
  private int click;
  ClassUniqueInstance(int click) {
    this.click = click;
  }
  public ClassUniqueInstance getInstance() {
    return INSTANCE;
  }
  public void setClick(int click) {
    this.click = click;
  }
  public int getClick() {
    return  click;
  }
}
