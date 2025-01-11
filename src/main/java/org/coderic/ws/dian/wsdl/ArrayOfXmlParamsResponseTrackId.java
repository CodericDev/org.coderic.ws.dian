
package org.coderic.ws.dian.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfXmlParamsResponseTrackId complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfXmlParamsResponseTrackId">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="XmlParamsResponseTrackId" type="{http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId}XmlParamsResponseTrackId" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfXmlParamsResponseTrackId", namespace = "http://schemas.datacontract.org/2004/07/XmlParamsResponseTrackId", propOrder = {
    "xmlParamsResponseTrackId"
})
public class ArrayOfXmlParamsResponseTrackId {

    @XmlElement(name = "XmlParamsResponseTrackId", nillable = true)
    protected List<XmlParamsResponseTrackId> xmlParamsResponseTrackId;

    /**
     * Gets the value of the xmlParamsResponseTrackId property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the xmlParamsResponseTrackId property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getXmlParamsResponseTrackId().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link XmlParamsResponseTrackId }
     * </p>
     * 
     * 
     * @return
     *     The value of the xmlParamsResponseTrackId property.
     */
    public List<XmlParamsResponseTrackId> getXmlParamsResponseTrackId() {
        if (xmlParamsResponseTrackId == null) {
            xmlParamsResponseTrackId = new ArrayList<>();
        }
        return this.xmlParamsResponseTrackId;
    }

}
