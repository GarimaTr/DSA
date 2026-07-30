import java.util.ArrayList;
import java.util.List;

class Main{
    public static void main(String[] args) {
        
        ArrayList<Integer> list = new ArrayList<>();
        // OR other way
        // List<Integer> arr = new ArrayList<>();
        // Collection<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);

        list.remove(0);
        System.out.println(list);

        List<Integer> list2= new ArrayList<>();
        list2.add(101);
        list2.add(102);
        list2.add(103);

        list.addAll(list2);
        System.out.println(list);

        list.removeAll(list2);
        System.out.println(list);

        System.out.println(list.size());

        System.out.println("List2: "+list2);
        list2.clear();
        System.out.println(list2.size());

        // traverse  list using iterator
        Iterator<Integer> iterator = list.iterator();
    

    }
}