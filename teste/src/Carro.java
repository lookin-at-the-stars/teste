//Gabriel Barbosa de Souza (10434547), Lucas Osório Baldoino(10434481), Arthur Silva Torres (10434401)

public class Carro extends Veiculo {
    private int numeroDePortas;
    private int quantidadeDeLugares;

    // Construtor
    public Carro(String fabricante, String modelo, int anoFabricacao, int numeroDePortas, int quantidadeDeLugares) {
        super(fabricante, modelo, anoFabricacao); // Chama o construtor da superclasse
        this.numeroDePortas = numeroDePortas;
        this.quantidadeDeLugares = quantidadeDeLugares;
    }

    // Método para ligar o carro
    public void ligaCarro() {
        if (!isLigado()) {
            setLigado(true);
            System.out.println("O carro foi ligado.");
        } else {
            System.out.println("O carro já está ligado.");
        }
    }

    // Método para desligar o carro
    public void desligaCarro() {
        if (isLigado()) {
            setLigado(false);
            System.out.println("O carro foi desligado.");
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Método getInfo
    @Override
    public String getInfo() {
        return super.getInfo() + ", Número de Portas: " + numeroDePortas + ", Quantidade de Lugares: " + quantidadeDeLugares;
    }
}
