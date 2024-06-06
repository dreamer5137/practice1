import java.util.Scanner;
public class Program 
{
    public static void main (String args[])
    {
        int x1,y1;
        Scanner in = new Scanner(System.in);
        System.out.print("Введите координаты точки a");
        x1 = in.nextInt();
        y1 = in.nextInt();
        System.out.print("Введите координаты точки b");
        int x2 = in.nextInt();
        int y2 = in.nextInt();
        Point a = new Point(x1, y1);
        Point b = new Point(x2, y2);
        Line otr = new Line(a,b);
        System.out.println(otr.Dlina());
    }
}
