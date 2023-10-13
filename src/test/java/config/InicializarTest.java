package config;

import drivers.Drivers;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;

public class InicializarTest extends Drivers {

    static String ambiente = "https://www.correios.com.br/";

    public static void abrirNavegador(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get(ambiente);
        driver.manage().window().maximize();
    }

    public static void fecharNavegador(){
        driver.quit();
    }

}
