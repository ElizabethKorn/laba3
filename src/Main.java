import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args){
        Timer check = new Timer();
        int start = 6;
        int end = 14;
        LinkedList<Integer> list = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();
        System.out.println("===========================================================");
        for (int n = start; n <= end; n++) {
            check.callsCount = (int) Math.pow(2, n);
            System.out.println("Для количества операций = " + check.callsCount + ":");
            System.out.printf("ArrayList.add() : %d мс\t\t\tLinkedList.add() : %d мс\n",
                    check.timeForMethod(arr, Timer.MethodType.Add), check.timeForMethod(list, Timer.MethodType.Add));
            System.out.printf("ArrayList.get() : %d мс\t\t\tLinkedList.get() : %d мс\n",
                    check.timeForMethod(arr, Timer.MethodType.Get), check.timeForMethod(list, Timer.MethodType.Get));
            System.out.printf("ArrayList.remove() : %d мс\t\tLinkedList.remove() : %d мс\n",
                    check.timeForMethod(arr, Timer.MethodType.Delete), check.timeForMethod(list, Timer.MethodType.Delete));
            System.out.println("===========================================================");
        }
    }
}