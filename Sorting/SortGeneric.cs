public class SortGeneric {

    //Problem Statement
    //Write a method which is capable of sorting a Array and LL without using any if else
    public static void Main(string args[]){
        int arr[]={1,2,3,4,5};
        LinkedList<int> linkedList=new LinkedList<int>(new int[]{1,2,3,4,5});
        var sortedArray=SortGeneric(arr);
        var sortedList=SortGeneric(linkedList);
    }

    public static List<T> SortGeneric<T>(IEnumerable<T> collection)where T: IComparable<T>{
        List<T> sortedList=collection.ToList();
        sortedList.sort();
        return sortedList;
    }
}
