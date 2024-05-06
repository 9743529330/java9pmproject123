public class SSPPLITDEMO {
    public static void main(String[] args) {
        String str="amol is a java selenium coach .he is very good person";
        String[] stArr=str.split("");
        for (int i=0;i<stArr.length;i++)
            System.out.println(stArr[i]);
        System.out.println("length of string=" +str.length());
    }
}
