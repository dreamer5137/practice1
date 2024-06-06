public class Line 
{
    private Point a;
    private Point b;
    public Point getA()
    {
        return a;
    }
    public Point getB()
    {
        return b;
    }
    public void setA(Point a)
    {
        this.a = a;
    }
    public void setB(Point b)
    {
        this.b = b;
    }
    public Line(Point a,Point b)
    {
        this.a = a;
        this.b = b;
    }
    public String Dlina()
    {
        double dlina;
        dlina = Math.sqrt(Math.pow(a.getX()-b.getX(), 2) + Math.pow(a.getY()-b.getY(), 2));
        return "Длина отрезка = " + dlina;
    }
}
