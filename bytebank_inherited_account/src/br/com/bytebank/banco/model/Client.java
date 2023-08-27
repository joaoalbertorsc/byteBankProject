package br.com.bytebank.banco.model;

import java.io.Serializable;

public class Client implements Serializable {
    private String name;
    private String cpf;
    private String profession;

    // Setters e Getters devem ser usados com cautela e nem todos os
    // atributos privados precisam ter expostos esses dois métodos com
    // riscos de cairmos em um modelo anêmico que tem os seus comportamentos
    // controlados por outras classes.
    //


    // get lendo o nome 'Name'
    //
    public String getName() {
        return name;
    }

    // modificando o nome 'Name' para a var 'name' que o 'setName' recebe quando é invocado.
    //
    public void setName(String name) {
        this.name = name;
    }

    // lendo o cpf 'cpf'
    //
    public String getCpf() {
        return cpf;
    }

    // modificando o cpf 'cpf' para a var 'cpf' que o 'setCpf' recebe quando é invocado.
    //
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    // lendo a profession 'profession'
    //
    public String getProfession() {
        return profession;
    }

    // modificando a profession 'profession' para o var 'profession' que o 'setProfession' recebe quando é invocado.
    //
    public void setProfession(String profession) {
        this.profession = profession;
    }
}

