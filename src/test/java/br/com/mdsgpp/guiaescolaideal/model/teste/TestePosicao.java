package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.Posicao;

public class TestePosicao {
    
    @Test
    public void testPosicaoConstrutorComParametros() {
	Posicao posicao = new Posicao("1234567", "14345677");
	
	assertTrue(posicao.getLongitude().equals("14345677"));
	assertTrue(posicao.getLatitude().equals("1234567"));
    }

    @Test
    public void testPosicao() {
	Posicao posicao = new Posicao();
	
	assertTrue(posicao.getLatitude().equals(posicao.getLongitude()));
	assertTrue(posicao.getLatitude().equals("ERROR"));
    }

    @Test
    public void testGetLatitude() {
	Posicao posicao = new Posicao("1", "2");
	assertTrue(posicao.getLatitude().equals("1"));
    }

    @Test
    public void testGetLongitude() {
	Posicao posicao = new Posicao("1", "2");
	assertTrue(posicao.getLongitude().equals("2"));
    }

    @Test
    public void testValidaEntrada() {
	Posicao posicao = new Posicao();
	
	posicao.validaPosicao("1,2", "1,3");
	
	assertTrue(posicao.getLongitude().equals("1.3"));
	assertTrue(posicao.getLatitude().equals("1.2"));
    }
    
    @Test
    public void testValidaEntradaValoresInvalidos() {
	Posicao posicao = new Posicao();
	
	posicao.validaPosicao("", "1,3");
	
	assertTrue(posicao.getLatitude().equals(posicao.getLongitude()));
	assertTrue(posicao.getLatitude().equals("ERROR"));
    }
    
    @Test
    public void testValidaEntradaValorInvalidoLongitude() {
	Posicao posicao = new Posicao();
	
	posicao.validaPosicao("1,2", "");
	
	assertTrue(posicao.getLatitude().equals(posicao.getLongitude()));
	assertTrue(posicao.getLatitude().equals("ERROR"));
    }

}
