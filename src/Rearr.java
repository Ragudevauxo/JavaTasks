
import java.util.LinkedList;

public class Rearr {
    LinkedList<Character> arr = new LinkedList<>();
    String s = "aab";
    char c[] = s.toCharArray();
    LinkedList<Character> main = new LinkedList<>();

    public void val() {
        for (int i = 1; i < c.length; i++) {
            arr.add(c[i]);
        }
    }

    public String get() {
        main.add(c[0]);
        for (int i = 1; i < s.length(); i++) {

            for (int j = 0; j < arr.size(); j++) {

                if (main.getLast() != arr.get(j)) {

                    main.add(arr.get(j));
                    arr.remove(j);
                }
            }
        }
        System.out.println(main);
        if (main.size() == c.length) {
            return "possible";
        }

        return "not possible";

    }

    public static void main(String[] args) {
        Rearr r = new Rearr();
        r.val();
        System.out.println(r.get());

    }
}

