public class Veiculo {
    private String fabricante;
    private String modelo;
    private int anoFabricacao;
    private boolean ligado;

    // Construtor
    public Veiculo(String fabricante, String modelo, int anoFabricacao) {
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.anoFabricacao = anoFabricacao;
        this.ligado = false; // Inicialmente desligado
    }

    // Getters
    public String getFabricante() {
        return fabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public boolean isLigado() {
        return ligado;
    }

    // Setter
    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    // Método getInfo
    public String getInfo() {
        return "Fabricante: " + fabricante + ", Modelo: " + modelo + ", Ano de Fabricação: " + anoFabricacao + ", Ligado: " + (ligado ? "Sim" : "Não");
    }
}