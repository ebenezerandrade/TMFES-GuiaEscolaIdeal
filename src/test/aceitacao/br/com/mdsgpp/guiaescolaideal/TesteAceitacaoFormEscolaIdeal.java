package br.com.mdsgpp.guiaescolaideal;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

import com.thoughtworks.selenium.Selenium;
import com.thoughtworks.selenium.webdriven.WebDriverBackedSelenium;

public class TesteAceitacaoFormEscolaIdeal {

    private WebDriver driver;
    private Selenium selenium;
    private String baseUrl = "http://localhost:8765/GuiaEscolaIdeal/index.jsp";

    @Before
    public void setUp() throws Exception {
	// You may use any WebDriver implementation. Firefox is used here as an
	// example
	driver = new FirefoxDriver();
	selenium = new WebDriverBackedSelenium(driver, baseUrl);
    }

    @Test
    public void testeCasoPerfeito() throws InterruptedException {

	realizarBuscaIdeal();

	selecionaModalidade("Ensino Regular");
	selecionaEstado("Distrito Federal");
	selenium.click("id=labinf5");
	submit();

	assertTrue(driver.getPageSource().contains("Resultado"));

    }

    @Test
    public void testeSemInserirEstado() {
	realizarBuscaIdeal();
	selecionaModalidade("Ensino Regular");
	submit();

	assertEquals("Campo estado não foi selecionado!", selenium.getAlert());
    }

    @Test
    public void testeMunicipioCaracterInvalido() {
	realizarBuscaIdeal();
	selecionaModalidade("Ensino Regular");
	selecionaEstado("Goiás");

	driver.findElement(By.id("municipio")).clear();
	driver.findElement(By.id("municipio")).sendKeys("@#$%^&");
	submit();

	assertEquals("Município inválido! Uso de caracteres inválidos.",
		selenium.getAlert());

    }

    @Test
    public void testeModalidadeVazia() {
	realizarBuscaIdeal();
	submit();

	assertEquals("Campo modalidade não foi selecionado!",
		selenium.getAlert());
    }

    @Test
    public void testeSistemaNaoEncontraNenhumaEscola() {
	realizarBuscaIdeal();
	selecionaModalidade("Ensino Regular");
	selecionaEstado("Goiás");

	driver.findElement(By.id("municipio")).clear();
	driver.findElement(By.id("municipio")).sendKeys(
		"javavah do sul e do norte");
	submit();

	assertTrue(driver.getPageSource().contains(
		"Consulta não retornou nenhuma escola com esses atributos."));

    }

    private void submit() {
	selenium.click("id=button1id");
    }

    private void selecionaEstado(String estado) {
	new Select(driver.findElement(By.id("select_estado-ideal")))
		.selectByVisibleText(estado);
    }

    private void selecionaModalidade(String modalidade) {
	new Select(driver.findElement(By.id("modalidade")))
		.selectByVisibleText(modalidade);
    }

    private void realizarBuscaIdeal() {
	selenium.open("/GuiaEscolaIdeal/index.jsp");
	selenium.click("link=Buscar Escola");
	driver.findElement(
		By.xpath("//section[@id='portfolio']/div/div[2]/div[2]/a/div"))
		.click();
    }

    @After
    public void close() {
	selenium.close();
    }

}
