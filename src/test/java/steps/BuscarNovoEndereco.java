package steps;


import config.InicializarTest;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import utils.MassaDeDados;


public class BuscarNovoEndereco {
HomePage home = new HomePage();
MassaDeDados massa = new MassaDeDados();

    @Given("que esteja na pagina principal do correios")
    public void queEstejaNaPaginaPrincipalDoCorreios() {
        InicializarTest.abrirNavegador();
    }

    @When("buscar as informacoes")
    public void buscarAsInformacoes() {
        home.pesquisarEnderecoCep(massa.inserirCep());

    }

    @Then("valido o retorno da pesquisa")
    public void validoORetornoDaPesquisa() {
        home.validarDadosDePesquisa("Rua Ferreira de Oliveira", "Alto do Pari", "São Paulo/SP", "03022-030");
        InicializarTest.fecharNavegador();
    }

}
