package br.com.lucasxavier.desafio.dominio;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Mentoria {
    private String titulo;
    private String descricao;
    private LocalDate data;

}
