CREATE TABLE BOOK (ID NUMERIC(19) NOT NULL, DESCRIPTION VARCHAR(255) NULL, ISBN VARCHAR(255) NULL, NBOFPAGE INTEGER NULL, TITLE VARCHAR(255) NULL, UNITCOST FLOAT(16) NULL, PRIMARY KEY (ID))
CREATE TABLE t_author (ID NUMERIC(19) NOT NULL, BIO VARCHAR(5000) NULL, date_of_birth VARCHAR(255) NULL, first_name VARCHAR(50) NULL, LANGUAGE INTEGER NULL, last_name VARCHAR(255) NOT NULL, PRIMARY KEY (ID))
CREATE TABLE CD (ID NUMERIC(19) NOT NULL, DESCRIPTION VARCHAR(3000) NULL, GENRE VARCHAR(255) NULL, TITLE VARCHAR(100) NULL, total_duration FLOAT(16) NULL, unit_cost FLOAT(16) NULL, PRIMARY KEY (ID))
CREATE TABLE SEQUENCE (SEQ_NAME VARCHAR(50) NOT NULL, SEQ_COUNT NUMERIC(28) NULL, PRIMARY KEY (SEQ_NAME))
INSERT INTO SEQUENCE(SEQ_NAME, SEQ_COUNT) values ('SEQ_GEN', 0)
