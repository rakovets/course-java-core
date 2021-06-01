package com.rakovets.course.java.core.practice.reflection;
import java.util.Arrays;

public class ReflectionUtilsDemo {
    public static void main(String[] args) {
        Actor actor = new Actor("Ivan");
        Class<Actor> actorClass = Actor.class;
        System.out.println(ReflectionUtils.getField(actorClass,"name"));
        System.out.println(ReflectionUtils.getMethod(actorClass,"getName"));
        System.out.println(Arrays.toString(ReflectionUtils.getAllMethodsOfClass(actorClass)));
        ReflectionUtils.invokeMethod(ReflectionUtils.getMethod(actorClass,"getName"),actor);
        ReflectionUtils.setField((ReflectionUtils.getField(actorClass,"name")),actor,"Tatsiana");
        System.out.println(actor.toString());
    }
}
