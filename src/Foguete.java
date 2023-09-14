public class Foguete extends Componente{
    private double capacidadeCombustivel;
    private double velocidadePropulcao;

    public Foguete(String nome, boolean original, String lugarFabricação, double capacidade, double velocidadePropulcao) {
        super(nome, original, lugarFabricação);
        this.capacidadeCombustivel = capacidade;
        this.velocidadePropulcao = velocidadePropulcao;
    }

    @Override
    public String toString() {
        return "Foguete{" +
                "nome='" + this.getNome() + '\'' +
                ", original=" + this.getOriginal() +
                ", lugarFabricação='" + this.getLugarFabricação() + '\'' +
                ", capacidadeCombustivel=" + capacidadeCombustivel +
                ", velocidadePropulcao=" + velocidadePropulcao +
                "} ";
    }
}
