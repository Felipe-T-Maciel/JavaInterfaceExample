public class Asa extends Componente{
    private int grauInclinaçãoMaxima;
    private int tamanho;

    public Asa(String nome, boolean original, String lugarFabricação, int grauInclinaçãoMaxima, int tamanho) {
        super(nome, original, lugarFabricação);
        this.grauInclinaçãoMaxima = grauInclinaçãoMaxima;
        this.tamanho = tamanho;
    }
}
