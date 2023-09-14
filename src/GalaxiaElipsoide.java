public class GalaxiaElipsoide extends Galaxia{
    private double eixoMaior;
    private double eixoMenor;

    public GalaxiaElipsoide(String nome, int numeroDeEstrelas, double eixoMaior, double eixoMenor) {
        super(nome, numeroDeEstrelas);
        this.eixoMaior = eixoMaior;
        this.eixoMenor = eixoMenor;
    }

    @Override
    public String toString() {
        return "GalaxiaElipsoide{" +
                " nome='" + this.getNome() + '\'' +
                ", numeroDeEstrelas=" + this.getNumeroDeEstrelas() +
                ", eixoMaior=" + eixoMaior +
                ", eixoMenor=" + eixoMenor +
                '}';
    }
}
