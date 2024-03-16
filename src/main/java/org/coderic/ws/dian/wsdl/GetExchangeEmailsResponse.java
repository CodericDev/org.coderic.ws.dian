
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
 *         &lt;element name="GetExchangeEmailsResult" type="{http://schemas.datacontract.org/2004/07/ExchangeEmailResponse}ExchangeEmailResponse" minOccurs="0"/&gt;
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
    "getExchangeEmailsResult"
})
@XmlRootElement(name = "GetExchangeEmailsResponse")
public class GetExchangeEmailsResponse {

    @XmlElementRef(name = "GetExchangeEmailsResult", namespace = "http://wcf.dian.colombia", type = JAXBElement.class, required = false)
    protected JAXBElement<ExchangeEmailResponse> getExchangeEmailsResult;

    /**
     * Obtiene el valor de la propiedad getExchangeEmailsResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     *     
     */
    public JAXBElement<ExchangeEmailResponse> getGetExchangeEmailsResult() {
        return getExchangeEmailsResult;
    }

    /**
     * Define el valor de la propiedad getExchangeEmailsResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ExchangeEmailResponse }{@code >}
     *     
     */
    public void setGetExchangeEmailsResult(JAXBElement<ExchangeEmailResponse> value) {
        this.getExchangeEmailsResult = value;
    }

}
