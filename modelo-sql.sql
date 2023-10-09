/**
 Treino Database
 Autor: Vitor de Jesus ❣🚀
 Data: 05/10/2023
 */
 
 CREATE DATABASE db_java;
 
 USE db_java;
 
 CREATE TABLE departamento (
 idDepartamento int NOT NULL auto_increment,
 nome varchar (45) NOT NULL,
 sigla varchar (45) NOT NULL,
 PRIMARY KEY (idDepartamento) 
 );
 
 CREATE TABLE funcionario(
 idFuncionario int NOT NULL,
 nome varchar(45) NOT NULL,
 matricula int NOT NULL,
 departamento_FK int,
 CONSTRAINT FK_Departamento FOREIGN KEY (departamento_FK) REFERENCES departamento (idDepartamento)
 );
 
 INSERT INTO departamento(nome, sigla)values
 ("Desenvolvimento", "DEV"),
 ("Qualidade", "QA"),
 ("Engenharia", "ENG");
 
 SELECT * from departamento;
 
 
 INSERT INTO funcionario(idFuncionario, nome, matricula, departamento_FK)values
 (1, "Maria", 2513, 3),
 (2, "João", 3640, 1),
 (3,"Marta", 1010, 2);
 
 SELECT * FROM funcionario;
 
 SELECT * FROM funcionario WHERE nome = "Maria";
 
 DELETE FROM funcionario WHERE nome = "Maria";
 
 
 
 
 
 
 
 
 
 
 
 
 
 