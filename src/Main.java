import java.time.LocalDate;

import dominio.Bootcamp;
import dominio.Curso;
import dominio.Dev;
import dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso("Curso java", "descrição curso java", 8);
        Curso curso2 = new Curso("Curso js", "descrição curso js", 4);
        Mentoria mentoria1 = new Mentoria("Mentoria de java", "descrição mentoria java", LocalDate.now());
        
        Bootcamp bootcamp = new Bootcamp("Bootcamp Java Developer", "Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria1);

        Dev devMayara = new Dev("Mayara");
        devMayara.inscreverBootcamp(bootcamp);

        devMayara.progredir();
        devMayara.progredir();
        System.out.println(bootcamp);
        System.out.println("Conteúdos Inscritos Mayara" + devMayara.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Mayara" + devMayara.getConteudosConcluidos());
        System.out.println("XP: " + devMayara.calcularTotalXp());

    }
}
