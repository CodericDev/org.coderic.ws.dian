
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para XmlParamsResponseTrackId complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="XmlParamsResponseTrackId"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="DocumentKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ProcessedMessage" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="SenderCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Success" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/&gt;
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
@XmlType(name = "XmlParamsResponseTrackId", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", propOrder = {
    "documentKey",
    "processedMessage",
    "senderCode",
    "success",
    "xmlFileName"
})
public class XmlParamsResponseTrackId {

    @XmlElementRef(name = "DocumentKey", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> documentKey;
    @XmlElementRef(name = "ProcessedMessage", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> processedMessage;
    @XmlElementRef(name = "SenderCode", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> senderCode;
    @XmlElement(name = "Success")
    protected Boolean success;
    @XmlElementRef(name = "XmlFileName", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", type = JAXBElement.class, required = false)
    protected JAXBElement<String> xmlFileName;

    /**
     * Obtiene el valor de la propiedad documentKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getDocumentKey() {
        return documentKey;
    }

    /**
     * Define el valor de la propiedad documentKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setDocumentKey(JAXBElement<String> value) {
        this.documentKey = value;
    }

    /**
     * Obtiene el valor de la propiedad processedMessage.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getProcessedMessage() {
        return processedMessage;
    }

    /**
     * Define el valor de la propiedad processedMessage.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setProcessedMessage(JAXBElement<String> value) {
        this.processedMessage = value;
    }

    /**
     * Obtiene el valor de la propiedad senderCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getSenderCode() {
        return senderCode;
    }

    /**
     * Define el valor de la propiedad senderCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setSenderCode(JAXBElement<String> value) {
        this.senderCode = value;
    }

    /**
     * Obtiene el valor de la propiedad success.
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSuccess() {
        return success;
    }

    /**
     * Define el valor de la propiedad success.
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSuccess(Boolean value) {
        this.success = value;
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
