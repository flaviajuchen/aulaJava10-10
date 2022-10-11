public class Projeto{

    public static void main(String[] args){

        System.out.println("Hello World!");

        // Aluno aluno01 = new Aluno();
        // aluno01.nome = "William";
        // aluno01.semestre = 1;
        // aluno01.idade = 38;

//        aluno01.informacoesAluno();

//        Garrafa pet = new Garrafa();

//       pet.volume();
//
//        pet.encher(conteudo:"agua", volume: 500);
//
//        pet.volume();
//
//        pet.tomar(volume: 100);
//
//        pet.volume();
//    }
    Bhaskara formula = new Bhaskara();
    formula.a = 1;
    formula.b = 3;
    formula.c = 2;

    formula.calcularDelta();
    formula.calcularX1();
    formula.calcularX2();

    System.out.println("O valor de Delta e:"+formula.delta);
    System.out.println("O valor de X1 e:"+formula.x1);
    System.out.println("O valor de X2 e:"+formula.x2);
    }
}
    