package SchoolTaskFiles;

import java.util.List;

public class SchoolUtil {
    public static Student getBestStudent(List<Student> list) {
        int averageMark = 0;
        int j = 0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getAverageAnnualMark() > averageMark) {
                averageMark = list.get(i).getAverageAnnualMark();
                j = i;
            }
        }
        return list.get(j);
    }
}