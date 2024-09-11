
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Counter {
    private final Map<Character, Integer> charCount = new HashMap<>();
    private final Map<String, Integer> wordCount = new HashMap<>();
    private final Scanner sc = new Scanner(System.in);    
    
    public void counter(String text) {
        for(int i = 0; i < text.length(); ++i) {
            char c = text.charAt(i);
            if(!charCount.containsKey(c)) {
                charCount.put(c, 1);
            }
            else
                charCount.put(c, charCount.get(c)+1);           
        }
        charCount.remove(' ');
        
        String[] arr = text.trim().split("\\s+");
        for(int i = 0; i < arr.length; ++i) {
            String s = arr[i];
            if(!wordCount.containsKey(s)) {
                wordCount.put(s, 1);
            }
            else
                wordCount.put(s, 1+wordCount.get(s));
        }
    }
    
    public void display(){
        System.out.println(wordCount);
        System.out.println(charCount);
    }
    
    public String getString(String mess, String regex) { 
        String s;
        while(true) {
            System.out.println(mess);
            s = sc.nextLine();
            if(!s.matches(regex)){
                System.err.println("Only regex: (" + regex + ")");
                continue;
            }
            return s;
        }
    }
}
