import com.codeborne.selenide.Condition;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class CreatAProject extends BaseTest {
    @Test
  public void createAProject() {
        open("/login");
        $("#inputEmail").sendKeys(user);
        $("#inputPassword").sendKeys(password);
        $("#btnLogin").click();
        $("#createButton").click();
        $("#inputTitle").sendKeys("QASE TEST1");
        $("#inputCode").sendKeys("QT");
        $("#inputDescription").sendKeys("This is robot");
        $(".btn").click();


  }
}
