package br.senai.sp.jandira.controller;

import java.sql.SQLException;
import java.util.Scanner;

public class Menu {
    public void executarMenu() throws SQLException {

        Scanner scanner = new Scanner(System.in);

        Empresa empresa = new Empresa();

        boolean continuar = true;

        while (continuar) {

            System.out.println("/------------ Bem Vindo ------------/");
            System.out.println("/-----------------------------------/");
            System.out.println("/-------------- Menu ---------------/");
            System.out.println("1 - Listar Funcionarios              ");
            System.out.println("2 - Deletar Funcionario              ");
            System.out.println("3 - Pesquisar Funcionario            ");
            System.out.println("4 - Cadastrar Funcionario            ");
            System.out.println("5 - Sair                             ");
            System.out.println("/-----------------------------------/");

            int optionUser = scanner.nextInt();
            scanner.nextLine();

            switch (optionUser) {
                case 1:
                    empresa.consultaFuncionario();
                    break;

                case 2:
                    System.out.println("Informe o nome do Funcionario: ");
                    String nomeDelete = scanner.nextLine();

                    empresa.deletarFuncionario(nomeDelete);

                    break;

                case 3:
                    System.out.println("Informe o nome do Funcionario: ");
                    String nomePesquisa = scanner.nextLine();

                    empresa.pesquisarFuncionario(nomePesquisa);

                    break;

                case 4:
                    System.out.println("Informe o ID");
                    int id = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Informe o Nome: ");
                    String nome = scanner.nextLine();
                    System.out.println("Informe a Matricula: ");
                    int matricula = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println(" [1- Desenvolvimento  2- Qualidade  3- Engenhaia] ");
                    System.out.println("Informe o Departamento: ");
                    int departamento = scanner.nextInt();
                    scanner.nextLine();

                    empresa.cadastrarFuncionario(id, nome, matricula, departamento);


                    break;

                case 5:
                    continuar = false;
                    break;
            }

        }

    }
}
