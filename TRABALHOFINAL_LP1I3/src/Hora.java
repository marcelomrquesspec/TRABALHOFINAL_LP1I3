//Marcelo Marques Araujo CB3005631
import java.util.Scanner;


public class Hora {
    private int horas;
    private int minutos;
    private int segundos;

    private Scanner scan = new Scanner(System.in);


    public Hora(int h, int m, int s){
        this.setHor(h);
        this.setMin(m);
        this.setSeg(s);
    }
    
    public Hora() { 
       this.setHor();
       this.setMin();
       this.setSeg();
    }



    public void setHor(){
        int h;

        do{
            System.out.print("Digite o valor da hora: ");
            h = scan.nextInt();

            if(h < 0 || h > 23){
                System.out.println("O valor dos segundos deve ser positivo e menor que 24");
            }
            
        }while(h < 0 || h > 23);

        this.horas = h;
    }

    public void setMin(){
        
        int m;

        do{
            System.out.print("Digite o valor do minuto: ");
            m = scan.nextInt();

            if(m < 0 || m > 59){
                System.out.println("O valor do segundos deve ser positivo e menor que 60");
            }
            
        }while(m < 0 || m > 59);

        this.minutos = m;
    }
    

    public void setSeg(){
        int s;

        do{
            System.out.print("Digite o valor dos segundo: ");
            s = scan.nextInt();

            if(s < 0 || s > 59){
                System.out.println("O valor do segundos deve ser positivo e menor que 60");
            }
            
        }while(s < 0 || s > 59);

        this.segundos = s;
    }
    public void setHor(int h){
        if(h < 0 || h > 23){
            System.out.println("O valor da hora deve ser positivo e menor que 24");
            return;
        }

        this.horas = h;
    }

    public void setMin(int m){
        
        if(m < 0 || m > 59){
            System.out.println("O valor do minuto deve ser positivo e menor que 60");
            return;
        }
        

        this.minutos = m;
    }

    public void setSeg(int s){
        
        if(s < 0 || s > 59){
            System.out.println("O valor digitado dos segundos deve ser positivo e menor que 60");
            return;
        }

        this.segundos = s;
    }


    public int getHor(){
        return this.horas;
    }
    
    public int getMin(){
        return this.minutos;
    }
    
    public int getSeg(){
        return this.segundos;
    }


    public int getSegundos()
    {
        final int QTD_SEGUNDOS_EM_HORA = 3600;
        final int QTD_SEGUNDOS_EM_MINUTO = 60;

        int qtdSegundos = 0;

        qtdSegundos += this.horas * QTD_SEGUNDOS_EM_HORA;
        qtdSegundos += this.minutos * QTD_SEGUNDOS_EM_MINUTO;
        qtdSegundos += this.segundos;

        return qtdSegundos;
    }

    public String getHora1()
    {
        return formatarData(this.horas, this.minutos, this.segundos);
    }

    public String getHora2()
    {
        int horaPeriodo = this.horas;
        String periodo = horaPeriodo < 12 ? "AM" : "PM";

        if(horaPeriodo == 0){
            horaPeriodo = 12;
        }

        if(horaPeriodo > 12){
            horaPeriodo -= 12;
        }


        return formatarData(horaPeriodo, this.minutos, this.segundos) + " " + periodo;
    }

    private String formatarData(int horas, int minutos, int segundos){
        return String.format("%02d", horas) + ":" +
            String.format("%02d", minutos) + ":" +
            String.format("%02d", segundos);
    }
}