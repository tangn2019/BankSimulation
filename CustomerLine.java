package BankSimulation;

import java.util.concurrent.*;

public class CustomerLine extends ArrayBlockingQueue<Customer> {
    public CustomerLine(int maxLineSize){
        super(maxLineSize);
    }
    public String toString(){
        if(this.size() == 0)
            return "[Empty]";
        StringBuilder result = new StringBuilder();
        for(Customer customer : this)
            result.append(customer);
        return result.toString();
    }
}
