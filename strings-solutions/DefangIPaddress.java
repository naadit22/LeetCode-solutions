public class DefangIPaddress {
    public static void main(String[] args){
        String address = "1.1.1.1";
        System.out.println(defanfIPaddr(address));
    }

    static String defanfIPaddr(String address){
        String newAddr = "";
        for(int i = 0;i<address.length();i++){
            newAddr = address.replace(".", "[.]");
        }
        return newAddr;
    }
}
