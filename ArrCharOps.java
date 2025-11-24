public class ArrCharOps {

    public static void println(char[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }

    public static char charAt(char[] arr, int index) {
        return arr[index];
    }

    public static boolean equals(char[] arr1, char[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }
        return true;
    }

    public static int indexOf(char[] arr, char ch) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            } 
        }
        return -1;
    }

    public static int indexOf(char[] arr, char ch, int fromIndex) {
        for (int i = fromIndex; i < arr.length; i++) {
            if (arr[i] == ch) {
                return i;
            } 
        }
        return -1;
    }

    public static int lastIndexOf(char[] arr, char ch) {
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == ch) {
                return i;
            } 
        }
        return -1;
    }

    public static char[] concat(char[] arr1, char[] arr2) {
        int totalLength = arr1.length + arr2.length;
        char[] newArr = new char[totalLength];
        
        for (int i = 0; i < totalLength; i++) {
            if (i < arr1.length) {
                newArr[i] = arr1[i]; 
            } else {
                int arr2Index = i - arr1.length;
                newArr[i] = arr2[arr2Index]; 
            } 
        }
        return newArr;
    }
    
    public static char[] subArray(char[] arr, int beginIndex, int endIndex) {
        int subLength = endIndex - beginIndex;
        char[] newArr = new char[subLength];
        int j = 0;
        
        for (int i = beginIndex; i < endIndex; i++) {
            newArr[j] = arr[i]; 
            j++; 
        }
        return newArr;
    }

    public static long hashCode(char[] arr) {
        int n = arr.length;
        
        if (n == 0) {
            return 0;
        }
        
        long hashValue = 0;
        for (int i = 0; i < n; i++) {
            hashValue = hashValue * 7 + arr[i];
        }
        return hashValue;
    }

    public static int compareTo(String str1, String str2) {
        int len1 = str1.length();
        int len2 = str2.length();
        
        int limit = Math.min(len1, len2);
        
        for (int i = 0; i < limit; i++) {
            char char1 = str1.charAt(i);
            char char2 = str2.charAt(i);
            
            if (char1 != char2) {
                if (char1 < char2) {
                    return -1;
                } else {
                    return 1;
                }
            }
        }
        
        if (len1 < len2) {
            return -1;
        } else if (len1 > len2) {
            return 1;
        } else {
            return 0;
        }
    }
}