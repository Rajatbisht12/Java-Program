import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Program21 {
    public static void main(String[] args) {
        String s  = "I will be in the room in 10 minutes";

        Pattern p = Pattern.compile("\\bin\\b");
        Matcher m = p.matcher(s);
        while (m.find()){
            System.out.println("Pattern matches: " + m.group() + " at " + m.start());
        }
    }
}