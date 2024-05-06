public class UpperLower {
    public static void main(String[] args) {
        String s="WelComE is THE AUTOmation";
        int upper=0;
        int lower=0;
        for (int i=0;i<s.length();i++)
        {
            char ch=s.charAt(i);
            if (ch>=65 && ch<=90)
            {
                upper++;

            }
            else
            {
                lower++;
            }
        }
        System.out.println("lower="+lower);
            System.out.println("upper="+upper);

        }
    }

