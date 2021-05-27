package com.rakovets.course.java.core.practice.xml;

import java.nio.file.Paths;

public class HibernateConfiguratorReaderAndWriterDemo {
    public static void main(String[] args) {
        String fileReadPath = Paths.get("src", "main", "resources", "practice", "xml", "hibernate.cfg.xml").toString();
        String fileWritePath = Paths.get("src", "main", "resources", "practice", "xml", "hibernate_.cfg.xml").toString();
        ConfigurationHibernate configurationHibernate = new ConfigurationHibernate();
        ConfigurationReader.readConfiguration(fileReadPath, configurationHibernate);
        System.out.println(configurationHibernate.getProperties());
        System.out.println(configurationHibernate.getMapping());
        ConfigurationWriter.writeConfig(configurationHibernate, fileWritePath);

    }
}
