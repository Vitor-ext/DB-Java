package br.senai.sp.jandira.controller;

import br.senai.sp.jandira.model.Conexao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Empresa {

    public void consultaFuncionario(){
        try {
            /* Instanciar Conexão com Banco de Dados */
            Conexao objConexao = new Conexao();

            Connection objConnection = objConexao.getConnection();

            // Criar um Objeto Statement [Declaração]
            Statement statement = objConnection.createStatement();

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

    public void cadastrarFuncionario(int id, String nome, int matricula, int departamento){
        try {
            Conexao objConexao = new Conexao();

            Connection connection = objConexao.getConnection();

            Statement statement = connection.createStatement();

            /** Criar Query com Instruções SQL */
            String queryPesquisarFuncionario = " INSERT INTO funcionario(idFuncionario, nome, matricula, departamento_FK)values " +
                    "(" + id + ",'" + nome + "'," + matricula + "," + departamento +")";

            statement.executeUpdate(queryPesquisarFuncionario);

            System.out.println("Funcionario Cadastrado com Sucesso!!!");

        } catch (Exception e){
            System.out.println(e);
            System.out.println("Erro ao cadastrar dados !!");
        }
    }

    public void pesquisarFuncionario(String nome){
        try {
            Conexao objConexao = new Conexao();

            Connection connection = objConexao.getConnection();

            Statement statement = connection.createStatement();

            /** Criar Query com Instruções SQL */
            String queryPesquisarFuncionario = "SELECT * FROM funcionario WHERE nome = '" + nome + "'";

             ResultSet result = statement.executeQuery(queryPesquisarFuncionario);

            while(result.next()){
                int id = result.getInt("idFuncionario");
                String nomeFuncionario = result.getString("nome");
                int matricula = result.getInt("matricula");
                int departamento = result.getInt("departamento_FK");

                System.out.println("ID: " + id);
                System.out.println("Nome: " + nomeFuncionario);
                System.out.println("Matricula: " + matricula);
                System.out.println("Departamento: " + departamento);
                System.out.println("/----------------------------------/");

            }


        } catch (Exception e){
            System.out.println(e);
            System.out.println("Erro ao pesquisar dados !!");
        }

    }



    public void deletarFuncionario(String nome) throws SQLException {
        try {
            Conexao objConexao = new Conexao();

            Connection connection = objConexao.getConnection();

            Statement statement = connection.createStatement();

            /** Criar Query com Instruções SQL */
            String queryDeletarFuncionario = "DELETE FROM funcionario WHERE nome = '" + nome + "'";

            statement.executeUpdate(queryDeletarFuncionario);
            System.out.println("Funcionario Excluido com Sucesso !!");

        } catch (Exception e){
            System.out.println(e);
            System.out.println("Erro ao excluir dados !!");
        }

    }




}
