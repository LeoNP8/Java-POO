package exemplo_03;

public class Carro {
    //Atributos
    String marca;
    String modelo;
    int ano;
    
    public Carro(String marca, String modelo, int ano) {
    this.marca = marca;
    this.modelo = modelo;
    this.ano = ano;
    }
    
    //Métodos
    public void ligar(){
        System.out.println("O carra ta ligado, seu porra");
    }
    
    public void desligar(){
        System.out.println("desligado seu merda");
    }
}




