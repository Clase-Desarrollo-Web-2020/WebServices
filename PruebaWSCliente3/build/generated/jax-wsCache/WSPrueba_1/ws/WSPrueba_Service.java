
package ws;

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
 * JAX-WS RI 2.2.6-1b01 
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "WSPrueba", targetNamespace = "http://ws/", wsdlLocation = "http://desktop-v9egkm5:8080/PruebaWSAp3/WSPrueba?wsdl")
public class WSPrueba_Service
    extends Service
{

    private final static URL WSPRUEBA_WSDL_LOCATION;
    private final static WebServiceException WSPRUEBA_EXCEPTION;
    private final static QName WSPRUEBA_QNAME = new QName("http://ws/", "WSPrueba");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://desktop-v9egkm5:8080/PruebaWSAp3/WSPrueba?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        WSPRUEBA_WSDL_LOCATION = url;
        WSPRUEBA_EXCEPTION = e;
    }

    public WSPrueba_Service() {
        super(__getWsdlLocation(), WSPRUEBA_QNAME);
    }

    public WSPrueba_Service(WebServiceFeature... features) {
        super(__getWsdlLocation(), WSPRUEBA_QNAME, features);
    }

    public WSPrueba_Service(URL wsdlLocation) {
        super(wsdlLocation, WSPRUEBA_QNAME);
    }

    public WSPrueba_Service(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, WSPRUEBA_QNAME, features);
    }

    public WSPrueba_Service(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public WSPrueba_Service(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns WSPrueba
     */
    @WebEndpoint(name = "WSPruebaPort")
    public WSPrueba getWSPruebaPort() {
        return super.getPort(new QName("http://ws/", "WSPruebaPort"), WSPrueba.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns WSPrueba
     */
    @WebEndpoint(name = "WSPruebaPort")
    public WSPrueba getWSPruebaPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws/", "WSPruebaPort"), WSPrueba.class, features);
    }

    private static URL __getWsdlLocation() {
        if (WSPRUEBA_EXCEPTION!= null) {
            throw WSPRUEBA_EXCEPTION;
        }
        return WSPRUEBA_WSDL_LOCATION;
    }

}
