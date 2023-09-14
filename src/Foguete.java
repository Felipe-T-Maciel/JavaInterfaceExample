public class Foguete extends Componente{
    private int capacidadeCombustivel;
    private double forçaPropulcao;

    public Foguete(String nome, boolean original, String lugarFabricação, int capacidade, double forçaPropulcao) {
        super(nome, original, lugarFabricação);
        this.capacidadeCombustivel = capacidade;
        this.forçaPropulcao = forçaPropulcao;
    }
}
