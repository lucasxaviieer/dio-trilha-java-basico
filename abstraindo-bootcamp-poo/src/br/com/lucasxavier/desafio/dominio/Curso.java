package br.com.lucasxavier.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Curso {

    private String titulo;
    private String descricao;
    private Integer cargaHoraria;

}
