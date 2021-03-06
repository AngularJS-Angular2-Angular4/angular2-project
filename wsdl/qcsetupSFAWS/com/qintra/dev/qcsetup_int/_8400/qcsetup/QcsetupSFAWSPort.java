
package com.qintra.dev.qcsetup_int._8400.qcsetup;

import java.com_qwest_qcsetup.Address;
import java.com_qwest_qcsetup.TN;
import java.com_qwest_qcsetup_webservice_csuporder.ArrayOfBillingAccount;
import java.com_qwest_qcsetup_webservice_csuporder.ArrayOfResponseMessage;
import java.com_qwest_qcsetup_webservice_csuporder.ContractInformation;
import java.com_qwest_qcsetup_webservice_csuporder.SalesInformation;
import java.language_builtins.ArrayOfString;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.ws.Holder;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebService(name = "qcsetupSFAWSPort", targetNamespace = "http://qcsetup-int.dev.qintra.com:8400/qcsetup")
@XmlSeeAlso({
    com.qintra.dev.qcsetup_int._8400.qcsetup.ObjectFactory.class,
    java.com_qwest_qcsetup.ObjectFactory.class,
    java.com_qwest_qcsetup_webservice_csuporder.ObjectFactory.class,
    java.language_builtins.ObjectFactory.class
})
public interface QcsetupSFAWSPort {


    /**
     * 
     * @param customerAccountEstablishDate
     * @param customerHubId
     * @param contractInfo
     * @param orderId
     * @param description
     * @param billingAccounts
     * @param existingCustomer
     * @param salesChannelId
     * @param customerActiveFlag
     * @param opportunityId
     * @param qcid
     * @param processType
     * @param businessProcessType
     * @param btn
     * @param customerAddress
     * @param cuid
     * @param userDefinedAccountName
     * @param billingAccounts0
     * @param orderInitiatorName
     * @param mainFax
     * @param customerName
     * @param taskId0
     * @param orionOrderId
     * @param salesInformation
     * @param projectId
     * @param taskId
     * @param responseMessages
     * @param statusCode
     */
    @WebMethod
    @RequestWrapper(localName = "createOrder", targetNamespace = "http://qcsetup-int.dev.qintra.com:8400/qcsetup", className = "java.com_qwest_qcsetup_webservice_csuporder.CreateOrderRequest")
    @ResponseWrapper(localName = "createOrderResponse", targetNamespace = "http://qcsetup-int.dev.qintra.com:8400/qcsetup", className = "java.com_qwest_qcsetup_webservice_csuporder.CreateOrderResponse")
    public void createOrder(
        @WebParam(name = "billingAccounts", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        ArrayOfBillingAccount billingAccounts,
        @WebParam(name = "btn", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        TN btn,
        @WebParam(name = "businessProcessType", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String businessProcessType,
        @WebParam(name = "contractInfo", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        ContractInformation contractInfo,
        @WebParam(name = "cuid", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String cuid,
        @WebParam(name = "customerAddress", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        Address customerAddress,
        @WebParam(name = "customerHubId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String customerHubId,
        @WebParam(name = "customerName", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String customerName,
        @WebParam(name = "existingCustomer", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String existingCustomer,
        @WebParam(name = "mainFax", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        TN mainFax,
        @WebParam(name = "opportunityId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        long opportunityId,
        @WebParam(name = "orderInitiatorName", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String orderInitiatorName,
        @WebParam(name = "processType", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String processType,
        @WebParam(name = "projectId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        long projectId,
        @WebParam(name = "qcid", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        long qcid,
        @WebParam(name = "salesChannelId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        String salesChannelId,
        @WebParam(name = "salesInformation", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        SalesInformation salesInformation,
        @WebParam(name = "taskId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo")
        long taskId,
        @WebParam(name = "billingAccounts", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<ArrayOfString> billingAccounts0,
        @WebParam(name = "customerAccountEstablishDate", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<XMLGregorianCalendar> customerAccountEstablishDate,
        @WebParam(name = "customerActiveFlag", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<Boolean> customerActiveFlag,
        @WebParam(name = "description", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<String> description,
        @WebParam(name = "orderId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<Long> orderId,
        @WebParam(name = "orionOrderId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<Long> orionOrderId,
        @WebParam(name = "responseMessages", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<ArrayOfResponseMessage> responseMessages,
        @WebParam(name = "statusCode", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<String> statusCode,
        @WebParam(name = "taskId", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<Long> taskId0,
        @WebParam(name = "userDefinedAccountName", targetNamespace = "java:com.qwest.qcsetup.webservice.csupOrder.bo", mode = WebParam.Mode.OUT)
        Holder<String> userDefinedAccountName);

}
