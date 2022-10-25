import java.util.HashSet;
 
public class HashSets {
 public static void main(String args[])
 {
    //creating
    HashSet<Integer> set = new HashSet<>();

    //insert - list.add(el);
    set.add(1);
    set.add(2);
    set.add(3);
    set.add(1);
    System.out.println(set);

    //search - contains
    if(set.contains(1))
    {
        System.out.println("set contains 1");
    }
    if(!set.contains(6))
    {
        System.out.println("set doesn't contain 6");
    }

    //delete
    set.remove(1);
    if(!set.contains(1))
    {
        System.out.println("doesn't contain 1");
    }
 }    
}
