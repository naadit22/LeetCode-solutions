public class CheckStringEquivalent {
    public static void main(String[] args){
        String[] word1 = {"ab","c"};
        String[] word2 = {"a","bc"};
        System.out.println(equivalent(word1,word2));
    }

    static boolean equivalent(String[] word1, String[] word2){
        String str1 = "";
        for(int i = 0;i<word1.length;i++){
            str1 += word1[i];
        }
        String str2 = "";
        for(int i = 0;i<word2.length;i++){
            str2 += word2[i];
        }
        if(!str1.equals(str2))
            return false;
    return true;
    }
}
