package com.rakovets.course.java.core.practice.jcf_set;

import com.rakovets.course.java.core.practice.jcf_set.controller.FineController;
import com.rakovets.course.java.core.practice.jcf_set.controller.UserController;

public class Demo {
    private static final UserController userController = new UserController();
    private static FineController fineController = new FineController();
    private static User user = new User("Toha", "GoodBoy", Region.MOGILEV);
    private static User user1 = new User("Patrick", "Beitman", Region.MINSK);
    private static Fine fine1 = new Fine(user, Region.MINSK, FineType.TRAFFIC_POLICE_FINES);
    private static Fine fine2 = new Fine(user, Region.MOGILEV, FineType.CORONAVIRUS_PENALTY);
    private static Fine fine3 = new Fine(user, Region.GRODNO, FineType.PENALTY_FOR_VIOLATION_OF_SILENCE);
    private static Fine fine4 = new Fine(user1, Region.MINSK, FineType.TRAFFIC_POLICE_FINES);

    public static void main(String[] args) {
        boolean result = userController.add(user);
        userController.add(user1);
        System.out.println(result);

        boolean addFine = fineController.add(fine1);
        fineController.add(fine2);
        fineController.add(fine3);
        fineController.add(fine4);
        System.out.println(addFine);

        System.out.println(fineController.listAllFines());
        System.out.println(fineController.listFinesByUserId(1));
    }


}
