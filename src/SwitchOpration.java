public class SwitchOpration {
    public static void main(String[] args) {
        int a=10;
        int b=2;
        int c;
        String choice="calculator";
        switch (choice)
        {
            case "add":c=a+b;
            System.out.println("Addition=" +c);
            break;
            case "sub":c=a-b;
            System.out.println("substraction=" +c);
            break;
            case "mul":c=a*b;
            System.out.println("multiplication=" +c);
            break;
            case "div":c=a/b;
            System.out.println("divide=" +c);
            break;
            default:
                System.out.println("wrong choice");
                break;
        }


    }
}
