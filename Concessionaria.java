import models.*;

public class Concessionaria {
    public static void main(String[] args) {

        Carro cruzer = new Carro("Cruzer", "sedan", 2015, "branco", 80000, 10);
        Carro onix = new Carro("Onix", "hatch", 2022, "prata", 70000, 9);

        //indique o carro a ser calculado
        System.out.println("O preço de venda do carro é: "+ cruzer.calculaPrecoVenda());


        Moto pop = new Moto("POP", 2019, "vermelho", 17000, 20, true);
        Moto bros = new Moto("Bros", 2020, "vermelho", 18500, 20, true);

        //indique a moto a ser calculada
        System.out.println("O preço de venda da moto é: "+ pop.calculaPrecoVenda());


        Caminhao mercedesBenz = new Caminhao("Mercedes Benz", 2021, "vermelho", 3000, 170000, 3);
        Caminhao iveco = new Caminhao("Iveco", 2022, "vermelho", 2000, 169000, 2);

        //indique o caminhão a ser calculado
        System.out.println("O preço de venda do caminhão é: "+ iveco.calculaPrecoVenda());

        Quadriciclo honda1 = new Quadriciclo("Honda", 2022, "vermelho", 19000, 8, "4x4");
        Quadriciclo honda2 = new Quadriciclo("Honda", 2021, "vermelho", 18000, 5, "4x2");

        //indique o quadriciclo a ser calculado
        System.out.println("O preço de venda do quadriciclo é: "+ honda1.calculaPrecoVenda());



        //selecione o tipo de seguro (1 ou 2) e o veículo associado;
        Seguro seguro = new Seguro("1",cruzer);
        System.out.println("O preço de venda do seguro é: "+ seguro.calculaPrecoVenda());


    }
}
