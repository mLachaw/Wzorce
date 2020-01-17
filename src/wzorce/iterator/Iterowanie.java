/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package wzorce.iterator;

import java.util.*;

/**
 *
 * @author MLachaw
 */
public class Iterowanie {
    public static void main(String[] args){
        
        
//        List<String> listaStr = new ArrayList<>();
//        listaStr.add("jeden");
//        listaStr.add("dwa");
//        listaStr.add("trzy");
//        listaStr.add("cztery");
//        listaStr.add("pięć");
//        
//        List<Integer> listaInt = new ArrayList<>();
//        listaInt.add(100);
//        listaInt.add(200);
//        listaInt.add(300);
//        listaInt.add(400);
//        listaInt.add(500);
//        
//        Set<String> kolSet = new HashSet<>();
//        kolSet.add("str 1");
//        kolSet.add("str 2");
//        kolSet.add("str 3");
//        kolSet.add("str 4");
//        kolSet.add("str 5");
//        
        Map<Integer,String> map = new HashMap<>();
        map.put(1,"jeden");
        map.put(2,"dwa");
        map.put(3,"trzy");
        map.put(4,"cztery");
        map.put(5,"pięć");
        
        
//========Pętla FOR EACH======== */ 

//        for (Integer s:listaInt)
//        {
//            System.out.println(s);
//        }

//========Koniec


//======Poruszanie się po liście w tył dla list "kolSet"
//        System.out.println("\n ========List String w przod=========");
//        Iterator i = kolSet.iterator();
//        while(i.hasNext())
//        {
//            System.out.println(i.next());
//        }
//======Koniec        
        

//========Poruszanie się po liście w tył dla list "listaStr" i "listaInt"
//
//        System.out.println("\n ========List String w tył=========");
//        while(((ListIterator)i).hasPrevious())
//        {
//             System.out.println(((ListIterator)i).previousIndex() +" : "+((ListIterator)i).previous());
//        }
//======  Koniec  

//========Poruszanie się po liście w przód po mapie "map"

            Iterator<Integer> i = map.keySet().iterator();
            while(i.hasNext())
            {
                Integer key = i.next();
                System.out.println(key+" : "+ map.get(key));
            }       
//======  Koniec  
    }
    
}
