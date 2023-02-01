import java.util.*;

//Creating Generics class
class Generics <T> {
    ArrayList<T> li = new ArrayList<T>();

    Generics(ArrayList<T> li)
    {
        this.li = li;
    }

    void displayOutput()
    {
        Iterator<T> idx = li.iterator();
        while(idx.hasNext())
        {
            System.out.println(idx.next() + " ");
        }
        System.out.println();
    }

}

public class GenericsAssignment {
    public static void main(String[] args) {

        ArrayList<Integer> li_1 = new ArrayList<Integer>();
        li_1.add(22);
        li_1.add(44);
        li_1.add(66);

        ArrayList<Float> li_2 = new ArrayList<Float>();
        li_2.add(5.0f);
        li_2.add(9.0f);
        li_2.add(11.0f);

        ArrayList<String> li_3 = new ArrayList<String>();
        li_3.add("Manish");
        li_3.add("Kumar");
        li_3.add("Jha");

        ArrayList<Double> li_4 = new ArrayList<Double>();
        li_4.add(100.0);
        li_4.add(99.0);
        li_4.add(399.0);

        Generics<Integer> genA = new Generics<Integer>(li_1);
        Generics<Float> genB = new Generics<Float>(li_2);
        Generics<String> genC = new Generics<String>(li_3);
        Generics<Double> genD = new Generics<Double>(li_4);

        System.out.println("The value of integer is: ");
        genA.displayOutput();
        System.out.println("The value of float is: ");
        genB.displayOutput();
        System.out.println("The value of string : ");
        genC.displayOutput();
        System.out.println("The value of double : ");
        genD.displayOutput();
    }
}