package com.devglan.dao.impl;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.devglan.dao.UserDao;
import com.devglan.model.UserDetails;

import javax.persistence.EntityManagerFactory;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private EntityManagerFactory entityManagerFactory;

	public List getUserDetails() {
		Session session = entityManagerFactory.unwrap(SessionFactory.class).openSession();

		return session.createCriteria(UserDetails.class).list();

	}

}
