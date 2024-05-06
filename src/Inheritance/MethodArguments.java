package Inheritance;

public class MethodArguments {
    void myMethod1(int a)
    {
        System.out.println("a= "+a);
    }
    void myMethod2(int a,int b)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
    }
    void myMethod3(int a,int b,int c)
    {
        System.out.println("a="+a);
        System.out.println("b="+b);
        System.out.println("c="+c);
    }
    void myMethod4(int a,char c,double d)
    {
        System.out.println("a="+a);
        System.out.println("char="+c);
        System.out.println("double="+d);
    }
    void myMethod5(int a,char c,double d,String str)
    {
        System.out.println("a="+a);
        System.out.println("char="+c);
        System.out.println("double="+d);
        System.out.println("string="+str);

    }
    void printArray(int[] arr)
    {
        for (int i=0;i<arr.length;i++)
        {
            System.out.print(" " +arr[i]);
        }
        System.out.println();
    }
    void printTwoDArray(String[][] stArr)
    {
        int row=stArr.length;
        int col=stArr[0].length;
        System.out.println("row="+stArr.length);
        System.out.println("col="+stArr[0].length);
        System.out.println("\n =====> Below is my 2-D Array");
        for (int i=0;i<stArr.length;i++)
        {
            for (int j=0;j<stArr[0].length;i++)
            {
                System.out.print(" "+stArr[i][j] +"\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        MethodArguments ob=new MethodArguments();
        ob.myMethod1(10);
        ob.myMethod2(20,26);
        ob.myMethod3(86,98,78);
        ob.myMethod4(10,'h',23.26);
        ob.myMethod5(45,'u',63.23,"amol");
        int[] xrr={23,56,69,63,53};
        System.out.println("\" =====>Below is my array");
        ob.printArray(xrr);
        String[][] printTwoDArray={
                {"amol","gautam","amit","sunil","mohan"},
                {"surya","jhanvii","tapu","sunil","raju"},
                {"tanu","salini","arya","sunil","kapoor"},
              {"raushan","apoorva","brij","sunil","aaditya"},
                {"raushan","apoorva","brij","sunil","aaditya"},
                {"raushan","apoorva","brij","sunil","aaditya"},

        };
        ob.printTwoDArray(printTwoDArray);
    }


}


