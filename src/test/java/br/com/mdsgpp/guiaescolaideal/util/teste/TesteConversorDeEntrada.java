package br.com.mdsgpp.guiaescolaideal.util.teste;

import static org.junit.Assert.*;

import java.text.ParseException;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.exceptions.EntradaDadosException;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;
import br.com.mdsgpp.guiaescolaideal.util.ConversorDeEntrada;

public class TesteConversorDeEntrada {

    @Test(expected = PesquisaException.class)
    public void testGetPalavrasChaveDoTextoIsNull() throws PesquisaException {
	ConversorDeEntrada.getPalavrasChaveDoTexto(null);
    }

    @Test(expected = PesquisaException.class)
    public void testGetPalavrasChaveDoTextoIsEmpty() throws PesquisaException {
	ConversorDeEntrada.getPalavrasChaveDoTexto("");
    }

    @Test(expected = PesquisaException.class)
    public void testGetPalavrasChaveDoTextoComPercentil()
	    throws PesquisaException {
	ConversorDeEntrada.getPalavrasChaveDoTexto("%%%");
    }

    @Test(expected = PesquisaException.class)
    public void testGetPalavrasChaveDoTextoComDuasLetras()
	    throws PesquisaException {
	ConversorDeEntrada.getPalavrasChaveDoTexto("es");
    }

    @Test
    public void testGetPalavrasChaveDoTexto() throws PesquisaException {
	List<String> lista = ConversorDeEntrada
		.getPalavrasChaveDoTexto("MDS + GPP");
	assertTrue(lista.size() == 2);
    }

    @Test
    public void testGetPalavrasChaveDoTextoComSimbolos()
	    throws PesquisaException {
	List<String> lista = ConversorDeEntrada
		.getPalavrasChaveDoTexto("m+at*e(m)á%t#i!c@a");
	assertTrue(lista.size() == 1);
	assertTrue(lista.get(0).equalsIgnoreCase("Matematica"));
    }

    @Test
    public void testGetNumeroInteiroSemPonto() {
	String numeroTexto = "1.223.456";
	int numero = ConversorDeEntrada.getNumeroInteiroSemPonto(numeroTexto);
	assertTrue(numero == 1223456);
    }

    @Test
    public void testGetNumeroInteiroSemPontoIsEmpty() {
	String numeroTexto = "";
	int numero = ConversorDeEntrada.getNumeroInteiroSemPonto(numeroTexto);
	assertTrue(numero == 0);
    }

    @Test
    public void testGetNumeroInteiroSemPontoIsNULL() {
	String numeroTexto = null;
	int numero = ConversorDeEntrada.getNumeroInteiroSemPonto(numeroTexto);
	assertTrue(numero == 0);
    }

    @Test
    public void testGetNumeroInteiroSemPontoComEspaco() {
	String numeroTexto = " 1.245";
	int numero = ConversorDeEntrada.getNumeroInteiroSemPonto(numeroTexto);
	assertTrue(numero == 1245);
    }

    @Test
    public void testGetNumeroInteiroSemPontoComEspacoNoFinal() {
	String numeroTexto = " 1.245 ";
	int numero = ConversorDeEntrada.getNumeroInteiroSemPonto(numeroTexto);
	assertTrue(numero == 1245);
    }

    @Test
    public void testGetValorBooleanDoTextoIsEmpty() {
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto(""));
    }

    @Test
    public void testGetValorBooleanDoTextoIsNULL() {
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto(null));
    }

    @Test
    public void testGetValorBooleanDoTexto() {
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto("nao"));
    }

    @Test
    public void testGetValorBooleanDoTextoValorTrue() {
	assertTrue(ConversorDeEntrada.getValorBooleanDoTexto("Sim"));
    }

    @Test
    public void testGetDataIsNull() throws ParseException {
	assertNull(ConversorDeEntrada.getData(null));
    }

    @Test
    public void testGetDataIsEmpty() throws ParseException {
	assertNull(ConversorDeEntrada.getData(""));
    }

    @Test
    public void testGetDataErrada() throws ParseException {
	assertNull(ConversorDeEntrada.getData("22-1993"));
    }

    @Test
    public void testGetData() throws ParseException {
	assertNotNull(ConversorDeEntrada.getData("05/05/2015"));
    }

    @Test
    public void testConstrutor() {
	assertNotNull(new ConversorDeEntrada());
    }

    @Test
    public void testGerarCampos() throws EntradaDadosException {
	assertTrue(ConversorDeEntrada.gerarCampos("padrao", "1 2 3 4 5",
		"padrao").size() == 5);
    }
    
    @Test
    public void testValidarCep() throws EntradaDadosException{
	String cep = "70000-000";
	ConversorDeEntrada.validarCep(cep);
    }
    
    @Test(expected=EntradaDadosException.class)
    public void testValidarCepInvalido() throws EntradaDadosException{
	String cep = "cepvalido";
	ConversorDeEntrada.validarCep(cep);
    }
    
    @Test(expected=EntradaDadosException.class)
    public void testValidarCepInvalidoNumerico() throws EntradaDadosException{
	String cep = "71000000";
	ConversorDeEntrada.validarCep(cep);
    }
    
    @Test
    public void testGetValorBooleanDoTextoComDoisParametros(){
	assertTrue(ConversorDeEntrada.getValorBooleanDoTexto("java", Arrays.asList("sim", "java")));
    }
    
    @Test
    public void testGetValorBooleanDoTextoComDoisParametrosEsperandoFalso(){
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto("ruby", Arrays.asList("sim", "java")));
    }
    
    @Test
    public void testGetValorBooleanDoTextoComDoisParametrosValorNull(){
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto(null, Arrays.asList("sim", "java")));
    }
    
    @Test
    public void testGetValorBooleanDoTextoComDoisParametrosValorVazio(){
	assertFalse(ConversorDeEntrada.getValorBooleanDoTexto("", Arrays.asList("sim", "java")));
    }
    
    @Test
    public void testGetNumeroInteiro() throws EntradaDadosException{
	assertTrue(ConversorDeEntrada.getNumeroInteiro("2") == 2);
    }
    
    @Test(expected = EntradaDadosException.class)
    public void testGetNumeroInteiroComValorInvalido() throws EntradaDadosException{
	ConversorDeEntrada.getNumeroInteiro("dois");
    }
}
