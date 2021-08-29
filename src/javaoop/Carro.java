package javaoop;

public class Carro extends Veiculo {
    private static final double PESO_CARRO = 1000d;
    private static final int RODAS = 4;

    public Carro(Integer velocidade, Double aceleracao, Integer anguloDeVirada, String patente, String placa){
        super(velocidade, aceleracao, anguloDeVirada, patente, PESO_CARRO, RODAS, placa);
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
