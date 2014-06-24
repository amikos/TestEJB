package test.bean;

import test.service.StateFulServiceLocal;
import test.service.StateFulServiceRemote;

import javax.annotation.PostConstruct;
import javax.ejb.Stateful;

/**
 * Created by Zhansar on 24.06.14.
 */
@Stateful(name = "StateFulEJB")
public class StateFulBean {

    private String status = "First";

    public StateFulBean() {
    }
    public void doAction(){
        System.out.println("doAction");
    }

    @PostConstruct
    public void PostConstruct() {
        System.out.println("PostConstruct StateFulBean");
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }

}
