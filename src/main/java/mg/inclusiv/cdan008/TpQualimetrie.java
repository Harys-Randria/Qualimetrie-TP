/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package mg.inclusiv.cdan008;


import java.util.ArrayList;
import java.util.Arrays;
import mg.inclusiv.cdan008.entity.Imput;
import mg.inclusiv.cdan008.entity.Trie;


public class TpQualimetrie {

    /**
     * @param args
     */
    public static void main(String[] args) {

        Imput imput = new Imput();

        String nombres = imput.EntrerNombre();
        ArrayList nombresList = imput.ToArray(nombres);
        
        int[] aTrier = imput.toTab(nombresList);
        System.out.println(Arrays.toString(aTrier));
        
        Trie trie = new Trie(aTrier);
        
        trie.AscTrie();
        trie.showNumbers();
        
       
    }
}
