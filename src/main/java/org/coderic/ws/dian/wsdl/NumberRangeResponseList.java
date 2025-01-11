
package org.coderic.ws.dian.wsdl;

import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElementRef;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para NumberRangeResponseList complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="NumberRangeResponseList">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="OperationCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="OperationDescription" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         <element name="ResponseList" type="{http://schemas.datacontract.org/2004/07/NumberRangeResponse}ArrayOfNumberRangeResponse" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NumberRangeResponseList", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", propOrder = {
    "operationCode",
    "operationDescription",
    "responseList"
})
public class NumberRangeResponseList {

    @XmlElementRef(name = "OperationCode", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationCode;
    @XmlElementRef(name = "OperationDescription", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", type = JAXBElement.class, required = false)
    protected JAXBElement<String> operationDescription;
    @XmlElementRef(name = "ResponseList", namespace = "http://schemas.datacontract.org/2004/07/NumberRangeResponseList", type = JAXBElement.class, required = false)
    protected JAXBElement<ArrayOfNumberRangeResponse> responseList;

    /**
     * Obtiene el valor de la propiedad operationCode.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationCode() {
        return operationCode;
    }

    /**
     * Define el valor de la propiedad operationCode.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationCode(JAXBElement<String> value) {
        this.operationCode = value;
    }

    /**
     * Obtiene el valor de la propiedad operationDescription.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public JAXBElement<String> getOperationDescription() {
        return operationDescription;
    }

    /**
     * Define el valor de la propiedad operationDescription.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link String }{@code >}
     *     
     */
    public void setOperationDescription(JAXBElement<String> value) {
        this.operationDescription = value;
    }

    /**
     * Obtiene el valor de la propiedad responseList.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     *     
     */
    public JAXBElement<ArrayOfNumberRangeResponse> getResponseList() {
        return responseList;
    }

    /**
     * Define el valor de la propiedad responseList.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link ArrayOfNumberRangeResponse }{@code >}
     *     
     */
    public void setResponseList(JAXBElement<ArrayOfNumberRangeResponse> value) {
        this.responseList = value;
    }

}
