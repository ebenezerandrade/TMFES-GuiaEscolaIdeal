package br.com.mdsgpp.guiaescolaideal.util;

import java.sql.Date;
import java.text.DateFormat;
import java.text.Normalizer;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import br.com.mdsgpp.guiaescolaideal.dao.Campo;
import br.com.mdsgpp.guiaescolaideal.dao.CampoTexto;
import br.com.mdsgpp.guiaescolaideal.exceptions.EntradaDadosException;
import br.com.mdsgpp.guiaescolaideal.exceptions.PesquisaException;

public class ConversorDeEntrada {

    /**
     * Quebra o texto em n palavras;
     * 
     * @param texto
     * @return List<String> palavras chaves do texto em uma lista.
     * @throws PesquisaException
     */
    public static List<String> getPalavrasChaveDoTexto(String texto)
	    throws EntradaDadosException {
	Utilitarios.checarParaConteudo(texto, 3);

	texto = retiraAcentos(texto);
	texto = retiraCaracteresEspeciais(texto);
	texto = retiraEspacoDuplo(texto);

	Utilitarios.checarParaConteudo(texto, 0);

	return Arrays.asList(texto.split(" "));
    }

    public static List<Campo> gerarCampos(String nome, String valor,
	    String tabela) throws EntradaDadosException {

	List<Campo> campos = new ArrayList<Campo>();
	List<String> palavras = getPalavrasChaveDoTexto(valor);

	for (String palavra : palavras) {
	    campos.add(new CampoTexto(nome, palavra, tabela));
	}
	return campos;
    }

    public static int getNumeroInteiroSemPonto(String numero) {
	if (numero == null || numero.isEmpty()) {
	    return 0;
	}

	// Substitui todos os pontos por nada e retirna os espaços antes e no
	// final do número
	String novoTexto = numero.replaceAll("[.]", "").trim();
	return Integer.parseInt(novoTexto);
    }
    
    public static int getNumeroInteiro(String numero) throws EntradaDadosException{
	try{
	    return Integer.parseInt(numero);
	}catch(NumberFormatException e){
	    throw new EntradaDadosException("Formato de número inválido!");
	}
    }

    // sim = true e false para o resto
    public static boolean getValorBooleanDoTexto(String texto) {
	if (texto == null || texto.isEmpty()) {
	    return false;
	}

	return texto.equalsIgnoreCase("sim");
    }
    
    public static boolean getValorBooleanDoTexto(String texto, List<String> palavrasPermitidas) {
	if (!Util.textoTemConteudo(texto)) {
	    return false;
	}
	
	for(String palavra: palavrasPermitidas){
	    if(texto.equalsIgnoreCase(palavra)){
		return true;
	    }
	}
	
	return false;
    }

    public static Date getData(String dataTexto) {
	Date data = null;
	
	if(!Util.textoTemConteudo(dataTexto)){
	    return null;
	}

	try {
	    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	    data = new Date(dateFormat.parse(dataTexto).getTime());
	} catch (ParseException e) {
	    Logger logger = LoggerFactory.getLogger(ConversorDeEntrada.class);
	    logger.info(e.getMessage());
	} 
	
	return data;
    }

    public static void validarCep(String cep) throws EntradaDadosException {
	if ((!Util.textoTemConteudo(cep, 8)) || (!cep.matches("[0-9]{5}-[0-9]{3}"))) {
	    throw new EntradaDadosException("CEP inválido");
	}
    }

    private static String retiraAcentos(String texto) {
	return Normalizer.normalize(texto, Normalizer.Form.NFD);
    }

    private static String retiraCaracteresEspeciais(String texto) {
	return texto.replaceAll("[^a-zA-Z0-9 ]", "");
    }

    private static String retiraEspacoDuplo(String texto) {
	return texto.replaceAll("  ", " ");
    }

}
