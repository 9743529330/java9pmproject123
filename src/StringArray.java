public class StringArray {
    public static void main(String[] args) {
        String[] str=new String[5];
        str[0]="mylove";
        str[1]="meripyari";
        str[2]="i love you";
        str[3]="i hate you";
        str[4]="very fantastic";
       // for (int i=0;i<5;i++)
        int stArr=str[0].length();
        for (String ladla:str)
        System.out.println(ladla);
        System.out.println("length=" +stArr);

    }
}
