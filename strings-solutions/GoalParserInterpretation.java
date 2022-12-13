import java.nio.charset.StandardCharsets;

public class GoalParserInterpretation {
    public static void main(String[] args) {
        String str = "G()()()()(al)";
        System.out.println(interpret(str));
    }

    static String interpret(String command){
        String ans = "";
        for (int i = 0; i < command.length(); i++) {
            if(command.charAt(i)=='(' && command.charAt(i+1)==')'){
                ans+="o";
            }
            else if(command.charAt(i)=='(' || command.charAt(i)==')'){
                ans+="";
            }
            else{
                ans+=command.charAt(i);
            }
        }
        return ans;
    }
}
