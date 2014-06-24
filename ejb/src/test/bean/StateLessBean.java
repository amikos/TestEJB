package test.bean;

import javax.annotation.PostConstruct;
import javax.ejb.Stateless;

/**
 * Created by Zhansar on 24.06.14.
 */
@Stateless(name = "StateLessEJB")
public class StateLessBean {

    private String status = "First";

    public StateLessBean() {
    }
    public void doAction(){
        System.out.println("doAction");
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("PostConstruct StateLessBean");
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
