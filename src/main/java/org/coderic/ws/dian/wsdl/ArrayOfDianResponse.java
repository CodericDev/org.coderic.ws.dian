
package org.coderic.ws.dian.wsdl;

import java.util.ArrayList;
import java.util.List;
import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para ArrayOfDianResponse complex type.</p>
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.</p>
 * 
 * <pre>{@code
 * <complexType name="ArrayOfDianResponse">
 *   <complexContent>
 *     <restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       <sequence>
 *         <element name="DianResponse" type="{http://schemas.datacontract.org/2004/07/DianResponse}DianResponse" maxOccurs="unbounded" minOccurs="0"/>
 *       </sequence>
 *     </restriction>
 *   </complexContent>
 * </complexType>
 * }</pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfDianResponse", namespace = "http://schemas.datacontract.org/2004/07/DianResponse", propOrder = {
    "dianResponse"
})
public class ArrayOfDianResponse {

    @XmlElement(name = "DianResponse", nillable = true)
    protected List<DianResponse> dianResponse;

    /**
     * Gets the value of the dianResponse property.
     * 
     * <p>This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dianResponse property.</p>
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * </p>
     * <pre>
     * getDianResponse().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DianResponse }
     * </p>
     * 
     * 
     * @return
     *     The value of the dianResponse property.
     */
    public List<DianResponse> getDianResponse() {
        if (dianResponse == null) {
            dianResponse = new ArrayList<>();
        }
        return this.dianResponse;
    }

}
