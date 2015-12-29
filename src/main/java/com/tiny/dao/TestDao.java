package com.tiny.dao;

import com.tiny.model.TestModel;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 14-1-31
 * Time: 下午10:13
 * To change this template use File | Settings | File Templates.
 */


public interface TestDao {

    public void save(TestModel t);

}
