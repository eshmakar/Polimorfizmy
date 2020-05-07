public class Polimorfizmy {
    public static void main(String[] args) {
        Employee e = new Teacher();
        Employee e1 = new Driver();

        help_able h = new Teacher();

        Employee[] array = {e, e1};
        for (Employee ee : array) {
            ee.work();
            ee.help();
        }
    }
}


abstract class Employee implements help_able {
    abstract void work();
}

class Teacher extends Employee {
    @Override
    void work() {
        System.out.println("The teacher is work");
    }

    @Override
    public void help() {
        System.out.println("Teacher helps");
    }
}

class Driver extends Employee {
    @Override
    void work() {
        System.out.println("The driver is work");
    }

    @Override
    public void help() {
        System.out.println("Driver helps");
    }
}

interface help_able {
    void help();
}