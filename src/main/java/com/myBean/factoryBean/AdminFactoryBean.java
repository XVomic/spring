package com.myBean.factoryBean;

import com.myBean.factoryBean.entity.Admin;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component
public class AdminFactoryBean implements FactoryBean<Admin> {
    Admin admin;

    @Override
    public Admin getObject() throws Exception {
        return new Admin("admin","123456");
    }

    @Override
    public Class<?> getObjectType() {
        return Admin.class;
    }
}
