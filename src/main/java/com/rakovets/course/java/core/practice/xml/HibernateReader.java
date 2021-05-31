package com.rakovets.course.java.core.practice.xml;

import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.Attribute;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.*;

public class HibernateReader {
    static LinkedHashMap<String, String> propertyMap = new LinkedHashMap<>();
    static LinkedHashMap<String, String> mappingMap = new LinkedHashMap<>();

    public HibernateConfig readConfig(String pathToFile) {
        HibernateConfig hibernateConfig = new HibernateConfig();

        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileInputStream(pathToFile));
            while (xmlEventReader.hasNext()) {
                XMLEvent xmlEvent = xmlEventReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startElement = xmlEvent.asStartElement();
                    String name = startElement.getName().getLocalPart();
                    switch (name) {
                        case HibernateFields.PROPERTY:
                            String getName = getValueByName(startElement, HibernateFields.NAME);
                            xmlEvent = xmlEventReader.nextEvent();
                            String value = xmlEvent.asCharacters().getData();
                            if (getName != null) {
                                propertyMap.put(getName, value);
                            }
                            break;
                        case HibernateFields.MAPPING:
                            String getValue = getValueByName(startElement, HibernateFields.CLASS);
                            if (getValue != null) {
                                mappingMap.put(getValue, HibernateFields.CLASS);
                            }
                    }
                }
            }
            hibernateConfig.setMapMapping(mappingMap);
            hibernateConfig.setMapProperty(propertyMap);

        } catch (XMLStreamException | FileNotFoundException e) {
            e.printStackTrace();
        }
        return hibernateConfig;
    }

    private static String getValueByName(StartElement startElement, String attributeName) {
        Iterator<Attribute> attributes = startElement.getAttributes();

        while (attributes.hasNext()) {
            Attribute attribute = attributes.next();
            if (attribute.getName().toString().equals(attributeName)) {
                return attribute.getValue();
            }
        }
        return null;
    }
}
