package module_12.task_1;

import java.util.function.BinaryOperator;

public class ParallelCalculator implements Runnable {
    private BinaryOperator<Integer> bo;
    private int operand1;
    private int operand2;
    public int result;

    public ParallelCalculator(BinaryOperator<Integer> bo, int operand1, int operand2) {
        this.bo = bo;
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    @Override
    public void run() {
        this.result = bo.apply(operand1, operand2);
    }
}

/*
Create ParallelCalculator class that will be able to execute an operation in parallel thread.
Use the implementation of Runnable interface for this.
Constructor of ParallelCalculator should take 3 parameters:
        The BinaryOperator<Integer> to define an operation that will be executed,
        The operand1 of type int and operand2 of type int.
The ParallelCalculator class should have not  private result field of type int where the result of the operation
will be written when it's executed.
*/