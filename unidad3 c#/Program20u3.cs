using System;

class Program20u3
{
    static void Main()
    {
        double ahorroDiario = 3.0; // Ahorro el primer día
        int dia = 1;
        double ahorroTotal = 0.0;

        while (dia <= 365) // Suponiendo un año de 365 días
        {
            ahorroTotal += ahorroDiario;
            ahorroDiario *= 3; // Triplicar el ahorro diario
            dia++;
        }

        Console.WriteLine("Ahorro diario al cabo de un año: $" + ahorroTotal);
    }
}