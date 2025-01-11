
package org.coderic.ws.dian.wsdl;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the org.coderic.ws.dian.wsdl package. 
 * <p>An ObjectFactory allows you to programmatically 
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

    private static final QName _ExchangeEmailResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", "ExchangeEmailResponse");
    private static final QName _DianResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "DianResponse");
    private static final QName _ArrayOfDianResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "ArrayOfDianResponse");
    private static final QName _ArrayOfstring_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/Arrays", "ArrayOfstring");
    private static final QName _UploadDocumentResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/UploadDocumentResponse", "UploadDocumentResponse");
    private static final QName _ArrayOfXmlParamsResponseTrackId_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "ArrayOfXmlParamsResponseTrackId");
    private static final QName _XmlParamsResponseTrackId_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "XmlParamsResponseTrackId");
    private static final QName _NumberRangeResponseList_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponseList", "NumberRangeResponseList");
    private static final QName _ArrayOfNumberRangeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "ArrayOfNumberRangeResponse");
    private static final QName _NumberRangeResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "NumberRangeResponse");
    private static final QName _EventResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/EventResponse", "EventResponse");
    private static final QName _DocIdentifierWithEventsResponse_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", "DocIdentifierWithEventsResponse");
    private static final QName _AnyType_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyType");
    private static final QName _AnyURI_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "anyURI");
    private static final QName _Base64Binary_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "base64Binary");
    private static final QName _Boolean_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "boolean");
    private static final QName _Byte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "byte");
    private static final QName _DateTime_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "dateTime");
    private static final QName _Decimal_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "decimal");
    private static final QName _Double_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "double");
    private static final QName _Float_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "float");
    private static final QName _Int_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "int");
    private static final QName _Long_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "long");
    private static final QName _QName_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "QName");
    private static final QName _Short_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "short");
    private static final QName _String_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "string");
    private static final QName _UnsignedByte_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedByte");
    private static final QName _UnsignedInt_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedInt");
    private static final QName _UnsignedLong_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedLong");
    private static final QName _UnsignedShort_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "unsignedShort");
    private static final QName _Char_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "char");
    private static final QName _Duration_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "duration");
    private static final QName _Guid_QNAME = new QName("http://schemas.microsoft.com/2003/10/Serialization/", "guid");
    private static final QName _GetExchangeEmailsResponseGetExchangeEmailsResult_QNAME = new QName("http://wcf.dian.colombia", "GetExchangeEmailsResult");
    private static final QName _GetStatusTrackId_QNAME = new QName("http://wcf.dian.colombia", "trackId");
    private static final QName _GetStatusResponseGetStatusResult_QNAME = new QName("http://wcf.dian.colombia", "GetStatusResult");
    private static final QName _GetStatusZipResponseGetStatusZipResult_QNAME = new QName("http://wcf.dian.colombia", "GetStatusZipResult");
    private static final QName _GetStatusEventResponseGetStatusEventResult_QNAME = new QName("http://wcf.dian.colombia", "GetStatusEventResult");
    private static final QName _SendBillAsyncFileName_QNAME = new QName("http://wcf.dian.colombia", "fileName");
    private static final QName _SendBillAsyncContentFile_QNAME = new QName("http://wcf.dian.colombia", "contentFile");
    private static final QName _SendBillAsyncResponseSendBillAsyncResult_QNAME = new QName("http://wcf.dian.colombia", "SendBillAsyncResult");
    private static final QName _SendTestSetAsyncTestSetId_QNAME = new QName("http://wcf.dian.colombia", "testSetId");
    private static final QName _SendTestSetAsyncResponseSendTestSetAsyncResult_QNAME = new QName("http://wcf.dian.colombia", "SendTestSetAsyncResult");
    private static final QName _SendBillSyncResponseSendBillSyncResult_QNAME = new QName("http://wcf.dian.colombia", "SendBillSyncResult");
    private static final QName _SendBillAttachmentAsyncResponseSendBillAttachmentAsyncResult_QNAME = new QName("http://wcf.dian.colombia", "SendBillAttachmentAsyncResult");
    private static final QName _SendEventUpdateStatusResponseSendEventUpdateStatusResult_QNAME = new QName("http://wcf.dian.colombia", "SendEventUpdateStatusResult");
    private static final QName _SendNominaSyncResponseSendNominaSyncResult_QNAME = new QName("http://wcf.dian.colombia", "SendNominaSyncResult");
    private static final QName _GetNumberingRangeAccountCode_QNAME = new QName("http://wcf.dian.colombia", "accountCode");
    private static final QName _GetNumberingRangeAccountCodeT_QNAME = new QName("http://wcf.dian.colombia", "accountCodeT");
    private static final QName _GetNumberingRangeSoftwareCode_QNAME = new QName("http://wcf.dian.colombia", "softwareCode");
    private static final QName _GetNumberingRangeResponseGetNumberingRangeResult_QNAME = new QName("http://wcf.dian.colombia", "GetNumberingRangeResult");
    private static final QName _GetXmlByDocumentKeyResponseGetXmlByDocumentKeyResult_QNAME = new QName("http://wcf.dian.colombia", "GetXmlByDocumentKeyResult");
    private static final QName _GetDocIdentifierWithEventsContributorCode_QNAME = new QName("http://wcf.dian.colombia", "contributorCode");
    private static final QName _GetDocIdentifierWithEventsDateNumber_QNAME = new QName("http://wcf.dian.colombia", "dateNumber");
    private static final QName _GetDocIdentifierWithEventsResponseGetDocIdentifierWithEventsResult_QNAME = new QName("http://wcf.dian.colombia", "GetDocIdentifierWithEventsResult");
    private static final QName _GetReferenceNotesResponseGetReferenceNotesResult_QNAME = new QName("http://wcf.dian.colombia", "GetReferenceNotesResult");
    private static final QName _NumberRangeResponseResolutionNumber_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "ResolutionNumber");
    private static final QName _NumberRangeResponseResolutionDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "ResolutionDate");
    private static final QName _NumberRangeResponsePrefix_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "Prefix");
    private static final QName _NumberRangeResponseValidDateFrom_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "ValidDateFrom");
    private static final QName _NumberRangeResponseValidDateTo_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "ValidDateTo");
    private static final QName _NumberRangeResponseTechnicalKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponse", "TechnicalKey");
    private static final QName _XmlParamsResponseTrackIdDocumentKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "DocumentKey");
    private static final QName _XmlParamsResponseTrackIdProcessedMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "ProcessedMessage");
    private static final QName _XmlParamsResponseTrackIdSenderCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "SenderCode");
    private static final QName _XmlParamsResponseTrackIdXmlFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", "XmlFileName");
    private static final QName _DocIdentifierWithEventsResponseCsvBase64Bytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", "CsvBase64Bytes");
    private static final QName _DocIdentifierWithEventsResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", "Message");
    private static final QName _DocIdentifierWithEventsResponseStatusCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", "StatusCode");
    private static final QName _EventResponseCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/EventResponse", "Code");
    private static final QName _EventResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/EventResponse", "Message");
    private static final QName _EventResponseValidationDate_QNAME = new QName("http://schemas.datacontract.org/2004/07/EventResponse", "ValidationDate");
    private static final QName _EventResponseXmlBytesBase64_QNAME = new QName("http://schemas.datacontract.org/2004/07/EventResponse", "XmlBytesBase64");
    private static final QName _NumberRangeResponseListOperationCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponseList", "OperationCode");
    private static final QName _NumberRangeResponseListOperationDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponseList", "OperationDescription");
    private static final QName _NumberRangeResponseListResponseList_QNAME = new QName("http://schemas.datacontract.org/2004/07/NumberRangeResponseList", "ResponseList");
    private static final QName _UploadDocumentResponseErrorMessageList_QNAME = new QName("http://schemas.datacontract.org/2004/07/UploadDocumentResponse", "ErrorMessageList");
    private static final QName _UploadDocumentResponseZipKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/UploadDocumentResponse", "ZipKey");
    private static final QName _DianResponseErrorMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "ErrorMessage");
    private static final QName _DianResponseStatusCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "StatusCode");
    private static final QName _DianResponseStatusDescription_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "StatusDescription");
    private static final QName _DianResponseStatusMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "StatusMessage");
    private static final QName _DianResponseXmlBase64Bytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "XmlBase64Bytes");
    private static final QName _DianResponseXmlBytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "XmlBytes");
    private static final QName _DianResponseXmlDocumentKey_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "XmlDocumentKey");
    private static final QName _DianResponseXmlFileName_QNAME = new QName("http://schemas.datacontract.org/2004/07/DianResponse", "XmlFileName");
    private static final QName _ExchangeEmailResponseCsvBase64Bytes_QNAME = new QName("http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", "CsvBase64Bytes");
    private static final QName _ExchangeEmailResponseMessage_QNAME = new QName("http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", "Message");
    private static final QName _ExchangeEmailResponseStatusCode_QNAME = new QName("http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", "StatusCode");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: org.coderic.ws.dian.wsdl
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetExchangeEmails }
     * 
     * @return
     *     the new instance of {@link GetExchangeEmails }
     */
    public GetExchangeEmails createGetExchangeEmails() {
        return new GetExchangeEmails();
    }

    /**
     * Create an instance of {@link GetExchangeEmailsResponse }
     * 
     * @return
     *     the new instance of {@link GetExchangeEmailsResponse }
     */
    public GetExchangeEmailsResponse createGetExchangeEmailsResponse() {
        return new GetExchangeEmailsResponse();
    }

    /**
     * Create an instance of {@link ExchangeEmailResponse }
     * 
     * @return
     *     the new instance of {@link ExchangeEmailResponse }
     */
    public ExchangeEmailResponse createExchangeEmailResponse() {
        return new ExchangeEmailResponse();
    }

    /**
     * Create an instance of {@link GetStatus }
     * 
     * @return
     *     the new instance of {@link GetStatus }
     */
    public GetStatus createGetStatus() {
        return new GetStatus();
    }

    /**
     * Create an instance of {@link GetStatusResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusResponse }
     */
    public GetStatusResponse createGetStatusResponse() {
        return new GetStatusResponse();
    }

    /**
     * Create an instance of {@link DianResponse }
     * 
     * @return
     *     the new instance of {@link DianResponse }
     */
    public DianResponse createDianResponse() {
        return new DianResponse();
    }

    /**
     * Create an instance of {@link GetStatusZip }
     * 
     * @return
     *     the new instance of {@link GetStatusZip }
     */
    public GetStatusZip createGetStatusZip() {
        return new GetStatusZip();
    }

    /**
     * Create an instance of {@link GetStatusZipResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusZipResponse }
     */
    public GetStatusZipResponse createGetStatusZipResponse() {
        return new GetStatusZipResponse();
    }

    /**
     * Create an instance of {@link ArrayOfDianResponse }
     * 
     * @return
     *     the new instance of {@link ArrayOfDianResponse }
     */
    public ArrayOfDianResponse createArrayOfDianResponse() {
        return new ArrayOfDianResponse();
    }

    /**
     * Create an instance of {@link GetStatusEvent }
     * 
     * @return
     *     the new instance of {@link GetStatusEvent }
     */
    public GetStatusEvent createGetStatusEvent() {
        return new GetStatusEvent();
    }

    /**
     * Create an instance of {@link GetStatusEventResponse }
     * 
     * @return
     *     the new instance of {@link GetStatusEventResponse }
     */
    public GetStatusEventResponse createGetStatusEventResponse() {
        return new GetStatusEventResponse();
    }

    /**
     * Create an instance of {@link SendBillAsync }
     * 
     * @return
     *     the new instance of {@link SendBillAsync }
     */
    public SendBillAsync createSendBillAsync() {
        return new SendBillAsync();
    }

    /**
     * Create an instance of {@link SendBillAsyncResponse }
     * 
     * @return
     *     the new instance of {@link SendBillAsyncResponse }
     */
    public SendBillAsyncResponse createSendBillAsyncResponse() {
        return new SendBillAsyncResponse();
    }

    /**
     * Create an instance of {@link UploadDocumentResponse }
     * 
     * @return
     *     the new instance of {@link UploadDocumentResponse }
     */
    public UploadDocumentResponse createUploadDocumentResponse() {
        return new UploadDocumentResponse();
    }

    /**
     * Create an instance of {@link SendTestSetAsync }
     * 
     * @return
     *     the new instance of {@link SendTestSetAsync }
     */
    public SendTestSetAsync createSendTestSetAsync() {
        return new SendTestSetAsync();
    }

    /**
     * Create an instance of {@link SendTestSetAsyncResponse }
     * 
     * @return
     *     the new instance of {@link SendTestSetAsyncResponse }
     */
    public SendTestSetAsyncResponse createSendTestSetAsyncResponse() {
        return new SendTestSetAsyncResponse();
    }

    /**
     * Create an instance of {@link SendBillSync }
     * 
     * @return
     *     the new instance of {@link SendBillSync }
     */
    public SendBillSync createSendBillSync() {
        return new SendBillSync();
    }

    /**
     * Create an instance of {@link SendBillSyncResponse }
     * 
     * @return
     *     the new instance of {@link SendBillSyncResponse }
     */
    public SendBillSyncResponse createSendBillSyncResponse() {
        return new SendBillSyncResponse();
    }

    /**
     * Create an instance of {@link SendBillAttachmentAsync }
     * 
     * @return
     *     the new instance of {@link SendBillAttachmentAsync }
     */
    public SendBillAttachmentAsync createSendBillAttachmentAsync() {
        return new SendBillAttachmentAsync();
    }

    /**
     * Create an instance of {@link SendBillAttachmentAsyncResponse }
     * 
     * @return
     *     the new instance of {@link SendBillAttachmentAsyncResponse }
     */
    public SendBillAttachmentAsyncResponse createSendBillAttachmentAsyncResponse() {
        return new SendBillAttachmentAsyncResponse();
    }

    /**
     * Create an instance of {@link SendEventUpdateStatus }
     * 
     * @return
     *     the new instance of {@link SendEventUpdateStatus }
     */
    public SendEventUpdateStatus createSendEventUpdateStatus() {
        return new SendEventUpdateStatus();
    }

    /**
     * Create an instance of {@link SendEventUpdateStatusResponse }
     * 
     * @return
     *     the new instance of {@link SendEventUpdateStatusResponse }
     */
    public SendEventUpdateStatusResponse createSendEventUpdateStatusResponse() {
        return new SendEventUpdateStatusResponse();
    }

    /**
     * Create an instance of {@link SendNominaSync }
     * 
     * @return
     *     the new instance of {@link SendNominaSync }
     */
    public SendNominaSync createSendNominaSync() {
        return new SendNominaSync();
    }

    /**
     * Create an instance of {@link SendNominaSyncResponse }
     * 
     * @return
     *     the new instance of {@link SendNominaSyncResponse }
     */
    public SendNominaSyncResponse createSendNominaSyncResponse() {
        return new SendNominaSyncResponse();
    }

    /**
     * Create an instance of {@link GetNumberingRange }
     * 
     * @return
     *     the new instance of {@link GetNumberingRange }
     */
    public GetNumberingRange createGetNumberingRange() {
        return new GetNumberingRange();
    }

    /**
     * Create an instance of {@link GetNumberingRangeResponse }
     * 
     * @return
     *     the new instance of {@link GetNumberingRangeResponse }
     */
    public GetNumberingRangeResponse createGetNumberingRangeResponse() {
        return new GetNumberingRangeResponse();
    }

    /**
     * Create an instance of {@link NumberRangeResponseList }
     * 
     * @return
     *     the new instance of {@link NumberRangeResponseList }
     */
    public NumberRangeResponseList createNumberRangeResponseList() {
        return new NumberRangeResponseList();
    }

    /**
     * Create an instance of {@link GetXmlByDocumentKey }
     * 
     * @return
     *     the new instance of {@link GetXmlByDocumentKey }
     */
    public GetXmlByDocumentKey createGetXmlByDocumentKey() {
        return new GetXmlByDocumentKey();
    }

    /**
     * Create an instance of {@link GetXmlByDocumentKeyResponse }
     * 
     * @return
     *     the new instance of {@link GetXmlByDocumentKeyResponse }
     */
    public GetXmlByDocumentKeyResponse createGetXmlByDocumentKeyResponse() {
        return new GetXmlByDocumentKeyResponse();
    }

    /**
     * Create an instance of {@link EventResponse }
     * 
     * @return
     *     the new instance of {@link EventResponse }
     */
    public EventResponse createEventResponse() {
        return new EventResponse();
    }

    /**
     * Create an instance of {@link GetDocIdentifierWithEvents }
     * 
     * @return
     *     the new instance of {@link GetDocIdentifierWithEvents }
     */
    public GetDocIdentifierWithEvents createGetDocIdentifierWithEvents() {
        return new GetDocIdentifierWithEvents();
    }

    /**
     * Create an instance of {@link GetDocIdentifierWithEventsResponse }
     * 
     * @return
     *     the new instance of {@link GetDocIdentifierWithEventsResponse }
     */
    public GetDocIdentifierWithEventsResponse createGetDocIdentifierWithEventsResponse() {
        return new GetDocIdentifierWithEventsResponse();
    }

    /**
     * Create an instance of {@link DocIdentifierWithEventsResponse }
     * 
     * @return
     *     the new instance of {@link DocIdentifierWithEventsResponse }
     */
    public DocIdentifierWithEventsResponse createDocIdentifierWithEventsResponse() {
        return new DocIdentifierWithEventsResponse();
    }

    /**
     * Create an instance of {@link GetReferenceNotes }
     * 
     * @return
     *     the new instance of {@link GetReferenceNotes }
     */
    public GetReferenceNotes createGetReferenceNotes() {
        return new GetReferenceNotes();
    }

    /**
     * Create an instance of {@link GetReferenceNotesResponse }
     * 
     * @return
     *     the new instance of {@link GetReferenceNotesResponse }
     */
    public GetReferenceNotesResponse createGetReferenceNotesResponse() {
        return new GetReferenceNotesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfstring }
     * 
     * @return
     *     the new instance of {@link ArrayOfstring }
     */
    public ArrayOfstring createArrayOfstring() {
        return new ArrayOfstring();
    }

    /**
     * Create an instance of {@link ArrayOfXmlParamsResponseTrackId }
     * 
     * @return
     *     the new instance of {@link ArrayOfXmlParamsResponseTrackId }
     */
    public ArrayOfXmlParamsResponseTrackId createArrayOfXmlParamsResponseTrackId() {
        return new ArrayOfXmlParamsResponseTrackId();
    }

    /**
     * Create an instance of {@link XmlParamsResponseTrackId }
     * 
     * @return
     *     the new instance of {@link XmlParamsResponseTrackId }
     */
    public XmlParamsResponseTrackId createXmlParamsResponseTrackId() {
        return new XmlParamsResponseTrackId();
    }

    /**
     * Create an instance of {@link ArrayOfNumberRangeResponse }
     * 
     * @return
     *     the new instance of {@link ArrayOfNumberRangeResponse }
     */
    public ArrayOfNumberRangeResponse createArrayOfNumberRangeResponse() {
        return new ArrayOfNumberRangeResponse();
    }

    /**
     * Create an instance of {@link NumberRangeResponse }
     * 
     * @return
     *     the new instance of {@link NumberRangeResponse }
     */
    public NumberRangeResponse createNumberRangeResponse() {
        return new NumberRangeResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", name = "ExchangeEmailResponse")
    public JAXBElement<ExchangeEmailResponse> createExchangeEmailResponse(ExchangeEmailResponse value) {
        return new JAXBElement<>(_ExchangeEmailResponse_QNAME, ExchangeEmailResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "DianResponse")
    public JAXBElement<DianResponse> createDianResponse(DianResponse value) {
        return new JAXBElement<>(_DianResponse_QNAME, DianResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "ArrayOfDianResponse")
    public JAXBElement<ArrayOfDianResponse> createArrayOfDianResponse(ArrayOfDianResponse value) {
        return new JAXBElement<>(_ArrayOfDianResponse_QNAME, ArrayOfDianResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/Arrays", name = "ArrayOfstring")
    public JAXBElement<ArrayOfstring> createArrayOfstring(ArrayOfstring value) {
        return new JAXBElement<>(_ArrayOfstring_QNAME, ArrayOfstring.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", name = "UploadDocumentResponse")
    public JAXBElement<UploadDocumentResponse> createUploadDocumentResponse(UploadDocumentResponse value) {
        return new JAXBElement<>(_UploadDocumentResponse_QNAME, UploadDocumentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "ArrayOfXmlParamsResponseTrackId")
    public JAXBElement<ArrayOfXmlParamsResponseTrackId> createArrayOfXmlParamsResponseTrackId(ArrayOfXmlParamsResponseTrackId value) {
        return new JAXBElement<>(_ArrayOfXmlParamsResponseTrackId_QNAME, ArrayOfXmlParamsResponseTrackId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XmlParamsResponseTrackId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XmlParamsResponseTrackId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "XmlParamsResponseTrackId")
    public JAXBElement<XmlParamsResponseTrackId> createXmlParamsResponseTrackId(XmlParamsResponseTrackId value) {
        return new JAXBElement<>(_XmlParamsResponseTrackId_QNAME, XmlParamsResponseTrackId.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberRangeResponseList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberRangeResponseList }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", name = "NumberRangeResponseList")
    public JAXBElement<NumberRangeResponseList> createNumberRangeResponseList(NumberRangeResponseList value) {
        return new JAXBElement<>(_NumberRangeResponseList_QNAME, NumberRangeResponseList.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "ArrayOfNumberRangeResponse")
    public JAXBElement<ArrayOfNumberRangeResponse> createArrayOfNumberRangeResponse(ArrayOfNumberRangeResponse value) {
        return new JAXBElement<>(_ArrayOfNumberRangeResponse_QNAME, ArrayOfNumberRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberRangeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberRangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "NumberRangeResponse")
    public JAXBElement<NumberRangeResponse> createNumberRangeResponse(NumberRangeResponse value) {
        return new JAXBElement<>(_NumberRangeResponse_QNAME, NumberRangeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EventResponse", name = "EventResponse")
    public JAXBElement<EventResponse> createEventResponse(EventResponse value) {
        return new JAXBElement<>(_EventResponse_QNAME, EventResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocIdentifierWithEventsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocIdentifierWithEventsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", name = "DocIdentifierWithEventsResponse")
    public JAXBElement<DocIdentifierWithEventsResponse> createDocIdentifierWithEventsResponse(DocIdentifierWithEventsResponse value) {
        return new JAXBElement<>(_DocIdentifierWithEventsResponse_QNAME, DocIdentifierWithEventsResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Object }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyType")
    public JAXBElement<Object> createAnyType(Object value) {
        return new JAXBElement<>(_AnyType_QNAME, Object.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "anyURI")
    public JAXBElement<String> createAnyURI(String value) {
        return new JAXBElement<>(_AnyURI_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "base64Binary")
    public JAXBElement<byte[]> createBase64Binary(byte[] value) {
        return new JAXBElement<>(_Base64Binary_QNAME, byte[].class, null, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Boolean }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "boolean")
    public JAXBElement<Boolean> createBoolean(Boolean value) {
        return new JAXBElement<>(_Boolean_QNAME, Boolean.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Byte }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "byte")
    public JAXBElement<Byte> createByte(Byte value) {
        return new JAXBElement<>(_Byte_QNAME, Byte.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Double }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "double")
    public JAXBElement<Double> createDouble(Double value) {
        return new JAXBElement<>(_Double_QNAME, Double.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Float }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "float")
    public JAXBElement<Float> createFloat(Float value) {
        return new JAXBElement<>(_Float_QNAME, Float.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "int")
    public JAXBElement<Integer> createInt(Integer value) {
        return new JAXBElement<>(_Int_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "long")
    public JAXBElement<Long> createLong(Long value) {
        return new JAXBElement<>(_Long_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link QName }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "QName")
    public JAXBElement<QName> createQName(QName value) {
        return new JAXBElement<>(_QName_QNAME, QName.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "short")
    public JAXBElement<Short> createShort(Short value) {
        return new JAXBElement<>(_Short_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Short }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedByte")
    public JAXBElement<Short> createUnsignedByte(Short value) {
        return new JAXBElement<>(_UnsignedByte_QNAME, Short.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Long }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedInt")
    public JAXBElement<Long> createUnsignedInt(Long value) {
        return new JAXBElement<>(_UnsignedInt_QNAME, Long.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedLong")
    public JAXBElement<BigInteger> createUnsignedLong(BigInteger value) {
        return new JAXBElement<>(_UnsignedLong_QNAME, BigInteger.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "unsignedShort")
    public JAXBElement<Integer> createUnsignedShort(Integer value) {
        return new JAXBElement<>(_UnsignedShort_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Integer }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "char")
    public JAXBElement<Integer> createChar(Integer value) {
        return new JAXBElement<>(_Char_QNAME, Integer.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link Duration }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "duration")
    public JAXBElement<Duration> createDuration(Duration value) {
        return new JAXBElement<>(_Duration_QNAME, Duration.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.microsoft.com/2003/10/Serialization/", name = "guid")
    public JAXBElement<String> createGuid(String value) {
        return new JAXBElement<>(_Guid_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetExchangeEmailsResult", scope = GetExchangeEmailsResponse.class)
    public JAXBElement<ExchangeEmailResponse> createGetExchangeEmailsResponseGetExchangeEmailsResult(ExchangeEmailResponse value) {
        return new JAXBElement<>(_GetExchangeEmailsResponseGetExchangeEmailsResult_QNAME, ExchangeEmailResponse.class, GetExchangeEmailsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "trackId", scope = GetStatus.class)
    public JAXBElement<String> createGetStatusTrackId(String value) {
        return new JAXBElement<>(_GetStatusTrackId_QNAME, String.class, GetStatus.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetStatusResult", scope = GetStatusResponse.class)
    public JAXBElement<DianResponse> createGetStatusResponseGetStatusResult(DianResponse value) {
        return new JAXBElement<>(_GetStatusResponseGetStatusResult_QNAME, DianResponse.class, GetStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "trackId", scope = GetStatusZip.class)
    public JAXBElement<String> createGetStatusZipTrackId(String value) {
        return new JAXBElement<>(_GetStatusTrackId_QNAME, String.class, GetStatusZip.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetStatusZipResult", scope = GetStatusZipResponse.class)
    public JAXBElement<ArrayOfDianResponse> createGetStatusZipResponseGetStatusZipResult(ArrayOfDianResponse value) {
        return new JAXBElement<>(_GetStatusZipResponseGetStatusZipResult_QNAME, ArrayOfDianResponse.class, GetStatusZipResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "trackId", scope = GetStatusEvent.class)
    public JAXBElement<String> createGetStatusEventTrackId(String value) {
        return new JAXBElement<>(_GetStatusTrackId_QNAME, String.class, GetStatusEvent.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetStatusEventResult", scope = GetStatusEventResponse.class)
    public JAXBElement<DianResponse> createGetStatusEventResponseGetStatusEventResult(DianResponse value) {
        return new JAXBElement<>(_GetStatusEventResponseGetStatusEventResult_QNAME, DianResponse.class, GetStatusEventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "fileName", scope = SendBillAsync.class)
    public JAXBElement<String> createSendBillAsyncFileName(String value) {
        return new JAXBElement<>(_SendBillAsyncFileName_QNAME, String.class, SendBillAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendBillAsync.class)
    public JAXBElement<byte[]> createSendBillAsyncContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendBillAsync.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendBillAsyncResult", scope = SendBillAsyncResponse.class)
    public JAXBElement<UploadDocumentResponse> createSendBillAsyncResponseSendBillAsyncResult(UploadDocumentResponse value) {
        return new JAXBElement<>(_SendBillAsyncResponseSendBillAsyncResult_QNAME, UploadDocumentResponse.class, SendBillAsyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "fileName", scope = SendTestSetAsync.class)
    public JAXBElement<String> createSendTestSetAsyncFileName(String value) {
        return new JAXBElement<>(_SendBillAsyncFileName_QNAME, String.class, SendTestSetAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendTestSetAsync.class)
    public JAXBElement<byte[]> createSendTestSetAsyncContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendTestSetAsync.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "testSetId", scope = SendTestSetAsync.class)
    public JAXBElement<String> createSendTestSetAsyncTestSetId(String value) {
        return new JAXBElement<>(_SendTestSetAsyncTestSetId_QNAME, String.class, SendTestSetAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendTestSetAsyncResult", scope = SendTestSetAsyncResponse.class)
    public JAXBElement<UploadDocumentResponse> createSendTestSetAsyncResponseSendTestSetAsyncResult(UploadDocumentResponse value) {
        return new JAXBElement<>(_SendTestSetAsyncResponseSendTestSetAsyncResult_QNAME, UploadDocumentResponse.class, SendTestSetAsyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "fileName", scope = SendBillSync.class)
    public JAXBElement<String> createSendBillSyncFileName(String value) {
        return new JAXBElement<>(_SendBillAsyncFileName_QNAME, String.class, SendBillSync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendBillSync.class)
    public JAXBElement<byte[]> createSendBillSyncContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendBillSync.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendBillSyncResult", scope = SendBillSyncResponse.class)
    public JAXBElement<DianResponse> createSendBillSyncResponseSendBillSyncResult(DianResponse value) {
        return new JAXBElement<>(_SendBillSyncResponseSendBillSyncResult_QNAME, DianResponse.class, SendBillSyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "fileName", scope = SendBillAttachmentAsync.class)
    public JAXBElement<String> createSendBillAttachmentAsyncFileName(String value) {
        return new JAXBElement<>(_SendBillAsyncFileName_QNAME, String.class, SendBillAttachmentAsync.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendBillAttachmentAsync.class)
    public JAXBElement<byte[]> createSendBillAttachmentAsyncContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendBillAttachmentAsync.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendBillAttachmentAsyncResult", scope = SendBillAttachmentAsyncResponse.class)
    public JAXBElement<UploadDocumentResponse> createSendBillAttachmentAsyncResponseSendBillAttachmentAsyncResult(UploadDocumentResponse value) {
        return new JAXBElement<>(_SendBillAttachmentAsyncResponseSendBillAttachmentAsyncResult_QNAME, UploadDocumentResponse.class, SendBillAttachmentAsyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendEventUpdateStatus.class)
    public JAXBElement<byte[]> createSendEventUpdateStatusContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendEventUpdateStatus.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendEventUpdateStatusResult", scope = SendEventUpdateStatusResponse.class)
    public JAXBElement<DianResponse> createSendEventUpdateStatusResponseSendEventUpdateStatusResult(DianResponse value) {
        return new JAXBElement<>(_SendEventUpdateStatusResponseSendEventUpdateStatusResult_QNAME, DianResponse.class, SendEventUpdateStatusResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contentFile", scope = SendNominaSync.class)
    public JAXBElement<byte[]> createSendNominaSyncContentFile(byte[] value) {
        return new JAXBElement<>(_SendBillAsyncContentFile_QNAME, byte[].class, SendNominaSync.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "SendNominaSyncResult", scope = SendNominaSyncResponse.class)
    public JAXBElement<DianResponse> createSendNominaSyncResponseSendNominaSyncResult(DianResponse value) {
        return new JAXBElement<>(_SendNominaSyncResponseSendNominaSyncResult_QNAME, DianResponse.class, SendNominaSyncResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "accountCode", scope = GetNumberingRange.class)
    public JAXBElement<String> createGetNumberingRangeAccountCode(String value) {
        return new JAXBElement<>(_GetNumberingRangeAccountCode_QNAME, String.class, GetNumberingRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "accountCodeT", scope = GetNumberingRange.class)
    public JAXBElement<String> createGetNumberingRangeAccountCodeT(String value) {
        return new JAXBElement<>(_GetNumberingRangeAccountCodeT_QNAME, String.class, GetNumberingRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "softwareCode", scope = GetNumberingRange.class)
    public JAXBElement<String> createGetNumberingRangeSoftwareCode(String value) {
        return new JAXBElement<>(_GetNumberingRangeSoftwareCode_QNAME, String.class, GetNumberingRange.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link NumberRangeResponseList }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link NumberRangeResponseList }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetNumberingRangeResult", scope = GetNumberingRangeResponse.class)
    public JAXBElement<NumberRangeResponseList> createGetNumberingRangeResponseGetNumberingRangeResult(NumberRangeResponseList value) {
        return new JAXBElement<>(_GetNumberingRangeResponseGetNumberingRangeResult_QNAME, NumberRangeResponseList.class, GetNumberingRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "trackId", scope = GetXmlByDocumentKey.class)
    public JAXBElement<String> createGetXmlByDocumentKeyTrackId(String value) {
        return new JAXBElement<>(_GetStatusTrackId_QNAME, String.class, GetXmlByDocumentKey.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link EventResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetXmlByDocumentKeyResult", scope = GetXmlByDocumentKeyResponse.class)
    public JAXBElement<EventResponse> createGetXmlByDocumentKeyResponseGetXmlByDocumentKeyResult(EventResponse value) {
        return new JAXBElement<>(_GetXmlByDocumentKeyResponseGetXmlByDocumentKeyResult_QNAME, EventResponse.class, GetXmlByDocumentKeyResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "contributorCode", scope = GetDocIdentifierWithEvents.class)
    public JAXBElement<String> createGetDocIdentifierWithEventsContributorCode(String value) {
        return new JAXBElement<>(_GetDocIdentifierWithEventsContributorCode_QNAME, String.class, GetDocIdentifierWithEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "dateNumber", scope = GetDocIdentifierWithEvents.class)
    public JAXBElement<String> createGetDocIdentifierWithEventsDateNumber(String value) {
        return new JAXBElement<>(_GetDocIdentifierWithEventsDateNumber_QNAME, String.class, GetDocIdentifierWithEvents.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DocIdentifierWithEventsResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DocIdentifierWithEventsResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetDocIdentifierWithEventsResult", scope = GetDocIdentifierWithEventsResponse.class)
    public JAXBElement<DocIdentifierWithEventsResponse> createGetDocIdentifierWithEventsResponseGetDocIdentifierWithEventsResult(DocIdentifierWithEventsResponse value) {
        return new JAXBElement<>(_GetDocIdentifierWithEventsResponseGetDocIdentifierWithEventsResult_QNAME, DocIdentifierWithEventsResponse.class, GetDocIdentifierWithEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "trackId", scope = GetReferenceNotes.class)
    public JAXBElement<String> createGetReferenceNotesTrackId(String value) {
        return new JAXBElement<>(_GetStatusTrackId_QNAME, String.class, GetReferenceNotes.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://wcf.dian.colombia", name = "GetReferenceNotesResult", scope = GetReferenceNotesResponse.class)
    public JAXBElement<DianResponse> createGetReferenceNotesResponseGetReferenceNotesResult(DianResponse value) {
        return new JAXBElement<>(_GetReferenceNotesResponseGetReferenceNotesResult_QNAME, DianResponse.class, GetReferenceNotesResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "ResolutionNumber", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponseResolutionNumber(String value) {
        return new JAXBElement<>(_NumberRangeResponseResolutionNumber_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "ResolutionDate", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponseResolutionDate(String value) {
        return new JAXBElement<>(_NumberRangeResponseResolutionDate_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "Prefix", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponsePrefix(String value) {
        return new JAXBElement<>(_NumberRangeResponsePrefix_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "ValidDateFrom", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponseValidDateFrom(String value) {
        return new JAXBElement<>(_NumberRangeResponseValidDateFrom_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "ValidDateTo", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponseValidDateTo(String value) {
        return new JAXBElement<>(_NumberRangeResponseValidDateTo_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", name = "TechnicalKey", scope = NumberRangeResponse.class)
    public JAXBElement<String> createNumberRangeResponseTechnicalKey(String value) {
        return new JAXBElement<>(_NumberRangeResponseTechnicalKey_QNAME, String.class, NumberRangeResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "DocumentKey", scope = XmlParamsResponseTrackId.class)
    public JAXBElement<String> createXmlParamsResponseTrackIdDocumentKey(String value) {
        return new JAXBElement<>(_XmlParamsResponseTrackIdDocumentKey_QNAME, String.class, XmlParamsResponseTrackId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "ProcessedMessage", scope = XmlParamsResponseTrackId.class)
    public JAXBElement<String> createXmlParamsResponseTrackIdProcessedMessage(String value) {
        return new JAXBElement<>(_XmlParamsResponseTrackIdProcessedMessage_QNAME, String.class, XmlParamsResponseTrackId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "SenderCode", scope = XmlParamsResponseTrackId.class)
    public JAXBElement<String> createXmlParamsResponseTrackIdSenderCode(String value) {
        return new JAXBElement<>(_XmlParamsResponseTrackIdSenderCode_QNAME, String.class, XmlParamsResponseTrackId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", name = "XmlFileName", scope = XmlParamsResponseTrackId.class)
    public JAXBElement<String> createXmlParamsResponseTrackIdXmlFileName(String value) {
        return new JAXBElement<>(_XmlParamsResponseTrackIdXmlFileName_QNAME, String.class, XmlParamsResponseTrackId.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", name = "CsvBase64Bytes", scope = DocIdentifierWithEventsResponse.class)
    public JAXBElement<byte[]> createDocIdentifierWithEventsResponseCsvBase64Bytes(byte[] value) {
        return new JAXBElement<>(_DocIdentifierWithEventsResponseCsvBase64Bytes_QNAME, byte[].class, DocIdentifierWithEventsResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", name = "Message", scope = DocIdentifierWithEventsResponse.class)
    public JAXBElement<String> createDocIdentifierWithEventsResponseMessage(String value) {
        return new JAXBElement<>(_DocIdentifierWithEventsResponseMessage_QNAME, String.class, DocIdentifierWithEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DocIdentifierWithEventsResponse", name = "StatusCode", scope = DocIdentifierWithEventsResponse.class)
    public JAXBElement<String> createDocIdentifierWithEventsResponseStatusCode(String value) {
        return new JAXBElement<>(_DocIdentifierWithEventsResponseStatusCode_QNAME, String.class, DocIdentifierWithEventsResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EventResponse", name = "Code", scope = EventResponse.class)
    public JAXBElement<String> createEventResponseCode(String value) {
        return new JAXBElement<>(_EventResponseCode_QNAME, String.class, EventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EventResponse", name = "Message", scope = EventResponse.class)
    public JAXBElement<String> createEventResponseMessage(String value) {
        return new JAXBElement<>(_EventResponseMessage_QNAME, String.class, EventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EventResponse", name = "ValidationDate", scope = EventResponse.class)
    public JAXBElement<String> createEventResponseValidationDate(String value) {
        return new JAXBElement<>(_EventResponseValidationDate_QNAME, String.class, EventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/EventResponse", name = "XmlBytesBase64", scope = EventResponse.class)
    public JAXBElement<String> createEventResponseXmlBytesBase64(String value) {
        return new JAXBElement<>(_EventResponseXmlBytesBase64_QNAME, String.class, EventResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", name = "OperationCode", scope = NumberRangeResponseList.class)
    public JAXBElement<String> createNumberRangeResponseListOperationCode(String value) {
        return new JAXBElement<>(_NumberRangeResponseListOperationCode_QNAME, String.class, NumberRangeResponseList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", name = "OperationDescription", scope = NumberRangeResponseList.class)
    public JAXBElement<String> createNumberRangeResponseListOperationDescription(String value) {
        return new JAXBElement<>(_NumberRangeResponseListOperationDescription_QNAME, String.class, NumberRangeResponseList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", name = "ResponseList", scope = NumberRangeResponseList.class)
    public JAXBElement<ArrayOfNumberRangeResponse> createNumberRangeResponseListResponseList(ArrayOfNumberRangeResponse value) {
        return new JAXBElement<>(_NumberRangeResponseListResponseList_QNAME, ArrayOfNumberRangeResponse.class, NumberRangeResponseList.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", name = "ErrorMessageList", scope = UploadDocumentResponse.class)
    public JAXBElement<ArrayOfXmlParamsResponseTrackId> createUploadDocumentResponseErrorMessageList(ArrayOfXmlParamsResponseTrackId value) {
        return new JAXBElement<>(_UploadDocumentResponseErrorMessageList_QNAME, ArrayOfXmlParamsResponseTrackId.class, UploadDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", name = "ZipKey", scope = UploadDocumentResponse.class)
    public JAXBElement<String> createUploadDocumentResponseZipKey(String value) {
        return new JAXBElement<>(_UploadDocumentResponseZipKey_QNAME, String.class, UploadDocumentResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "ErrorMessage", scope = DianResponse.class)
    public JAXBElement<ArrayOfstring> createDianResponseErrorMessage(ArrayOfstring value) {
        return new JAXBElement<>(_DianResponseErrorMessage_QNAME, ArrayOfstring.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "StatusCode", scope = DianResponse.class)
    public JAXBElement<String> createDianResponseStatusCode(String value) {
        return new JAXBElement<>(_DianResponseStatusCode_QNAME, String.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "StatusDescription", scope = DianResponse.class)
    public JAXBElement<String> createDianResponseStatusDescription(String value) {
        return new JAXBElement<>(_DianResponseStatusDescription_QNAME, String.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "StatusMessage", scope = DianResponse.class)
    public JAXBElement<String> createDianResponseStatusMessage(String value) {
        return new JAXBElement<>(_DianResponseStatusMessage_QNAME, String.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "XmlBase64Bytes", scope = DianResponse.class)
    public JAXBElement<byte[]> createDianResponseXmlBase64Bytes(byte[] value) {
        return new JAXBElement<>(_DianResponseXmlBase64Bytes_QNAME, byte[].class, DianResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "XmlBytes", scope = DianResponse.class)
    public JAXBElement<byte[]> createDianResponseXmlBytes(byte[] value) {
        return new JAXBElement<>(_DianResponseXmlBytes_QNAME, byte[].class, DianResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "XmlDocumentKey", scope = DianResponse.class)
    public JAXBElement<String> createDianResponseXmlDocumentKey(String value) {
        return new JAXBElement<>(_DianResponseXmlDocumentKey_QNAME, String.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/DianResponse", name = "XmlFileName", scope = DianResponse.class)
    public JAXBElement<String> createDianResponseXmlFileName(String value) {
        return new JAXBElement<>(_DianResponseXmlFileName_QNAME, String.class, DianResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", name = "CsvBase64Bytes", scope = ExchangeEmailResponse.class)
    public JAXBElement<byte[]> createExchangeEmailResponseCsvBase64Bytes(byte[] value) {
        return new JAXBElement<>(_ExchangeEmailResponseCsvBase64Bytes_QNAME, byte[].class, ExchangeEmailResponse.class, ((byte[]) value));
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", name = "Message", scope = ExchangeEmailResponse.class)
    public JAXBElement<String> createExchangeEmailResponseMessage(String value) {
        return new JAXBElement<>(_ExchangeEmailResponseMessage_QNAME, String.class, ExchangeEmailResponse.class, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link String }{@code >}
     */
    @XmlElementDecl(namespace = "http://schemas.datacontract.org/2004/07/ExchangeEmailResponse", name = "StatusCode", scope = ExchangeEmailResponse.class)
    public JAXBElement<String> createExchangeEmailResponseStatusCode(String value) {
        return new JAXBElement<>(_ExchangeEmailResponseStatusCode_QNAME, String.class, ExchangeEmailResponse.class, value);
    }

}
