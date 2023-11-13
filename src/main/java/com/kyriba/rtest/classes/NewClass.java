package com.kyriba.rtest.classes;

public class NewClass
{
  private int x;
  
  public NewClass(int x)
  {
    this.x = x;
  }
  public void newTestedMethod()
  {
    this.x = x*2;
  }
  
  public void newNotTestedMethod()
  {
    this.x = x^2;
  }
  
  public int getX()
  {
    return x;
  }
  
  public void setX(int x)
  {
    this.x = x;
  }
  
}
