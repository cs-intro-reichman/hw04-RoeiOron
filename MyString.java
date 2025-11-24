public class MyString {
    
    public static void main(String[] args) {
        System.out.println("Testing lowercase:");
        System.out.println("UnHappy : " + lowerCase("UnHappy"));
        System.out.println("This costs 15 Sheksls : " + lowerCase("This costs 15 Sheksls"));
        System.out.println("TLV : " + lowerCase("TLV"));
        System.out.println("lowercase : " + lowerCase("lowercase"));

        System.out.println("Testing contains:");
        System.out.println(contains("unhappy", "happy")); // true
        System.out.println(contains("happy", "unhappy")); // false
        System.out.println(contains("historical", "story")); // false
        System.out.println(contains("psychology", "psycho")); // true
        System.out.println(contains("personality", "son")); // true
        System.out.println(contains("personality", "dad")); // false
        System.out.println(contains("resignation", "sign")); // true
    }

    public static String lowerCase(String str) {
        StringBuilder sb = new StringBuilder(); 
        
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            
            if (c >= 'A' && c <= 'Z') {
                c = (char) (c + 32);
            }
            sb.append(c);
        }
        return sb.toString(); 
    }

    public static boolean contains(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
    
        if (len2 > len1) {
            return false;
        }
        
        int outerLimit = len1 - len2;
        
        for (int i = 0; i <= outerLimit; i++) { 
            int j = 0;
            while (j < len2 && str1.charAt(i + j) == str2.charAt(j)) {
                j++; 
            }

            if (j == len2) {
                return true;
            }
        }
        return false;
    }
}

