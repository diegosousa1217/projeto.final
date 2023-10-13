package pages;

import metodos.Metodos;
import org.openqa.selenium.By;

public class HomePage {
    By buscarCep = By.id("relaxation");
    By logradouro = By.xpath("//td[@data-th='Logradouro/Nome']");
    By bairro = By.xpath("//td[@data-th='Bairro/Distrito']");
    By localidade = By.xpath("//td[@data-th='Localidade/UF']");
    By cep = By.xpath("//td[@data-th='CEP']");
    Metodos metodo = new Metodos();

    public void pesquisarEnderecoCep(String cep){
metodo.escrever(buscarCep, cep);
metodo.submit(buscarCep);
    }
    public void validarDadosDePesquisa(String logradouro, String bairro, String localidade, String cep){
        metodo.mudarAba();
        metodo.validar(this.logradouro, logradouro);
        metodo.validar(this.bairro, bairro);
        metodo.validar(this.localidade, localidade);
        metodo.validar(this.cep, cep);
    }
}
