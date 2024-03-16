
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
 *         &lt;element name="SendBillSyncResult" type="{http://schemas.datacontract.org/2004/07/DianResponse}DianResponse" minOccurs="0"/&gt;
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
    "sendBillSyncResult"
})
@XmlRootElement(name = "SendBillSyncResponse")
public class SendBillSyncResponse {

    @XmlElementRef(name = "SendBillSyncResult", namespace = "http://wcf.dian.colombia", type = JAXBElement.class, required = false)
    protected JAXBElement<DianResponse> sendBillSyncResult;

    /**
     * Obtiene el valor de la propiedad sendBillSyncResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     *     
     */
    public JAXBElement<DianResponse> getSendBillSyncResult() {
        return sendBillSyncResult;
    }

    /**
     * Define el valor de la propiedad sendBillSyncResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link DianResponse }{@code >}
     *     
     */
    public void setSendBillSyncResult(JAXBElement<DianResponse> value) {
        this.sendBillSyncResult = value;
    }

}
