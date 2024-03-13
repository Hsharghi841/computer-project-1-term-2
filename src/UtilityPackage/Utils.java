package UtilityPackage;

public class Utils {
    public static boolean isPasswordValid(String pass){
        boolean let = false, num = false;
        for (int i = 0; i < pass.length(); i++) {
            if(!let)
                if(pass.charAt(i) <= 'z' && pass.charAt(i) >= 'a' || pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z')
                    let = true;
            else if(!num) {
                if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
                    num = true;
            }else {
                return true;
            }
        }
        return false;
    }
}
