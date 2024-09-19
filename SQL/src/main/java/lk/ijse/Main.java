package lk.ijse;

import lk.ijse.config.FactoryConfiguration;
import lk.ijse.entity.Customer;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

import java.util.Arrays;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

Session session=FactoryConfiguration.getInstance().getSession();
 Transaction transaction=session.beginTransaction();
 //insert
/*  NativeQuery query1=session.createNativeQuery("insert into customer values(?1,?2)");
  query1.setParameter(1,1);
  query1.setParameter(2,"kamal");
  query1.executeUpdate();*/

      /*  NativeQuery query1=session.createNativeQuery("insert into customer values(?1,?2)");
        query1.setParameter(1,2);
        query1.setParameter(2,"piyal");
        query1.executeUpdate();*/


     //update
       /* NativeQuery query2=session.createNativeQuery("update customer set name =?1 where cid =?2");
        query2.setParameter(1,"Sayuri");
        query2.setParameter(2,1);
        query2.executeUpdate();*/
/*

       //delete
        NativeQuery query3=session.createNativeQuery("delete from customer where cid=?1");
        query3.setParameter(1,1);
        query3.executeUpdate();
*/

        //select
       /* NativeQuery query4=session.createNativeQuery("select * from customer");
                   List<Object[]> customers=     query4.list();
                   for(Object[] customer:customers){
                       System.out.println(customer[0]+":"+customer[1]);
                   }*/


        //search by name

  /*NativeQuery query=session.createNativeQuery("select * from customer where name=?1");
    query.addEntity(Customer.class);
        query.setParameter(1,"kamal");
    Customer customer= (Customer) query.uniqueResult();
        System.out.println(customer);*/


  transaction.commit();
  session.close();
    }
}
