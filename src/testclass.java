public class testclass implements aritmeticos{
    public static void main(String[] args) {
        System.out.println(new testclass().suma(1,6));
        System.out.println(new testclass().resta(7,9));
        System.out.println(new testclass().multiplicacion(7,7));
        System.out.println(new testclass().division(1,0));
        System.out.println(new testclass().suma(new testclass().multiplicacion(9,8),7));
    }

    public int suma (int x, int y) {return x+y;}

    public int resta (int x, int y) {return x-y;}

    public int multiplicacion (int x, int y) {return x*y;}

    public double division(int x, int y) {
        //Manejar división por cero
        if (y != 0) {
            return (double) x / y;
        } else {
            System.out.println("No se puede dividir por cero.");
            return 0.0;
        }
    }
}

interface aritmeticos{
    public int suma (int x, int y);

    public int resta (int x, int y);

    public int multiplicacion (int x, int y);

    public double division(int x, int y);
}
//Beltran Calvo Brayan #222217084