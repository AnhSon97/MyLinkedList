import java.util.LinkedList;
class Linked {
    public static void main(String[] args) {
        LinkedList MyLinked = new LinkedList();

        LinkedListTest Car1 = new LinkedListTest(30000000, "SUV", 200);
        LinkedListTest Car2 = new LinkedListTest(1000000, "VAN", 100);
        LinkedListTest Car3 = new LinkedListTest(2500000, "PICKUP", 200);
        LinkedListTest Car4 = new LinkedListTest(9000000, "RACE", 400);
        LinkedListTest Car5 = new LinkedListTest(2000000, "TRUCK", 200);

        MyLinked.add(0,Car1);
        MyLinked.addFirst(Car2);
        MyLinked.addLast(Car3);
        MyLinked.remove(0);
        MyLinked.remove(Car3);
        MyLinked.forEach((n) -> System.out.println(n));
        MyLinked.get(0);



    }
}
