package com.Primeiro_Proj.Model;

import java.util.Objects;

public class Livro {
    private String nome;
    private String npag;

    public Livro() {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNpag() {
        return npag;
    }

    public void setNpag(String npag) {
        this.npag = npag;
    }

    public Livro(String nome, String npag) {
        this.nome = nome;
        this.npag = npag;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(npag, livro.npag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, npag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", npag='" + npag + '\'' +
                '}';
    }
}
