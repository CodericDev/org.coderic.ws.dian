
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para UploadDocumentResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="UploadDocumentResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessageList" type="{http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId}ArrayOfXmlParamsResponseTrackId" minOccurs="0"/&gt;
 *         &lt;element name="ZipKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "UploadDocumentResponse", namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", propOrder = {
    "errorMessageList",
    "zipKey"
})
public class UploadDocumentResponse {

    @XmlElementRef(name = "ErrorMessageList", namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfXmlParamsResponseTrackId> errorMessageList;
    @XmlElementRef(name = "ZipKey", namespace = "http://schemas.datacontract.org/2004/07/UploadDocumentResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> zipKey;

    /**
     * Obtiene el valor de la propiedad errorMessageList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     *     
     */
    public JAXBElement<ArrayOfXmlParamsResponseTrackId> getErrorMessageList() {
        return errorMessageList;
    }

    /**
     * Define el valor de la propiedad errorMessageList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfXmlParamsResponseTrackId }{@code >}
     *     
     */
    public void setErrorMessageList(JAXBElement<ArrayOfXmlParamsResponseTrackId> value) {
        this.errorMessageList = value;
    }

    /**
     * Obtiene el valor de la propiedad zipKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getZipKey() {
        return zipKey;
    }

    /**
     * Define el valor de la propiedad zipKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setZipKey(JAXBElement<String> value) {
        this.zipKey = value;
    }

}
