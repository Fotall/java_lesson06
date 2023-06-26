import java.util.HashMap;
import java.util.HashSet;


public class seminar {
    public static void main(String[] args) {
        Set set1 = new Set();
        System.out.println(set1.add(444));    
        }
}
class Set {
    HashMap<Integer, Integer> set = new HashMap<>();
    
    public boolean add(Integer tel){
        if (set.containsKey(tel)) return false;
            set.put(tel, null);
            return true;
        }
        
            
}


    

