Ordem de execução:

1 - Executar SCRIPT_CONFIGURACAO.sql
2 - Executar SCRIPT_CRIACAO.sql
3 - Alterar arquivo <SCRIPT_CARREGA_ARQUIVO.sql>
	- Inserir o caminho para o arquivo migracao_final.csv
	 no trecho logo após <LOAD DATA LOCAL INFILE>
	- Caso contrário você não poderá carregar o arquivo no banco
4 - Executar SCRIPT_CARREGA_ARQUIVO.sql
4 - Executar SCRIPT_PROCEDURE.sql

Após a execução dos Scripts deve mandar rodar a procedure com o comando:

<call migra_registros();>