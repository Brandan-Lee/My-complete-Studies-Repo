using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace firstProject1
{
    internal class Program
    {
        static void Main(string[] args)
        {
            //used to write to the console
            Console.WriteLine("Hello!");
            Console.WriteLine("What is your name?\n");
            //used to retrieve data from the user
            Console.WriteLine("What is your name");
            string name = Console.ReadLine();
            Console.WriteLine($"Dear {name} welcome to our lesson!\n");
            //read is used to ensure that the console doesn't close
            Console.WriteLine("What is your name?");
            int asciiCode = Console.Read();
            Console.WriteLine(asciiCode);
            Console.ReadKey();
        }
    }
}
