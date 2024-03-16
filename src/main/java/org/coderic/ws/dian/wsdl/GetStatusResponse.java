
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="GetStatusResult" type="{http://schemas.datacontract.org/2004/07/DianResponse}DianResponse" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "getStatusResult"
})
@XmlRootElement(name = "GetStatusResponse")
public class GetStatusResponse {

    @XmlElementRef(name = "GetStatusResult", namespace = "http://wcf.dian.colombia", type = JAXBElement.class, required = false)
    protected JAXBElement<DianResponse> getStatusResult;

    /**
     * Obtiene el valor de la propiedad getStatusResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     *     
     */
    public JAXBElement<DianResponse> getGetStatusResult() {
        return getStatusResult;
    }

    /**
     * Define el valor de la propiedad getStatusResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     *     
     */
    public void setGetStatusResult(JAXBElement<DianResponse> value) {
        this.getStatusResult = value;
    }

}
