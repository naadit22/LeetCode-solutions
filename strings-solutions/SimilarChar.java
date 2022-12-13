import java.nio.charset.StandardCharsets;
import java.util.Arrays;

class SimilarChar
{
    public static void main(String args[])
    {
        String str = "aaabbc";
        int count = 0;
        String ans = "";
        char ch = str.charAt(0);
        for(int i = 0;i<str.length();i++){
            if(ch == str.charAt(i)){
                count++;
            }
            else{
                ans+=ch;
                ans+=count;
                ch = str.charAt(i);
                count = 1;
            }
            if(i==str.length()-1){
                ans+=ch;
                ans+=count;
            }
        }
        System.out.println(ans);
    }
}


//        int i = 0;
//        while(i<str.length()){
//            int count = 1;
//            for(int j = i+1;j<str.length();j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    count++;
//                }
//                else{
//                    System.out.println(str.charAt(i)+"--->"+count);
//                    i = i+count;
//                    break;
//                }
//            }
//        }