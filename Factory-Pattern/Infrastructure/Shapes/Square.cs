using System;
namespace Factory_Pattern.Infrastructure.Shapes {
    public class Square : IShape {
        public void Draw () {
            Console.WriteLine ("Drawing Square");
        }
    }
}