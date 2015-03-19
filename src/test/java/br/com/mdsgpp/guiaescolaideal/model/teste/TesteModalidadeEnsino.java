package br.com.mdsgpp.guiaescolaideal.model.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.model.ModalidadeEnsino;

public class TesteModalidadeEnsino {

    private ModalidadeEnsino modalidade;
    
    @Before
    public void setUP(){
    	modalidade = new ModalidadeEnsino();
    	
    	modalidade.setTipoModalidadeEnsino("eja");
    }
    
    @Test
    public void testGetTipoModalidadeEnsino(){
    	assertTrue(modalidade.getTipoModalidadeEnsino().equalsIgnoreCase("EJA"));
    }
    
    @Test
    public void testSetTipoModalidadeEnsino(){
    	modalidade.setTipoModalidadeEnsino("ensino");
    	assertTrue(modalidade.getTipoModalidadeEnsino().equalsIgnoreCase("ensino"));
    }


}
