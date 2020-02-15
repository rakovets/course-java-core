package StringList;

import java.util.List;

public class StringList {

    public void markWordsWithLength(List<String> list, int length) {
        for (int i = 0; list.size() > i; i++) {
            if (list.get(i).length() == length) {
                list.add(i, "*");
                i++;
            }
        }
    }

    public void removeWordsWithLength(List<String> list, int length) {
        for (int i = 0; list.size() > i; i++) {
            if (list.get(i).length() == length) {
                list.remove(i);
                i--;
            }
        }
    }
}