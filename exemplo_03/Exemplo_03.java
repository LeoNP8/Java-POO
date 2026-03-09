package exemplo_03;

public class Exemplo_03 {

    public static void main(String[] args) {
        // criando os objetos da classe carro
        Carro carro1 = new Carro("totoya", "volks", 80);
        Carro carro2 = new Carro("potoya", "hold", 90);
        
        //
        System.out.println("carro: " + carro1.marca + ", modelo: " + carro1.modelo + ", ano: " + carro1.ano);
        carro1.ligar();
        System.out.println("carro 2: " + carro2.marca);
        carro2.ligar();
        
        
    }
    
}
