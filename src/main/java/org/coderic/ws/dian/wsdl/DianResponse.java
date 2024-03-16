
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DianResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DianResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ErrorMessage" type="{http://schemas.microsoft.com/2003/10/Serialization/Arrays}ArrayOfstring" minOccurs="0"/&gt;
 *         &lt;element name="IsValid" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
 *         &lt;element name="StatusCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="StatusMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XmlBase64Bytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="XmlBytes" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/&gt;
 *         &lt;element name="XmlDocumentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="XmlFileName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DianResponse", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", propOrder = {
    "errorMessage",
    "isValid",
    "statusCode",
    "statusDescription",
    "statusMessage",
    "xmlBase64Bytes",
    "xmlBytes",
    "xmlDocumentKey",
    "xmlFileName"
})
public class DianResponse {

    @XmlElementRef(name = "ErrorMessage", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfstring> errorMessage;
    @XmlElement(name = "IsValid")
    protected Boolean isValid;
    @XmlElementRef(name = "StatusCode", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusCode;
    @XmlElementRef(name = "StatusDescription", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusDescription;
    @XmlElementRef(name = "StatusMessage", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> statusMessage;
    @XmlElementRef(name = "XmlBase64Bytes", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> xmlBase64Bytes;
    @XmlElementRef(name = "XmlBytes", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<byte[]> xmlBytes;
    @XmlElementRef(name = "XmlDocumentKey", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlDocumentKey;
    @XmlElementRef(name = "XmlFileName", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlFileName;

    /**
     * Obtiene el valor de la propiedad errorMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public JAXBElement<ArrayOfstring> getErrorMessage() {
        return errorMessage;
    }

    /**
     * Define el valor de la propiedad errorMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfstring }{@code >}
     *     
     */
    public void setErrorMessage(JAXBElement<ArrayOfstring> value) {
        this.errorMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad isValid.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsValid() {
        return isValid;
    }

    /**
     * Define el valor de la propiedad isValid.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsValid(Boolean value) {
        this.isValid = value;
    }

    /**
     * Obtiene el valor de la propiedad statusCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusCode() {
        return statusCode;
    }

    /**
     * Define el valor de la propiedad statusCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusCode(JAXBElement<String> value) {
        this.statusCode = value;
    }

    /**
     * Obtiene el valor de la propiedad statusDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusDescription() {
        return statusDescription;
    }

    /**
     * Define el valor de la propiedad statusDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusDescription(JAXBElement<String> value) {
        this.statusDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad statusMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getStatusMessage() {
        return statusMessage;
    }

    /**
     * Define el valor de la propiedad statusMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setStatusMessage(JAXBElement<String> value) {
        this.statusMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlBase64Bytes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getXmlBase64Bytes() {
        return xmlBase64Bytes;
    }

    /**
     * Define el valor de la propiedad xmlBase64Bytes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setXmlBase64Bytes(JAXBElement<byte[]> value) {
        this.xmlBase64Bytes = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlBytes.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public JAXBElement<byte[]> getXmlBytes() {
        return xmlBytes;
    }

    /**
     * Define el valor de la propiedad xmlBytes.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link byte[]}{@code >}
     *     
     */
    public void setXmlBytes(JAXBElement<byte[]> value) {
        this.xmlBytes = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlDocumentKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlDocumentKey() {
        return xmlDocumentKey;
    }

    /**
     * Define el valor de la propiedad xmlDocumentKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlDocumentKey(JAXBElement<String> value) {
        this.xmlDocumentKey = value;
    }

    /**
     * Obtiene el valor de la propiedad xmlFileName.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getXmlFileName() {
        return xmlFileName;
    }

    /**
     * Define el valor de la propiedad xmlFileName.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setXmlFileName(JAXBElement<String> value) {
        this.xmlFileName = value;
    }

}
