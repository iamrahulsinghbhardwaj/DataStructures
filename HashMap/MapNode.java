package HashMap;

public class MapNode<K,V> {
    K key;
    V value;
    MapNode<K,V> next;

    MapNode(K key,V value){
        this.key=key;
        this.value=value;
        //by default next is null so we do not need to do it next=null;
    }
}
