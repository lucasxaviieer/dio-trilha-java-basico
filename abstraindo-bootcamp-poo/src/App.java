import java.time.LocalDate;

import br.com.lucasxavier.desafio.dominio.Curso;
import br.com.lucasxavier.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso("Curso Java", "Descricao curso java", 8);
        Curso curso1 = new Curso("Curso JavaScript", "Descricao curso javascript", 4);

        System.out.println(curso);
        System.out.println(curso1);

        Mentoria mentoria = new Mentoria("Mentoria de Java", "descricao mentoria java", LocalDate.now());
        Mentoria mentoria2 = new Mentoria("Mentoria JavaScript", "Descricoa javascript", LocalDate.now());

        System.out.println(mentoria);
        System.out.println(mentoria2);
    }
}
