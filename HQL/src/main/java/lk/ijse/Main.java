package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;
import org.hibernate.query.Query;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Session session = FactoryConfiguration.getInstance().getSession();
        Transaction transaction = session.beginTransaction();

     /*   //insert
        Query query1=session.createQuery("insert into Customer(cid,name) values (?1,?2)");
        query1.setParameter(1,2);
        query1.setParameter(2,"wanidu");
        query1.executeUpdate();*/


      //update
      /*  Query query=session.createQuery("update Customer set name=?1 where cid=?2");
        query.setParameter(1,"supuni");
        query.setParameter(2,1);
        query.executeUpdate();*/

        //delete
      /*  Query query=session.createQuery("delete Customer where cid=?1");
        query.setParameter(1,1);
        query.executeUpdate();*/

    /* Query query=session.createQuery("from Customer");
     List<Customer> customers=query.list();
     for (Customer customer:customers){
         System.out.println(customer);
     }*/


      /*  Query query=session.createQuery("select cid,name from Customer where cid=?1");
        query.setParameter(1,1);
        List<Object[]> customers=query.getResultList();
        for(Object[] customer:customers){
            System.out.println(customer[0]);
            System.out.println(customer[1]);
        }*/


       /* Query query=session.createQuery("select cid,name from Customer");
       List<Object[]> customers= query.getResultList();
      for(Object[] customer:customers){
          System.out.println(customer[0]+","+customer[1]);
      }*/

/*
        Query query=session.createQuery("select a.aid,c.name from Address a inner join Customer c on a.aid = c.cid");
          List<Object[]> collector=query.list();
          for (Object[] objects:collector){
              System.out.println(objects[0]+","+objects[1]);
          }

*/

        transaction.commit();
        session.close();
    }
}
