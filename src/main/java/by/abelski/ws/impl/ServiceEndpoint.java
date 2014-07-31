package by.abelski.ws.impl;

import by.abelski.ws.api.IExampleService;
import by.abelski.ws.protocol.ServiceRequest;
import by.abelski.ws.protocol.ServiceResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;

import javax.xml.bind.Element;

/**
 * @author abelski
 */
@Endpoint
public class ServiceEndpoint {
    private static final String namespaceUri = "http://www.abelski.by/ws";

    @Autowired
    private IExampleService service;


    @PayloadRoot(localPart = "ServiceRequest", namespace = namespaceUri)
    public ServiceResponse getRequest(@RequestPayload ServiceRequest element) {

        return new ServiceResponse();
    }
}
