public class Ballistic{
  public static void main(String[]args){
  double X0= Double.parseDouble(args[0]);
  double V0= Double.parseDouble(args[1]);
  double t= Double.parseDouble(args[2]);
  double g= 9.81;
  double Result= X0+ V0*t-g*t*t/2;
  System.out.println(Result);






 }



    }
