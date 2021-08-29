package javaoop;

public class Main {

    public static void main(String[] args) {
        Corrida corrida = new Corrida(56d, 50000d, "Rali dos Sertoes", 5);

        System.out.println("Corrida: " + corrida.getNome() + " --- Distancia da corrida: " + corrida.getDistancia()+ " --- Premio: " + corrida.getPremioEmDolares());
        System.out.println("\n");

        corrida.adicionarCarro(200, 10.0, 90, "XUV-1111", "Onix");
        corrida.adicionarCarro(250, 13.0, 80, "JDA-1133", "S10");
        corrida.adicionarMoto(300, 18.0, 85, "DEL-2020", "YBR");
        corrida.adicionarMoto(160, 12.0, 90, "HIW-3909", "BROS");

        corrida.adicionarMoto(190, 7.0, 90,"HIW-3909", "BROS");

        System.out.println("--------------Socorrendo Carro--------------");
        SocorristaCarro socorristaCarro = new SocorristaCarro();
        Object resgateCarro = corrida.resgatarVeiculo("JDA-1133");
        socorristaCarro.socorrer((Carro) resgateCarro);
        System.out.println("\n");

        System.out.println("--------------Socorrendo Moto--------------");
        SocorristaMoto socorristaMoto = new SocorristaMoto();
        Object resgateMoto = corrida.resgatarVeiculo("DEL-2020");
        socorristaMoto.socorrer((Moto) resgateMoto);
        System.out.println("\n");

        corrida.removerVeiculo("DEL-2020");
        System.out.println("--------------Lista de Veículos após remoção--------------");
        corrida.mostrarVeiculos();
        System.out.println("\n");

        System.out.println("--------------Veículo Vencedor--------------");
        Veiculo vencedor = corrida.gerarCorrida();
        System.out.println("Veículo vencedor >> "+ vencedor.getPatente() + " | Placa >> " + vencedor.getPlaca());
    }
}
