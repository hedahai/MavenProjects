package com.tiny.service.impl;

import com.tiny.dao.TestDao;
import com.tiny.model.TestModel;
import com.tiny.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: Tiny
 * Date: 14-2-1
 * Time: 下午8:54
 * To change this template use File | Settings | File Templates.
 */

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    TestDao dao;

    public TestDao getDao() {
        return dao;
    }

    public void setDao(TestDao dao) {
        this.dao = dao;
    }

    public void save(TestModel model){
        dao.save(model);
    }

}
