package metodos;

import drivers.Drivers;
import org.openqa.selenium.By;

import java.util.Set;

import static org.junit.Assert.assertEquals;

public class Metodos extends Drivers {

    public void escrever(By elemento, String texto){
        driver.findElement(elemento).sendKeys(texto);

    }
    public void clicar(By elemento){
        driver.findElement(elemento).click();
    }

    public void submit(By elemento){
        driver.findElement(elemento).submit();

    }
    public void validar(By elemento, String textoEsperado){
        String textoCapturado = driver.findElement(elemento).getText();
        assertEquals(textoEsperado, textoCapturado);

    }
    public void fecharAbar(){
        driver.close();
    }

    public void mudarAba(){
        String janelaPrincipal = driver.getWindowHandle();
        Set<String> todasJanelas = driver.getWindowHandles();

        for (String janela : todasJanelas){
            if(!janela.equals(janelaPrincipal)){
                driver.switchTo().window(janela);
            }
        }

    }

}
