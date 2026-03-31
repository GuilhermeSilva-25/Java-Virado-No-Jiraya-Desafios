package br.com.nerdstore.test;

import br.com.nerdstore.domain.Professor;
import br.com.nerdstore.domain.Student;

public class SchoolTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        Student student = new Student();

        professor.name = "William Suane";
        professor.age = 40;
        professor.gender = 'M';

        student.name = "Guilherme Silva";
        student.age = 31;
        student.gender = 'M';

        System.out.printf("Nome: %s | Idade: %d | Gênero: %c%n", professor.name, professor.age, professor.gender);
        System.out.printf("Nome: %s | Idade: %d | Gênero: %c%n", student.name, student.age, student.gender);
    }
}
