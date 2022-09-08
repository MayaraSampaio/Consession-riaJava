package models;

public class Quadriciclo extends Veiculo {
    private static final String tipoDeVeiculo = "quadriciclo";
    private String tracaoDasRodas;

    public Quadriciclo(String nome, int anoFabricacao, String cor, double precoCompra, int estoque, String tracaoDasRodas) {
        super(nome, anoFabricacao, cor, precoCompra, estoque, tipoDeVeiculo);
        this.tracaoDasRodas = tracaoDasRodas;
    }

    public String getTracaoDasRodas() {
        return tracaoDasRodas;
    }

    public void setTracaoDasRodas(String tracaoDasRodas) {
        this.tracaoDasRodas = tracaoDasRodas;
    }

    @Override
    public double calculaPrecoVenda() {
        double precoVenda;
        String tracaoDasRodas= getTracaoDasRodas();

        if(tracaoDasRodas == "4x4") {
            precoVenda = getPrecoCompra() * 1.3;
        } else {
            precoVenda = getPrecoCompra() * 1.15;
        }
        return precoVenda;
    }
}
