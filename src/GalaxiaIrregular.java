public class GalaxiaIrregular extends Galaxia{
    private final boolean presençaDeNúcleo;
    private final boolean materiaEscura;

    public GalaxiaIrregular(String nome, int numeroDeEstrelas, boolean presençaDeNúcleo, boolean materiaEscura) {
        super(nome, numeroDeEstrelas);
        this.presençaDeNúcleo = presençaDeNúcleo;
        this.materiaEscura = materiaEscura;
    }

    @Override
    public String toString() {
        return "GalaxiaIrregular{" +
                " nome='" + this.getNome() + '\'' +
                ", numeroDeEstrelas=" + this.getNumeroDeEstrelas() +
                ", presençaDeNúcleo=" + presençaDeNúcleo +
                ", materiaEscura=" + materiaEscura +
                '}';
    }
}
