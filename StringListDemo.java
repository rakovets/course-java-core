package StringList;

import java.util.ArrayList;
import java.util.List;

public class StringListDemo {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        StringList stringList = new StringList();
        int i = 0;
        list.add("Hi");
        list.add("my");
        list.add("name");
        list.add("is");
        list.add("Java");

        for (String str : list) {
            System.out.println('"' + list.get(i) + '"');
            i++;
        }
        i = 0;
        System.out.println();

        stringList.markWordsWithLength(list, 4);

        for (String str : list) {
            System.out.println('"' + list.get(i) + '"');
            i++;
        }
        i = 0;
        System.out.println();

        stringList.removeWordsWithLength(list, 1);

        for (String str : list) {
            System.out.println('"' + list.get(i) + '"');
            i++;
        }
    }
}