public class Calculadora{
    public double Multiplicar(double x, double y){
        return x * y;
    }
    public double Divide(double dividendo , double divisor){
        return dividendo / divisor;
    }
    public double promediar(double x, double y , double z){
        double suma = x + y + z;
        return suma / 3; 
    }
    public void mostrarResultado(){
        System.out.println("Ahorita no joven, Sali al almuerzo. Regreso en 15 minutos");
    }



}