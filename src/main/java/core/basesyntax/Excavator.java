package core.basesyntax;

public class Excavator extends Machine {
    @Override
    public void doWork() {
        System.out.println("Excavator works now");
    }

    @Override
    public void stopWork() {
        System.out.println("Excavator stops working");
    } 
}
