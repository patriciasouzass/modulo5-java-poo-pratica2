package javaoop;

public class Moto extends Veiculo {
    private static final double PESO_MOTO = 300d;
    private static final int RODAS = 2;

    public Moto(Integer velocidade, Double aceleracao, Integer anguloDeVirada, String patente, String placa){
        super(velocidade, aceleracao, anguloDeVirada, patente, PESO_MOTO, RODAS, placa);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
