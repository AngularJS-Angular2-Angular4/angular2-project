
package com.sforce.soap.schemas._class.ws_acq_leads;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each
 * Java content interface and Java element interface
 * generated in the com.sforce.soap.schemas._class.ws_acq_leads package.
 * <p>An ObjectFactory allows you to programatically
 * construct new instances of the Java representation
 * for XML content. The Java representation of XML
 * content can consist of schema derived interfaces
 * and classes representing the binding of schema
 * type definitions, element declarations and model
 * groups.  Factory methods for each of these are
 * provided in this class.
 *
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _TnportableinfoNumberofdaysforportable_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Numberofdaysforportable");
    private final static QName _TnportableinfoBeginningTNRange_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BeginningTNRange");
    private final static QName _TnportableinfoPortableMessage_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "PortableMessage");
    private final static QName _TnportableinfoLosingCarrier_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LosingCarrier");
    private final static QName _TnportableinfoEndIngTNRange_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "EndIngTNRange");
    private final static QName _CompanyQualifiedLocResponseMessageCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "MessageCode");
    private final static QName _CompanyQualifiedLocResponseErrorMsg_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ErrorMsg");
    private final static QName _CompanyQualifiedLocResponseTotalNumber_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TotalNumber");
    private final static QName _ReturnCustomersResponseMessageDesc_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "MessageDesc");
    private final static QName _ServiceLocationDataServiceLocName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocName");
    private final static QName _ServiceLocationDataPrimaryTN_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "primaryTN");
    private final static QName _ServiceLocationDataAccName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "accName");
    private final static QName _CustomerSearchRequestCustomerName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "customerName");
    private final static QName _CreateLeadResponseLeadID_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LeadID");
    private final static QName _ConvertLeadRequestLeadId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LeadId");
    private final static QName _ACQLeadClli_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Clli");
    private final static QName _ACQLeadComments_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Comments");
    private final static QName _ACQLeadLName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LName");
    private final static QName _ACQLeadConvertLeadURL_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ConvertLeadURL");
    private final static QName _ACQLeadLongitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Longitude");
    private final static QName _ACQLeadCity_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "City");
    private final static QName _ACQLeadState_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "State");
    private final static QName _ACQLeadBusPhone_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BusPhone");
    private final static QName _ACQLeadRefeMailAddrs_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "RefeMailAddrs");
    private final static QName _ACQLeadRefSalesCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "RefSalesCode");
    private final static QName _ACQLeadPrimaryTN_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "PrimaryTN");
    private final static QName _ACQLeadTNcheckNPA_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TNcheckNPA");
    private final static QName _ACQLeadCountry_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Country");
    private final static QName _ACQLeadLeadCreatedDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LeadCreatedDate");
    private final static QName _ACQLeadSrc_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Src");
    private final static QName _ACQLeadOwner_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Owner");
    private final static QName _ACQLeadProducts_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Products");
    private final static QName _ACQLeadEmail_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Email");
    private final static QName _ACQLeadAddrLine2_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AddrLine2");
    private final static QName _ACQLeadZip_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Zip");
    private final static QName _ACQLeadAddrLine1_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AddrLine1");
    private final static QName _ACQLeadFName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "FName");
    private final static QName _ACQLeadLeadStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LeadStatus");
    private final static QName _ACQLeadLocationName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LocationName");
    private final static QName _ACQLeadName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Name");
    private final static QName _ACQLeadDescr_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Descr");
    private final static QName _ACQLeadSwcCLLI_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "SwcCLLI");
    private final static QName _ACQLeadTNcheckNXX_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TNcheckNXX");
    private final static QName _ACQLeadTNRateCenter_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TNRateCenter");
    private final static QName _ACQLeadContactTN_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ContactTN");
    private final static QName _ACQLeadLatitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Latitude");
    private final static QName _ACQLeadH_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "H");
    private final static QName _ACQLeadV_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "V");
    private final static QName _ACQLeadSwcNXX_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "SwcNXX");
    private final static QName _ACQLeadIndustry_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Industry");
    private final static QName _ACQLeadTNcheckQuantity_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TNcheckQuantity");
    private final static QName _ACQLeadRefFName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "RefFName");
    private final static QName _ACQLeadSwcNPA_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "SwcNPA");
    private final static QName _ACQLeadLeadAge_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "LeadAge");
    private final static QName _UserResponseStatusMsg_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "statusMsg");
    private final static QName _UserResponseStatusCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "statusCode");
    private final static QName _UserResponseUserId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "userId");
    private final static QName _CompanyQualifiedLocRequestStartDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "StartDate");
    private final static QName _CompanyQualifiedLocRequestEndDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "EndDate");
    private final static QName _CompanyQualifiedLocTntResponseEstCompetitorContractExpirationDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_Competitor_Contract_Expiration_Date");
    private final static QName _CompanyQualifiedLocTntResponseEstTotalTelcoSpend_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_Total_Telco_Spend");
    private final static QName _CompanyQualifiedLocTntResponseEstVoiceSpend_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_Voice_Spend");
    private final static QName _CompanyQualifiedLocTntResponseLastVerifiedByUser_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Last_Verified_ByUser");
    private final static QName _CompanyQualifiedLocTntResponseRelatedCustomerAccount_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Related_Customer_Account");
    private final static QName _CompanyQualifiedLocTntResponseEstITSpend_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_ITSpend");
    private final static QName _CompanyQualifiedLocTntResponseCompanyQualifiedLocation_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Company_Qualified_Location");
    private final static QName _CompanyQualifiedLocTntResponseSICMajorGroup_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "SIC_Major_Group");
    private final static QName _CompanyQualifiedLocTntResponseEstEmpNo_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_EmpNo");
    private final static QName _CompanyQualifiedLocTntResponseEstDataSpend_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Est_Data_Spend");
    private final static QName _CompanyQualifiedLocTntResponseTenantId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "TenantId");
    private final static QName _CompanyQualifiedLocTntResponseLastVerificationDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Last_Verification_Date");
    private final static QName _CompanyQualifiedLocTntResponseRemainingContractWithCompetitor_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Remaining_Contract_with_Competitor");
    private final static QName _CompanyQualifiedLocTntResponseCompanyName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Company_Name");
    private final static QName _CompanyQualifiedLocTntResponseSICDivision_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "SIC_Division");
    private final static QName _CompanyQualifiedLocTntResponseTenantStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Tenant_Status");
    private final static QName _CustomerInfoAccUrl_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AccUrl");
    private final static QName _CustomerInfoSegment_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Segment");
    private final static QName _CustomerInfoUUID_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "UUID");
    private final static QName _CustomerInfoName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "name");
    private final static QName _CompanyQualifiedResponseAssignedSalesUserName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Assigned_Sales_UserName");
    private final static QName _CompanyQualifiedResponseAddress_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Address");
    private final static QName _CompanyQualifiedResponseCLLIInformation_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "CLLI_Information");
    private final static QName _CompanyQualifiedResponseStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Status");
    private final static QName _CompanyQualifiedResponseInstallationInterval_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Installation_Interval");
    private final static QName _CompanyQualifiedResponseMTUGeolocationLongitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "MTU_Geolocation_Longitude");
    private final static QName _CompanyQualifiedResponseIsDeleted_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "isDeleted");
    private final static QName _CompanyQualifiedResponseValidationStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Validation_Status");
    private final static QName _CompanyQualifiedResponseDirectIndirect_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Direct_Indirect");
    private final static QName _CompanyQualifiedResponseAssignedSalesProfessional_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Assigned_Sales_Professional");
    private final static QName _CompanyQualifiedResponseAssignedSalesProfileURL_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Assigned_Sales_profile_URL");
    private final static QName _CompanyQualifiedResponseLocationType_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Location_Type");
    private final static QName _CompanyQualifiedResponseSiteActiveDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Site_Active_Date");
    private final static QName _CompanyQualifiedResponseBuildingId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BuildingId");
    private final static QName _CompanyQualifiedResponseSeqId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Seq_Id");
    private final static QName _CompanyQualifiedResponseMTUGeolocationLatitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "MTU_Geolocation_Latitude");
    private final static QName _ACQLeadMultiSiteApttusIdentifier_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ApttusIdentifier");
    private final static QName _SearchByAccountIdRequestAccountId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AccountId");
    private final static QName _BillingAccountDetailsBillingAccountId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingAccountId");
    private final static QName _BillingAccountDetailsBillingAccountName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingAccountName");
    private final static QName _BillingAccountDetailsBillingAccountOwner_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingAccountOwner");
    private final static QName _BillingAccountDetailsBillingAccountOwnerURL_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingAccountOwnerURL");
    private final static QName _BillingAccountDetailsBillingAcctEntity_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingAcctEntity");
    private final static QName _BillingAccountDetailsBillingSystem_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "BillingSystem");
    private final static QName _ServiceLocationSource_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Source");
    private final static QName _ServiceLocationServiceLocationId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ServiceLocationId");
    private final static QName _ServiceLocationAddressID_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AddressID");
    private final static QName _OpportunityDataOpportunityUrl_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "OpportunityUrl");
    private final static QName _OpportunityDataOpptyCloseDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "opptyCloseDate");
    private final static QName _OpportunityDataPostalCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "postalCode");
    private final static QName _OpportunityDataServiceLocState_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocState");
    private final static QName _OpportunityDataProducts_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "products");
    private final static QName _OpportunityDataServiceLocLatitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocLatitude");
    private final static QName _OpportunityDataTotalMRC_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "totalMRC");
    private final static QName _OpportunityDataIndustry_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "industry");
    private final static QName _OpportunityDataServiceLocCity_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocCity");
    private final static QName _OpportunityDataOpptyStage_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "opptyStage");
    private final static QName _OpportunityDataBusinessName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "businessName");
    private final static QName _OpportunityDataOpptyCreatedDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "opptyCreatedDate");
    private final static QName _OpportunityDataOpptyName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "opptyName");
    private final static QName _OpportunityDataForecastCategory_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "forecastCategory");
    private final static QName _OpportunityDataServiceLocCountry_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocCountry");
    private final static QName _OpportunityDataOpptyId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "opptyId");
    private final static QName _OpportunityDataServiceLocAddress_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocAddress");
    private final static QName _OpportunityDataServiceLocAddressLine2_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocAddressLine2");
    private final static QName _OpportunityDataServiceLocLongitude_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "serviceLocLongitude");
    private final static QName _SearchResultsOpportunityId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "OpportunityId");
    private final static QName _SearchResultsIsBillingAcctExists_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "isBillingAcctExists");
    private final static QName _SearchResultsAccountName_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AccountName");
    private final static QName _SearchResultsIsTooManyBAcctsExists_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "isTooManyBAcctsExists");
    private final static QName _SearchResultsBillingAcctEntity_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "billingAcctEntity");
    private final static QName _SearchResultsProspectingStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "prospectingStatus");
    private final static QName _SearchResultsCreatedDate_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "CreatedDate");
    private final static QName _GetopportunityRequestOffset_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Offset");
    private final static QName _GetopportunityRequestThresholdLimit_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "ThresholdLimit");
    private final static QName _QualificationAttrVal_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "val");
    private final static QName _QualificationAttrKey_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "key");
    private final static QName _GetLeadRequestStateCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "State_Code");
    private final static QName _GetLeadRequestLeadId_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "leadId");
    private final static QName _GetLeadRequestStatus_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "status");
    private final static QName _GetLeadRequestZipCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Zip_Code");
    private final static QName _GetLeadRequestCampaignCodes_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "Campaign_Codes");
    private final static QName _SearchByAccountIdResponse2AccountSegmentCode_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "AccountSegmentCode");
    private final static QName _SearchByAccountIdResponse2QCCBillingAcctDetails_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "QCCBillingAcctDetails");
    private final static QName _SearchByAccountIdResponse2QCBillingAcctDetails_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "QCBillingAcctDetails");
    private final static QName _SearchByAccountIdResponse2CTLBillingAcctDetails_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "CTLBillingAcctDetails");
    private final static QName _SearchByAccountIdResponse2CustomerTBR_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "CustomerTBR");
    private final static QName _SearchByAccountIdResponse2NoOfBillingAccounts_QNAME = new QName("http://soap.sforce.com/schemas/class/WS_ACQ_Leads", "NoOfBillingAccounts");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.sforce.soap.schemas._class.ws_acq_leads
     *
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link SearchByAccountIdResponse }
     *
     */
    public SearchByAccountIdResponse createSearchByAccountIdResponse() {
        return new SearchByAccountIdResponse();
    }

    /**
     * Create an instance of {@link SearchByAccountIdResponse2 }
     *
     */
    public SearchByAccountIdResponse2 createSearchByAccountIdResponse2() {
        return new SearchByAccountIdResponse2();
    }

    /**
     * Create an instance of {@link UserStatus }
     *
     */
    public UserStatus createUserStatus() {
        return new UserStatus();
    }

    /**
     * Create an instance of {@link CreateLeadsMultiSiteResponse }
     *
     */
    public CreateLeadsMultiSiteResponse createCreateLeadsMultiSiteResponse() {
        return new CreateLeadsMultiSiteResponse();
    }

    /**
     * Create an instance of {@link CreateLeadResponse }
     *
     */
    public CreateLeadResponse createCreateLeadResponse() {
        return new CreateLeadResponse();
    }

    /**
     * Create an instance of {@link ConvertLead }
     *
     */
    public ConvertLead createConvertLead() {
        return new ConvertLead();
    }

    /**
     * Create an instance of {@link ConvertLeadRequest }
     *
     */
    public ConvertLeadRequest createConvertLeadRequest() {
        return new ConvertLeadRequest();
    }

    /**
     * Create an instance of {@link UpdateLeads }
     *
     */
    public UpdateLeads createUpdateLeads() {
        return new UpdateLeads();
    }

    /**
     * Create an instance of {@link UpdateLeadsRequest }
     *
     */
    public UpdateLeadsRequest createUpdateLeadsRequest() {
        return new UpdateLeadsRequest();
    }

    /**
     * Create an instance of {@link DebuggingInfo }
     *
     */
    public DebuggingInfo createDebuggingInfo() {
        return new DebuggingInfo();
    }

    /**
     * Create an instance of {@link SearchByCustomerNameResponse }
     *
     */
    public SearchByCustomerNameResponse createSearchByCustomerNameResponse() {
        return new SearchByCustomerNameResponse();
    }

    /**
     * Create an instance of {@link CustomerSearchResponse }
     *
     */
    public CustomerSearchResponse createCustomerSearchResponse() {
        return new CustomerSearchResponse();
    }

    /**
     * Create an instance of {@link GetLeadsResponse }
     *
     */
    public GetLeadsResponse createGetLeadsResponse() {
        return new GetLeadsResponse();
    }

    /**
     * Create an instance of {@link GetLeadResponse }
     *
     */
    public GetLeadResponse createGetLeadResponse() {
        return new GetLeadResponse();
    }

    /**
     * Create an instance of {@link CallOptions }
     *
     */
    public CallOptions createCallOptions() {
        return new CallOptions();
    }

    /**
     * Create an instance of {@link CUIDStatusResponse }
     *
     */
    public CUIDStatusResponse createCUIDStatusResponse() {
        return new CUIDStatusResponse();
    }

    /**
     * Create an instance of {@link UserResponse }
     *
     */
    public UserResponse createUserResponse() {
        return new UserResponse();
    }

    /**
     * Create an instance of {@link GetCQLTenantsResponse }
     *
     */
    public GetCQLTenantsResponse createGetCQLTenantsResponse() {
        return new GetCQLTenantsResponse();
    }

    /**
     * Create an instance of {@link CompanyQualifiedtntResponse }
     *
     */
    public CompanyQualifiedtntResponse createCompanyQualifiedtntResponse() {
        return new CompanyQualifiedtntResponse();
    }

    /**
     * Create an instance of {@link CreateLeadsResponse }
     *
     */
    public CreateLeadsResponse createCreateLeadsResponse() {
        return new CreateLeadsResponse();
    }

    /**
     * Create an instance of {@link ReturnCustomer }
     *
     */
    public ReturnCustomer createReturnCustomer() {
        return new ReturnCustomer();
    }

    /**
     * Create an instance of {@link GetLeads }
     *
     */
    public GetLeads createGetLeads() {
        return new GetLeads();
    }

    /**
     * Create an instance of {@link GetLeadRequest }
     *
     */
    public GetLeadRequest createGetLeadRequest() {
        return new GetLeadRequest();
    }

    /**
     * Create an instance of {@link ReturnCustomerResponse }
     *
     */
    public ReturnCustomerResponse createReturnCustomerResponse() {
        return new ReturnCustomerResponse();
    }

    /**
     * Create an instance of {@link ReturnCustomersResponse }
     *
     */
    public ReturnCustomersResponse createReturnCustomersResponse() {
        return new ReturnCustomersResponse();
    }

    /**
     * Create an instance of {@link ConvertLeadMultiSiteResponse }
     *
     */
    public ConvertLeadMultiSiteResponse createConvertLeadMultiSiteResponse() {
        return new ConvertLeadMultiSiteResponse();
    }

    /**
     * Create an instance of {@link ConvertLeadResponse }
     *
     */
    public ConvertLeadResponse createConvertLeadResponse() {
        return new ConvertLeadResponse();
    }

    /**
     * Create an instance of {@link UpdateLeadsResponse }
     *
     */
    public UpdateLeadsResponse createUpdateLeadsResponse() {
        return new UpdateLeadsResponse();
    }

    /**
     * Create an instance of {@link UpdateLeadsResponse2 }
     *
     */
    public UpdateLeadsResponse2 createUpdateLeadsResponse2() {
        return new UpdateLeadsResponse2();
    }

    /**
     * Create an instance of {@link GetOpportunities }
     *
     */
    public GetOpportunities createGetOpportunities() {
        return new GetOpportunities();
    }

    /**
     * Create an instance of {@link GetopportunityRequest }
     *
     */
    public GetopportunityRequest createGetopportunityRequest() {
        return new GetopportunityRequest();
    }

    /**
     * Create an instance of {@link ConvertLeadMultiSite }
     *
     */
    public ConvertLeadMultiSite createConvertLeadMultiSite() {
        return new ConvertLeadMultiSite();
    }

    /**
     * Create an instance of {@link GetLeadsMultiSite }
     *
     */
    public GetLeadsMultiSite createGetLeadsMultiSite() {
        return new GetLeadsMultiSite();
    }

    /**
     * Create an instance of {@link CUIDStatus }
     *
     */
    public CUIDStatus createCUIDStatus() {
        return new CUIDStatus();
    }

    /**
     * Create an instance of {@link SessionHeader }
     *
     */
    public SessionHeader createSessionHeader() {
        return new SessionHeader();
    }

    /**
     * Create an instance of {@link UpdateLeadsMultiSite }
     *
     */
    public UpdateLeadsMultiSite createUpdateLeadsMultiSite() {
        return new UpdateLeadsMultiSite();
    }

    /**
     * Create an instance of {@link UpdateLeadsRequestMultiSite }
     *
     */
    public UpdateLeadsRequestMultiSite createUpdateLeadsRequestMultiSite() {
        return new UpdateLeadsRequestMultiSite();
    }

    /**
     * Create an instance of {@link GetCQLTenants }
     *
     */
    public GetCQLTenants createGetCQLTenants() {
        return new GetCQLTenants();
    }

    /**
     * Create an instance of {@link CompanyQualifiedLocTntRequest }
     *
     */
    public CompanyQualifiedLocTntRequest createCompanyQualifiedLocTntRequest() {
        return new CompanyQualifiedLocTntRequest();
    }

    /**
     * Create an instance of {@link AllowFieldTruncationHeader }
     *
     */
    public AllowFieldTruncationHeader createAllowFieldTruncationHeader() {
        return new AllowFieldTruncationHeader();
    }

    /**
     * Create an instance of {@link UpdateLeadsMultiSiteResponse }
     *
     */
    public UpdateLeadsMultiSiteResponse createUpdateLeadsMultiSiteResponse() {
        return new UpdateLeadsMultiSiteResponse();
    }

    /**
     * Create an instance of {@link UserStatusResponse }
     *
     */
    public UserStatusResponse createUserStatusResponse() {
        return new UserStatusResponse();
    }

    /**
     * Create an instance of {@link ConvertLeadResponse2 }
     *
     */
    public ConvertLeadResponse2 createConvertLeadResponse2() {
        return new ConvertLeadResponse2();
    }

    /**
     * Create an instance of {@link CreateLeads }
     *
     */
    public CreateLeads createCreateLeads() {
        return new CreateLeads();
    }

    /**
     * Create an instance of {@link CreateLeadRequest }
     *
     */
    public CreateLeadRequest createCreateLeadRequest() {
        return new CreateLeadRequest();
    }

    /**
     * Create an instance of {@link GetOpportunitiesResponse }
     *
     */
    public GetOpportunitiesResponse createGetOpportunitiesResponse() {
        return new GetOpportunitiesResponse();
    }

    /**
     * Create an instance of {@link GetOpportunityResponse }
     *
     */
    public GetOpportunityResponse createGetOpportunityResponse() {
        return new GetOpportunityResponse();
    }

    /**
     * Create an instance of {@link CreateLeadsMultiSite }
     *
     */
    public CreateLeadsMultiSite createCreateLeadsMultiSite() {
        return new CreateLeadsMultiSite();
    }

    /**
     * Create an instance of {@link CreateLeadRequestMultiSite }
     *
     */
    public CreateLeadRequestMultiSite createCreateLeadRequestMultiSite() {
        return new CreateLeadRequestMultiSite();
    }

    /**
     * Create an instance of {@link GetCompanyQualifiedLocations }
     *
     */
    public GetCompanyQualifiedLocations createGetCompanyQualifiedLocations() {
        return new GetCompanyQualifiedLocations();
    }

    /**
     * Create an instance of {@link CompanyQualifiedLocRequest }
     *
     */
    public CompanyQualifiedLocRequest createCompanyQualifiedLocRequest() {
        return new CompanyQualifiedLocRequest();
    }

    /**
     * Create an instance of {@link GetCompanyQualifiedLocationsResponse }
     *
     */
    public GetCompanyQualifiedLocationsResponse createGetCompanyQualifiedLocationsResponse() {
        return new GetCompanyQualifiedLocationsResponse();
    }

    /**
     * Create an instance of {@link CompanyQualifiedLocResponse }
     *
     */
    public CompanyQualifiedLocResponse createCompanyQualifiedLocResponse() {
        return new CompanyQualifiedLocResponse();
    }

    /**
     * Create an instance of {@link SearchByCustomerName }
     *
     */
    public SearchByCustomerName createSearchByCustomerName() {
        return new SearchByCustomerName();
    }

    /**
     * Create an instance of {@link CustomerSearchRequest }
     *
     */
    public CustomerSearchRequest createCustomerSearchRequest() {
        return new CustomerSearchRequest();
    }

    /**
     * Create an instance of {@link DebuggingHeader }
     *
     */
    public DebuggingHeader createDebuggingHeader() {
        return new DebuggingHeader();
    }

    /**
     * Create an instance of {@link LogInfo }
     *
     */
    public LogInfo createLogInfo() {
        return new LogInfo();
    }

    /**
     * Create an instance of {@link SearchByAccountId }
     *
     */
    public SearchByAccountId createSearchByAccountId() {
        return new SearchByAccountId();
    }

    /**
     * Create an instance of {@link SearchByAccountIdRequest }
     *
     */
    public SearchByAccountIdRequest createSearchByAccountIdRequest() {
        return new SearchByAccountIdRequest();
    }

    /**
     * Create an instance of {@link GetLeadsMultiSiteResponse }
     *
     */
    public GetLeadsMultiSiteResponse createGetLeadsMultiSiteResponse() {
        return new GetLeadsMultiSiteResponse();
    }

    /**
     * Create an instance of {@link GetLeadResponseMultiSite }
     *
     */
    public GetLeadResponseMultiSite createGetLeadResponseMultiSite() {
        return new GetLeadResponseMultiSite();
    }

    /**
     * Create an instance of {@link QCBillingAccountDetails }
     *
     */
    public QCBillingAccountDetails createQCBillingAccountDetails() {
        return new QCBillingAccountDetails();
    }

    /**
     * Create an instance of {@link ACQLead }
     *
     */
    public ACQLead createACQLead() {
        return new ACQLead();
    }

    /**
     * Create an instance of {@link SearchResults }
     *
     */
    public SearchResults createSearchResults() {
        return new SearchResults();
    }

    /**
     * Create an instance of {@link ACQLeadMultiSite }
     *
     */
    public ACQLeadMultiSite createACQLeadMultiSite() {
        return new ACQLeadMultiSite();
    }

    /**
     * Create an instance of {@link OpportunityData }
     *
     */
    public OpportunityData createOpportunityData() {
        return new OpportunityData();
    }

    /**
     * Create an instance of {@link ServiceLocation }
     *
     */
    public ServiceLocation createServiceLocation() {
        return new ServiceLocation();
    }

    /**
     * Create an instance of {@link BillingAccountDetails }
     *
     */
    public BillingAccountDetails createBillingAccountDetails() {
        return new BillingAccountDetails();
    }

    /**
     * Create an instance of {@link ServiceLocationData }
     *
     */
    public ServiceLocationData createServiceLocationData() {
        return new ServiceLocationData();
    }

    /**
     * Create an instance of {@link CompanyQualifiedResponse }
     *
     */
    public CompanyQualifiedResponse createCompanyQualifiedResponse() {
        return new CompanyQualifiedResponse();
    }

    /**
     * Create an instance of {@link CTLBillingAccountDetails }
     *
     */
    public CTLBillingAccountDetails createCTLBillingAccountDetails() {
        return new CTLBillingAccountDetails();
    }

    /**
     * Create an instance of {@link Tnportableinfo }
     *
     */
    public Tnportableinfo createTnportableinfo() {
        return new Tnportableinfo();
    }

    /**
     * Create an instance of {@link QualificationAttr }
     *
     */
    public QualificationAttr createQualificationAttr() {
        return new QualificationAttr();
    }

    /**
     * Create an instance of {@link CustomerInfo }
     *
     */
    public CustomerInfo createCustomerInfo() {
        return new CustomerInfo();
    }

    /**
     * Create an instance of {@link QCCBillingAccountDetails }
     *
     */
    public QCCBillingAccountDetails createQCCBillingAccountDetails() {
        return new QCCBillingAccountDetails();
    }

    /**
     * Create an instance of {@link CompanyQualifiedLocTntResponse }
     *
     */
    public CompanyQualifiedLocTntResponse createCompanyQualifiedLocTntResponse() {
        return new CompanyQualifiedLocTntResponse();
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Numberofdaysforportable", scope = Tnportableinfo.class)
    public JAXBElement<String> createTnportableinfoNumberofdaysforportable(String value) {
        return new JAXBElement<String>(_TnportableinfoNumberofdaysforportable_QNAME, String.class, Tnportableinfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BeginningTNRange", scope = Tnportableinfo.class)
    public JAXBElement<String> createTnportableinfoBeginningTNRange(String value) {
        return new JAXBElement<String>(_TnportableinfoBeginningTNRange_QNAME, String.class, Tnportableinfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "PortableMessage", scope = Tnportableinfo.class)
    public JAXBElement<String> createTnportableinfoPortableMessage(String value) {
        return new JAXBElement<String>(_TnportableinfoPortableMessage_QNAME, String.class, Tnportableinfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LosingCarrier", scope = Tnportableinfo.class)
    public JAXBElement<String> createTnportableinfoLosingCarrier(String value) {
        return new JAXBElement<String>(_TnportableinfoLosingCarrier_QNAME, String.class, Tnportableinfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "EndIngTNRange", scope = Tnportableinfo.class)
    public JAXBElement<String> createTnportableinfoEndIngTNRange(String value) {
        return new JAXBElement<String>(_TnportableinfoEndIngTNRange_QNAME, String.class, Tnportableinfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = CompanyQualifiedLocResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, CompanyQualifiedLocResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ErrorMsg", scope = CompanyQualifiedLocResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocResponseErrorMsg(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseErrorMsg_QNAME, String.class, CompanyQualifiedLocResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = CompanyQualifiedLocResponse.class)
    public JAXBElement<Integer> createCompanyQualifiedLocResponseTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, CompanyQualifiedLocResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = ReturnCustomersResponse.class)
    public JAXBElement<String> createReturnCustomersResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, ReturnCustomersResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = ReturnCustomersResponse.class)
    public JAXBElement<String> createReturnCustomersResponseMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, ReturnCustomersResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocName", scope = ServiceLocationData.class)
    public JAXBElement<String> createServiceLocationDataServiceLocName(String value) {
        return new JAXBElement<String>(_ServiceLocationDataServiceLocName_QNAME, String.class, ServiceLocationData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "primaryTN", scope = ServiceLocationData.class)
    public JAXBElement<String> createServiceLocationDataPrimaryTN(String value) {
        return new JAXBElement<String>(_ServiceLocationDataPrimaryTN_QNAME, String.class, ServiceLocationData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "accName", scope = ServiceLocationData.class)
    public JAXBElement<String> createServiceLocationDataAccName(String value) {
        return new JAXBElement<String>(_ServiceLocationDataAccName_QNAME, String.class, ServiceLocationData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "customerName", scope = CustomerSearchRequest.class)
    public JAXBElement<String> createCustomerSearchRequestCustomerName(String value) {
        return new JAXBElement<String>(_CustomerSearchRequestCustomerName_QNAME, String.class, CustomerSearchRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = CreateLeadResponse.class)
    public JAXBElement<String> createCreateLeadResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, CreateLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = CreateLeadResponse.class)
    public JAXBElement<String> createCreateLeadResponseMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, CreateLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadID", scope = CreateLeadResponse.class)
    public JAXBElement<String> createCreateLeadResponseLeadID(String value) {
        return new JAXBElement<String>(_CreateLeadResponseLeadID_QNAME, String.class, CreateLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadId", scope = ConvertLeadRequest.class)
    public JAXBElement<String> createConvertLeadRequestLeadId(String value) {
        return new JAXBElement<String>(_ConvertLeadRequestLeadId_QNAME, String.class, ConvertLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Clli", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadClli(String value) {
        return new JAXBElement<String>(_ACQLeadClli_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Comments", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadComments(String value) {
        return new JAXBElement<String>(_ACQLeadComments_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LName", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLName(String value) {
        return new JAXBElement<String>(_ACQLeadLName_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ConvertLeadURL", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadConvertLeadURL(String value) {
        return new JAXBElement<String>(_ACQLeadConvertLeadURL_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Longitude", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLongitude(String value) {
        return new JAXBElement<String>(_ACQLeadLongitude_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "City", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadCity(String value) {
        return new JAXBElement<String>(_ACQLeadCity_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "State", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadState(String value) {
        return new JAXBElement<String>(_ACQLeadState_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BusPhone", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadBusPhone(String value) {
        return new JAXBElement<String>(_ACQLeadBusPhone_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefeMailAddrs", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadRefeMailAddrs(String value) {
        return new JAXBElement<String>(_ACQLeadRefeMailAddrs_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefSalesCode", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadRefSalesCode(String value) {
        return new JAXBElement<String>(_ACQLeadRefSalesCode_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "PrimaryTN", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadPrimaryTN(String value) {
        return new JAXBElement<String>(_ACQLeadPrimaryTN_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckNPA", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadTNcheckNPA(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckNPA_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Country", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadCountry(String value) {
        return new JAXBElement<String>(_ACQLeadCountry_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadCreatedDate", scope = ACQLead.class)
    public JAXBElement<XMLGregorianCalendar> createACQLeadLeadCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ACQLeadLeadCreatedDate_QNAME, XMLGregorianCalendar.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Src", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadSrc(String value) {
        return new JAXBElement<String>(_ACQLeadSrc_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Products", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadProducts(String value) {
        return new JAXBElement<String>(_ACQLeadProducts_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Email", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadEmail(String value) {
        return new JAXBElement<String>(_ACQLeadEmail_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine2", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadAddrLine2(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine2_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Zip", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadZip(String value) {
        return new JAXBElement<String>(_ACQLeadZip_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine1", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadAddrLine1(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine1_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "FName", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadFName(String value) {
        return new JAXBElement<String>(_ACQLeadFName_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadStatus", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLeadStatus(String value) {
        return new JAXBElement<String>(_ACQLeadLeadStatus_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LocationName", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLocationName(String value) {
        return new JAXBElement<String>(_ACQLeadLocationName_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Name", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadName(String value) {
        return new JAXBElement<String>(_ACQLeadName_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Descr", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadDescr(String value) {
        return new JAXBElement<String>(_ACQLeadDescr_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcCLLI", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadSwcCLLI(String value) {
        return new JAXBElement<String>(_ACQLeadSwcCLLI_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckNXX", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadTNcheckNXX(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckNXX_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNRateCenter", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadTNRateCenter(String value) {
        return new JAXBElement<String>(_ACQLeadTNRateCenter_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ContactTN", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadContactTN(String value) {
        return new JAXBElement<String>(_ACQLeadContactTN_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Latitude", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLatitude(String value) {
        return new JAXBElement<String>(_ACQLeadLatitude_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "H", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadH(String value) {
        return new JAXBElement<String>(_ACQLeadH_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "V", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadV(String value) {
        return new JAXBElement<String>(_ACQLeadV_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcNXX", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadSwcNXX(String value) {
        return new JAXBElement<String>(_ACQLeadSwcNXX_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Industry", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadIndustry(String value) {
        return new JAXBElement<String>(_ACQLeadIndustry_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckQuantity", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadTNcheckQuantity(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckQuantity_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefFName", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadRefFName(String value) {
        return new JAXBElement<String>(_ACQLeadRefFName_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcNPA", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadSwcNPA(String value) {
        return new JAXBElement<String>(_ACQLeadSwcNPA_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadId", scope = ACQLead.class)
    public JAXBElement<String> createACQLeadLeadId(String value) {
        return new JAXBElement<String>(_ConvertLeadRequestLeadId_QNAME, String.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadAge", scope = ACQLead.class)
    public JAXBElement<BigDecimal> createACQLeadLeadAge(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ACQLeadLeadAge_QNAME, BigDecimal.class, ACQLead.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = CompanyQualifiedtntResponse.class)
    public JAXBElement<String> createCompanyQualifiedtntResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, CompanyQualifiedtntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ErrorMsg", scope = CompanyQualifiedtntResponse.class)
    public JAXBElement<String> createCompanyQualifiedtntResponseErrorMsg(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseErrorMsg_QNAME, String.class, CompanyQualifiedtntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = CompanyQualifiedtntResponse.class)
    public JAXBElement<Integer> createCompanyQualifiedtntResponseTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, CompanyQualifiedtntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "statusMsg", scope = UserResponse.class)
    public JAXBElement<String> createUserResponseStatusMsg(String value) {
        return new JAXBElement<String>(_UserResponseStatusMsg_QNAME, String.class, UserResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "statusCode", scope = UserResponse.class)
    public JAXBElement<String> createUserResponseStatusCode(String value) {
        return new JAXBElement<String>(_UserResponseStatusCode_QNAME, String.class, UserResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "userId", scope = UserResponse.class)
    public JAXBElement<String> createUserResponseUserId(String value) {
        return new JAXBElement<String>(_UserResponseUserId_QNAME, String.class, UserResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "StartDate", scope = CompanyQualifiedLocRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCompanyQualifiedLocRequestStartDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompanyQualifiedLocRequestStartDate_QNAME, XMLGregorianCalendar.class, CompanyQualifiedLocRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "EndDate", scope = CompanyQualifiedLocRequest.class)
    public JAXBElement<XMLGregorianCalendar> createCompanyQualifiedLocRequestEndDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompanyQualifiedLocRequestEndDate_QNAME, XMLGregorianCalendar.class, CompanyQualifiedLocRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Comments", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseComments(String value) {
        return new JAXBElement<String>(_ACQLeadComments_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_Competitor_Contract_Expiration_Date", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCompanyQualifiedLocTntResponseEstCompetitorContractExpirationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompanyQualifiedLocTntResponseEstCompetitorContractExpirationDate_QNAME, XMLGregorianCalendar.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_Total_Telco_Spend", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedLocTntResponseEstTotalTelcoSpend(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedLocTntResponseEstTotalTelcoSpend_QNAME, BigDecimal.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_Voice_Spend", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedLocTntResponseEstVoiceSpend(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedLocTntResponseEstVoiceSpend_QNAME, BigDecimal.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Last_Verified_ByUser", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseLastVerifiedByUser(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseLastVerifiedByUser_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Related_Customer_Account", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseRelatedCustomerAccount(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseRelatedCustomerAccount_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_ITSpend", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedLocTntResponseEstITSpend(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedLocTntResponseEstITSpend_QNAME, BigDecimal.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Company_Qualified_Location", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseCompanyQualifiedLocation(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseCompanyQualifiedLocation_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SIC_Major_Group", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseSICMajorGroup(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseSICMajorGroup_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_EmpNo", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedLocTntResponseEstEmpNo(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedLocTntResponseEstEmpNo_QNAME, BigDecimal.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Est_Data_Spend", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedLocTntResponseEstDataSpend(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedLocTntResponseEstDataSpend_QNAME, BigDecimal.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TenantId", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseTenantId(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseTenantId_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Last_Verification_Date", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCompanyQualifiedLocTntResponseLastVerificationDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompanyQualifiedLocTntResponseLastVerificationDate_QNAME, XMLGregorianCalendar.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Remaining_Contract_with_Competitor", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseRemainingContractWithCompetitor(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseRemainingContractWithCompetitor_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Company_Name", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseCompanyName(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseCompanyName_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SIC_Division", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseSICDivision(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseSICDivision_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Tenant_Status", scope = CompanyQualifiedLocTntResponse.class)
    public JAXBElement<String> createCompanyQualifiedLocTntResponseTenantStatus(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocTntResponseTenantStatus_QNAME, String.class, CompanyQualifiedLocTntResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccUrl", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoAccUrl(String value) {
        return new JAXBElement<String>(_CustomerInfoAccUrl_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Segment", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoSegment(String value) {
        return new JAXBElement<String>(_CustomerInfoSegment_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "UUID", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoUUID(String value) {
        return new JAXBElement<String>(_CustomerInfoUUID_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "name", scope = CustomerInfo.class)
    public JAXBElement<String> createCustomerInfoName(String value) {
        return new JAXBElement<String>(_CustomerInfoName_QNAME, String.class, CustomerInfo.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Assigned_Sales_UserName", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseAssignedSalesUserName(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseAssignedSalesUserName_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Address", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseAddress(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseAddress_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "CLLI_Information", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseCLLIInformation(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseCLLIInformation_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Status", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseStatus(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseStatus_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Zip", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseZip(String value) {
        return new JAXBElement<String>(_ACQLeadZip_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Installation_Interval", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseInstallationInterval(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseInstallationInterval_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "City", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseCity(String value) {
        return new JAXBElement<String>(_ACQLeadCity_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "State", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseState(String value) {
        return new JAXBElement<String>(_ACQLeadState_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MTU_Geolocation_Longitude", scope = CompanyQualifiedResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedResponseMTUGeolocationLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedResponseMTUGeolocationLongitude_QNAME, BigDecimal.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "isDeleted", scope = CompanyQualifiedResponse.class)
    public JAXBElement<Boolean> createCompanyQualifiedResponseIsDeleted(Boolean value) {
        return new JAXBElement<Boolean>(_CompanyQualifiedResponseIsDeleted_QNAME, Boolean.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Validation_Status", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseValidationStatus(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseValidationStatus_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Direct_Indirect", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseDirectIndirect(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseDirectIndirect_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Assigned_Sales_Professional", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseAssignedSalesProfessional(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseAssignedSalesProfessional_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Assigned_Sales_profile_URL", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseAssignedSalesProfileURL(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseAssignedSalesProfileURL_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Location_Type", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseLocationType(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseLocationType_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Site_Active_Date", scope = CompanyQualifiedResponse.class)
    public JAXBElement<XMLGregorianCalendar> createCompanyQualifiedResponseSiteActiveDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_CompanyQualifiedResponseSiteActiveDate_QNAME, XMLGregorianCalendar.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BuildingId", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseBuildingId(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseBuildingId_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Seq_Id", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseSeqId(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseSeqId_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Country", scope = CompanyQualifiedResponse.class)
    public JAXBElement<String> createCompanyQualifiedResponseCountry(String value) {
        return new JAXBElement<String>(_ACQLeadCountry_QNAME, String.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MTU_Geolocation_Latitude", scope = CompanyQualifiedResponse.class)
    public JAXBElement<BigDecimal> createCompanyQualifiedResponseMTUGeolocationLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_CompanyQualifiedResponseMTUGeolocationLatitude_QNAME, BigDecimal.class, CompanyQualifiedResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Clli", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteClli(String value) {
        return new JAXBElement<String>(_ACQLeadClli_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Comments", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteComments(String value) {
        return new JAXBElement<String>(_ACQLeadComments_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LName", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteLName(String value) {
        return new JAXBElement<String>(_ACQLeadLName_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ConvertLeadURL", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteConvertLeadURL(String value) {
        return new JAXBElement<String>(_ACQLeadConvertLeadURL_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "City", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteCity(String value) {
        return new JAXBElement<String>(_ACQLeadCity_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "State", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteState(String value) {
        return new JAXBElement<String>(_ACQLeadState_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BusPhone", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteBusPhone(String value) {
        return new JAXBElement<String>(_ACQLeadBusPhone_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefeMailAddrs", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteRefeMailAddrs(String value) {
        return new JAXBElement<String>(_ACQLeadRefeMailAddrs_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefSalesCode", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteRefSalesCode(String value) {
        return new JAXBElement<String>(_ACQLeadRefSalesCode_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckNPA", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteTNcheckNPA(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckNPA_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Country", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteCountry(String value) {
        return new JAXBElement<String>(_ACQLeadCountry_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadCreatedDate", scope = ACQLeadMultiSite.class)
    public JAXBElement<XMLGregorianCalendar> createACQLeadMultiSiteLeadCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_ACQLeadLeadCreatedDate_QNAME, XMLGregorianCalendar.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Src", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteSrc(String value) {
        return new JAXBElement<String>(_ACQLeadSrc_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Email", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteEmail(String value) {
        return new JAXBElement<String>(_ACQLeadEmail_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine2", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteAddrLine2(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine2_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Zip", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteZip(String value) {
        return new JAXBElement<String>(_ACQLeadZip_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine1", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteAddrLine1(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine1_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "FName", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteFName(String value) {
        return new JAXBElement<String>(_ACQLeadFName_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadStatus", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteLeadStatus(String value) {
        return new JAXBElement<String>(_ACQLeadLeadStatus_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LocationName", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteLocationName(String value) {
        return new JAXBElement<String>(_ACQLeadLocationName_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Name", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteName(String value) {
        return new JAXBElement<String>(_ACQLeadName_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Descr", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteDescr(String value) {
        return new JAXBElement<String>(_ACQLeadDescr_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckNXX", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteTNcheckNXX(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckNXX_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNRateCenter", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteTNRateCenter(String value) {
        return new JAXBElement<String>(_ACQLeadTNRateCenter_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ContactTN", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteContactTN(String value) {
        return new JAXBElement<String>(_ACQLeadContactTN_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Industry", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteIndustry(String value) {
        return new JAXBElement<String>(_ACQLeadIndustry_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TNcheckQuantity", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteTNcheckQuantity(String value) {
        return new JAXBElement<String>(_ACQLeadTNcheckQuantity_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "RefFName", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteRefFName(String value) {
        return new JAXBElement<String>(_ACQLeadRefFName_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadId", scope = ACQLeadMultiSite.class)
    public JAXBElement<String> createACQLeadMultiSiteLeadId(String value) {
        return new JAXBElement<String>(_ConvertLeadRequestLeadId_QNAME, String.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ApttusIdentifier", scope = ACQLeadMultiSite.class)
    public JAXBElement<Boolean> createACQLeadMultiSiteApttusIdentifier(Boolean value) {
        return new JAXBElement<Boolean>(_ACQLeadMultiSiteApttusIdentifier_QNAME, Boolean.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LeadAge", scope = ACQLeadMultiSite.class)
    public JAXBElement<BigDecimal> createACQLeadMultiSiteLeadAge(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_ACQLeadLeadAge_QNAME, BigDecimal.class, ACQLeadMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccountId", scope = SearchByAccountIdRequest.class)
    public JAXBElement<String> createSearchByAccountIdRequestAccountId(String value) {
        return new JAXBElement<String>(_SearchByAccountIdRequestAccountId_QNAME, String.class, SearchByAccountIdRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingAccountId", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingAccountId(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingAccountId_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingAccountName", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingAccountName(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingAccountName_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingAccountOwner", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingAccountOwner(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingAccountOwner_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingAccountOwnerURL", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingAccountOwnerURL(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingAccountOwnerURL_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingAcctEntity", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingAcctEntity(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingAcctEntity_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BillingSystem", scope = BillingAccountDetails.class)
    public JAXBElement<String> createBillingAccountDetailsBillingSystem(String value) {
        return new JAXBElement<String>(_BillingAccountDetailsBillingSystem_QNAME, String.class, BillingAccountDetails.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Comments", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationComments(String value) {
        return new JAXBElement<String>(_ACQLeadComments_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "LName", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationLName(String value) {
        return new JAXBElement<String>(_ACQLeadLName_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Products", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationProducts(String value) {
        return new JAXBElement<String>(_ACQLeadProducts_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Email", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationEmail(String value) {
        return new JAXBElement<String>(_ACQLeadEmail_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine2", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationAddrLine2(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine2_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Zip", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationZip(String value) {
        return new JAXBElement<String>(_ACQLeadZip_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddrLine1", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationAddrLine1(String value) {
        return new JAXBElement<String>(_ACQLeadAddrLine1_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "FName", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationFName(String value) {
        return new JAXBElement<String>(_ACQLeadFName_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Source", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationSource(String value) {
        return new JAXBElement<String>(_ServiceLocationSource_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Longitude", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationLongitude(String value) {
        return new JAXBElement<String>(_ACQLeadLongitude_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcCLLI", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationSwcCLLI(String value) {
        return new JAXBElement<String>(_ACQLeadSwcCLLI_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ContactTN", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationContactTN(String value) {
        return new JAXBElement<String>(_ACQLeadContactTN_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Latitude", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationLatitude(String value) {
        return new JAXBElement<String>(_ACQLeadLatitude_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "City", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationCity(String value) {
        return new JAXBElement<String>(_ACQLeadCity_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "H", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationH(String value) {
        return new JAXBElement<String>(_ACQLeadH_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ServiceLocationId", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationServiceLocationId(String value) {
        return new JAXBElement<String>(_ServiceLocationServiceLocationId_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "State", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationState(String value) {
        return new JAXBElement<String>(_ACQLeadState_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "V", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationV(String value) {
        return new JAXBElement<String>(_ACQLeadV_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcNXX", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationSwcNXX(String value) {
        return new JAXBElement<String>(_ACQLeadSwcNXX_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "PrimaryTN", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationPrimaryTN(String value) {
        return new JAXBElement<String>(_ACQLeadPrimaryTN_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Double }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AddressID", scope = ServiceLocation.class)
    public JAXBElement<Double> createServiceLocationAddressID(Double value) {
        return new JAXBElement<Double>(_ServiceLocationAddressID_QNAME, Double.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "SwcNPA", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationSwcNPA(String value) {
        return new JAXBElement<String>(_ACQLeadSwcNPA_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "name", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationName(String value) {
        return new JAXBElement<String>(_CustomerInfoName_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Country", scope = ServiceLocation.class)
    public JAXBElement<String> createServiceLocationCountry(String value) {
        return new JAXBElement<String>(_ACQLeadCountry_QNAME, String.class, ServiceLocation.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = CustomerSearchResponse.class)
    public JAXBElement<String> createCustomerSearchResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, CustomerSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ErrorMsg", scope = CustomerSearchResponse.class)
    public JAXBElement<String> createCustomerSearchResponseErrorMsg(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseErrorMsg_QNAME, String.class, CustomerSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = CustomerSearchResponse.class)
    public JAXBElement<Integer> createCustomerSearchResponseTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, CustomerSearchResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "OpportunityUrl", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataOpportunityUrl(String value) {
        return new JAXBElement<String>(_OpportunityDataOpportunityUrl_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyCloseDate", scope = OpportunityData.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityDataOpptyCloseDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityDataOpptyCloseDate_QNAME, XMLGregorianCalendar.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "postalCode", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataPostalCode(String value) {
        return new JAXBElement<String>(_OpportunityDataPostalCode_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocState", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataServiceLocState(String value) {
        return new JAXBElement<String>(_OpportunityDataServiceLocState_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "products", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataProducts(String value) {
        return new JAXBElement<String>(_OpportunityDataProducts_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocLatitude", scope = OpportunityData.class)
    public JAXBElement<BigDecimal> createOpportunityDataServiceLocLatitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityDataServiceLocLatitude_QNAME, BigDecimal.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "totalMRC", scope = OpportunityData.class)
    public JAXBElement<BigDecimal> createOpportunityDataTotalMRC(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityDataTotalMRC_QNAME, BigDecimal.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "industry", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataIndustry(String value) {
        return new JAXBElement<String>(_OpportunityDataIndustry_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocCity", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataServiceLocCity(String value) {
        return new JAXBElement<String>(_OpportunityDataServiceLocCity_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyStage", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataOpptyStage(String value) {
        return new JAXBElement<String>(_OpportunityDataOpptyStage_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "businessName", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataBusinessName(String value) {
        return new JAXBElement<String>(_OpportunityDataBusinessName_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyCreatedDate", scope = OpportunityData.class)
    public JAXBElement<XMLGregorianCalendar> createOpportunityDataOpptyCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_OpportunityDataOpptyCreatedDate_QNAME, XMLGregorianCalendar.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyName", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataOpptyName(String value) {
        return new JAXBElement<String>(_OpportunityDataOpptyName_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "forecastCategory", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataForecastCategory(String value) {
        return new JAXBElement<String>(_OpportunityDataForecastCategory_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocCountry", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataServiceLocCountry(String value) {
        return new JAXBElement<String>(_OpportunityDataServiceLocCountry_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyId", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataOpptyId(String value) {
        return new JAXBElement<String>(_OpportunityDataOpptyId_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocAddress", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataServiceLocAddress(String value) {
        return new JAXBElement<String>(_OpportunityDataServiceLocAddress_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocAddressLine2", scope = OpportunityData.class)
    public JAXBElement<String> createOpportunityDataServiceLocAddressLine2(String value) {
        return new JAXBElement<String>(_OpportunityDataServiceLocAddressLine2_QNAME, String.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "serviceLocLongitude", scope = OpportunityData.class)
    public JAXBElement<BigDecimal> createOpportunityDataServiceLocLongitude(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_OpportunityDataServiceLocLongitude_QNAME, BigDecimal.class, OpportunityData.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = GetLeadResponseMultiSite.class)
    public JAXBElement<String> createGetLeadResponseMultiSiteMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, GetLeadResponseMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = GetLeadResponseMultiSite.class)
    public JAXBElement<String> createGetLeadResponseMultiSiteMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, GetLeadResponseMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = GetLeadResponseMultiSite.class)
    public JAXBElement<Integer> createGetLeadResponseMultiSiteTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, GetLeadResponseMultiSite.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = GetOpportunityResponse.class)
    public JAXBElement<String> createGetOpportunityResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, GetOpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = GetOpportunityResponse.class)
    public JAXBElement<String> createGetOpportunityResponseMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, GetOpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = GetOpportunityResponse.class)
    public JAXBElement<Integer> createGetOpportunityResponseTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, GetOpportunityResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "OpportunityId", scope = SearchResults.class)
    public JAXBElement<String> createSearchResultsOpportunityId(String value) {
        return new JAXBElement<String>(_SearchResultsOpportunityId_QNAME, String.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccountId", scope = SearchResults.class)
    public JAXBElement<String> createSearchResultsAccountId(String value) {
        return new JAXBElement<String>(_SearchByAccountIdRequestAccountId_QNAME, String.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "isBillingAcctExists", scope = SearchResults.class)
    public JAXBElement<Boolean> createSearchResultsIsBillingAcctExists(Boolean value) {
        return new JAXBElement<Boolean>(_SearchResultsIsBillingAcctExists_QNAME, Boolean.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccountName", scope = SearchResults.class)
    public JAXBElement<String> createSearchResultsAccountName(String value) {
        return new JAXBElement<String>(_SearchResultsAccountName_QNAME, String.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "isTooManyBAcctsExists", scope = SearchResults.class)
    public JAXBElement<Boolean> createSearchResultsIsTooManyBAcctsExists(Boolean value) {
        return new JAXBElement<Boolean>(_SearchResultsIsTooManyBAcctsExists_QNAME, Boolean.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "billingAcctEntity", scope = SearchResults.class)
    public JAXBElement<String> createSearchResultsBillingAcctEntity(String value) {
        return new JAXBElement<String>(_SearchResultsBillingAcctEntity_QNAME, String.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "prospectingStatus", scope = SearchResults.class)
    public JAXBElement<String> createSearchResultsProspectingStatus(String value) {
        return new JAXBElement<String>(_SearchResultsProspectingStatus_QNAME, String.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link javax.xml.datatype.XMLGregorianCalendar }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "CreatedDate", scope = SearchResults.class)
    public JAXBElement<XMLGregorianCalendar> createSearchResultsCreatedDate(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_SearchResultsCreatedDate_QNAME, XMLGregorianCalendar.class, SearchResults.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = GetopportunityRequest.class)
    public JAXBElement<String> createGetopportunityRequestOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, GetopportunityRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Offset", scope = GetopportunityRequest.class)
    public JAXBElement<Integer> createGetopportunityRequestOffset(Integer value) {
        return new JAXBElement<Integer>(_GetopportunityRequestOffset_QNAME, Integer.class, GetopportunityRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyId", scope = GetopportunityRequest.class)
    public JAXBElement<String> createGetopportunityRequestOpptyId(String value) {
        return new JAXBElement<String>(_OpportunityDataOpptyId_QNAME, String.class, GetopportunityRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ThresholdLimit", scope = GetopportunityRequest.class)
    public JAXBElement<Integer> createGetopportunityRequestThresholdLimit(Integer value) {
        return new JAXBElement<Integer>(_GetopportunityRequestThresholdLimit_QNAME, Integer.class, GetopportunityRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "opptyStage", scope = GetopportunityRequest.class)
    public JAXBElement<String> createGetopportunityRequestOpptyStage(String value) {
        return new JAXBElement<String>(_OpportunityDataOpptyStage_QNAME, String.class, GetopportunityRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "BuildingId", scope = CompanyQualifiedLocTntRequest.class)
    public JAXBElement<String> createCompanyQualifiedLocTntRequestBuildingId(String value) {
        return new JAXBElement<String>(_CompanyQualifiedResponseBuildingId_QNAME, String.class, CompanyQualifiedLocTntRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = UpdateLeadsResponse2 .class)
    public JAXBElement<String> createUpdateLeadsResponse2MessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, UpdateLeadsResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = UpdateLeadsResponse2 .class)
    public JAXBElement<String> createUpdateLeadsResponse2MessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, UpdateLeadsResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = GetLeadResponse.class)
    public JAXBElement<String> createGetLeadResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, GetLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = GetLeadResponse.class)
    public JAXBElement<String> createGetLeadResponseMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, GetLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "TotalNumber", scope = GetLeadResponse.class)
    public JAXBElement<Integer> createGetLeadResponseTotalNumber(Integer value) {
        return new JAXBElement<Integer>(_CompanyQualifiedLocResponseTotalNumber_QNAME, Integer.class, GetLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "val", scope = QualificationAttr.class)
    public JAXBElement<String> createQualificationAttrVal(String value) {
        return new JAXBElement<String>(_QualificationAttrVal_QNAME, String.class, QualificationAttr.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "key", scope = QualificationAttr.class)
    public JAXBElement<String> createQualificationAttrKey(String value) {
        return new JAXBElement<String>(_QualificationAttrKey_QNAME, String.class, QualificationAttr.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "State_Code", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestStateCode(String value) {
        return new JAXBElement<String>(_GetLeadRequestStateCode_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "leadId", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestLeadId(String value) {
        return new JAXBElement<String>(_GetLeadRequestLeadId_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Offset", scope = GetLeadRequest.class)
    public JAXBElement<Integer> createGetLeadRequestOffset(Integer value) {
        return new JAXBElement<Integer>(_GetopportunityRequestOffset_QNAME, Integer.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "status", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestStatus(String value) {
        return new JAXBElement<String>(_GetLeadRequestStatus_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Integer }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ThresholdLimit", scope = GetLeadRequest.class)
    public JAXBElement<Integer> createGetLeadRequestThresholdLimit(Integer value) {
        return new JAXBElement<Integer>(_GetopportunityRequestThresholdLimit_QNAME, Integer.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Zip_Code", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestZipCode(String value) {
        return new JAXBElement<String>(_GetLeadRequestZipCode_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Campaign_Codes", scope = GetLeadRequest.class)
    public JAXBElement<String> createGetLeadRequestCampaignCodes(String value) {
        return new JAXBElement<String>(_GetLeadRequestCampaignCodes_QNAME, String.class, GetLeadRequest.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccountSegmentCode", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<String> createSearchByAccountIdResponse2AccountSegmentCode(String value) {
        return new JAXBElement<String>(_SearchByAccountIdResponse2AccountSegmentCode_QNAME, String.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link QCCBillingAccountDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "QCCBillingAcctDetails", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<QCCBillingAccountDetails> createSearchByAccountIdResponse2QCCBillingAcctDetails(QCCBillingAccountDetails value) {
        return new JAXBElement<QCCBillingAccountDetails>(_SearchByAccountIdResponse2QCCBillingAcctDetails_QNAME, QCCBillingAccountDetails.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<String> createSearchByAccountIdResponse2MessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link QCBillingAccountDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "QCBillingAcctDetails", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<QCBillingAccountDetails> createSearchByAccountIdResponse2QCBillingAcctDetails(QCBillingAccountDetails value) {
        return new JAXBElement<QCBillingAccountDetails>(_SearchByAccountIdResponse2QCBillingAcctDetails_QNAME, QCBillingAccountDetails.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link CTLBillingAccountDetails }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "CTLBillingAcctDetails", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<CTLBillingAccountDetails> createSearchByAccountIdResponse2CTLBillingAcctDetails(CTLBillingAccountDetails value) {
        return new JAXBElement<CTLBillingAccountDetails>(_SearchByAccountIdResponse2CTLBillingAcctDetails_QNAME, CTLBillingAccountDetails.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "AccountName", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<String> createSearchByAccountIdResponse2AccountName(String value) {
        return new JAXBElement<String>(_SearchResultsAccountName_QNAME, String.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "CustomerTBR", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<BigDecimal> createSearchByAccountIdResponse2CustomerTBR(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SearchByAccountIdResponse2CustomerTBR_QNAME, BigDecimal.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link Boolean }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "isTooManyBAcctsExists", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<Boolean> createSearchByAccountIdResponse2IsTooManyBAcctsExists(Boolean value) {
        return new JAXBElement<Boolean>(_SearchResultsIsTooManyBAcctsExists_QNAME, Boolean.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link java.math.BigDecimal }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "NoOfBillingAccounts", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<BigDecimal> createSearchByAccountIdResponse2NoOfBillingAccounts(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_SearchByAccountIdResponse2NoOfBillingAccounts_QNAME, BigDecimal.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "ErrorMsg", scope = SearchByAccountIdResponse2 .class)
    public JAXBElement<String> createSearchByAccountIdResponse2ErrorMsg(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseErrorMsg_QNAME, String.class, SearchByAccountIdResponse2 .class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "OpportunityUrl", scope = ConvertLeadResponse.class)
    public JAXBElement<String> createConvertLeadResponseOpportunityUrl(String value) {
        return new JAXBElement<String>(_OpportunityDataOpportunityUrl_QNAME, String.class, ConvertLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "OpportunityId", scope = ConvertLeadResponse.class)
    public JAXBElement<String> createConvertLeadResponseOpportunityId(String value) {
        return new JAXBElement<String>(_SearchResultsOpportunityId_QNAME, String.class, ConvertLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "Owner", scope = ConvertLeadResponse.class)
    public JAXBElement<String> createConvertLeadResponseOwner(String value) {
        return new JAXBElement<String>(_ACQLeadOwner_QNAME, String.class, ConvertLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageCode", scope = ConvertLeadResponse.class)
    public JAXBElement<String> createConvertLeadResponseMessageCode(String value) {
        return new JAXBElement<String>(_CompanyQualifiedLocResponseMessageCode_QNAME, String.class, ConvertLeadResponse.class, value);
    }

    /**
     * Create an instance of {@link javax.xml.bind.JAXBElement }{@code <}{@link String }{@code >}}
     *
     */
    @XmlElementDecl(namespace = "http://soap.sforce.com/schemas/class/WS_ACQ_Leads", name = "MessageDesc", scope = ConvertLeadResponse.class)
    public JAXBElement<String> createConvertLeadResponseMessageDesc(String value) {
        return new JAXBElement<String>(_ReturnCustomersResponseMessageDesc_QNAME, String.class, ConvertLeadResponse.class, value);
    }

}
