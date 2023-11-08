package hookwebdriver.definitions;
import hookwebdriver.WebDriverManager;
import io.cucumber.java.en.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import static org.junit.Assert.assertTrue;

public class IngresarContacUs {
    private  final WebDriver driver = WebDriverManager.getDriver();
    @Given("que el usuario se vaya a la seccion contacUs")
    public void que_el_ususario_se_vaya_a_la_seccion_contac_us() {
        driver.manage().window().maximize();
        driver.navigate().to("http://www.automationpractice.pl/index.php?controller=contact");
    }
    @When("el usuario ingresa sus datos a cada campo")
    public void el_usuario_ingresa_sus_datos_a_cada_campo() throws InterruptedException {
        WebElement subjectHeading = driver.findElement(By.id("id_contact"));
        Select selectSubjectHeading = new Select(subjectHeading);
        selectSubjectHeading.selectByIndex(1);
        Thread.sleep(2000);
        selectSubjectHeading.selectByIndex(2);
        Thread.sleep(2000);
        selectSubjectHeading.selectByIndex(0);
        Thread.sleep(2000);
        selectSubjectHeading.selectByVisibleText("Webmaster");
        Thread.sleep(2000);

        WebElement email=driver.findElement(By.id("email"));
        email.sendKeys("ejemplo@gmail.com");
        Thread.sleep(2000);

        WebElement orderReference=driver.findElement(By.cssSelector("input#id_order"));
        orderReference.sendKeys("1234567");

        WebElement message=driver.findElement(By.xpath("//textarea[@id='message']"));
        message.sendKeys("escribiendo mesnaje de prueba");

        WebElement submitMessage=driver.findElement(By.id("submitMessage"));
        submitMessage.click();
    }
    @Then("se debe permitir registarlo")
    public void se_debe_permitir_registarlo() {
        WebElement successMessage= driver.findElement(By.xpath("//p[contains(@class, 'alert alert-success')]"));
        assertTrue("los datos no fueron enviados",successMessage.isDisplayed());
    }

}
