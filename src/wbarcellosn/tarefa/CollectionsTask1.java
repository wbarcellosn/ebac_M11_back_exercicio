/**
 * @author winic
 */
package wbarcellosn.tarefa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsTask1 {

    public static void main(String[] args){
        List<String> namesList = new ArrayList<>();

        namesList.add("Winicius");
        namesList.add("Maria");
        namesList.add("Ana");
        namesList.add("Lucia");
        namesList.add("Mariana");
        namesList.add("Jéssica");

        System.out.println("**** Lista em ordem não alfabética***");
        for (String name : namesList){
            System.out.println(name);
        }

        Collections.sort(namesList);
        System.out.println("\n**** Lista em ordem alfabética***");
        for (String name : namesList){
            System.out.println(name);
        }
    }
}
