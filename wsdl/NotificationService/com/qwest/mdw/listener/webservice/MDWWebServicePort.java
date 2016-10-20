package com.qwest.mdw.listener.webservice;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService(name="MDWWebServicePort", targetNamespace="http://mdw.qwest.com/listener/webservice")
@SOAPBinding(style= Style.RPC)
public abstract interface MDWWebServicePort
{
  @WebMethod
  @WebResult(name="Response", partName="Response")
  public abstract String invokeWebService(@WebParam(name = "ServiceName", partName = "ServiceName") String paramString1, @WebParam(name = "RequestDetails", partName = "RequestDetails") String paramString2);
}
