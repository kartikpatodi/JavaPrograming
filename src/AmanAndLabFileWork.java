import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class AmanAndLabFileWork
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Order> orders = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            Order order = new Order();
            order.i = i + 1;
            order.t = sc.nextInt();
            order.d = sc.nextInt();
            order.s = order.t + order.d;
            orders.add(order);
        }
        StringBuilder sb = new StringBuilder();
        orders.sort(new OrderComparator());
        for(Order order : orders)
        {
            sb.append(order).append(" ");
        }
        System.out.println(sb.toString());
    }

    static class Order
    {
        int i;
        int t;
        int d;
        int s;

        @Override
        public String toString()
        {
            return String.valueOf(i);
        }
    }

    static class OrderComparator implements Comparator<Order>
    {
        @Override
        public int compare(Order o1, Order o2)
        {
            int d = o1.s - o2.s;
            if(d != 0) return d;
            else return o1.i - o2.i;
        }
    }

}
