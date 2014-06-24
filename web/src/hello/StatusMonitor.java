package hello;

/**
 * Created by Zhansar on 19.06.14.
 */

import test.bean.StateFulBean;
import test.bean.StateLessBean;

import javax.ejb.EJB;

public class StatusMonitor {
    public StateFulBean getStateFulBean() {
        return stateFulBean;
    }

    public void setStateFulBean(StateFulBean stateFulBean) {
        this.stateFulBean = stateFulBean;
    }

    @EJB
    StateFulBean stateFulBean;

    @EJB
    StateLessBean stateLessBean;

    public void changeStateFulBeanStatus(){
        if (stateFulBean.getStatus().equals("First")){
            stateFulBean.setStatus("Second");
        }else{
            stateFulBean.setStatus("First");
        }
    }

    public StateLessBean getStateLessBean() {
        return stateLessBean;
    }

    public void setStateLessBean(StateLessBean stateLessBean) {
        this.stateLessBean = stateLessBean;
    }

    public void changeStateLessBeanStatus(){
        if (stateLessBean.getStatus().equals("First")){
            stateLessBean.setStatus("Second");
        }else{

            stateLessBean.setStatus("First");
        }
    }

}