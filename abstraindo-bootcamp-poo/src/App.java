import java.time.LocalDate;

import br.com.lucasxavier.desafio.dominio.Bootcamp;
import br.com.lucasxavier.desafio.dominio.Curso;
import br.com.lucasxavier.desafio.dominio.Dev;
import br.com.lucasxavier.desafio.dominio.Mentoria;

public class App {
    public static void main(String[] args) throws Exception {

        Curso curso = new Curso();
        curso.setTitulo("Curso Java");
        curso.setDescricao("Descricao Curso Java");
        curso.setCargaHoraria(8);

        Curso curso1 = new Curso();
        curso1.setTitulo("Curso de JavaScrip");
        curso1.setDescricao("Descricao do Curso de JavaScrip");
        curso1.setCargaHoraria(4);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria Java");
        mentoria.setDescricao("Descricao Mentoria Java");
        mentoria.setData(LocalDate.of(2024, 11, 21));

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Mentoria JavaScript");
        mentoria1.setDescricao("Descricao Mentoria JavaScript");
        mentoria1.setData(LocalDate.of(2024, 12, 21));

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java Developer");
        bootcamp.setDescricao("Descricao Bootcamp Java Developer");
        bootcamp.getConteudosBootcamp().add(curso);
        bootcamp.getConteudosBootcamp().add(curso1);
        bootcamp.getConteudosBootcamp().add(mentoria);
        bootcamp.getConteudosBootcamp().add(mentoria1);

        Dev devLucas = new Dev();
        devLucas.setNome("Lucas");
        devLucas.inscrever(bootcamp);
        devLucas.progredir();
        devLucas.progredir();
        System.out.println("Conteudos inscritos de " + devLucas.getNome() + ": " + devLucas.getConteudosInscritos());
        System.out.println("Conteudos concluidos de " + devLucas.getNome() + ": " + devLucas.getConteudosConcluidos());
        System.out.println("XP: " + devLucas.calcularXp());

        System.out.println("----------------------------");
        Dev devRebeca = new Dev();
        devRebeca.setNome("Rebeca");
        devRebeca.inscrever(bootcamp);
        devRebeca.progredir();
        System.out.println("Conteudos inscritos de " + devRebeca.getNome() + ": " + devRebeca.getConteudosInscritos());
        System.out
                .println("Conteudos concluidos de " + devRebeca.getNome() + ": " + devRebeca.getConteudosConcluidos());
        System.out.println("XP: " + devRebeca.calcularXp());

    }
}
