package com.rakovets.course.java.core.practice.exception_handling;
import java.util.logging.Logger;

public class Demo6 {
    public static final Logger logger = Logger.getLogger(Demo6.class.getName());
    public static void main(String[] args) {
        try {
            new Task6().getCounterProducts(new String[]{"Не подошел размер", "Не подошел цвет", "Брак товара"});
        } catch (SizeNotFitException | СolorNotFitException e) {
            logger.info("Отправить товар повторно");
        } catch (ProductDefectException e) {
            logger.info(e.getMessage());
        }
    }
}
