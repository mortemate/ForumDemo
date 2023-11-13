package com.kyriba.rtest.classes;

public class ThisClassIsNotTested
{
  public String thisMethodIsNotTestedAndNotChanged(String str)
  {
    return str;
  }
  
  public String thisMethodIsNotTestedAndChanged(String str)
  {
    return str + "_Changed";
  }
  
  private String thisPrivateMethodIsNotTestedAndChanged(String str)
  {
    return str + str + "_Changed";
  }
  
  private String thisPrivateMethodIsNotTestedAndNotChanged(String str)
  {
    return str + str + str;
  }
  
}
