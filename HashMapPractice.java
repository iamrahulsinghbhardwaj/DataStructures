import java.util.HashMap;
import java.util.Map;

class HashMapPractice {
    public static void main(String args[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        
        map.put(1,0);
        map.put(2,1);
        map.put(1,2);
        map.put(3,3);

        for (Map.Entry<Integer,Integer> entry: map.entrySet()) {
            System.out.println("Key "+entry.getKey()+" Value "+entry.getValue());
        }
    }
}
