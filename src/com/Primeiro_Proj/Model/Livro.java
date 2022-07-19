package com.Primeiro_Proj.Model;
import java.util.Objects;

public class Livro {
    private String nome;
    private Integer nPag;

    public Livro() {
    }
    public Livro(String nome, Integer nPag) {
        this.nome = nome;
        this.nPag = nPag;
    }

   public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getnPag() {
        return nPag;
    }

    public void setnPag(Integer nPag) {
        this.nPag = nPag;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(nome, livro.nome) && Objects.equals(nPag, livro.nPag);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, nPag);
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", nPag=" + nPag +
                '}';
    }
}
