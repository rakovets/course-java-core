import com.rakovets.course.java.core.practice.string.StringUtil;

public class StringBuilderSpeedDemo {
    public static void main(String[] args) {
        System.out.println(StringUtil.compareResults("Never forgive! Never forget!", 100));
        System.out.println(StringUtil.compareResults("Never forgive! Never forget!", 2000));
        System.out.println(StringUtil.compareResults("Never forgive! Never forget!", 30000));
        System.out.println(StringUtil.compareResults("Never forgive! Never forget!", 400000));
    }
}
