package com.example.aulas.aula4.model;

public class Funcionario {

    private int id;
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario() { }

    public int getId() {return id;}
    public void setId(int id) {if (id > 0) {this.id = id;}}

    public String getNome() {return nome;}
    public void setNome(String nome) {if (nome == null || nome.isEmpty()) {this.nome = nome;}}

    public String getCargo() {return cargo;}
    public void setCargo(String cargo) {if (cargo == null || cargo.isEmpty()) {this.cargo = cargo;}}

    public double getSalario() {return salario;}
    public void setSalario(double salario) {if (salario >= 0) {this.salario = salario;}}

}
