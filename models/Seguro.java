package models;

public class Seguro implements venda {
    private String tipoDeSeguro; //1 para furto/roubo e 2 para acidentes;
    private String tipoDeVeiculoAssociado;
    private Veiculo veiculo;

    public Seguro(String tipoDeSeguro, Veiculo veiculo) {
        this.tipoDeSeguro = tipoDeSeguro;
        this.veiculo = veiculo;
    }

    private double getPrecoVendaDoVeiculo() {
        return veiculo.calculaPrecoVenda();
    }

    private String getTipoDeVeiculoAssociado() {
        return veiculo.getTipoDeVeiculo();
    }

    private String getTipoDeSeguro() {
        return tipoDeSeguro;
    }

    @Override
    public double calculaPrecoVenda() {
        double precoDeVenda = getPrecoVendaDoVeiculo();
        String tipoDeVeiculoAssociado = getTipoDeVeiculoAssociado();
        System.out.println(tipoDeVeiculoAssociado);
        String tipoDeSeguro = getTipoDeSeguro();

        double precoDoSeguro = 0;
        if (tipoDeVeiculoAssociado == "carro" || tipoDeVeiculoAssociado == "caminhao" && tipoDeSeguro == "2") {
            precoDoSeguro = precoDeVenda * 0.03;
        }else {
            precoDoSeguro = precoDeVenda * 0.02;
        }
        return precoDoSeguro;
    };
}
