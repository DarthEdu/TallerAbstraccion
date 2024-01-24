public class Cuadrado extends numeroAbstracto{
    public int number;

    //Metodo abstracto heredado de numeroAbstracto
    @Override
    public int obtenerNumero(int number){
        return number;
    }

    public int cuadradoNumero(int number){
        return number * number;
    }
}