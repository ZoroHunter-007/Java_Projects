package com.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class Session_Class {
    private static SessionFactory sessionFactory;

    static {
        try {
            // Build the registry
            StandardServiceRegistry registry = new StandardServiceRegistryBuilder()
                    .configure("hibernate.cfg.xml") // default config
                    .build();

            // Build metadata
            Metadata metadata = new MetadataSources(registry).getMetadataBuilder().build();

            // Build session factory
            sessionFactory = metadata.getSessionFactoryBuilder().build();

        } catch (Exception e) {
            e.printStackTrace();
            throw new ExceptionInInitializerError("SessionFactory creation failed");
        }
    }

    public static Session getSession() {
        return sessionFactory.openSession();
    }
}
