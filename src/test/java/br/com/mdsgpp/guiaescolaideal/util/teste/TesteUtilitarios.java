package br.com.mdsgpp.guiaescolaideal.util.teste;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.exceptions.EntradaDadosException;
import br.com.mdsgpp.guiaescolaideal.util.Utilitarios;

public class TesteUtilitarios {

    private final String TEXTO = "teste";
    private final int TAMANHO_MINIMO = 2;

    @Test
    public void testChecarParaConteudo() throws EntradaDadosException {
	Utilitarios.checarParaConteudo(TEXTO, TAMANHO_MINIMO);
    }

    @Test(expected = EntradaDadosException.class)
    public void testChecarParaConteudoTamanhoMenor()
	    throws EntradaDadosException {
	Utilitarios.checarParaConteudo(TEXTO, 6);
    }

    @Test(expected = EntradaDadosException.class)
    public void testChecarParaConteudoTextoNull()
	    throws EntradaDadosException {
	Utilitarios.checarParaConteudo(null, 0);
    }
    
    @Test(expected = EntradaDadosException.class)
    public void testChecarParaConteudoTextoVazio()
	    throws EntradaDadosException {
	Utilitarios.checarParaConteudo("", 0);
    }

}
