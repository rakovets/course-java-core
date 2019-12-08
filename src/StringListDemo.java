import java.util.Arrays;
import java.util.LinkedList;

public class StringListDemo {
	public static void main(String[] args) {
		LinkedList<String> list = new LinkedList();
		list.addAll(Arrays.asList("this", "is", "lost", "of", "fun", "for", "every", "Java", "programmer"));
		int length = 4;
		StringList object = new StringList();
		object.markWordsWithLength(list, length);
	}
}
