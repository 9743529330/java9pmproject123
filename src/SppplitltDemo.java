public class SppplitltDemo {
    public static void main(String[] args) {
        String str = "my name is mithlesh kumar.i learn java selenium Automation programming.";
        String[] stArr = str.split("mithlesh kumar");
        // for (int i = 0; i < str.length(); i++) {

        for (int i = 0; i < stArr.length; i++) {

            System.out.println(stArr[i]);
        }
    }
}
