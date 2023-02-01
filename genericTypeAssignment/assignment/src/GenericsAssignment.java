import java.util.*;

//Creating Generics class
class Generics <T> {
    List<T> ls = new ArrayList<T>();

    Generics(ArrayList<T> li)
    {
        this.ls = li;
    }

    void display()
    {
        Iterator<T> itr = ls.iterator();
        while(itr.hasNext())
        {
            System.out.println(itr.next() + " ");
        }
        System.out.println();
    }

}

public class GenericsAssignment {
    public static void main(String[] args) {

    	ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1.add(1);
        list1.add(2);
        list1.add(3);

        ArrayList<Float> list2 = new ArrayList<Float>();
        list2.add(4.0f);
        list2.add(5.0f);
        list2.add(6.0f);

        ArrayList<String> list3 = new ArrayList<String>();
        list3.add("Sample");
        list3.add("String");
        list3.add("Output");

        ArrayList<Double> list4 = new ArrayList<Double>();
        list4.add(7.0);
        list4.add(8.0);
        list4.add(399.0);

        Generics<Integer> intGen = new Generics<Integer>(list1);
        Generics<Float> floatGen = new Generics<Float>(list2);
        Generics<String> strGen = new Generics<String>(list3);
        Generics<Double> doubleGen = new Generics<Double>(list4);

        System.out.println("Integer value: ");
        intGen.display();
        System.out.println("Float value: ");
        floatGen.display();
        System.out.println("String value: ");
        strGen.display();
        System.out.println("Double value: ");
        doubleGen.display();
    }
}