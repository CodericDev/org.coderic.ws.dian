
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlRootElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType>
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="SendTestSetAsyncResult" type="{http://schemas.datacontract.org/2004/07/UploadDocumentResponse}UploadDocumentResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "sendTestSetAsyncResult"
})
@XmlRootElement(name = "SendTestSetAsyncResponse")
public class SendTestSetAsyncResponse {

    @XmlElementRef(name = "SendTestSetAsyncResult", namespace = "http://wcf.dian.colombia", type = JAXBElement.class, required = false)
    protected JAXBElement<UploadDocumentResponse> sendTestSetAsyncResult;

    /**
     * Obtiene el valor de la propiedad sendTestSetAsyncResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     *     
     */
    public JAXBElement<UploadDocumentResponse> getSendTestSetAsyncResult() {
        return sendTestSetAsyncResult;
    }

    /**
     * Define el valor de la propiedad sendTestSetAsyncResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link UploadDocumentResponse }{@code >}
     *     
     */
    public void setSendTestSetAsyncResult(JAXBElement<UploadDocumentResponse> value) {
        this.sendTestSetAsyncResult = value;
    }

}
