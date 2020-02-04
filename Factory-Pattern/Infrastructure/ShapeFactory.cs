namespace Factory_Pattern.Infrastructure.Shapes {
    public class ShapeFactory {
        private IShape _shape = null;

        public IShape createShape (Shapes shapeType) {
            switch (shapeType) {
                case Shapes.Circle:
                    {
                        _shape = new Circle ();
                        break;
                    }
                case Shapes.Rectangle:
                    {
                        _shape = new Rectangle ();
                        break;
                    }
                case Shapes.Square:
                    {
                        _shape = new Square ();
                        break;
                    }

                default:
                    {
                        throw new System.NotImplementedException ();
                    }

            }

            return _shape;
        }
    }
}