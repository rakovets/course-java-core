package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;
import java.util.LinkedHashMap;
import java.util.Map;

    public class HibernateDemo {
        public static void main(String[] args) {
            HibernateReader hibernateReader = new HibernateReader();
            HibernateConfig hibernateConfig = hibernateReader
                    .readConfig(Paths
                            .get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml")
                            .toString());
            LinkedHashMap<String, String> propertyMap = hibernateConfig.getMapProperty();
            LinkedHashMap<String, String> mappingMap = hibernateConfig.getMapMapping();

            for (Map.Entry<String, String> property : propertyMap.entrySet()) {
                System.out.println("Key = " + property.getKey() + "\tValue = " + property.getValue());
            }
            for (Map.Entry<String, String> map : mappingMap.entrySet()) {
                System.out.println("Key = " + map.getKey() + "\tValue = " + map.getValue());
            }

            HibernateConfig newHibernateConfig = new HibernateConfig(propertyMap, mappingMap);
            HibernateWriter hibernateWriter = new HibernateWriter();
            hibernateWriter.createFile(Paths
                    .get("src", "main", "resources", "practice", "xml", "new-hibernate.cfg.xml")
                            .toString(), newHibernateConfig);
        }
}
