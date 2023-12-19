import java.util.regex.*;

public class Program20 {
    public static void main(String[] args) {
        String pattern = "[a-z]+";
        String check = "happy Learning! Welcome to Edureka";
        Pattern p = Pattern.compile(pattern);
        Matcher c = p.matcher(check);
        while (c.find())
        {
            System.out.println(check.substring(c.start(), c.end()));
        }
    }
}