import java.awt.geom.*;     // for Point2D.Double
import java.util.ArrayList; // for ArrayList
import gpdraw.*;            // for DrawingTool

public class IrregularPolygon
{
    private ArrayList <Point2D.Double> myPolygon;
    private double perimeter;
    private double total;
    private DrawingTool myPencil;
    private SketchPad myPaper;
    
    //name
    public String getName()
    {
        return "Ryan Chow";
    }
    
    //constructors
    public IrregularPolygon()
    {
        myPolygon = new ArrayList<Point2D.Double>();
        perimeter = 0.0;
        total = 0.0;
        myPaper = new SketchPad(500,500);
        myPencil = new DrawingTool(myPaper);
    }
    
    //public methods
    public void add(Point2D.Double aPoint)
    {
        myPolygon.add(aPoint);
    }
    
    public void draw()
    {
        myPencil.up();
        myPencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
        myPencil.down();
        
        for (int i = 1; i < myPolygon.size(); i++)
        {
            myPencil.move(myPolygon.get(i).getX(), myPolygon.get(i).getY());
        }
        myPencil.move(myPolygon.get(0).getX(), myPolygon.get(0).getY());
    }
    
    public double perimeter()
    {
        for (int i = 1; i < myPolygon.size(); i++)
        {
            perimeter += myPolygon.get(i).distance(myPolygon.get(i-1));
        }
        perimeter += myPolygon.get(myPolygon.size()-1).distance(myPolygon.get(0));
        return perimeter;
    }
    
    public double area()
    {
        double total = 0.0;
        int i;
        for (i = 0; i < myPolygon.size()-1; i++)
        {
            double X0 = myPolygon.get(i).getX();
            double Y0 = myPolygon.get(i).getY();
            double X1 = myPolygon.get(i+1).getX();
            double Y1 = myPolygon.get(i+1).getY();
            total += (X0 * Y1) - (Y0 * X1);
        }
        total += (myPolygon.get(i).getX() * myPolygon.get(0).getY()) - (myPolygon.get(i).getY() * myPolygon.get(0).getX());
        return 0.5 * Math.abs(total);
    }
}
