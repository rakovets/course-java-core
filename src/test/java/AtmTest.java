import com.rakovets.course.java.core.example.oop.classesandobjects.Atm;

public class AtmTest {
    public static void main(String[] args) {
        Atm atm1 = new Atm(1, 1, 1);

        // Добавляем банкноты
        atm1.addBanknotes100(1);
        atm1.addBanknotes50(2);
        atm1.addBanknotes20(2);

        // Проверка на возможность снятия заданной суммы
        System.out.println(atm1.isPossibleIssue(140));

        // Получение возможных комбинаций
        System.out.println(atm1.getOptionsCombinationBanknotes(140));

        // Выбор комбинации
        atm1.getCash("1*100 0*50 2*20");

        // Проверка на возможность снятия предыдущей суммы
        System.out.println(atm1.isPossibleIssue(140));
    }
}
