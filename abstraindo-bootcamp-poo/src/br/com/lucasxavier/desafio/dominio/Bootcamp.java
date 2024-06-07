package br.com.lucasxavier.desafio.dominio;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Bootcamp {

    private String nome;
    private String descricao;
    private final LocalDate DATA_INCIAL = LocalDate.now();
    private final LocalDate DATA_FINAL = DATA_INCIAL.plusDays(45);

}
