public class Garrafa {
    String cor;
    String conteudo;
    int volume;
    String material;

    public void encher(String conteudo, int volume){
        this.conteudo = conteudo;
        this.volume = volume;
    }

    public void tomar(int volume){
        this.conteudo = this.volume - volume;
    }

    public void volume(){
        System.out.println("Tem"+ this.volume+" ml na garrafa");
    }
}