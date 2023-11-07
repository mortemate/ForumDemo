package com.kyriba.rtest.classes;

public class ThisClassIsTested
{
  
  public String thisMethodIsTestedAndNotChanged(String str)
  {
    return str;
  }
  
  public String thisMethodIsTestedAndChanged(String str)
  {
    return str;
  }
  
  private String thisPrivateMethodIsTestedAndChanged(String str)
  {
    return str + str;
  }
  
  private String thisPrivateMethodIsTestedAndNotChanged(String str)
  {
    return str + str + str;
  }
  
  public String callPrivateMethods(String str, boolean bool)
  {
    if (bool) {
      return thisPrivateMethodIsTestedAndChanged(str);
    } else {
      return thisPrivateMethodIsTestedAndNotChanged(str);
    }
  }
}