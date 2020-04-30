package com.javawebtutor.service;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javawebtutor.hibernate.util.HibernateUtil;
import com.javawebtutor.model.Inbox;
import com.javawebtutor.model.User;

public class InboxService {
	
	 public List<Inbox> getListOfUsers(){
	        List<Inbox> list = new ArrayList<Inbox>();
	        Session session = HibernateUtil.openSession();
	        Transaction tx = null;        
	        try {
	            tx = session.getTransaction();
	            tx.begin();
	            list = session.createQuery("from inbox").list();                        
	            tx.commit();
	            System.out.println();
	        } catch (Exception e) {
	            if (tx != null) {
	                tx.rollback();
	            }
	            e.printStackTrace();
	        } finally {
	            session.close();
	        }
	        return list;
	    }

}
