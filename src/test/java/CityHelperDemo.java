import com.rakovets.course.java.core.practice.lambda_expressions.CityHelper;

import java.util.ArrayList;

public class CityHelperDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList();
        arrayList.add("City1");
        arrayList.add("City2");
        arrayList.add("NotACity");
        CityHelper.cities = arrayList;
        System.out.println(CityHelper.longerThen(5).toString());

    }
}
