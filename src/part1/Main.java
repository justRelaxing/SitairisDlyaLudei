package part1;

public class Main {

    public interface BasicFunctionality {
        int add(int a, int b);
    }

    public interface ExtendedArithmetic extends BasicFunctionality {
        int subtract(int a, int b);
    }

    public interface StringManipulation extends BasicFunctionality {
        String concatenate(String a);
    }

    public interface StringOutput extends BasicFunctionality {
        void print(String s1);
    }

    public interface AdvancedArithmetic extends BasicFunctionality {
        int multiply(int a, int b);
    }

    public class ArithmeticOperations implements ExtendedArithmetic {
        @Override
        public int subtract(int a, int b) {
            return a - b;
        }

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }

    abstract class AbstractExtendedArithmetic implements ExtendedArithmetic {
        abstract int mod(int a, int b);
    }

    interface FullOperations extends ExtendedArithmetic, StringManipulation {
        int divide(int a, int b);
    }

    abstract class AbstractStringManipulation implements StringManipulation {
        abstract int stringLength(String s);
    }

    interface StringAndArithmetic extends StringManipulation, StringOutput, AdvancedArithmetic {
        int power(int a, int b);
    }

    abstract class AbstractOutputAndArithmetic implements StringOutput, AdvancedArithmetic {
        abstract int divide(int a, int b);
    }

    public class ConcreteExtendedArithmetic extends AbstractExtendedArithmetic {
        @Override
        int mod(int a, int b) {
            return a % b;
        }

        @Override
        public int subtract(int a, int b) {
            return a - b;
        }

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }

    public class AnotherExtendedArithmetic extends AbstractExtendedArithmetic {
        @Override
        int mod(int a, int b) {
            return a % b;
        }

        @Override
        public int subtract(int a, int b) {
            return a - b;
        }

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }

    public class FullStringAndArithmetic extends AbstractOutputAndArithmetic implements StringAndArithmetic {
        @Override
        int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        }

        @Override
        public int power(int a, int b) {
            return (int) Math.pow(a, b);
        }

        @Override
        public int multiply(int a, int b) {
            return a * b;
        }

        @Override
        public String concatenate(String a) {
            return a + a;
        }

        @Override
        public void print(String s1) {
            System.out.println(s1);
        }

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }

    public class FullOperationsImplementation extends AbstractStringManipulation implements FullOperations, StringAndArithmetic {
        @Override
        int stringLength(String s) {
            return s.length();
        }

        @Override
        public int multiply(int a, int b) {
            return a * b;
        }

        @Override
        public int divide(int a, int b) {
            if (b == 0) {
                throw new ArithmeticException("Division by zero");
            }
            return a / b;
        }

        @Override
        public int subtract(int a, int b) {
            return a - b;
        }

        @Override
        public int power(int a, int b) {
            return (int) Math.pow(a, b);
        }

        @Override
        public String concatenate(String a) {
            return a + a;
        }

        @Override
        public void print(String s1) {
            System.out.println(s1);
        }

        @Override
        public int add(int a, int b) {
            return a + b;
        }
    }

    public static void main(String[] args) {
        Main main = new Main();

        FullStringAndArithmetic stringAndArithmetic = main.new FullStringAndArithmetic();
        stringAndArithmetic.print("\nTesting FullStringAndArithmetic!");
        System.out.println("3 + 4 = " + stringAndArithmetic.add(3, 4));
        System.out.println("2 ^ 3 = " + stringAndArithmetic.power(2, 3));
        System.out.println("Concatenate 'Hi' = " + stringAndArithmetic.concatenate("Hi"));

        FullOperationsImplementation fullOps = main.new FullOperationsImplementation();
        fullOps.print("\nTesting FullOperationsImplementation!");
        System.out.println("5 - 2 = " + fullOps.subtract(5, 2));
        System.out.println("10 / 2 = " + fullOps.divide(10, 2));
        System.out.println("Length of 'Test' = " + fullOps.stringLength("Test"));
    }
}
