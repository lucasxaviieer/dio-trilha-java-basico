package br.com.lucasxavier.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate DATA_INCIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INCIAL.plusDays(45);

    private Set<Dev> devInscritos = new HashSet<>();
    private Set<Conteudo> conteudosBootcamp = new LinkedHashSet<>();

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
