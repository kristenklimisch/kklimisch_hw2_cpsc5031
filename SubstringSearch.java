
public class SubstringSearch {
    
    
    /* 
    Method to search a string s for the first occurence 
    of substring u.
    Output:
    ~If U is found, the method returns the character 
    index where U starts.
    ~If U is not found, the method returns -1. 
    */
    public static int search(String s, String u) {
        int n = s.length();
        int m = u.length();
        
        for (int i = 0; i < n - m; i++) {
            int j = 0;
            while ((j < m ) && (u.charAt(j) == s.charAt(i+j))) {
                j += 1;
            }
            if (j == m) {
                return i;
            }
        }
        return -1; 
    }
    
    // Method to print the output of this program. 
    public static void print(String s, string u){

    }
    
    public static void main(String[] args) {
        String s = "Happy happy joy joy";
        String u = "happy";
        int index = search(s, u);
        System.out.println("result:")
    }
}
