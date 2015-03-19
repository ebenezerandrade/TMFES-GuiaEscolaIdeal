package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Regiao;

public class TesteRegiao {
    Regiao regiao= new Regiao();
    @Before
    public void setUp()
    {
	regiao.setNome("teste");
    }
    @Test
    public void testGetNome() {
	assertTrue(regiao.getNome().equalsIgnoreCase("teste"));
    }
    @Test
    public void testSetNome(){
	regiao.setNome("teste2");
	assertTrue(regiao.getNome().equalsIgnoreCase("teste2"));
    }

}
