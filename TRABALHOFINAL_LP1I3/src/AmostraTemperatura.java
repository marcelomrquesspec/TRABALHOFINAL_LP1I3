//Marcelo Marques Araujo CB3005631  
import java.util.Scanner;


//  Classe AmostraTemperatura - numseq: int data: Data  hora: Hora valor:float
public class AmostraTemperatura  {
    private int numseq = 0;
    private Data data;
    private Hora hora;
    private float valor;
    private Scanner scan = new Scanner(System.in);

    
    
// +AmostraTemperatura()
    public AmostraTemperatura () {
        this.setData();
        this.setHora();
        this.setValor();
    }
    
//+ AmostraTemperatura(int a, int b, int c, int d, int e, int f, float v)
    public AmostraTemperatura (int a, int b, int c, int d, int e, int f, float v) {
        this.setData(a, b, c);
        this.setHora(d, e, f);
        this.setValor(v);
    }

//+ AmostraTemperatura(Data d, Hora h, float v)

    public AmostraTemperatura(Data d, Hora h, float v){
        this.data = d;
        this.hora = h;
        this.setValor(v);
    }
 

 //+ setData(int a, int b, int c)
   
    public void setData(int a, int b, int c){
        this.data = new Data(a, b, c);
    }
    
// +setData()   
    public void setData(){
        this.data = new Data();        
    }
    
//+ setHora(int a, int b, int c)
    public void setHora(int a, int b, int c){
        this.hora = new Hora(a, b, c);
    }
    
//+setHora() 
    public void setHora(){
        this.hora = new Hora();        
    }
    
//+ setValor(float v)
    public void setValor(float v){
        this.valor = v; 
        this.numseq++;
    }
    
// +setValor()
    public void setValor(){
        float v;

        System.out.print("Entre com o valor da temperatura: ");
        v = scan.nextFloat();

        this.valor = v;
        this.numseq++;
    }
    
//+getNumSeq(): int
    public int getNumSeq(){
        return this.numseq;
    }
    
 //+ getData(): String 
    public String getData(){
        return this.data.mostra1();
    }
    
 //+getHora(): int
    public String getHora(){
        return this.hora.getHora1();
    }

 
//+getValor(): int
    public float getValor(){
        return this.valor;
    }


    
}
