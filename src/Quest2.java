import java.util.regex.*;
class Quest2 {
  
    // Function to validate the password.
    public static boolean
    isValidPassword(String password)
    {
  
        // Regex to check valid password.
        String regex = "^(?=.*[0-9])"
                       + "(?=.*[a-z])(?=.*[A-Z])"
                       + "(?=.*[!@#$%^&*()-+])"
                       + "(?=\\S+$).{6,20}$";
  
        // Compile the ReGex
        Pattern p = Pattern.compile(regex);
  
        // If the password is empty
        // return false
        if (password == null) {
            return false;
        }
  
        // Pattern class contains matcher() method
        // to find matching between given password
        // and regular expression.
        Matcher m = p.matcher(password);
  
        // Return if the password
        // matched the ReGex
        return m.matches();
    }
  
    // Driver Code.
    public static void main(String args[])
    {
  
        // Test Case 1:
        String str1 = "Edilson@test20";
        System.out.println(isValidPassword(str1));
  
        // Test Case 2:
        String str2 = "Edilsonlima";
        System.out.println(isValidPassword(str2));
  
        // Test Case 3:
        String str3 = "trix@ tes20";
        System.out.println(isValidPassword(str3));
  
        // Test Case 4:
        String str4 = "1234";
        System.out.println(isValidPassword(str4));
  
        // Test Case 5:

        String str5 = "Edi@20";
        System.out.println(isValidPassword(str5));
  
        // Test Case 6:
        String str6 = "trix@portal20";
        System.out.println(isValidPassword(str6));
    }
}
