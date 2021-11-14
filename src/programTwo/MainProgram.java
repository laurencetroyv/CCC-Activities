package programTwo;

public class MainProgram {
    public static void main(String[] args) {
        ProgramTwo q1;
        q1 = new ProgramTwo();
        q1.a = 12;
        q1.b = 12;
        q1.setC(12);
        q1.methodOne(12);
        q1.methodOne(0);
        System.out.println(q1.methodTwo());
        q1.setC(q1.methodTwo());
    }
}