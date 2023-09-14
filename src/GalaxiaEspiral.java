public class GalaxiaEspiral extends Galaxia{
    private final double raioBraçoEspiral;
    private final int numeroDeBraços;


    public GalaxiaEspiral(String nome, int numeroDeEstrelas, double raioBraçoEspiral, int numeroDeBraços) {
        super(nome, numeroDeEstrelas);
        this.raioBraçoEspiral = raioBraçoEspiral;
        this.numeroDeBraços = numeroDeBraços;
    }

    @Override
    public String toString() {
        return "GalaxiaEspiral{" +
                " nome='" + this.getNome() + '\'' +
                ", numeroDeEstrelas=" + this.getNumeroDeEstrelas() +
                ", raioBraçoEspiral=" + raioBraçoEspiral +
                ", numeroDeBraços=" + numeroDeBraços +
                '}';
    }
}
