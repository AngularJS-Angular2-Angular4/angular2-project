package com.qwest.mdw.listener.webservice;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;

@WebServiceClient(name="MDWWebService", targetNamespace="http://mdw.qwest.com/listener/webservice", wsdlLocation="file:/Users/sidhug/Documents/Real-WSDLsenc/Notification.xml")
public class MDWWebService
  extends Service
{
  private static final URL MDWWEBSERVICE_WSDL_LOCATION;
  private static final WebServiceException MDWWEBSERVICE_EXCEPTION;
  private static final QName MDWWEBSERVICE_QNAME = new QName("http://mdw.qwest.com/listener/webservice", "MDWWebService");
  
  static
  {
    URL localURL = null;
    WebServiceException localWebServiceException = null;
    try
    {
      localURL = new URL("file:/Users/sidhug/Documents/Real-WSDLsenc/Notification.xml");
    }
    catch (MalformedURLException localMalformedURLException)
    {
      localWebServiceException = new WebServiceException(localMalformedURLException);
    }
    MDWWEBSERVICE_WSDL_LOCATION = localURL;
    MDWWEBSERVICE_EXCEPTION = localWebServiceException;
  }
  
  public MDWWebService()
  {
    super(__getWsdlLocation(), MDWWEBSERVICE_QNAME);
  }
  
  public MDWWebService(WebServiceFeature... paramVarArgs)
  {
    super(__getWsdlLocation(), MDWWEBSERVICE_QNAME, paramVarArgs);
  }
  
  public MDWWebService(URL paramURL)
  {
    super(paramURL, MDWWEBSERVICE_QNAME);
  }
  
  public MDWWebService(URL paramURL, WebServiceFeature... paramVarArgs)
  {
    super(paramURL, MDWWEBSERVICE_QNAME, paramVarArgs);
  }
  
  public MDWWebService(URL paramURL, QName paramQName)
  {
    super(paramURL, paramQName);
  }
  
  public MDWWebService(URL paramURL, QName paramQName, WebServiceFeature... paramVarArgs)
  {
    super(paramURL, paramQName, paramVarArgs);
  }
  
  @WebEndpoint(name="MDWWebServicePort")
  public MDWWebServicePort getMDWWebServicePort()
  {
    return (MDWWebServicePort)super.getPort(new QName("http://mdw.qwest.com/listener/webservice", "MDWWebServicePort"), MDWWebServicePort.class);
  }
  
  @WebEndpoint(name="MDWWebServicePort")
  public MDWWebServicePort getMDWWebServicePort(WebServiceFeature... paramVarArgs)
  {
    return (MDWWebServicePort)super.getPort(new QName("http://mdw.qwest.com/listener/webservice", "MDWWebServicePort"), MDWWebServicePort.class, paramVarArgs);
  }
  
  private static URL __getWsdlLocation()
  {
    if (MDWWEBSERVICE_EXCEPTION != null) {
      throw MDWWEBSERVICE_EXCEPTION;
    }
    return MDWWEBSERVICE_WSDL_LOCATION;
  }
}
