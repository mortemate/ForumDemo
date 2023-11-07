package com.kyriba.rtest.classes;

public class ThisClassIsNotTested
{
  public String thisMethodIsNotTestedAndNotChanged(String str)
  {
    return str;
  }
  
  public String thisMethodIsNotTestedAndChanged(String str)
  {
    return str;
  }
  
  private String thisPrivateMethodIsNotTestedAndChanged(String str)
  {
    return str + str;
  }
  
  private String thisPrivateMethodIsNotTestedAndNotChanged(String str)
  {
    return str + str + str;
  }
  
}
