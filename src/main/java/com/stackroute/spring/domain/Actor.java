package com.stackroute.spring.domain;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
public class Actor implements BeanNameAware, BeanFactoryAware
{
    private String actorName;
    private String actorGender;
    private int actorAge;

    public Actor() {
    }

    public Actor(String actorName, String actorGender, int actorAge) {
        this.actorName = actorName;
        this.actorGender = actorGender;
        this.actorAge = actorAge;
    }
    public String getActorName()
    {
        return actorName;
    }
    public void setActorName(String actorName)
    {
        this.actorName = actorName;
    }
    public String getActorGender()
    {
        return actorGender;
    }
    public void setActorGender(String actorGender)
    {
        this.actorGender = actorGender;
    }
    public int getActorAge() {
        return actorAge;
    }
    public void setActorAge(int actorAge)
    {
        this.actorAge = actorAge;
    }
    @Override
    public String toString() {
        return "Actor{" +
                "actorName='" + actorName + '\'' +
                ", actorGender='" + actorGender + '\'' +
                ", actorAge=" + actorAge +
                '}';
    }

    public void setBeanName(String s) {
        System.out.println("in BeanNameAware "+s);
    }


    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("In BeanFactoryAware "+beanFactory );
    }
}
