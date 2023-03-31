/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.banco;

/**
 *
 * @author dcarv
 */
public class Pessoa {
    private String nome;
    private String dataDeNascimento;
    private int Idade;
    
    public void Pessoa(String nome, String dataDeNasicmento){
        
    }
    
    public String getNome() {
            return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return Idade;
    }

    public void setIdade(int Idade) {
        int anoAtual = 2023;
        int ano =  Integer.parseInt(dataDeNascimento);
        this.Idade = anoAtual - ano;
    }
   
}
