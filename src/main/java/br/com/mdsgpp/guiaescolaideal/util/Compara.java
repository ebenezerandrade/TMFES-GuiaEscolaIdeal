package br.com.mdsgpp.guiaescolaideal.util;

import java.util.ArrayList;
import java.util.List;

import br.com.mdsgpp.guiaescolaideal.exceptions.EscolaNaoPresenteException;
import br.com.mdsgpp.guiaescolaideal.exceptions.EscolaRepetidaException;
import br.com.mdsgpp.guiaescolaideal.exceptions.QuantidadeDeEscolasExcedenteException;
import br.com.mdsgpp.guiaescolaideal.model.Escola;

public class Compara {
    private List<Escola> lista;

    public Compara() {
	this.lista = new ArrayList<Escola>();
    }

    public Escola getEscolaA() {
	try {
	    return lista.get(0);
	} catch (Exception e) {
	    return null;
	}
    }

    public Escola getEscolaB() {
	try {
	    return lista.get(1);
	} catch (Exception e) {
	    return null;
	}
    }

    public void add(Escola escola) throws QuantidadeDeEscolasExcedenteException, EscolaRepetidaException {
	verificaSeListaJaPossuiEssaEscola(escola);
	
	if (lista.size() < 2) {
	    lista.add(escola);
	} else {
	    throw new QuantidadeDeEscolasExcedenteException(
		    "Quantidade de escolas acima de 2.");
	}
    }

    private void verificaSeListaJaPossuiEssaEscola(Escola escola) throws EscolaRepetidaException {
	for (Escola newEscola : lista) {
	    if(escola.getCodEscola() == newEscola.getCodEscola()){
		throw new EscolaRepetidaException("A escola já está na lista.");
	    }
	}
    }

    public void remove(int idNumerico) throws EscolaNaoPresenteException {
	boolean verifica = false;
	
	for(int i=0; i < lista.size(); i++){
	    if(idNumerico == lista.get(i).getCodEscola()){
		lista.remove(i);
		verifica = true;
	    }
	}
	
	if(!verifica){
	    throw new EscolaNaoPresenteException("Escola não pode ser excluída.");
	}
	
    }

}
