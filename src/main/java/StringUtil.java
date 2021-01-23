public class StringUtil {
    //Task 1
    public static String main(String[] args) {
        String str1 = "Hello";
        String str2 = " Java";
        return str1.concat(str2);
    }

    //Task 2
   public static int indexOf(String str, char x) {
        return str.indexOf(x);
    }

    //Task 3
    public static boolean equals(String str1, String str2) {
        return str1.equals(str2);
    }

    //Task 4
   public static String trimAndToUpperCase(String str) {
        return str.trim().toUpperCase();
      }

   //Task 5
   public static String substring (String str) {
        if (str.length() >= 33) {
            return str.substring(10, 33);
        } else {
            return str.substring(10);
        }

   }
   //Task 6
   public static String replace(String str) {
        return str.replace(":(",":)");
   }

   //Task 7


}


