package test.service;

/**
 * Created by Zhansar on 24.06.14.
 */
import javax.ejb.Remote;

@Remote
public interface StateFulServiceRemote {

    public void doAction();

}
