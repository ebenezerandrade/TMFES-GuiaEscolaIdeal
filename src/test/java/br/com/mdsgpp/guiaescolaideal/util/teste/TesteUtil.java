package br.com.mdsgpp.guiaescolaideal.util.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.util.Util;

public class TesteUtil {

    @Test
    public void testTextoTemConteudo() {
	assertTrue(Util.textoTemConteudo("teste"));
    }
    
    @Test
    public void testTextoTemConteudoComNull() {
	assertFalse(Util.textoTemConteudo(null));
    }
    
    @Test
    public void testTextoTemConteudoVazio() {
	assertFalse(Util.textoTemConteudo(""));
    }

    @Test
    public void testTextoTemConteudoTamanho() {
	assertTrue(Util.textoTemConteudo("teste", 3));
    }
    
    @Test
    public void testTextoTemConteudoTamanhoAbaixo() {
	assertFalse(Util.textoTemConteudo("te", 3));
    }

}
