package school.mjc.stage0.conditions.finalTask;

public class IntegerDivider {
    public static void main(String[] args) {
        IntegerDivider integerDivider=new IntegerDivider();
        integerDivider.printCompletelyDivided(10,5);
    }
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider < dividend){
            System.out.println("can be divided completely");
        }else {
            System.out.println("cannot be divided completely");
        }
    }
}
