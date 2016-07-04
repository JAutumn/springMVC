package com.springMVC.services;

import com.springMVC.entity.Contact;
import com.springMVC.services.interfaces.ContactService;
import org.junit.Assert;
import org.junit.Ignore;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@Ignore
public class ContactServiceImplTest extends Assert{
    
    @Test
    public void testFindById() {
        ApplicationContext context = new ClassPathXmlApplicationContext("META-INF/beans.xml");
        ContactService contactService = context.getBean("contactService", ContactService.class);
        Contact contact = contactService.findById(13L);
        assertEquals(Long.valueOf(13L), contact.getId());
    }
}
