package extras.devdojo.ex11;

public class TesteSeminarios {
    public static void main(String[] args) {
        Local local = new Local("Rua dos Beijaflores, 432 - Guarujá - SP");
        Aluno aluno = new Aluno("Marina", 22);
        Aluno[] alunos = {aluno};
        Professor professor = new Professor("Joaquim", "Química");
        Seminario seminario = new Seminario("Onde estudar", alunos, local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);
        System.out.println(professor.toString());
    }
}
