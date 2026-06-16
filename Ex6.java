public class Ex6 {
    
    public static void main(String[] args) {
        
        int countBegin = 0;
        int counter = 0;
        
        while (countBegin <= 100) {
            System.out.println("Counting: " + countBegin);
            System.out.println("Adding: " + counter);
            
            counter += countBegin;
            
            countBegin++;
        }

        System.out.println("Soma total: " + counter);
    }
}