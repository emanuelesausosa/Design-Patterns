using System;
using Factory_Pattern.Infrastructure.Shapes;

namespace Factory_Pattern
{
    class Program
    {
        private static IShape _shape;
        static void Main(string[] args)
        {
            Console.WriteLine("Hello World!");
            var shapeFactory = new ShapeFactory();
            _shape = shapeFactory.createShape(Shapes.Circle);

            _shape.Draw();
        }
    }
}
