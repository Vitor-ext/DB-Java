package br.senai.sp.jandira.model;

import java.sql.Connection;
import java.sql.DriverManager;

public class Conexao {

    private String servidor;
    private String banco;
    private String user;
    private String password;

    private Connection conexao;

    public void conexaoBanco(){

        this.servidor = "localhost";
        this.banco = "db_java";
        this.user = "root";
        this.password = "bcd127";
    }

    public boolean connectDrive(){

        try{
            this.conexao = DriverManager.getConnection("jdbc:mysql://"+this.servidor+
                    "/"+this.banco,this.user,this.password);
            return true;

        } catch (Exception error){
            System.out.println(error);
            return false;
        }
    }

    public Connection getConexao() {
        return conexao;
    }
}
