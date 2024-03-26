package mg.inclusiv.cdan008.entity;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Imput {
    Scanner scann = new Scanner(System.in);

    public String EntrerNombre(){
        String chaineDeCaractere;
        System.out.println("Entrez vos nombres séparer des virgules(,) : ");
        chaineDeCaractere = scann.next();

        return chaineDeCaractere;
    }
    
    public ArrayList<Integer> ToArray(String e){
         List<Integer> list = new ArrayList<>();
        for (String s : e.split(",")) {
            list.add(Integer.valueOf(s));
        }
            
        return (ArrayList<Integer>) list;
    }
    
    public int[] toTab (ArrayList array){
    int[] tab = new int[array.size()];
    for(int i = 0 ; i < array.size() ; i ++){
        tab[i] = (int) array.get(i);
    }
    return tab;
    }
    
}
