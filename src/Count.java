import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;

public class Count {

    LinkedList<Integer> list = new LinkedList<>();
    LinkedHashSet<Character> list1 = new LinkedHashSet<>();


    public void getCount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values");
        String input = scanner.nextLine();
        char arr[] = input.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = i; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }

            }
            list1.add(arr[i]);
            list.add(count);

        }
        Iterator it = list1.iterator();
        Iterator it1 = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next() + " frequency is " + it1.next());
        }
    }

    public static void main(String[] args) {
        Count c = new Count();
        c.getCount();

    }


}
