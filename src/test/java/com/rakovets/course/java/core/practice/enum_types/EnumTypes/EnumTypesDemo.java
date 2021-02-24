package com.rakovets.course.java.core.practice.enum_types.EnumTypes;

class EnumTypesDemo {
    public static void main(String[] args) {

        EnumTypes enumTypes = new EnumTypes();
        System.out.print("My favourite season is ");
        enumTypes.getFavoriteSeason();
        System.out.println("Description: ");
        enumTypes.favorite();
        enumTypes.getDescription(Season.SUMMER);
        System.out.println("All seasons:");
        enumTypes.display();
    }
}
