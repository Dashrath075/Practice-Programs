package dash;
import java.util.*;
@FunctionalInterface
public interface NewFuncInterface1 {
         void print(String msg);//abstract method
         static String show(){
        	 return "How are you";       
        	 }
         static int show1() {
        	 return 100;
         }
         default void hello() {
             System.out.println("default");	 
         }
}
