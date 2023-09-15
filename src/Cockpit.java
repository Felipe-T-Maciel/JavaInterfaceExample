public class Cockpit extends Componente {
    private final double maximaGraus;
    private final int qtdLugaresParaPiloto;

    public Cockpit(String nome, boolean original, String lugarFabricação, double maximaGraus, int qtdLugaresParaPiloto) {
        super(nome, original, lugarFabricação);
        this.maximaGraus = maximaGraus;
        this.qtdLugaresParaPiloto = qtdLugaresParaPiloto;
    }

    @Override
    public String toString() {
        return "Cockpit{" +
                "nome='" + this.getNome() + '\'' +
                ", original=" + this.getOriginal() +
                ", lugarFabricação='" + this.getLugarFabricação() + '\'' +
                ", maximaGraus=" + maximaGraus +
                ", qtdLugaresParaPiloto=" + qtdLugaresParaPiloto +
                "} ";
    }
}
