import java.util.ArrayList;
import java.util.Scanner;

public class ClusterFeatures
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long p = sc.nextLong();
        long q = sc.nextLong();
        ArrayList<Point> data = new ArrayList<>();
        for(int i = 0; i < p; i++)
        {
            long x = sc.nextLong();
            long y = sc.nextLong();
            Point point = new Point(x, y);
            data.add(point);
        }
        for(int i = 0; i < q; i++)
        {
            long x1 = sc.nextLong();
            long x2 = sc.nextLong();
            long y1 = sc.nextLong();
            long y2 = sc.nextLong();
            Cluster cluster = new Cluster(x1, x2, y1, y2);
        }
    }

    static class Point
    {
        long x, y;

        Point(long x, long y)
        {
            this.x = x;
            this.y = y;
        }
    }

    static class Cluster
    {
        long x1, x2, y1, y2;
        double x0, y0, r, d;
        ArrayList<Point> data;
        Point sumOfPoints;
        long n;

        Cluster(long x1, long x2, long y1, long y2)
        {
            this.x1 = x1;
            this.x2 = x2;
            this.y1 = y1;
            this.y2 = y2;
            data = new ArrayList<>();
            sumOfPoints = new Point(0, 0);
        }

        boolean inCluster(Point p)
        {
            return p.x > x1 && p.x < x2 && p.y > y1 && p.y < y2;
        }

        boolean addPoint(Point p)
        {
            sumOfPoints.x += p.x;
            sumOfPoints.y += p.y;
            return data.add(p);
        }

        void calulateCentroid()
        {
            n = data.size();
            x0 = sumOfPoints.x / n;
            y0 = sumOfPoints.y / n;
        }

        void calculateR()
        {
            long xi0=0,yi0=0;
            for(int i = 0; i < n; i++)
            {
                Point p = data.get(i);
                xi0 += Math.pow((p.x-x0),2);
                xi0 += Math.pow((p.y-y0),2);
            }
        }

        void calculateD()
        {

        }
    }
}
