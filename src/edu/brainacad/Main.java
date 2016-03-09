package edu.brainacad;

/**
 * Created by Admin on 09.03.2016.
 */
public class Main {
    public static void main(String[] args) {


        String myStr1 = new String("Cartoon");
        String myStr2 = new String("Tomcat");
        char[] arr = myStr1.toCharArray();

        for(char a:arr){

            if(myStr2.indexOf(a)== -1){
                System.out.print(a);
            }
        }

    }

    }
