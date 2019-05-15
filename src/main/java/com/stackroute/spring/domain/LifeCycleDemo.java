package com.stackroute.spring.domain;

//import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.DisposableBean;

public class LifeCycleDemo implements InitializingBean, DisposableBean
{
    public void customInit()
    {
        System.out.println("Inside custom Init");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("In afterPropertiesSet");
    }

    public void destroy() throws Exception {
        System.out.println("in destroy method");
    }

    public void customDestroy()
    {
        System.out.println("In custom Destroy");
    }
}