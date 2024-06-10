package br.com.lucasxavier.desafio.dominio;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Curso extends Conteudo {

    private Integer cargaHoraria;

    @Override
    public String toString() {
        return "Curso [cargaHoraria=" + cargaHoraria + ", Descricao=" + getDescricao() + ", Titulo="
                + getTitulo() + "]";
    }

    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

}
