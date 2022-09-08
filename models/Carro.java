package models;

public class Carro extends Veiculo {
    private static final String tipoDeVeiculo = "carro";
    private String modeloCarro;

    public Carro(String nome, String modeloCarro, int anoFabricacao, String cor, double precoCompra, int estoque) {
        super(nome, anoFabricacao, cor, precoCompra, estoque, tipoDeVeiculo);
        this.modeloCarro = modeloCarro;
    }

    public String getModeloCarro() {
        return modeloCarro;
    }

    public void setModeloCarro(String modeloCarro) {
        this.modeloCarro = modeloCarro;
    }

    @Override
    public double calculaPrecoVenda() {
        double precoVenda;
        int anoFabricacao = getAnoFabricacao();
        String modeloCarro = getModeloCarro();

        if(anoFabricacao < 2018 && modeloCarro == "sedan") {
            precoVenda = getPrecoCompra() * 1.3;
        } else {
            precoVenda = getPrecoCompra() * 1.15;
        }
        return precoVenda;
    }
}
