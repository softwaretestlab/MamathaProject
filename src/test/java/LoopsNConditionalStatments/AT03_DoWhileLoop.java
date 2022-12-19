package LoopsNConditionalStatments;

import org.junit.Test;

public class AT03_DoWhileLoop {
    @Test
    public void DoWhileLoopLearn() {
        int TicketNumber = 40;
        do {
            System.out.println("Ticket Number is : " + TicketNumber);
            TicketNumber++;

        } while (TicketNumber <= 45);

    }
}