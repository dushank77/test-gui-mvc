package mytesting;

public class test {

    public static void main(String[] args) {
        SortTesting gui = new SortTesting();
        Control control = new Control();
        int[] y = control
        int[] x = insertion_sort(y);
        control.setOutputText(x);
        System.out.println(control.output);
        NewClass n=new NewClass();
        
        
    }

    
    
    
    
    
    
    
    
    
  //////////////////////////////////////////////////  
    public static int[] insertion_sort(int[] A) {
        int n = A.length;
        int key;
        for (int j = 0; j < n; j++) {
            key = A[j];
            int i = j - 1;
            while (i >= 0 && A[i] > key) {
                A[i + 1] = A[i]; //swap
                i = i - 1;
            }
            A[i + 1] = key;
        }
        return A;
    }
}
