public class StringDemo2 {
    public static void main(String[] args) {
        String str="amol is living in pune";
        String str1="MITHLESH IS LIVING IN PATNA";
        System.out.println("str=" +str);
        System.out.println("length =" +str.length());
        System.out.println("character at index 10=" +str.charAt(10));
        System.out.println("substring of 10=" +str.substring(10));
        System.out.println("substring of (2,12)="+str.substring(2,12));
        System.out.println("str=" +str.toUpperCase());
        System.out.println("str1= " +str1.toLowerCase());
    }
}
