DROP procedure IF EXISTS migra_registros;
DROP procedure IF EXISTS insere_escola;

DELIMITER $$

CREATE PROCEDURE migra_registros()
    BEGIN
			INSERT INTO regiao 
									(descricao) 
			SELECT DISTINCT col_f 
			FROM   migracao_arquivo 
			WHERE  col_f IS NOT NULL; 
			
			INSERT INTO uf 
									(cod_regiao, 
									 descricao) 
			SELECT DISTINCT r.cod_regiao, 
											m.col_g 
			FROM   regiao r, 
						 migracao_arquivo m 
			WHERE  m.col_f = r.descricao; 
			
			INSERT INTO municipio 
									(descricao, 
									 cod_uf, 
									 ddd) 
			SELECT DISTINCT m.col_h   nome, 
											uf.cod_uf uf, 
											m.col_o   ddd 
			FROM   migracao_arquivo m, 
						 uf 
			WHERE  m.col_g = uf.descricao 
			ORDER  BY m.col_h; 
			
			INSERT INTO endereco 
									(cod_municipio, 
									 bairro, 
									 rua, 
									 cep, 
									 numero, 
									 complemento) 
			SELECT DISTINCT mun.cod_municipio cod_municipio, 
											m.col_m           bairro, 
											m.col_j           rua, 
											m.col_n           cep, 
											m.col_k           numero, 
											m.col_l           complemento 
			FROM   municipio mun, 
						 migracao_arquivo m 
			WHERE  mun.descricao = m.col_h 
						 AND mun.ddd <=> col_o; 
			
			INSERT INTO tipo_rede_escola 
									(descricao, 
									 dependencia_adm, 
									 categoria_escola_privada) 
			SELECT DISTINCT m.col_b DESCRICAO, 
											m.col_c DEPENDENCIA_ADM, 
											m.col_d CATEGORIA_ESCOLA_PRIVADA 
			FROM   migracao_arquivo m 
			ORDER  BY m.col_b, 
								m.col_c; 
			
			INSERT INTO local_funcionamento 
									(tipo_predio_escola, 
									 se_sala_empresa, 
									 se_und_internacao, 
									 se_templos_igreja, 
									 se_casa_professor, 
									 se_rancho, 
									 outros, 
									 se_outra_escola) 
			SELECT DISTINCT col_ae TIPO_PREDIO_ESCOLA, 
											col_af SE_SALA_EMPRESA, 
											col_ag SE_UND_INTERNACAO, 
											col_ah SE_TEMPLOS_IGREJA, 
											col_ai SE_CASA_PROFESSOR, 
											col_aj SE_RANCHO, 
											col_ak OUTROS, 
											col_al SE_OUTRA_ESCOLA 
			FROM   migracao_arquivo 
			ORDER  BY col_ae; 
			
			INSERT INTO tipo_abastecimento_agua 
									(descricao) 
			VALUES      ('REDE PÚBLICA'), 
									('POÇO ARTESIANO'), 
									('CACIMBA'), 
									('FONTE'), 
									('INEXISTENTE'); 
			
			INSERT INTO tipo_abastecimento_energia_eletrica 
									(descricao) 
			VALUES      ('REDE PÚBLICA'), 
									('GERADOR'), 
									('OUTROS'), 
									('INEXISTENTE'); 
			
			INSERT INTO equipamento 
									(descricao) 
			VALUES      ('DVD'), 
									('IMPRESSORA'), 
									('APARELHO SOM'), 
									('PROJETOR MULTIMEDIA'), 
									('FAX'), 
									('MAQUINA FOTOGRAF. OU FILMADORA'), 
									('PARABOLICA'), 
									('COPIADORA'), 
									('RETROPROJETOR'), 
									('TV'), 
									('VIDEOCASSETE'); 
			
			INSERT INTO tipo_esgoto_sanitario 
									(descricao) 
			VALUES      ('REDE PÚBLICA'), 
									('FOSSA'), 
									('INEXISTENTE'); 
			
			INSERT INTO tipo_destinacao_lixo 
									(descricao) 
			VALUES      ('Coleta Periódica'), 
									('Queima'), 
									('Joga em Outra Área Recicla'), 
									('Recicla'), 
									('Enterra'), 
									('Outros'); 
			
			INSERT INTO modalidade_ensino (descricao)
			VALUES      ('Ensino Regular'), 
									('Educação Especial'), 
									('Educação De Jovens E Adultos'); 
		
		    
		call insere_escola();

    END $$

		
 DELIMITER;
 


 

DELIMITER $$

CREATE PROCEDURE insere_escola()
BEGIN

  -- DefiniÃ§Ã£o de variÃ¡veis utilizadas na Procedure
  DECLARE existe_mais_linhas INT DEFAULT 0;
	DECLARE v_id INT DEFAULT 0;
	 DECLARE v_cod_escola INT DEFAULT 0;
	declare v_telefone varchar(20);
	

  -- DefiniÃ§Ã£o do cursor
  DECLARE c_migracao_arquivo CURSOR FOR SELECT id FROM migracao_arquivo;

  -- DefiniÃ§Ã£o da variÃ¡vel de controle de looping do cursor
  DECLARE CONTINUE HANDLER FOR NOT FOUND SET existe_mais_linhas = 1;

  -- Abertura do cursor
  OPEN c_migracao_arquivo;

  -- Looping de execuÃ§Ã£o do cursor
  meuLoop: LOOP
  FETCH c_migracao_arquivo INTO v_id;

  -- Controle de existir mais registros na tabela
  IF existe_mais_linhas = 1 THEN
  LEAVE meuLoop;
  END IF;

				
		INSERT INTO escola 
            (nome_escola, 
             cod_rede, 
             tipo_localizacao, 
             cod_endereco, 
             condicao_funcionamento, 
             email, 
             se_sistema_senai, 
             se_ong, 
             data_inicio_letivo, 
             data_termino_letivo, 
             se_fins_lurativos, 
             atividade_complementar, 
             cod_local_funcionamento, 
             se_acessibilidade, 
             se_depen_vias_aces, 
             se_santi_acess, 
             se_aee, 
             se_sala_diretoria, 
             se_sala_professor, 
             se_secretaria, 
             se_refeitorio, 
             se_despensa, 
             se_almoxarifado, 
             se_auditorio, 
             se_lab_info, 
             se_lab_ciencias, 
             se_sala_atend_esp, 
             se_quadra_espo_coberta, 
             se_quadra_espo_descoberta, 
             se_patio_coberto, 
             se_patio_descoberto, 
             se_parque_infantil, 
             se_cozinha, 
             se_biblioteca, 
             se_bercario, 
             se_sanitario_no_predio, 
             se_sanitario_fora_predio, 
             se_sanitario_educ_adeq_infan, 
             se_banheiro_chuveiro, 
             se_lavanderia, 
             se_outras_dependencias, 
             num_salas_existentes, 
             num_salas_utilizadas, 
             se_sala_leitura, 
             se_alojamento_aluno, 
             se_alojamento_professor, 
             se_area_verde, 
             num_funcionarios, 
             se_alimentacao_esc_alunos, 
             se_agua_filtrada, 
             se_internet, 
             num_computadores_alunos, 
             num_computadores_administracao, 
             num_computadores_total, 
             se_educacao_indigna, 
             se_lingua_indigena, 
             se_brasil_alfabetizacao, 
             se_abertura_fds_comun, 
             num_matriculas) 
							SELECT 
								m.col_a, 
								tre.cod_rede, 
								col_e, 
								e.cod_endereco, 
								m.col_s, 
								m.col_r, 
								m.col_aa, 
								m.col_ab, 
								m.col_v, 
								m.col_w, 
								m.col_x, 
								m.col_ad, 
								lf.cod_local_funcionamento, 
								m.col_am, 
								m.col_an, 
								m.col_ao, 
								m.col_ap, 
								m.col_aq, 
								m.col_ar, 
								m.col_as, 
								m.col_at, 
								m.col_au, 
								m.col_av, 
								m.col_aw, 
								m.col_ax, 
								m.col_ay, 
								m.col_az, 
								m.col_ba, 
								m.col_bb, 
								m.col_bc, 
								m.col_bd, 
								m.col_be, 
								m.col_bf, 
								m.col_bg, 
								m.col_bh, 
								m.col_bi, 
								m.col_bj, 
								m.col_bk, 
								m.col_bl, 
								m.col_bm, 
								m.col_bn, 
								m.col_bo, 
								m.col_bp, 
								m.col_bq, 
								m.col_br, 
								m.col_bs, 
								m.col_bt, 
								m.col_bu, 
								m.col_bv, 
								m.col_bw, 
								m.col_cp, 
								m.col_cr, 
								m.col_cs, 
								m.col_cq, 
								m.col_de, 
								m.col_df, 
								m.col_dg, 
								m.col_dh, 
								m.col_dl 
							FROM   migracao_arquivo m, 
										 tipo_rede_escola tre, 
										 local_funcionamento lf, 
										 endereco e 
										 INNER JOIN municipio mun 
														 ON e.cod_municipio = mun.cod_municipio 
							WHERE  ( e.bairro <=> m.col_m 
											 AND e.rua <=> m.col_j 
											 AND e.cep <=> m.col_n 
											 AND e.numero <=> m.col_k 
											 AND e.complemento <=> m.col_l ) 
										 AND mun.ddd <=> m.col_o 
										 AND ( m.col_b <=> tre.descricao 
													 AND m.col_c <=> tre.dependencia_adm 
													 AND m.col_d <=> tre.categoria_escola_privada ) 
										 AND ( m.col_ae <=> lf.tipo_predio_escola 
													 AND m.col_af <=> lf.se_sala_empresa 
													 AND m.col_ag <=> lf.se_und_internacao 
													 AND m.col_ah <=> lf.se_templos_igreja 
													 AND m.col_ai <=> lf.se_casa_professor 
													 AND m.col_aj <=> lf.se_rancho 
													 AND m.col_ak <=> lf.outros 
													 AND m.col_al <=> lf.se_outra_escola )
													 and m.id = v_id	;
													 
									set v_cod_escola = (select max(cod_escola) from escola);



									INSERT INTO equipamento_escola 
										(cod_equipamento, 
										 cod_escola) 
									SELECT e.cod_equipamento, 
										   v_cod_escola 
									FROM   equipamento e, 
										   (SELECT CASE col_ct 
													 WHEN 'Sim' THEN 'DVD' 
												   END AS col_ct, 
												   CASE col_cu 
													 WHEN 'Sim' THEN 'IMPRESSORA' 
												   END AS col_cu, 
												   CASE col_cv 
													 WHEN 'Sim' THEN 'APARELHO SOM' 
												   END AS col_cv, 
												   CASE col_cw 
													 WHEN 'Sim' THEN 'PROJETOR MULTIMEDIA' 
												   END AS col_cw, 
												   CASE col_cx 
													 WHEN 'Sim' THEN 'FAX' 
												   END AS col_cx, 
												   CASE col_cy 
													 WHEN 'Sim' THEN 'MAQUINA FOTOGRAF. OU FILMADORA' 
												   END AS col_cy, 
												   CASE col_cz 
													 WHEN 'Sim' THEN 'PARABOLICA' 
												   END AS col_cz, 
												   CASE col_da 
													 WHEN 'Sim' THEN 'COPIADORA' 
												   END AS col_da, 
												   CASE col_db 
													 WHEN 'Sim' THEN 'RETROPROJETOR' 
												   END AS col_db, 
												   CASE col_dc 
													 WHEN 'Sim' THEN 'TV' 
												   END AS col_dc, 
												   CASE col_dd 
													 WHEN 'Sim' THEN 'VIDEOCASSETE' 
												   END AS col_dd 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  e.descricao IN ( vw_m.col_ct, vw_m.col_cu, vw_m.col_cv, vw_m.col_cw, 
															vw_m.col_cx, vw_m.col_cy, vw_m.col_cz, vw_m.col_da, 
															vw_m.col_db, vw_m.col_dc, vw_m.col_dd ); 

									INSERT INTO tipo_abastecimento_agua_escola 
												(cod_tipo_abastecimento_agua, 
												 cod_escola) 
									SELECT tba.cod_tipo_abastecimento_agua, 
										   v_cod_escola 
									FROM   tipo_abastecimento_agua tba, 
										   (SELECT CASE col_bx 
													 WHEN 'Sim' THEN 'REDE PÚBLICA' 
												   END AS col_Bx, 
												   CASE col_by 
													 WHEN 'Sim' THEN 'POÇO ARTESIANO' 
												   END AS col_By, 
												   CASE col_bz 
													 WHEN 'Sim' THEN 'CACIMBA' 
												   END AS col_BZ, 
												   CASE col_ca 
													 WHEN 'Sim' THEN 'FONTE' 
												   END AS col_CA, 
												   CASE col_cb 
													 WHEN 'Sim' THEN 'INEXISTENTE' 
												   END AS col_CB 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  tba.descricao IN ( vw_m.col_bx, vw_m.col_by, vw_m.col_bz, vw_m.col_ca, 
															  vw_m.col_cb ); 

									INSERT INTO tipo_abaste_ener_elet_esc 
												(cod_tipo_abast_energia, 
												 cod_escola) 
									SELECT tbe.COD_TIPO_ABAST_ENERGIA, 
										   v_cod_escola 
									FROM   tipo_abastecimento_energia_eletrica tbe, 
										   (SELECT CASE col_cc 
													 WHEN 'Sim' THEN 'REDE PÚBLICA' 
												   END AS col_cc, 
												   CASE col_cd 
													 WHEN 'Sim' THEN 'GERADOR' 
												   END AS col_cd, 
												   CASE col_ce 
													 WHEN 'Sim' THEN 'OUTROS' 
												   END AS col_ce, 
												   CASE col_cf 
													 WHEN 'Sim' THEN 'INEXISTENTE' 
												   END AS col_cf 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  tbe.descricao IN ( vw_m.col_cc, vw_m.col_cd, vw_m.col_ce, vw_m.col_cf ); 

									INSERT INTO tipo_abastecimento_agua_escola 
												(cod_tipo_abastecimento_agua, 
												 cod_escola) 
									SELECT tba.cod_tipo_abastecimento_agua, 
										   v_cod_escola 
									FROM   tipo_abastecimento_agua tba, 
										   (SELECT CASE col_bx 
													 WHEN 'Sim' THEN 'REDE PÚBLICA' 
												   END AS col_Bx, 
												   CASE col_by 
													 WHEN 'Sim' THEN 'POÇO ARTESIANO' 
												   END AS col_By, 
												   CASE col_bz 
													 WHEN 'Sim' THEN 'CACIMBA' 
												   END AS col_BZ, 
												   CASE col_ca 
													 WHEN 'Sim' THEN 'FONTE' 
												   END AS col_CA, 
												   CASE col_cb 
													 WHEN 'Sim' THEN 'INEXISTENTE' 
												   END AS col_CB 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  tba.descricao IN ( vw_m.col_bx, vw_m.col_by, vw_m.col_bz, vw_m.col_ca, 
															  vw_m.col_cb ); 

									INSERT INTO tipo_esgoto_escola 
												(cod_tipo_esgoto, 
												 cod_escola) 
									SELECT es.cod_tipo_esgoto, 
										   v_cod_escola 
									FROM   tipo_esgoto_sanitario es, 
										   (SELECT CASE col_cg 
													 WHEN 'Sim' THEN 'REDE PÚBLICA' 
												   END AS col_cg, 
												   CASE col_ch 
													 WHEN 'Sim' THEN 'FOSSA' 
												   END AS col_ch, 
												   CASE col_ci 
													 WHEN 'Sim' THEN 'INEXISTENTE' 
												   END AS col_ci 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  es.descricao IN ( vw_m.col_cg, vw_m.col_ch, vw_m.col_ci ); 

									INSERT INTO tipo_destinacao_lixo_escola 
												(cod_tipo_destinacao_lixo, 
												 cod_escola) 
									SELECT tdl.cod_tipo_destinacao_lixo, 
										   v_cod_escola 
									FROM   tipo_destinacao_lixo tdl, 
										   (SELECT CASE col_cj 
													 WHEN 'Sim' THEN 'Coleta Periódica' 
												   END AS col_cj, 
												   CASE col_ck 
													 WHEN 'Sim' THEN 'Queima' 
												   END AS col_ck, 
												   CASE col_cl 
													 WHEN 'Sim' THEN 'Joga em Outra Área Recicla' 
												   END AS col_cl, 
												   CASE col_cm 
													 WHEN 'Sim' THEN 'Recicla' 
												   END AS col_cm, 
												   CASE col_cn 
													 WHEN 'Sim' THEN 'Enterra' 
												   END AS col_cn, 
												   CASE col_ci 
													 WHEN 'Sim' THEN 'Outros' 
												   END AS col_ci 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  tdl.descricao IN ( vw_m.col_cj, vw_m.col_ck, vw_m.col_cl, 
															  vw_m.col_cm, vw_m.col_cn ); 

									INSERT INTO modalidade_escola_escola 
												(cod_modalidade_ensino, 
												 cod_escola) 
									SELECT me.cod_modalidade_ensino, 
										   v_cod_escola 
									FROM   modalidade_ensino me, 
										   (SELECT CASE col_di 
													 WHEN 'S' THEN 'Ensino Regular' 
												   END AS col_di, 
												   CASE col_dj 
													 WHEN 'S' THEN 'Educação Especial' 
												   END AS col_dj, 
												   CASE col_dk 
													 WHEN 'S' THEN 'Educação De Jovens E Adultos' 
												   END AS col_dk 
											FROM   migracao_arquivo 
											WHERE  id = v_id) vw_m 
									WHERE  me.descricao IN ( vw_m.col_di, vw_m.col_dj, vw_m.col_dk ); 
											
									set v_telefone = (select ifnull(col_p,'0') from migracao_arquivo where id = v_id);
									
									if v_telefone not like '0' then


									insert into telefone(numero_telefone, cod_escola, cod_municipio)
									select v_telefone, v_cod_escola, ed.cod_municipio
									from escola e 
										inner join endereco ed on e.cod_endereco = ed.cod_endereco 
									where e.cod_escola = v_cod_escola;

									end if;
												
  

  -- Retorna para a primeira linha do loop
  END LOOP meuLoop;

 close c_migracao_arquivo;
 
 
  END$$

DELIMITER ;


