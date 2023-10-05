package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Empresa {

    public void consultaFuncionario(){
        try {

            /* Instanciar Conexão com Banco de Dados */
            Conexao objConexao = new Conexao();

            Connection objConnection = objConexao.getConexao();

            // Criar um Objeto Statement [Declaração]
            Statement statement = objConexao.getConexao().createStatement();

            /** Criar Query com Instruções SQL */
            String queryFuncionarios = "SELECT * FROM funcionario";

            /** Executar Query */
            ResultSet resultFuncionarios = statement.executeQuery(queryFuncionarios);

            while(resultFuncionarios.next()){
                int id = resultFuncionarios.getInt("idFuncionario");
                String nome = resultFuncionarios.getString("nome");
                int matricula = resultFuncionarios.getInt("matricula");
                int departamento = resultFuncionarios.getInt("departamento_FK");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nome);
                System.out.println("Matricula: " + matricula);
                System.out.println("Departamento: " + departamento);
                System.out.println("/----------------------------------/");

            }

            resultFuncionarios.close();

        } catch (Exception erro){
            System.out.println(erro);
        }
    }

}
