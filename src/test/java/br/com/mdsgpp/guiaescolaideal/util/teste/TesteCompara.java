package br.com.mdsgpp.guiaescolaideal.util.teste;

import static org.junit.Assert.*;
import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;

import br.com.mdsgpp.guiaescolaideal.exceptions.EscolaNaoPresenteException;
import br.com.mdsgpp.guiaescolaideal.exceptions.EscolaRepetidaException;
import br.com.mdsgpp.guiaescolaideal.exceptions.QuantidadeDeEscolasExcedenteException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;
import br.com.mdsgpp.guiaescolaideal.util.Compara;

public class TesteCompara {

    private Compara compara;
    private Escola escolaA, escolaB, escola;

    @Before
    public void setUp() throws Exception {
	this.compara = new Compara();
    }

    @Test
    public void testAdd() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	verificaSeNaoExisteEscola();
	addPrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
    }
    
    @Test
    public void testAddDuasEscolas() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	verificaSeNaoExisteEscola();
	
	addPrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
	
	addSegundaEscola();
	verificaSeExisteDuasEscolas();
    }
    
    @Test(expected=EscolaRepetidaException.class)
    public void testAddDuasEscolasRepetidas() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	verificaSeNaoExisteEscola();
	
	addPrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
	
	addPrimeiraEscola();
    }
    
    @Test(expected=QuantidadeDeEscolasExcedenteException.class)
    public void testAddMaisDeDuasEscolas() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	verificaSeNaoExisteEscola();
	
	addPrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
	
	addSegundaEscola();
	verificaSeExisteDuasEscolas();
	
	addTerceiraEscola();
    }
    
    @Test
    public void testRemove() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException, EscolaNaoPresenteException {
	verificaSeNaoExisteEscola();
	
	addPrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
	
	addSegundaEscola();
	verificaSeExisteDuasEscolas();
	
	removePrimeiraEscola();
	verificaSeExisteApenasUmaEscola();
    }
    
    @Test(expected = EscolaNaoPresenteException.class)
    public void testRemoveEscolaNaoPresente() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException, EscolaNaoPresenteException {
	int id = 17015;
	
	compara.remove(id);
    }

    private void removePrimeiraEscola() throws EscolaNaoPresenteException {
	compara.remove(1);
	
    }

    private void verificaSeExisteDuasEscolas() {
	assertNotNull(compara.getEscolaA());
	assertNotNull(compara.getEscolaB());
    }

    private void verificaSeExisteApenasUmaEscola() {
	assertNotNull(compara.getEscolaA());
	assertNull(compara.getEscolaB());
    }

    private void addSegundaEscola()
	    throws QuantidadeDeEscolasExcedenteException,
	    EscolaRepetidaException {
	mockEscolaB();
	compara.add(this.escolaB);
    }

    private void addPrimeiraEscola()
	    throws QuantidadeDeEscolasExcedenteException,
	    EscolaRepetidaException {
	mockEscolaA();
	compara.add(this.escolaA);
    }
    
    private void addTerceiraEscola() throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException{
	mockEscola();
	compara.add(this.escola);
    }

    private void verificaSeNaoExisteEscola() {
	assertNull(compara.getEscolaA());
	assertNull(compara.getEscolaB());
    }

    public void mockEscolaA() {
	this.escolaA = mock(Escola.class);
	when(escolaA.getCodEscola()).thenReturn(1);

    }

    public void mockEscola() {
	this.escola = mock(Escola.class);
	when(escola.getCodEscola()).thenReturn(3);
    }

    public void mockEscolaB() {
	this.escolaB = mock(Escola.class);
	when(escolaB.getCodEscola()).thenReturn(2);
    }
}
