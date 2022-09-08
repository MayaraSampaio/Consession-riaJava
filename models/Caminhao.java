package models;

public class Caminhao extends Veiculo {
    private static final String tipoDeVeiculo = "caminhao";
    private double cargaSuportada;

    public Caminhao(String nome, int anoFabricacao, String cor, double cargaSuportada, double precoCompra, int estoque) {
        super(nome, anoFabricacao, cor, precoCompra, estoque, tipoDeVeiculo);
        this.cargaSuportada = cargaSuportada;
    }

    public double getCargaSuportada() {
        return cargaSuportada;
    }

    public void setCargaSuportada(double cargaSuportada) {
        this.cargaSuportada = cargaSuportada;
    }

    @Override
    public double calculaPrecoVenda() {
        double precoVenda;
        double cargaSuportada = getCargaSuportada();
        double precoCompra = getPrecoCompra();
        if((cargaSuportada >= 3000)) {
            precoVenda = precoCompra * 1.07;
        } else {
            precoVenda = precoCompra * 1.05;
        }
        return precoVenda;
    }
}
