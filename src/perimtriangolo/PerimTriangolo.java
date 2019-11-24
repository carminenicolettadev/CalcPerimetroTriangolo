
package perimtriangolo;

import java.util.Scanner;


public class PerimTriangolo {

   
    public static void main(String[] args) {
       
        double x1 = 0 , y1 =0; // coordinate primo vertice
        double x2 =0 , y2 = 0; //coordinate secondo vertice
        double x3 =0, y3 = 0; //coordinate terzo vertice
        double d12 ,d13, d23; //distanze tra i vertici
        double perimetro;
        int i;
        Scanner input = new Scanner(System.in);
        
        for(i = 1;i<=3;i++){//inserimento numeri utenti per i 3 vertici 

            System.out.println("Inserisci valorie vertice N." + i);
            int numinserito = input.nextInt();
            switch(i){
                case 1:
                    x1 = numinserito;
                    y1 = numinserito;
                    break;
                case 2:
                    x2 = numinserito;
                    y2 = numinserito;
                    break;
                case 3:
                    x3 = numinserito;
                    y3 = numinserito;
                    break;
                    
            
            }//end switch
            
        }// end for
        
        
       
        System.out.println("---------------------------------------");
        System.out.println(x1 + " " + y1 + " Vertice1");
        System.out.println(x2 + " " + y2 + " Vertice2");
        System.out.println(x3 + " " + y3 + " Vertice3");
        d12 = CalcDistaza(x1,x2,y1,y2);
        d13 =  CalcDistaza(x1,x3,y1,y3);
        d23 =  CalcDistaza(x2,x3,y2,y3);
        System.out.println("---------------------------------------");
        System.out.println("A:" + d12 + " B:" + d13 + " C:" + d23 );
        
        perimetro = CalcPerimetro(d12,d13,d23);
        
        System.out.println("Il primetro è:" + perimetro);
        
    }
    
    public static double CalcPerimetro(double x,double y,double z){
        
        return x + y + z;
        
    }
    
    public static double CalcDistaza(double point1x, double point2x ,double point1y,double point2y){
        
        double qd;//quadrato della distanza tra point 1 e point 2
        double d;//distanza
        
        qd= (point1x-point2x)*(point1x-point2x) + (point1y -point2y)*(point1y -point2y);
        d=Math.floor(Math.sqrt(qd));
        
        return d;
    }
    
}
