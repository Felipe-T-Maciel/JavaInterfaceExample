public class Asa extends Componente{
    private double grauInclinaçãoMaxima;
    private double tamanho;

    public Asa(String nome, boolean original, String lugarFabricação, double grauInclinaçãoMaxima, double tamanho) {
        super(nome, original, lugarFabricação);
        this.grauInclinaçãoMaxima = grauInclinaçãoMaxima;
        this.tamanho = tamanho;
    }

    @Override
    public String toString() {
        return "Asa{" +
                "nome='" + this.getNome() + '\'' +
                ", original=" + this.getOriginal() +
                ", lugarFabricação='" + this.getLugarFabricação() + '\'' +
                ", grauInclinaçãoMaxima=" + grauInclinaçãoMaxima +
                ", tamanho=" + tamanho +
                '}';
    }

}
