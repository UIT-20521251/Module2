package ss8_CleanCode.regex;

public class CheckRegex {
    public static boolean checkClasName(String className){
        String regexClasName = "^C((0[1-9])|(1[0-2]))\\d{2}[GL][1-9]-JV10[13]$";
        return  className.matches(regexClasName);
    }
    public static boolean checkPhoneNum(String num){
        String regexPhoneNum = "^0[1-9][0-9]{8,9}$";
        return  num.matches(regexPhoneNum);
    }
    public static boolean checkLicensePlate(String licensePlate){
        String regexLicensePlate = "[1-9][0-9][A-Z]-[0-9]{4,5}";
        return licensePlate.matches(regexLicensePlate);
    }
}
