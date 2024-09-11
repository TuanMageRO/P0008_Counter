

public class Main {
    
    public static void main(String[] args) {             
        Counter cnt = new Counter();
        String text = cnt.getString("Enter the text: ", "[A-Za-z\\s]+");
        cnt.counter(text);
        cnt.display();
    }
}