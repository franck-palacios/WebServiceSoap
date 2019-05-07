
package sv.com.fpalacio.soap.service;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "ClienteServiceImplService", targetNamespace = "http://service.soap.fpalacio.com.sv/", wsdlLocation = "http://localhost:2424/webService/clientes?wsdl")
public class ClienteServiceImplService
    extends Service
{

    private final static URL CLIENTESERVICEIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CLIENTESERVICEIMPLSERVICE_EXCEPTION;
    private final static QName CLIENTESERVICEIMPLSERVICE_QNAME = new QName("http://service.soap.fpalacio.com.sv/", "ClienteServiceImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:2424/webService/clientes?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CLIENTESERVICEIMPLSERVICE_WSDL_LOCATION = url;
        CLIENTESERVICEIMPLSERVICE_EXCEPTION = e;
    }

    public ClienteServiceImplService() {
        super(__getWsdlLocation(), CLIENTESERVICEIMPLSERVICE_QNAME);
    }

    public ClienteServiceImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CLIENTESERVICEIMPLSERVICE_QNAME, features);
    }

    public ClienteServiceImplService(URL wsdlLocation) {
        super(wsdlLocation, CLIENTESERVICEIMPLSERVICE_QNAME);
    }

    public ClienteServiceImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CLIENTESERVICEIMPLSERVICE_QNAME, features);
    }

    public ClienteServiceImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public ClienteServiceImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns ClienteService
     */
    @WebEndpoint(name = "ClienteServiceImplPort")
    public ClienteService getClienteServiceImplPort() {
        return super.getPort(new QName("http://service.soap.fpalacio.com.sv/", "ClienteServiceImplPort"), ClienteService.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns ClienteService
     */
    @WebEndpoint(name = "ClienteServiceImplPort")
    public ClienteService getClienteServiceImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://service.soap.fpalacio.com.sv/", "ClienteServiceImplPort"), ClienteService.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CLIENTESERVICEIMPLSERVICE_EXCEPTION!= null) {
            throw CLIENTESERVICEIMPLSERVICE_EXCEPTION;
        }
        return CLIENTESERVICEIMPLSERVICE_WSDL_LOCATION;
    }

}
