public class Aluno{
    String nome;
    int idade;
    int semestre;

    public void informacoesAluno(){
        System.out.println("O nome do aluno é: "+ nome);
        System.out.println("A idade do aluno é: "+ idade);
        System.out.println("Ele está no "+ semestre+" semestre");
    }
}