using System;

class Program
{
    static void Main()
    {
        double salarioInicial = 1500.0;
        double aumentoAnual = 0.10; // 10% de aumento anual
        int año = 1;

        Console.WriteLine("Salario inicial del profesor: $" + salarioInicial);

        while (año <= 6)
        {
            salarioInicial += salarioInicial * aumentoAnual;
            Console.WriteLine("Año " + año + ": $" + salarioInicial);
            año++;
        }

        Console.WriteLine("Salario después de 6 años: $" + salarioInicial);
    }
}
