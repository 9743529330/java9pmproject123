public class HeyBaby {
    public static void main(String[] args) {
        String s1="hey baby you are so lovely";
        String[] s2=s1.split(" ");
        for (int i=0;i<s2.length;i++)
        {
            if (s2[i].endsWith("y"))
            {
                System.out.println(s2[i]);
            }
        }
    }
}
