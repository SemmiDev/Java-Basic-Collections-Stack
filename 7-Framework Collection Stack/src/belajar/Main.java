package belajar;

import java.util.Iterator;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {
        Stack<String> data = new Stack<>();
        // stack dengan konsep. yg terakhir di input, akan jadi yg pertama ketika di show dan ketika kita remove, data yg terakhir akan duluan terimove
        data.add("Sam");
        data.push("Dev");
        data.push("Mr.Sam Clay");

        Iterator show = data.iterator();
        while (show.hasNext()){
            System.out.println(show.next());
        }

        // hapus data
        data.pop();
    }
}
