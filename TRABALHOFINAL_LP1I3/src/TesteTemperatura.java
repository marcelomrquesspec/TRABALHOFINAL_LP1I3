//Marcelo Marques Araujo CB3005631

public class TesteTemperatura {
    
    public static void main(String[] args){
        
        
        
        AmostraTemperatura TemperaturaT1 = new AmostraTemperatura(29, 6, 2022, 18, 22, 3, 40.5f);

        System.out.println("Exibindo Propriedades TemperaturaT1\n");
        System.out.println("data: " + TemperaturaT1.getData());
        System.out.println("hora: " + TemperaturaT1.getHora());
        System.out.println("valor: " +TemperaturaT1.getValor());
        System.out.println("");

        


        AmostraTemperatura TemperaturaT2 = new AmostraTemperatura();
        
        
//propriedades t2
        System.out.println("Exibindo TemperaturaT2");
        System.out.println("data: " + TemperaturaT2.getData());
        System.out.println("hora: " + TemperaturaT2.getHora());
        System.out.println("valor: " + TemperaturaT2.getValor());
        System.out.println("");

        System.out.println("Modificando os valores da TemperaturaT2\n");

        TemperaturaT1.setData();
        TemperaturaT1.setHora();
        TemperaturaT1.setValor();
        
//propriedades T1
        System.out.println("Exibindo Propriedades TemperaturaT1");
        System.out.println("data: " + TemperaturaT1.getData());
        System.out.println("hora: " + TemperaturaT1.getHora());
        System.out.println("valor: " + TemperaturaT1.getValor());

    }
}
