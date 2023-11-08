package Java8;

import java.util.function.Predicate;

public class PredicateFunctional {
    public static void main(String[] args) {  
        Predicate<Integer> pr = a -> (a > 18); // Creating predicate  
        System.out.println(pr.test(10));    // Calling Predicate method    
    }  
} 


/* DEFINITION : It is a functional interface which represents a 
predicate (boolean-valued function) of one argument. It is defined 
in the java.util.function package and contains test() a functional method*/
