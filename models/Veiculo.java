package models;

public abstract class Veiculo implements venda {
    private String nome;
    private int anoFabricacao;
    private String cor;
    private double precoCompra;
    private int estoque;

    private String tipoDeVeiculo;

    public Veiculo(String nome, int anoFabricacao, String cor, double precoCompra, int estoque, String tipoDeVeiculo) {
        this.nome = nome;
        this.anoFabricacao = anoFabricacao;
        this.cor = cor;
        this.precoCompra = precoCompra;
        this.estoque = estoque;
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoFabricacao() {
        return anoFabricacao;
    }

    public void setAnoFabricacao(int anoFabricacao) {
        this.anoFabricacao = anoFabricacao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public double getPrecoCompra() {
        return precoCompra;
    }

    public void setPrecoCompra(double precoCompra) {
        this.precoCompra = precoCompra;
    }

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public String getTipoDeVeiculo() {
        return tipoDeVeiculo;
    }

    public void setTipoDeVeiculo(String tipoDeVeiculo) {
        this.tipoDeVeiculo = tipoDeVeiculo;
    }

    public abstract double calculaPrecoVenda();
}
