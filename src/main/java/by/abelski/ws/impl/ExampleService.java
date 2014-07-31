package by.abelski.ws.impl;

import by.abelski.ws.api.IExampleService;
import org.springframework.stereotype.Service;

import java.util.Calendar;

/**
 * @author abelski
 */
@Service
public class ExampleService implements IExampleService {
    public String getHello(String name) throws Exception {
        return "Hello, " + name + "!";
    }
    public Calendar getCurrentTime() {
        return Calendar.getInstance();
    }
}
