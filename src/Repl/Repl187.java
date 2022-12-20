package Repl;


import java.util.ArrayList;
import java.util.Iterator;
public class Repl187 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>(5);
        words.add("hi");
        words.add("yo");
        words.add("sup");
        words.add("yolo");
        words.add("boop");

        words.remove(0);
        words.remove(1);
        words.remove(2);
        Iterator<String> iterator =words.iterator();
        while (iterator.hasNext()){

            System.out.print(iterator.next()+" ");
        }


       // for (int i = 0; i <= words.toArray().length - 1; i++) {
           // System.out.print(words.get(i)+" ");

        }
    }
