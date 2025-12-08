import java.util.*;
class Counter{
    static int count =0;
    Counter(){
        count++;
    }
}
class Assignment_nine{
    public static void main(String[] args) {
        Counter c = new Counter();
        Counter c1 = new Counter();
        Counter c2 = new Counter();
        System.out.println(c2.count);

    }
}