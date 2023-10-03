package ColectiiDate;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CreateDatabase {
    public static void main(String[] args) {
        String propozitie="creatie noua";
        String[] array=propozitie.split(" ");
        System.out.println(array[1]);
        ArrayList<String> obj1= new ArrayList<>();
        for (String element: array)
              {
            obj1.add(element);
        }
        System.out.println(obj1.get(0));
        obj1.add("ceasul acesta este un breitling ofr bentley");
        obj1.add("iar acesta este maserati");
        System.out.println(obj1);
        obj1.set(2,"update string");
        System.out.println(obj1);
        List<String> obj2= new ArrayList<>();
        obj2.add("avem si casio");
        obj2.add("avem multe ceasuri");
        for (String element:obj2)
              {
                  //System.out.println("Elemente obj2 "+ element);
        }
obj2.stream().forEach(System.out::println);
        System.out.println(obj1.stream().findFirst().get());
       // boolean valoare=obj2.stream().filter(v->v.contains("ceas")).collect(Collectors.toList());
        System.out.println(obj2.stream().filter(v->v.contains("ceas")).collect(Collectors.toList()));

    }
}
