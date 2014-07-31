package by.abelski.ws.api;

import java.util.Calendar;

/**
 * @author abelski
 */
public interface IExampleService {
    public String getHello(String name) throws Exception;
    public Calendar getCurrentTime();
}
