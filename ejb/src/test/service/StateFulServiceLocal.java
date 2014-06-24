package test.service;

/**
 * Created by Zhansar on 24.06.14.
 */
import javax.ejb.Local;

@Local
public interface StateFulServiceLocal {

    public void doAction();

}
