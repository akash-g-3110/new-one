import java.util.regex.*;

public class RegularExpression {

    public static void main(String[] args) {
        String s1 = "wFvLrl2xQjyrWrxeNI21@#9w";
        String s = s1;
        s = s.replaceAll("[^0-9]", "");
        System.out.println(s);
        Pattern p1 = Pattern.compile("\\W+");//algorithm

        Matcher m1 = p1.matcher(s1);
        while (m1.find()) {
            // int i;
            //i= Integer.parseInt(m.group());

            System.out.println("\n"+m1.group());

        }
    }
}


