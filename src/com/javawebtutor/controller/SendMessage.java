package com.javawebtutor.controller;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.javawebtutor.hibernate.util.HibernateUtil;
import com.javawebtutor.model.Inbox;
import com.javawebtutor.model.User;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public class SendMessage {
static int status=0;
//static int d=1;

public boolean register(Inbox inbox){
	 Session session = HibernateUtil.openSession();
	
	 Transaction tx = null;	
	 try {
		 tx = session.getTransaction();
		 tx.begin();
		 session.saveOrUpdate(inbox);		
		 tx.commit();
	 } catch (Exception e) {
		 if (tx != null) {
			 tx.rollback();
		 }
		 e.printStackTrace();
	 } finally {
		 session.close();
	 }	
	 return true;
}


/*public User getUserByUseremail(String ema) {
    Session session = HibernateUtil.openSession();
    Transaction tx = null;
    User user = null;
    try {
        tx = session.getTransaction();
        tx.begin();
        Query query = session.createQuery("from User where userId='"+ema+"'");
        user = (User)query.uniqueResult();
        tx.commit();
    } catch (Exception e) {
        if (tx != null) {
            tx.rollback();
        }
        e.printStackTrace();
    } finally {
        session.close();
    }
    return user;
}

/*public static int sendMsg(String sender,String reciever,String msg ){
	
	//Connection con=GetCon.getCon();
	
	
	 Session session = HibernateUtil.openSession();
	 
	// java.util.Date sqdate=Calendar.getInstance().getTime();
	//java.sql.Date dat =new java.sql.Date(sqdate.getTime());
//
	//DateFormat df = new SimpleDateFormat("dd-MM-yyyy HH:mm:ss");
	//String text = df.format(dat);
	
	
	 
	 
	
	System.out.println(text);
	
	System.out.println(sender);
	
	System.out.println(reciever);
	System.out.println(msg);
	System.out.println(sender);
	 Transaction tx = null;	
	    Integer stId = null;
	    int xyz=0;
	
	 try{
		 tx = session.getTransaction();
		 tx.begin();
		 Inbox inbox =new Inbox();
		 
		// Query query = session.createQuery("from User where userId='"+user.getUserId()+"'");
		 //User u = (User)query.uniqueResult();
		 
		 
		 inbox.setReciever(reciever);
		 inbox.setMsg(msg);
		 inbox.setDat(text);
		 inbox.setSender(sender);
		 inbox.setId(inbox.getId());
		 stId = (Integer) session.save(inbox);
	 xyz=stId.intValue();
		 
		 tx.commit();
		 System.out.println("hello commited");
		
	 }catch(Exception ex){
		 if(tx!=null){
			 tx.rollback();
		 }
	 }finally{
		 session.close();
		
	 }
	 return xyz;
	

}*/
}

