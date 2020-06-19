

public class Comp2List {
    String name;
    Comp2List next;

    Comp2List(String name_) {
        name = name_;
    }

    public static void main(String[] args) {
        Comp2List cl_1 = new Comp2List("Alice");
        Comp2List cl_2 = new Comp2List("Bob");
        Comp2List cl_3 = new Comp2List("Claire");
        Comp2List cl_4 = new Comp2List("Don");
        Comp2List cl_5 = new Comp2List("Ellen");

        cl_3.next = cl_1;
        cl_1.next = cl_4;
        printAll(cl_3);
        cl_1.next = null;
        
        System.out.println("--------");
        
        // build a chain of objects: Alice -> Bob -> Claire -> Don -> Ellen
        cl_1.next = cl_2;
        cl_2.next = cl_3;
        cl_3.next = cl_4;
        cl_4.next = cl_5;
        printAll(cl_1);
        cl_1.next = null;
        System.out.println("--------");

        cl_1.next = null;
        printAll(cl_1);
        System.out.println("--------");

        // build a chain of objects: Ellen -> Don -> Claire -> Bob -> Alice
        cl_5.next = cl_4;
        cl_4.next = cl_3;
        cl_3.next = cl_2;
        cl_2.next = cl_1;
        printAll(cl_5);
        cl_1.next = null;
        System.out.println("--------");
    }

    static void printAll(Comp2List compObject) {
        System.out.println("list of objects: ");
        while ( compObject.next != null) {
            System.out.print(compObject.name + ", ");
            compObject = compObject.next;
        }
        System.out.print(compObject.name);
        System.out.println();
    }
}
