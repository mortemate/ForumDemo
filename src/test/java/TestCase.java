import com.kyriba.rtest.classes.ThisClassIsTested;
import org.junit.jupiter.api.Test;


public class TestCase
{
  
  ThisClassIsTested tested = new ThisClassIsTested();
  
  
  @Test
  void coverChangedMethodTest()
  {
    assert tested.thisMethodIsTestedAndChanged("This method will be changed").equals("This method will be changed");
  }
  
  
  @Test
  void coverNotChangedMethodTest()
  {
    assert tested.thisMethodIsTestedAndNotChanged("This method will not be changed")
                 .equals("This method will not be changed");
  }
  
  @Test
  void coverChangedPrivateMethodTest()
  {
    assert tested.callPrivateMethods("Repeat twice ", true).equals("Repeat twice Repeat twice ");
  }
  
  @Test
  void coverNotChangedPrivateMethodTest()
  {
    assert tested.callPrivateMethods("Repeat three times ", false)
                 .equals("Repeat three times Repeat three times Repeat three times ");
  }
}
