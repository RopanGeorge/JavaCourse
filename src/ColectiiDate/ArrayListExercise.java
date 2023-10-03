package ColectiiDate;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

public class ArrayListExercise {
    ArrayList<String> colours;

    public ArrayListExercise() {
        colours= new ArrayList<>();
    }

    public ArrayList<String>listOfColours(String color){
        colours.add(color);
    return colours;
    }

    public void iterateThroughList(){
        for(int i=0;i<colours.size();i++)
            System.out.println(colours.get(i));
    }
    public void iterateList(){
        Iterator<String> iterator = colours.iterator();
        while(iterator.hasNext()){
            System.out.println("Iterare cu iterator");
            System.out.println(iterator.next());
        }
    }

    public void  IterateForEach(){
        for (String element:colours){

            System.out.println(element);
        }
    }
    //update position by index
    public ArrayList<String> updatePositionByIndex(int index, String newValue){
        colours.set(index,newValue);
        addNewValue(index,newValue);
        return colours;
    }
    //folosim index
    public void addNewValue(int index, String value){
        colours.add(index=1,value);
    }
    //returneaza o valoare random din lista colours
    public void randomValueList(){
        Random random=new Random();
        System.out.println("Valori aleatorii din random: " +colours.get( random.nextInt(colours.size())));
    }

    public void removeElement(int index){
        colours.remove(index);
    }

    public boolean searchElement(String value){
        for(int i=0;i<colours.size();i++)

            if(colours.get(i).contains(value))
                return true;
        return false;
    }

    //sterge toate elementele
    public void emptyArray(){
        colours.clear();
    }

    //shuffle elements
    public void shuffleValues(){
        Collections.shuffle(colours);
    }

    public static void main(String[] args) {
        ArrayListExercise obj1= new ArrayListExercise();
        obj1.listOfColours("red");
        obj1.listOfColours("blue");
        obj1.listOfColours("yellow");
        System.out.println(obj1.colours);
        obj1.iterateThroughList();
        obj1.iterateList();
        obj1.IterateForEach();
        System.out.println("Lista curenta de culori " + obj1.colours);
        System.out.println(obj1.updatePositionByIndex(obj1.colours.size()/2,"brown"));
        obj1.randomValueList();
        obj1.randomValueList();
        System.out.println();

        System.out.println("Shuffle: ");
        obj1.shuffleValues();


        System.out.println(obj1.colours);
        obj1.removeElement(1);
        System.out.println(obj1.colours);
        obj1.emptyArray();
        System.out.println(obj1.colours);
    }
}
