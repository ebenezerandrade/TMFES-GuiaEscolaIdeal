package br.com.mdsgpp.guiaescolaideal.exceptions;

public class MensagemNaoCompletadaException extends ContatoException
{
    private static final long serialVersionUID = 1L;

    public MensagemNaoCompletadaException(String mensagem)
    {
	super(mensagem);
    }
}
