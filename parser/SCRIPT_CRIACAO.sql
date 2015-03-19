/*==============================================================*/
/* DBMS name:      MySQL 5.0                                    */
/* Created on:     18/04/2014 21:50:33                          */
/*==============================================================*/


drop table if exists ENDERECO;

drop table if exists EQUIPAMENTO;

drop table if exists EQUIPAMENTO_ESCOLA;

drop table if exists ESCOLA;

drop table if exists LOCAL_FUNCIONAMENTO;

drop table if exists MIGRACAO_ARQUIVO;

drop table if exists MODALIDADE_ENSINO;

drop table if exists MODALIDADE_ESCOLA_ESCOLA;

drop table if exists MUNICIPIO;

drop table if exists REGIAO;

drop table if exists TELEFONE;

drop table if exists TIPO_ABASTECIMENTO_AGUA;

drop table if exists TIPO_ABASTECIMENTO_AGUA_ESCOLA;

drop table if exists TIPO_ABASTECIMENTO_ENERGIA_ELETRICA;

drop table if exists TIPO_ABASTE_ENER_ELET_ESC;

drop table if exists TIPO_DESTINACAO_LIXO;

drop table if exists TIPO_DESTINACAO_LIXO_ESCOLA;

drop table if exists TIPO_ESGOTO_ESCOLA;

drop table if exists TIPO_ESGOTO_SANITARIO;

drop table if exists TIPO_REDE_ESCOLA;

drop table if exists UF;

/*==============================================================*/
/* Table: ENDERECO                                              */
/*==============================================================*/
create table ENDERECO
(
   COD_ENDERECO         INT not null auto_increment,
   COD_MUNICIPIO        INT,
   BAIRRO               VARCHAR(60) comment 'COL_M',
   RUA                  VARCHAR(100) comment 'COL_J',
   CEP                  VARCHAR(15) comment 'COL_N',
   NUMERO               VARCHAR(20) comment 'COL_K',
   COMPLEMENTO          VARCHAR(30) comment 'COL_L',
   primary key (COD_ENDERECO)
);

/*==============================================================*/
/* Table: EQUIPAMENTO                                          */
/*==============================================================*/
create table EQUIPAMENTO
(
   COD_EQUIPAMENTO     INT not null auto_increment,
   DESCRICAO            VARCHAR(30) comment 'COL_CT ATE COL_DD
            
            1 - DVD
            2 - IMPRESSORA
            3 - APARELHO_SOM
            4 - PROJETOR MULTIMEDIA
            5 - FAX
            6 - MAQUINA FOTOGRAFICA/FILMADORA
            7 - PARABOLICA
            8 - FILMADORA
            9 - COPIADORA
            10 - RETROPROJETOR
            11 - TV
            12 - VIDEOCASSETE
            
            ',
   primary key (COD_EQUIPAMENTO)
);

/*==============================================================*/
/* Table: EQUIPAMENTO_ESCOLA                                   */
/*==============================================================*/
create table EQUIPAMENTO_ESCOLA
(
   COD_EQUIPAMENTO_ESCOLA INT not null auto_increment,
   COD_ESCOLA           INT,
   COD_EQUIPAMENTO     INT,
   primary key (COD_EQUIPAMENTO_ESCOLA)
);

/*==============================================================*/
/* Table: ESCOLA                                                */
/*==============================================================*/
create table ESCOLA
(
   COD_ESCOLA           INT not null auto_increment,
   NOME_ESCOLA          varchar(115) comment 'COL_A',
   COD_REDE             INT,
   TIPO_LOCALIZACAO     VARCHAR(15) comment 'COL_E',
   COD_ENDERECO         INT,
   CONDICAO_FUNCIONAMENTO VARCHAR(20) comment 'COL_S',
   EMAIL                VARCHAR(75) comment 'COL_R',
   SE_SISTEMA_SENAI     VARCHAR(10) comment 'COL_AA',
   SE_ONG               VARCHAR(10) comment 'COL_AB',
   DATA_INICIO_LETIVO   VARCHAR(20) comment 'COL_V',
   DATA_TERMINO_LETIVO  VARCHAR(20) comment 'COL_W',
   SE_FINS_LURATIVOS    VARCHAR(10) comment 'COL_X',
   ATIVIDADE_COMPLEMENTAR VARCHAR(30) comment 'COL_AD',
   COD_LOCAL_FUNCIONAMENTO INT,
   SE_ACESSIBILIDADE    VARCHAR(10) comment 'COL_AM',
   SE_DEPEN_VIAS_ACES   VARCHAR(10) comment 'COL_AN
            ',
   SE_SANTI_ACESS       VARCHAR(10) comment 'COL_AO',
   SE_AEE               VARCHAR(30) comment 'COL_AP. 
            Atendimento educacional especializado',
   SE_SALA_DIRETORIA    VARCHAR(10) comment 'COL_AQ',
   SE_SALA_PROFESSOR    VARCHAR(10) comment 'COL_AR',
   SE_SECRETARIA        VARCHAR(10) comment 'COL_AS',
   SE_REFEITORIO        VARCHAR(10) comment 'COL_AT',
   SE_DESPENSA          VARCHAR(10) comment 'COL_AU',
   SE_ALMOXARIFADO      VARCHAR(10) comment 'COL_AV',
   SE_AUDITORIO         VARCHAR(10) comment 'COL_AW',
   SE_LAB_INFO          VARCHAR(10) comment 'COL_AX',
   SE_LAB_CIENCIAS      VARCHAR(10) comment 'COL_AY',
   SE_SALA_ATEND_ESP    VARCHAR(10) comment 'COL_AZ',
   SE_QUADRA_ESPO_COBERTA VARCHAR(10) comment 'COL_BA',
   SE_QUADRA_ESPO_DESCOBERTA VARCHAR(10) comment 'COL_BB',
   SE_PATIO_COBERTO     VARCHAR(10) comment 'COL_BC',
   SE_PATIO_DESCOBERTO  VARCHAR(10) comment 'COL_BD',
   SE_PARQUE_INFANTIL   VARCHAR(10) comment 'COL_BE',
   SE_COZINHA           VARCHAR(10) comment 'COL_BF',
   SE_BIBLIOTECA        VARCHAR(10) comment 'COL_BG',
   SE_BERCARIO          VARCHAR(10) comment 'COL_BH',
   SE_SANITARIO_NO_PREDIO VARCHAR(10) comment 'COL_BI',
   SE_SANITARIO_FORA_PREDIO VARCHAR(10) comment 'COL_BJ',
   SE_SANITARIO_EDUC_ADEQ_INFAN VARCHAR(10) comment 'COL_BK',
   SE_BANHEIRO_CHUVEIRO VARCHAR(10) comment 'COL_BL',
   SE_LAVANDERIA        VARCHAR(10) comment 'COL_BM',
   SE_OUTRAS_DEPENDENCIAS VARCHAR(10) comment 'COL_BN',
   NUM_SALAS_EXISTENTES VARCHAR(10) comment 'COL_BO',
   NUM_SALAS_UTILIZADAS VARCHAR(10) comment 'COL_BP',
   SE_SALA_LEITURA      VARCHAR(10) comment 'COL_BQ',
   SE_ALOJAMENTO_ALUNO  VARCHAR(10) comment 'COL_BR',
   SE_ALOJAMENTO_PROFESSOR VARCHAR(10) comment 'COL_BS',
   SE_AREA_VERDE        VARCHAR(10) comment 'COL_BT',
   NUM_FUNCIONARIOS     VARCHAR(10) comment 'COL_BU',
   SE_ALIMENTACAO_ESC_ALUNOS VARCHAR(10) comment 'COL_BV',
   SE_AGUA_FILTRADA     VARCHAR(22) comment 'COL_BW',
   SE_INTERNET          VARCHAR(10) comment 'COL_CP',
   NUM_COMPUTADORES_ALUNOS VARCHAR(10) comment 'COL_CR',
   NUM_COMPUTADORES_ADMINISTRACAO VARCHAR(10) comment 'COL_CS',
   NUM_COMPUTADORES_TOTAL VARCHAR(10) comment 'COL_CQ',
   SE_EDUCACAO_INDIGNA  VARCHAR(10) comment 'COL_DE',
   SE_LINGUA_INDIGENA   VARCHAR(10) comment 'COL_DF',
   SE_BRASIL_ALFABETIZACAO VARCHAR(10) comment 'COL_DG',
   SE_ABERTURA_FDS_COMUN VARCHAR(10) comment 'COL_DH',
   NUM_MATRICULAS       VARCHAR(15) comment 'COL_DL',
   primary key (COD_ESCOLA)
);

alter table ESCOLA comment 'Responsável por guardar os registros das escolas cadastradas';

/*==============================================================*/
/* Table: LOCAL_FUNCIONAMENTO                                   */
/*==============================================================*/
create table LOCAL_FUNCIONAMENTO
(
   COD_LOCAL_FUNCIONAMENTO INT not null auto_increment,
   TIPO_PREDIO_ESCOLA   VARCHAR(15) comment 'COL_AE',
   SE_SALA_EMPRESA      VARCHAR(10) comment 'COL_AF',
   SE_UND_INTERNACAO    VARCHAR(10) comment 'COL_AG',
   SE_TEMPLOS_IGREJA    VARCHAR(10) comment 'COL_AH',
   SE_CASA_PROFESSOR    VARCHAR(10) comment 'COL_AI',
   SE_RANCHO            VARCHAR(40) comment 'COL_AJ',
   OUTROS               VARCHAR(10) comment 'COL_AK',
   SE_OUTRA_ESCOLA      VARCHAR(10) comment 'COL_AL',
   primary key (COD_LOCAL_FUNCIONAMENTO)
);

alter table LOCAL_FUNCIONAMENTO comment 'Essa tabela define se a escola funciona numa igreja, prisao,';

/*==============================================================*/
/* Table: MIGRACAO_ARQUIVO                                      */
/*==============================================================*/
create table MIGRACAO_ARQUIVO
(
   ID                   INT not null auto_increment,
   COL_A                varchar(115),
   COL_B                varchar(20),
   COL_C                varchar(20),
   COL_D                varchar(20),
   COL_E                varchar(15),
   COL_F                varchar(20),
   COL_G                varchar(25),
   COL_H                varchar(40),
   COL_I                varchar(15),
   COL_J                varchar(100),
   COL_K                varchar(20),
   COL_L                varchar(30),
   COL_M                varchar(60),
   COL_N                varchar(15),
   COL_O                varchar(8),
   COL_P                varchar(20),
   COL_Q                varchar(20),
   COL_R                varchar(75),
   COL_S                varchar(20),
   COL_T                varchar(20),
   COL_U                varchar(20),
   COL_V                varchar(20),
   COL_W                varchar(20),
   COL_X                varchar(10),
   COL_Y                varchar(10),
   COL_Z                varchar(10),
   COL_AA               varchar(10),
   COL_AB               varchar(10),
   COL_AC               varchar(10),
   COL_AD               varchar(30),
   COL_AE               varchar(15),
   COL_AF               varchar(10),
   COL_AG               varchar(10),
   COL_AH               varchar(10),
   COL_AI               varchar(10),
   COL_AJ               varchar(40),
   COL_AK               varchar(10),
   COL_AL               varchar(10),
   COL_AM               varchar(10),
   COL_AN               varchar(10),
   COL_AO               varchar(10),
   COL_AP               varchar(30),
   COL_AQ               varchar(10),
   COL_AR               varchar(10),
   COL_AS               varchar(10),
   COL_AT               varchar(10),
   COL_AU               varchar(10),
   COL_AV               varchar(10),
   COL_AW               varchar(10),
   COL_AX               varchar(10),
   COL_AY               varchar(10),
   COL_AZ               varchar(10),
   COL_BA               varchar(10),
   COL_BB               varchar(10),
   COL_BC               varchar(10),
   COL_BD               varchar(10),
   COL_BE               varchar(10),
   COL_BF               varchar(10),
   COL_BG               varchar(10),
   COL_BH               varchar(10),
   COL_BI               varchar(10),
   COL_BJ               varchar(10),
   COL_BK               varchar(10),
   COL_BL               varchar(10),
   COL_BM               varchar(10),
   COL_BN               varchar(10),
   COL_BO               varchar(10),
   COL_BP               varchar(10),
   COL_BQ               varchar(10),
   COL_BR               varchar(10),
   COL_BS               varchar(10),
   COL_BT               varchar(10),
   COL_BU               varchar(10),
   COL_BV               varchar(10),
   COL_BW               varchar(22),
   COL_BX               varchar(10),
   COL_BY               varchar(10),
   COL_BZ               varchar(10),
   COL_CA               varchar(10),
   COL_CB               varchar(10),
   COL_CC               varchar(10),
   COL_CD               varchar(10),
   COL_CE               varchar(10),
   COL_CF               varchar(10),
   COL_CG               varchar(10),
   COL_CH               varchar(10),
   COL_CI               varchar(10),
   COL_CJ               varchar(10),
   COL_CK               varchar(10),
   COL_CL               varchar(10),
   COL_CM               varchar(10),
   COL_CN               varchar(10),
   COL_CO               varchar(10),
   COL_CP               varchar(10),
   COL_CQ               varchar(10),
   COL_CR               varchar(10),
   COL_CS               varchar(10),
   COL_CT               varchar(10),
   COL_CU               varchar(10),
   COL_CV               varchar(10),
   COL_CW               varchar(10),
   COL_CX               varchar(10),
   COL_CY               varchar(10),
   COL_CZ               varchar(10),
   COL_DA               varchar(10),
   COL_DB               varchar(10),
   COL_DC               varchar(10),
   COL_DD               varchar(10),
   COL_DE               varchar(10),
   COL_DF               varchar(10),
   COL_DG               varchar(10),
   COL_DH               varchar(10),
   COL_DI               varchar(10),
   COL_DJ               varchar(10),
   COL_DK               varchar(10),
   COL_DL               varchar(15),
   primary key (ID)
);

/*==============================================================*/
/* Table: MODALIDADE_ENSINO                                     */
/*==============================================================*/
create table MODALIDADE_ENSINO
(
   COD_MODALIDADE_ENSINO INT not null auto_increment,
   DESCRICAO            VARCHAR(20) comment 'COL_DI ATE COL_DK
            
            1 - ENSINO REGULAR
            2 - EDUCAO ESPECIAL
            3 - EDUCACAO DE JOVENS E ADULTOS
            ',
   primary key (COD_MODALIDADE_ENSINO)
);

/*==============================================================*/
/* Table: MODALIDADE_ESCOLA_ESCOLA                              */
/*==============================================================*/
create table MODALIDADE_ESCOLA_ESCOLA
(
   COD_MODALIDADE_ESCOLA_ESCOLA INT not null auto_increment,
   COD_MODALIDADE_ENSINO INT,
   COD_ESCOLA           INT,
   primary key (COD_MODALIDADE_ESCOLA_ESCOLA)
);

/*==============================================================*/
/* Table: MUNICIPIO                                             */
/*==============================================================*/
create table MUNICIPIO
(
   COD_MUNICIPIO        INT not null auto_increment,
   DESCRICAO            VARCHAR(40) comment 'COL_H',
   COD_UF               INT,
   DDD                  VARCHAR(8) comment 'COL_O',
   primary key (COD_MUNICIPIO)
);

alter table MUNICIPIO comment 'Tabela que representa o município';

/*==============================================================*/
/* Table: REGIAO                                                */
/*==============================================================*/
create table REGIAO
(
   COD_REGIAO           INT not null auto_increment,
   DESCRICAO            VARCHAR(20) comment 'COL_F',
   primary key (COD_REGIAO)
);

alter table REGIAO comment 'Região Administrativa';

/*==============================================================*/
/* Table: TELEFONE                                              */
/*==============================================================*/
create table TELEFONE
(
   COD_TELEFONE         INT not null auto_increment,
   NUMERO_TELEFONE      VARCHAR(20) comment 'COL_P',
   COD_ESCOLA           INT,
   COD_MUNICIPIO        INT,
   primary key (COD_TELEFONE)
);

/*==============================================================*/
/* Table: TIPO_ABASTECIMENTO_AGUA                               */
/*==============================================================*/
create table TIPO_ABASTECIMENTO_AGUA
(
   COD_TIPO_ABASTECIMENTO_AGUA INT not null auto_increment,
   DESCRICAO            VARCHAR(19) comment 'COL_BX ATE COL_CB
            
            1 - REDE PUBLICA
            2 - POCO ARTESIANO
            3 - CACIMBA
            4 - FONTE
            5 - INEXISTENTE
            ',
   primary key (COD_TIPO_ABASTECIMENTO_AGUA)
);

alter table TIPO_ABASTECIMENTO_AGUA comment 'COLUNAS DE CL ATÉ CP
';

/*==============================================================*/
/* Table: TIPO_ABASTECIMENTO_AGUA_ESCOLA                        */
/*==============================================================*/
create table TIPO_ABASTECIMENTO_AGUA_ESCOLA
(
   COD_TIP_ABAST_AGUA_ESC INT not null auto_increment,
   COD_TIPO_ABASTECIMENTO_AGUA INT,
   COD_ESCOLA           INT,
   primary key (COD_TIP_ABAST_AGUA_ESC)
);

/*==============================================================*/
/* Table: TIPO_ABASTECIMENTO_ENERGIA_ELETRICA                   */
/*==============================================================*/
create table TIPO_ABASTECIMENTO_ENERGIA_ELETRICA
(
   COD_TIPO_ABAST_ENERGIA INT not null auto_increment,
   DESCRICAO            VARCHAR(18) comment 'COL_CC ATE COL_CF
            
            1 - REDE PUBLICA
            2 - GERADOR
            3 - OUTROS
            4 - INEXISTENTE
            ',
   primary key (COD_TIPO_ABAST_ENERGIA)
);

alter table TIPO_ABASTECIMENTO_ENERGIA_ELETRICA comment 'COLUNAS CQ ATÉ CT';

/*==============================================================*/
/* Table: TIPO_ABASTE_ENER_ELET_ESC                             */
/*==============================================================*/
create table TIPO_ABASTE_ENER_ELET_ESC
(
   COD_TIPO_ABASTE_ENER_ESC INT not null auto_increment,
   COD_TIPO_ABAST_ENERGIA INT,
   COD_ESCOLA           INT,
   primary key (COD_TIPO_ABASTE_ENER_ESC)
);

/*==============================================================*/
/* Table: TIPO_DESTINACAO_LIXO                                  */
/*==============================================================*/
create table TIPO_DESTINACAO_LIXO
(
   COD_TIPO_DESTINACAO_LIXO INT not null auto_increment,
   DESCRICAO            VARCHAR(30) comment 'COL_CJ ATE COL_CO
            
            1 - Coleta Periódica	
            2 - Queima	
            3- Joga em Outra Área Recicla 
            4 - RECICLA	
            5 - Enterra	
            6 - Outros',
   primary key (COD_TIPO_DESTINACAO_LIXO)
);

/*==============================================================*/
/* Table: TIPO_DESTINACAO_LIXO_ESCOLA                           */
/*==============================================================*/
create table TIPO_DESTINACAO_LIXO_ESCOLA
(
   COD_TIPO_DEST_LIXO_ESC INT not null auto_increment,
   COD_ESCOLA           INT,
   COD_TIPO_DESTINACAO_LIXO INT,
   primary key (COD_TIPO_DEST_LIXO_ESC)
);

/*==============================================================*/
/* Table: TIPO_ESGOTO_ESCOLA                                    */
/*==============================================================*/
create table TIPO_ESGOTO_ESCOLA
(
   COD_TIPO_ESGOTO_ESCOLA INT not null auto_increment,
   COD_TIPO_ESGOTO      INT,
   COD_ESCOLA           INT,
   primary key (COD_TIPO_ESGOTO_ESCOLA)
);

/*==============================================================*/
/* Table: TIPO_ESGOTO_SANITARIO                                 */
/*==============================================================*/
create table TIPO_ESGOTO_SANITARIO
(
   COD_TIPO_ESGOTO      INT not null auto_increment,
   DESCRICAO            VARCHAR(20) comment 'COL_CG ATE COL_CI
            
            1 - REDE PUBLICCA
            2 - FOSSA
            3 - INEXISTENTE',
   primary key (COD_TIPO_ESGOTO)
);

/*==============================================================*/
/* Table: TIPO_REDE_ESCOLA                                      */
/*==============================================================*/
create table TIPO_REDE_ESCOLA
(
   COD_REDE             INT not null auto_increment,
   DESCRICAO            VARCHAR(20) comment 'COL_B',
   DEPENDENCIA_ADM      VARCHAR(20) comment 'COL_C',
   CATEGORIA_ESCOLA_PRIVADA VARCHAR(20) comment 'COL_D',
   primary key (COD_REDE)
);

alter table TIPO_REDE_ESCOLA comment 'Responsável por classificar a escola como Pública ou Privada';

/*==============================================================*/
/* Table: UF                                                    */
/*==============================================================*/
create table UF
(
   COD_UF               INT not null auto_increment,
   COD_REGIAO           INT,
   DESCRICAO            VARCHAR(25) comment 'COL_G',
   primary key (COD_UF)
);

alter table UF comment 'ESTADOS DO BRASIL';

alter table ENDERECO add constraint FK_REFERENCE_4 foreign key (COD_MUNICIPIO)
      references MUNICIPIO (COD_MUNICIPIO) on delete restrict on update restrict;

alter table EQUIPAMENTO_ESCOLA add constraint FK_FK_EE_EQUIPAMENTO foreign key (COD_EQUIPAMENTO)
      references EQUIPAMENTO (COD_EQUIPAMENTO) on delete restrict on update restrict;

alter table EQUIPAMENTO_ESCOLA add constraint FK_FK_EE_ESCOLA foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table ESCOLA add constraint FK_FK_E_ENDERECO foreign key (COD_ENDERECO)
      references ENDERECO (COD_ENDERECO);

alter table ESCOLA add constraint FK_FK_E_LOCAL_FUNCIONAMENTO foreign key (COD_LOCAL_FUNCIONAMENTO)
      references LOCAL_FUNCIONAMENTO (COD_LOCAL_FUNCIONAMENTO) on delete restrict on update restrict;

alter table ESCOLA add constraint FK_FK_E_TIPO_REDE_ESCOLA foreign key (COD_REDE)
      references TIPO_REDE_ESCOLA (COD_REDE) on delete restrict on update restrict;

alter table MODALIDADE_ESCOLA_ESCOLA add constraint FK_REFERENCE_19 foreign key (COD_MODALIDADE_ENSINO)
      references MODALIDADE_ENSINO (COD_MODALIDADE_ENSINO) on delete restrict on update restrict;

alter table MODALIDADE_ESCOLA_ESCOLA add constraint FK_REFERENCE_20 foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table MUNICIPIO add constraint FK_FK_M_UF foreign key (COD_UF)
      references UF (COD_UF) on delete restrict on update restrict;

alter table TELEFONE add constraint FK_REFERENCE_6 foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table TELEFONE add constraint FK_REFERENCE_7 foreign key (COD_MUNICIPIO)
      references MUNICIPIO (COD_MUNICIPIO) on delete restrict on update restrict;

alter table TIPO_ABASTECIMENTO_AGUA_ESCOLA add constraint FK_FK_TAAE_ESCOLA foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table TIPO_ABASTECIMENTO_AGUA_ESCOLA add constraint FK_FK_TAAE_TIPO_ABAST_AGUA foreign key (COD_TIPO_ABASTECIMENTO_AGUA)
      references TIPO_ABASTECIMENTO_AGUA (COD_TIPO_ABASTECIMENTO_AGUA) on delete restrict on update restrict;

alter table TIPO_ABASTE_ENER_ELET_ESC add constraint FK_FK_TAEE_ESCOLA foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table TIPO_ABASTE_ENER_ELET_ESC add constraint FK_FK_TAEE_TIPO_ABAST_ENERG_ELET foreign key (COD_TIPO_ABAST_ENERGIA)
      references TIPO_ABASTECIMENTO_ENERGIA_ELETRICA (COD_TIPO_ABAST_ENERGIA) on delete restrict on update restrict;

alter table TIPO_DESTINACAO_LIXO_ESCOLA add constraint FK_FK_TDLE_E foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table TIPO_DESTINACAO_LIXO_ESCOLA add constraint FK_FK_TDLE_TIPO_DESTINACAO_LIXO foreign key (COD_TIPO_DESTINACAO_LIXO)
      references TIPO_DESTINACAO_LIXO (COD_TIPO_DESTINACAO_LIXO) on delete restrict on update restrict;

alter table TIPO_ESGOTO_ESCOLA add constraint FK_FK_TEE_ESCOLA foreign key (COD_ESCOLA)
      references ESCOLA (COD_ESCOLA) on delete restrict on update restrict;

alter table TIPO_ESGOTO_ESCOLA add constraint FK_FK_TEE_TIPO_ESGOTO_ESCOLA foreign key (COD_TIPO_ESGOTO)
      references TIPO_ESGOTO_SANITARIO (COD_TIPO_ESGOTO) on delete restrict on update restrict;

alter table UF add constraint FK_FK_UF_REGIAO foreign key (COD_REGIAO)
      references REGIAO (COD_REGIAO) on delete restrict on update restrict;

alter table endereco ADD INDEX idx_endereco_BAIRRO_RUA_CEP_NUMERO_COMPLEMENTO

 (BAIRRO ASC, RUA ASC, CEP ASC, NUMERO ASC, COMPLEMENTO ASC);


alter table local_funcionamento ADD INDEX idx_local_funcionamento_migracao_arquivo
(TIPO_PREDIO_ESCOLA ASC, SE_SALA_EMPRESA ASC, SE_UND_INTERNACAO ASC, SE_CASA_PROFESSOR ASC, SE_RANCHO ASC, OUTROS ASC, SE_TEMPLOS_IGREJA ASC, SE_OUTRA_ESCOLA ASC);