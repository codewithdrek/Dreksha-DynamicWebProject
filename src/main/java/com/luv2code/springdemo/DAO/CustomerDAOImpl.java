package com.luv2code.springdemo.DAO;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.luv2code.springdemo.entity.Customer;

@Repository
public class CustomerDAOImpl implements CustomerDAO {

	@Autowired
	SessionFactory sessionFactory; // sessionFactory must be same in .xml file

	@Override
	//@Transactional  annotation shifted to ServiceImpl
	public List<Customer> getCustomers() {

		// get Current hibernate session
         Session currentSession = sessionFactory.getCurrentSession();

         // create Query
         Query<Customer> theQuery =  currentSession.createQuery("from Customer",Customer.class);
         
         // execute query and return result list
          List<Customer> customersList = theQuery.getResultList();
         
		// return result
		return customersList;
	}

}
