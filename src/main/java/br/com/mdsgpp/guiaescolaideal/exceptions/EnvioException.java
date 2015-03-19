package br.com.mdsgpp.guiaescolaideal.exceptions;

public class EnvioException extends ContatoException 
{
    private static final long serialVersionUID = 1L;

    public EnvioException(String mensagem)
    {
	super(mensagem);
    }

}
