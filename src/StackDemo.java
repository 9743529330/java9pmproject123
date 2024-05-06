import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<String> s=new Stack<>();
        s.push("amol");
        s.push("kisan");
        s.push("manju");
        s.push("jai hind");
        s.push("maa");
       // System.out.println("madu");
        System.out.println(s);
        System.out.println(s.pop());//
        System.out.println(s.pop());
        System.out.println(s.pop());
        System.out.println(s.pop());//
        System.out.println(s);
        s.push("maa");
        s.push("pandit");
        System.out.println(s);
        System.out.println(s.pop());
        System.out.println(s);
    }
}
