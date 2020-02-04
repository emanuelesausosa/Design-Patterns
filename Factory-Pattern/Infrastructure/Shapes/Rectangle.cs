using System;
namespace Factory_Pattern.Infrastructure.Shapes {
    public class Rectangle : IShape {
        public void Draw () {
            Console.WriteLine ("Drawing Square");
        }
    }
}