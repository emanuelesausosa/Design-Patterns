using System;
namespace Factory_Pattern.Infrastructure.Shapes {
    public class Circle : IShape {
        public void Draw () {
           Console.WriteLine("Drawing circle");
        }
    }
}