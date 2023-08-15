import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Pedido{

    public static int opcion,i,cant;
    public static double valor,d,p;
    public static Servicios se=new Servicios();

    static RandomAccessFile archivo;
    
    static void escribir(Double p,Double vuel) throws IOException {
        archivo.seek(archivo.length());
        archivo.writeDouble(p);
        archivo.writeDouble(vuel);
    }
    
    static void imprimir() throws IOException {
        archivo.seek(0);
        while(archivo.getFilePointer() < archivo.length()) {

            System.out.print("\t"+"cantidad recivida de dinero: "+ archivo.readDouble());
            System.out.print("\t"+ "vuelto entregado : "+archivo.readDouble());
            System.out.println(" ");
         }
     }

    public static void main(String args[]){

        try {
            archivo = new RandomAccessFile("Comideria.txt", "rw");
        } catch(IOException e) {
           
        }

      InputStreamReader isr=new InputStreamReader(System.in);
      BufferedReader br=new BufferedReader(isr);
      Scanner s=new Scanner(System.in);
  
      System.out.println("	*****  Bienvenidos a Asados Josow  *****");
      System.out.println("	");
      System.out.println("	     ** Menu de comidas y Bebidas ** ");
      System.out.println("	");
                         

       se.menu();

       do{
         System.out.println("Seleccione su opcion");
         
          while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
          opcion=s.nextInt();
       }while(opcion<1 || opcion>16);

   try{

       switch(opcion){
           case 1:{
                   Double vuel;
             do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);

               se.Cpollo();

             vuel = se.Cpollo();

             }while(p<=150.00 || p>=1000.00);
             
             System.out.println("Su vuelto es: "+se.Cpollo());

             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
                    System.out.println("Se han ingresado los datos correctamente!");
                    break;
           }
        
           case 2:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccarne();
             vuel = se.Ccarne();
             }while(p<=140 || p>=1000);
             
             System.out.println("Su vuelto es: "+se.Ccarne());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 3:{
               Double vuel;
               do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccerdo();
            vuel =  se.Ccerdo();
             }while(p<=140 || p>=1000);
             
             System.out.println("Su vuelto es: "+se.Ccerdo());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 4:{
               Double vuel;
             do{
                  System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Cenchiladas();
            vuel = se.Cenchiladas();
             }while(p<=50 || p>=1000);
             
             System.out.println("Su vuelto es: "+se.Cenchiladas());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 5:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ctajadas();
            vuel =  se.Ctajadas();
             }while(p<=50 || p>=1000);
             
             System.out.println("Su vuelto es: "+se.Ctajadas());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }


      

           case 6:{
               Double vuel;
             do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccacao();
            vuel = se.Ccacao();
             }while(p<=35 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Ccacao());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }
        
           case 7:{
               Double vuel;
             do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Csebada();
            vuel = se.Csebada();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Csebada());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 8:{
               Double vuel;
             do{
                  System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Climonada();
            vuel = se.Climonada();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Climonada());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 9:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Cgranadilla();
            vuel = se.Cgranadilla();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Cgranadilla());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 10:{
               Double vuel;
             do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Cjamaica();
            vuel = se.Cjamaica();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Cjamaica());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 11:{
               Double vuel;
               do{
                System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Cmelon();
            vuel = se.Cmelon();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Cmelon());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 12:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Cagua();
            vuel = se.Cagua();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Cagua());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 13:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccoca350();
            vuel = se.Ccoca350();
             }while(p<=20 || p>=200);
             
             System.out.println("Su vuelto es: "+se.Ccoca350());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 14:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccoca2();
            vuel = se.Ccoca2();
             }while(p<=45 || p>=500);
             
             System.out.println("Su vuelto es: "+se.Ccoca2());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           }

           case 15:{
               Double vuel;
             do{
                 System.out.println("Digite la cantidad de su pago (cordobas)");
               
            while(!s.hasNextInt()){s.next();System.out.println("Inserte de nuevo");}
             p=s.nextDouble();
               se.setpago(p);
             se.Ccoca3();
            vuel = se.Ccoca3();
             }while(p<=60 || p>=500);
             
             System.out.println("Su vuelto es: "+se.Ccoca3());
             try {
                        escribir(p, vuel);
                    } catch(IOException e) {
                        
                    }
             break;
           
           }
           case 16: {
                    try {
                        imprimir();
                    } catch(IOException e) {
                        
                    }
                    break;
              }

          }

      }catch(Exception ex){System.out.println(ex.getMessage());}

    }
}