package ColectiiDate;

import java.util.HashMap;
import java.util.Map;

public class Hashmap {
    public static void main(String[] args) {
        Hashmap listaHasMap= new Hashmap();
        listaHasMap.adaugareInMap(1,"ana");
        listaHasMap.adaugareInMap(2,"are");
        listaHasMap.adaugareInMap(3,"mere");

        System.out.println(listaHasMap.hashMap);
        listaHasMap.AboutMap();
    }
    Map<Integer,String> hashMap;
    public Hashmap(){
        hashMap=new HashMap<>();

    }
    public Map<Integer,String> adaugareInMap(int cheie, String valoare){
        hashMap.put(cheie,valoare);
        return hashMap;
    }
    public void AboutMap(){
        System.out.println(hashMap.keySet()+"--"+hashMap.values());
        System.out.println(hashMap.get(2));
    }
}
