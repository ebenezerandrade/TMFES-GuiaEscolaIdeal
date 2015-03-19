package br.com.mdsgpp.guiaescolaideal.exceptions;

public class EscolaNaoPresenteException extends Exception {

    private static final long serialVersionUID = 1L;
    
    public EscolaNaoPresenteException(String message){
	super(message);
    }

}
