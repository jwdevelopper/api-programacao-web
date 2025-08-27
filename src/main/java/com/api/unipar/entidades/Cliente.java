package com.api.unipar.entidades;

import javax.persistence.*;
import java.util.Objects;
//DEFINE QUE A CLASSE É UMA ENTIDADE E POR TANTO REPRESENTA UMA TABELA DO BANCO DE DADOS
@Entity
//DEFINO CONFIGURAÇÕES DA TABELA DO BD, NO CASO DEFININDO O NOME
@Table(name = "cliente")
public class Cliente {

    //ANOTAÇÃO RESPONSAVEL POR CONFIGURAR O ID DA ENTIDADE
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    //DEMAIS ATRIBUTOS DA ENTIDADE

    private String nome;

    //METODOS ACESSORES DA ENTIDADE
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Cliente)) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(id, cliente.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }
}
