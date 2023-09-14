public class Cockpit extends Componente {
    private int maximaGraus;
    private int qtdLugaresParaPiloto;

    public Cockpit(String nome, boolean original, String lugarFabricação, int maximaGraus, int qtdLugaresParaPiloto) {
        super(nome, original, lugarFabricação);
        this.maximaGraus = maximaGraus;
        this.qtdLugaresParaPiloto = qtdLugaresParaPiloto;
    }
}
