import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
//import gpdraw.*;            // for DrawingTool

public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon = new ArrayList <Point2D.Double>();
    DrawingTool myPencil = new DrawingTool();
    SketchPad myPaper = new SketchPad(300,300);
    private double x;
    private double y;
    private double perimeter;
    
    //constructors
    public IrregularPolygon()
    {
        x = 1;
        y = 1;
        perimeter = 0.0;
    }
    
    //public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
    }
    
    public void draw()
    {
        double x1 = myPolygon.get(0).getX();
        double y1 = myPolygon.get(0).getY();
        double x2 = myPolygon.get(1).getX();
        double y2 = myPolygon.get(1).getY();
        
    }
    
    public double perimeter()
    {
        for (int i = 0; i < myPolygon.size()-1; i++)
        {
            
        }
    }
    
    public double area()
    {
        
    }
}
