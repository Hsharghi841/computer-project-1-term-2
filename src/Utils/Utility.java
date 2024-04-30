package Utils;

import java.util.regex.Pattern;

public class Utility {
    public static boolean isPasswordValid(String pass){
        boolean let = false, num = false;
        for (int i = 0; i < pass.length(); i++) {
            if(!let) {
                if ((pass.charAt(i) <= 'z' && pass.charAt(i) >= 'a') || (pass.charAt(i) >= 'A' && pass.charAt(i) <= 'Z'))
                    let = true;
            } else if(!num) {
                if (pass.charAt(i) >= '0' && pass.charAt(i) <= '9')
                    num = true;
            }else {
                return true;
            }
        }
        return let && num;
    }
    public static boolean isEmailValid(String Email){
        if(!Pattern.matches("[a-zA-Z0-9\\.]+(@)[^0-9]+(\\.)[^0-9]+",Email)) {
            System.out.println("this email is invalid");
            return false;
        }
        else {
            System.out.println("this email is valid");
            return true;
        }
    }
}
