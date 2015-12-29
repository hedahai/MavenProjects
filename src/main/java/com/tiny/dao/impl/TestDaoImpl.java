package com.tiny.dao.impl;

import com.tiny.dao.TestDao;
import com.tiny.model.TestModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 14-2-3
 * Time: 下午6:51
 * To change this template use File | Settings | File Templates.
 */

@Repository
public class TestDaoImpl implements TestDao{

    @Autowired
    private SessionFactory sessionFactory;

    public SessionFactory getSessionFactory() {
        return sessionFactory;
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    public void save(TestModel t){
         sessionFactory.getCurrentSession().save(t);
    }
}
