package br.senai.sp.jandira;

import br.senai.sp.jandira.controller.Empresa;

import java.lang.invoke.WrongMethodTypeException;

public class App {
    public static void main(String[] args) {
        Empresa objEmpresa = new Empresa();
        objEmpresa.consultaFuncionario();

    }
}
