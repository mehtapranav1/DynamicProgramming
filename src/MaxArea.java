import java.util.Stack;
public class MaxArea {
    static int MaxA(int[] hist,int length) {
        Stack<Integer> s = new Stack<>();

        int max_area = 0;
        int tp;
        int area_with_top;
        int i = 0;
        while (i < length) {
            if (s.empty() || hist[s.peek()] < hist[i]) {
                s.push(i++);
            } else {
                tp = s.peek();
                s.pop();

                area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

                if (max_area < area_with_top) {
                    max_area = area_with_top;
                }
            }
        }
        while (s.empty() == false)
        {
            tp = s.peek();
            s.pop();
            area_with_top = hist[tp] * (s.empty() ? i : i - s.peek() - 1);

            if (max_area < area_with_top)
                max_area = area_with_top;
        }

        return max_area;

    }
    public static void main (String args[])
    {
        int hist[]={6,2,5,4,5,1,6};
        System.out.println("maximum area is "+MaxA(hist,hist.length));
    }
}
