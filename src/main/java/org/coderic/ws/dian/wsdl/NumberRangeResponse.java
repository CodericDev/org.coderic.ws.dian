
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumberRangeResponse complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="NumberRangeResponse"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="ResolutionNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ResolutionDate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="Prefix" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="FromNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ToNumber" type="{http://www.w3.org/2001/XMLSchema}long" minOccurs="0"/&gt;
 *         &lt;element name="ValidDateFrom" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="ValidDateTo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="TechnicalKey" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberRangeResponse", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", propOrder = {
    "resolutionNumber",
    "resolutionDate",
    "prefix",
    "fromNumber",
    "toNumber",
    "validDateFrom",
    "validDateTo",
    "technicalKey"
})
public class NumberRangeResponse {

    @XmlElementRef(name = "ResolutionNumber", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolutionNumber;
    @XmlElementRef(name = "ResolutionDate", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> resolutionDate;
    @XmlElementRef(name = "Prefix", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> prefix;
    @XmlElement(name = "FromNumber")
    protected Long fromNumber;
    @XmlElement(name = "ToNumber")
    protected Long toNumber;
    @XmlElementRef(name = "ValidDateFrom", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validDateFrom;
    @XmlElementRef(name = "ValidDateTo", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> validDateTo;
    @XmlElementRef(name = "TechnicalKey", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponse", type = JAXBElement.class, required = false)
    protected JAXBElement<String> technicalKey;

    /**
     * Obtiene el valor de la propiedad resolutionNumber.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolutionNumber() {
        return resolutionNumber;
    }

    /**
     * Define el valor de la propiedad resolutionNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolutionNumber(JAXBElement<String> value) {
        this.resolutionNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad resolutionDate.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getResolutionDate() {
        return resolutionDate;
    }

    /**
     * Define el valor de la propiedad resolutionDate.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setResolutionDate(JAXBElement<String> value) {
        this.resolutionDate = value;
    }

    /**
     * Obtiene el valor de la propiedad prefix.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getPrefix() {
        return prefix;
    }

    /**
     * Define el valor de la propiedad prefix.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setPrefix(JAXBElement<String> value) {
        this.prefix = value;
    }

    /**
     * Obtiene el valor de la propiedad fromNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getFromNumber() {
        return fromNumber;
    }

    /**
     * Define el valor de la propiedad fromNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setFromNumber(Long value) {
        this.fromNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad toNumber.
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getToNumber() {
        return toNumber;
    }

    /**
     * Define el valor de la propiedad toNumber.
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setToNumber(Long value) {
        this.toNumber = value;
    }

    /**
     * Obtiene el valor de la propiedad validDateFrom.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidDateFrom() {
        return validDateFrom;
    }

    /**
     * Define el valor de la propiedad validDateFrom.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidDateFrom(JAXBElement<String> value) {
        this.validDateFrom = value;
    }

    /**
     * Obtiene el valor de la propiedad validDateTo.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getValidDateTo() {
        return validDateTo;
    }

    /**
     * Define el valor de la propiedad validDateTo.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setValidDateTo(JAXBElement<String> value) {
        this.validDateTo = value;
    }

    /**
     * Obtiene el valor de la propiedad technicalKey.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getTechnicalKey() {
        return technicalKey;
    }

    /**
     * Define el valor de la propiedad technicalKey.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setTechnicalKey(JAXBElement<String> value) {
        this.technicalKey = value;
    }

}
