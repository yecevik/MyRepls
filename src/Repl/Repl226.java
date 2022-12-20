package Repl;
/*
Reverse the String without using the Reverse method from the StringBuilder Class
input["I am a java Programmer"] output["Programmer java a am I"]
input["Syntax is Great"] output["Great is Syntax"]
 */
public class Repl226 {

    public static void main(String[] args) {


    }
    public static String reverse(String strToRev){
        if(strToRev == null || strToRev.isEmpty()){
            return strToRev;
        }
        String reverse = "";
        for(int i = strToRev.length() -1; i>=0; i--){
            reverse = reverse + strToRev.charAt(i);
        }

        return reverse;
    }

}




