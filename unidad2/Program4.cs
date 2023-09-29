using System.Diagnostics.CodeAnalysis;

namespace progra4
{
    internal class formula
    {
        static void Main(string[] args)
        {
            int Y, A, X;
            Console.WriteLine("ingresa valor de y");
            Y = Int32.Parse(Console.ReadLine());
            Console.WriteLine("ingresar valor de A");
            A = Int32.Parse(Console.ReadLine());

            X = Y + A + 3;
            Console.WriteLine("El resultado de la formula es:" + X);
        }
    }
}









        