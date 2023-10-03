package ColectiiDate;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListClass {
    public static void main(String[] args) {
            LinkedListClass obiect = new LinkedListClass();
            obiect.adaugareInLista("Ana ");
            obiect.adaugareInLista("are");
            obiect.adaugareInLista("mere");
        System.out.println(obiect.lista);
        obiect.iterareLista_forSimplu();
        obiect.iterareLista_forEach();
        obiect.iterareLista_Iterator();
        obiect.adaugarePePozitie(1,"n-are");
        obiect.iterareLista_forEach();

        System.out.println("Apelare cu functie si valoare");
        obiect.functieAfisareElementSiPozitie();
        System.out.println("Remove:");
        obiect.fucntieRemove(0);
        obiect.iterareLista_forEach();

    }
    LinkedList<String> lista;

    public LinkedListClass(){
        lista=new LinkedList<>();
    }
    public LinkedList<String> adaugareInLista(String obiect){
        lista.add(obiect);
        return lista;
    }
    public void iterareLista_forSimplu(){
        for(int i=0;i< lista.size();i++){
            System.out.println(lista.get(i));
        }
    }
    public void iterareLista_forEach(){
        for (String element:lista
             ) {
            System.out.println(element);
        }
    }
    public void iterareLista_Iterator(){
        Iterator iterator= lista.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
    public LinkedList<String> adaugarePePozitie(int pozitie, String valoare){
        lista.add(pozitie,valoare);
        return lista;
    }
    public void functieAfisareElementSiPozitie(){
        for(int i=0;i<lista.size();i++)
            System.out.println("Elementul de pe pozitia "+i+" are ca valoare "+ lista.get(i));
    }
    public void fucntieRemove(int pozitie){
        lista.remove(pozitie);
    }




}
