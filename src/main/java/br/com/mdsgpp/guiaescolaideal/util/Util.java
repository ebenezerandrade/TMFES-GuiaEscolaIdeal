package br.com.mdsgpp.guiaescolaideal.util;

public final class Util {

    private Util() {
    }

    public static boolean textoTemConteudo(String texto) {
	return texto != null && !texto.isEmpty();
    }

    public static boolean textoTemConteudo(String texto, int tamanhoMinimo) {
	return textoTemConteudo(texto) && texto.length() >= tamanhoMinimo;
    }

}
