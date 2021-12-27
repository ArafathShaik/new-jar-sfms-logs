// 
// Decompiled by Procyon v0.5.36
// 
package org.wtt.docker.listener;

import java.io.IOException;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertiesUtility
{
    public static Properties properties;
    
    public static Properties loadProperties(final String path) {
        Properties properties = new Properties();
        try (FileInputStream st = new FileInputStream(path)) {
            properties.load(st);
            setProperies(properties);
        }
        catch (Exception e) {
            e.printStackTrace();
        }
        return properties;
    }
    
    public static Properties getProperies() {
        return PropertiesUtility.properties;
    }
    
    public static void setProperies( Properties properies) {
        PropertiesUtility.properties = properies;
    }
    
    public static Properties loadApplicationProperties() throws IOException {
        Properties properties = new Properties();
        properties.load(ClassLoader.getSystemResourceAsStream("src/test/resources/application.properties"));
        setProperies(properties);
        System.out.println("Inside the PropertiesUtility Class Logs");
        System.out.println("Elastic search Path: "+PropertiesUtility.properties.getProperty("es.path"));
        System.out.println("ES INDEX: "+PropertiesUtility.properties.getProperty("es.index"));
        System.out.println("Application URL: "+PropertiesUtility.properties.getProperty("application.url"));
        System.out.println("FilePATH:"+System.getProperty("user.dir") + "/" + "src/test/resources/RBIH0000000.pfx");
        System.out.println("FilePATH:"+System.getProperty("user.dir") + "/" + "src/test/resources/RBIH0000000.pfx");
        return properties;
    }
}
