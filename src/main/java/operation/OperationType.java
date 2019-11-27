package operation;

public class OperationType {

    private String operation;
    private int a;
    private int b;
    private int c;

    public OperationType(String operation, int a, int b) {
        this.operation = operation;
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }
}
