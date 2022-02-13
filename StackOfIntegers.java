import java.io.*;
import java.util.*;

public class StackOfIntegers {
    private int[] elements;
    private int size;


    public StackOfIntegers()
    {
        elements = new int[16];
    }

    public StackOfIntegers(int Capacity){
        elements = new int[Capacity]; 
        
    }

    public boolean empty(){
        if(size <= 0){
            return true;
        }
        else{
            return false;
        }
        

    }
    public int peek(){
        return elements[size - 1];

    }


    public void push(int value)
    {
        size ++;
        elements[size -1] = value;

    }

    public int pop(){
        int i = elements[size -1];
        size --;
        return i;
        
    }
    public int getSize(){
        return size;

    }

    

}




