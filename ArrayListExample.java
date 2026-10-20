import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        //add ---------
        list.add(10);
        list.add(20);
        System.out.println(list);
        //insert -------
        list.add(30);
        System.out.println(list);
        //remove
        list.remove(0);
        System.out.println(list);

        // new arr----
        List<Integer> list2 = new ArrayList<>();
        list2.add(40);
        System.out.println(list2);
        //add all
        list.addAll(list2);
        System.out.println(list);


        list.removeAll(list2);
        System.out.println(list);
        System.out.println(list.size());


        list2.clear();
        System.out.println(list2.size());



        //------------------- Iterator--------------------
        Iterator<Integer> iterator = list2.iterator();
        while (iterator.hasNext()) {
            System.out.println("ELEMENT"+iterator.next());
        }


        List<Integer>list3 = new ArrayList<>();
        list3.add(100);
        list3.add(200);
        System.out.println(list3.get(0));

        System.out.println(list3.set(0 , 400));
        System.out.println(list3);



        //----------------------toArray -----

        Object [] arr = list3.toArray();
        for (Object obj : arr){
            System.out.println(obj);
        }

        //--------------------contains method ----

        System.out.println(list3.contains(700));

       List<Integer> list4 = new ArrayList<>();
       list4.add(100000 );
       list4.add(2000);
       list4.add(3000);

        System.out.println(list4);


        Object [] hii=  list4.toArray();
        for( Object obj : hii){
            System.out.println( "Elements :  "+ obj);
        }



        List<Integer> list5 = new ArrayList<>();
        list5.add(400);
        list5.add(12000);
        list5.add(300);
        list5.add(52200);
        System.out.println(list5);
        Collections.sort(list5);
        System.out.println(list5);


        Collections.sort(list5 , Collections.reverseOrder());
        System.out.println("PRINTING THA LIST : "+list5);



        //----------------deep copy------------------------------------
        ArrayList<Integer> newList = (ArrayList<Integer>) ((ArrayList<Integer>) list5).clone();
        System.out.println("PRINTING THE SHALLOW COPY OF ARRAY :"+newList);

       // -----------------------ensureCapacity-----------------------------

         ArrayList<Integer> marks = new ArrayList<>();
        marks.ensureCapacity(100);


       //-------------is empty -------------------------------------------
        System.out.println(marks.isEmpty());
        System.out.println(newList .isEmpty());


        //---------------indexof()----------------
        System.out.println(newList.indexOf(300));




    }



}
