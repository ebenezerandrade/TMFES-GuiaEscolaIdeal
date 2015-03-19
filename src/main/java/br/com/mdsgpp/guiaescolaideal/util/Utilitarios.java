/**
 * 
 */
package br.com.mdsgpp.guiaescolaideal.util;

import br.com.mdsgpp.guiaescolaideal.exceptions.EntradaDadosException;

public final class Utilitarios {
    
    private Utilitarios(){}
    
    public static void checarParaConteudo(String texto, int tamanhoMinimo)
	    throws EntradaDadosException {
	if (!Util.textoTemConteudo(texto, tamanhoMinimo)) {
	    throw new EntradaDadosException(
		    "Argumento(s) inserido(s) pelo usuário inválido(s).");
	}
    }

}
