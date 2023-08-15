public class Servicios{
   double pago;
 
   public Servicios(){}

   public Servicios(double pago){this.pago=pago;}

   public void setpago(double pago){this.pago=pago;}

   public double getpago(){return pago;}

   public void menu(){

     System.out.println("----------------1.- Pollo asado, gallo pinto y tajadas C$150---------------- ");
     System.out.println("----------------2.- Carne Asada, gallo pinto y tajadas C$140---------------- ");
     System.out.println("----------------3.- Cerdo Asado, gallo pinto y tajadas C$140---------------- ");
     System.out.println("----------------4.- Enchiladas C$50----------------------------------------- ");
     System.out.println("----------------5.- Tajadas con queso C$50---------------------------------- ");
     System.out.println("----------------6.- Cacao C$35---------------------------------------------- ");
     System.out.println("----------------7.- Sebada C$20--------------------------------------------- ");
     System.out.println("----------------8.- Limonada C$20------------------------------------------- ");
     System.out.println("----------------9.- Granadilla C$20----------------------------------------- ");
     System.out.println("----------------10.- Jamaica C$20------------------------------------------- ");
     System.out.println("----------------11.- Melon C$20--------------------------------------------- ");
     System.out.println("----------------12.- Agua embotellada 500ml C$20---------------------------- ");
     System.out.println("----------------13.- Coca Cola 350ml C$20----------------------------------- ");
     System.out.println("----------------14.- Coca Cola 2L C$45-------------------------------------- ");
     System.out.println("----------------15.- Coca Cola 3L C$60-------------------------------------- ");
     System.out.println("----------------16.- Mostrar datos-------------------------------------- ");

   
   }

   public double Cpollo(){
      return getpago()-150;
   }

   public double Ccarne(){
      return getpago()-140;
   }

   public double Ccerdo(){
      return getpago()-140;
   }

   public double Cenchiladas(){
      return getpago()-50;
   }

   public double Ctajadas(){
      return getpago()-50;
   }


   public double Ccacao(){
      return getpago()-35;
   }

   public double Csebada(){
      return getpago()-20;
   }

   public double Climonada(){
      return getpago()-20;
   }

   public double Cgranadilla(){
      return getpago()-20;
   }

   public double Cjamaica(){
      return getpago()-20;
   }

   public double Cmelon(){
      return getpago()-20;
   }

   public double Cagua(){
      return getpago()-20;
   }

   public double Ccoca350(){
      return getpago()-20;
   }

   public double Ccoca2(){
      return getpago()-45;
   }

   public double Ccoca3(){
      return getpago()-60;
   }

}