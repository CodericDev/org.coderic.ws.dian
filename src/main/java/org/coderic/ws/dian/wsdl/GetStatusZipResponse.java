
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
 *         <element name="GetStatusZipResult" type="{http://schemas.datacontract.org/2004/07/DianResponse}ArrayOfDianResponse" minOccurs="0"/>
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
    "getStatusZipResult"
})
@XmlRootElement(name = "GetStatusZipResponse")
public class GetStatusZipResponse {

    @XmlElementRef(name = "GetStatusZipResult", namespace = "http://wcf.dian.colombia", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfDianResponse> getStatusZipResult;

    /**
     * Obtiene el valor de la propiedad getStatusZipResult.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfDianResponse> getGetStatusZipResult() {
        return getStatusZipResult;
    }

    /**
     * Define el valor de la propiedad getStatusZipResult.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfDianResponse }{@code >}
     *     
     */
    public void setGetStatusZipResult(JAXBElement<ArrayOfDianResponse> value) {
        this.getStatusZipResult = value;
    }

}
