package br.com.lucasxavier.desafio.dominio;

import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Mentoria extends Conteudo {

    private LocalDate data;

    @Override
    public String toString() {
        return "Mentoria [data=" + data + ", Descricao=" + getDescricao() + ", Titulo=" + getTitulo() + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO + 20d;
    }

}
