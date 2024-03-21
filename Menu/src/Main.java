import java.util.Scanner;

class main{

    public static float sumar(float valor1, float valor2)
    {
        return valor1 + valor2;
    }

    public static float restar(float valor1, float valor2)
    {
        return valor1 - valor2;
    }

    public static float multiplicar(float valor1, float valor2)
    {
        return valor1 * valor2;
    }

    public static float dividir(float valor1, float valor2)
    {
        if(valor2 == 0)
        {
            System.out.println("No se puede realizar una division entre 0");
            return 0;
        }

        return valor1 / valor2;
    }
    public static boolean operacion(int opcion, float valor1, float valor2)
    {
        boolean result = true;
        switch (opcion)
        {
            case 1:
                System.out.println("El valor de la suma es: " + sumar(valor1, valor2));
                return result;

            case 2:
                System.out.println("El valor de la resta es: " + restar(valor1, valor2));
                return result;

            case 3:
                System.out.println("El valor de la multiplicacion es: " + multiplicar(valor1, valor2));
                return result;

            case 4:
                System.out.println("El valor de la división es: " + dividir(valor1, valor2));
                return result;

            case 5:
                System.out.println("Gracias por utilizar el programa ;)");
                result = false;

        }
        return result;
    }

    public static void main(String[] args)
    {
        int opcion;
        float value2;
        float value1;

        do {
            System.out.println("Elija la operacion que desea realizar");
            System.out.println("[1] Sumar");
            System.out.println("[2] Restar");
            System.out.println("[3] Multiplicar");
            System.out.println("[4] Dividir");
            System.out.println("[5] Salir");
            System.out.println(" ");

            Scanner sc = new Scanner(System.in);
            System.out.print("Ingrese su opcion: ");

            opcion = sc.nextInt();

            System.out.println(" ");
            System.out.print("Ingrese el primer valor: ");
            value1 = sc.nextFloat();

            System.out.println(" ");

            System.out.print("Ingrese el segundo valor: ");
            value2 = sc.nextFloat();

        } while (operacion(opcion, value1, value2));


    }
}
