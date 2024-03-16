//
// Este archivo ha sido generado por Eclipse Implementation of JAXB v3.0.0 
// Visite https://eclipse-ee4j.github.io/jaxb-ri 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2024.03.16 a las 06:57:08 AM COT 
//


package oasis.names.specification.ubl.schema.xsd.utilitystatement_2;

import javax.xml.namespace.QName;
import jakarta.xml.bind.JAXBElement;
import jakarta.xml.bind.annotation.XmlElementDecl;
import jakarta.xml.bind.annotation.XmlRegistry;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the oasis.names.specification.ubl.schema.xsd.utilitystatement_2 package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _UtilityStatement_QNAME = new QName("urn:oasis:names:specification:ubl:schema:xsd:UtilityStatement-2", "UtilityStatement");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: oasis.names.specification.ubl.schema.xsd.utilitystatement_2
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link UtilityStatementType }
     * 
     */
    public UtilityStatementType createUtilityStatementType() {
        return new UtilityStatementType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UtilityStatementType }{@code >}
     * 
     * @param value
     *     Java instance representing xml element's value.
     * @return
     *     the new instance of {@link JAXBElement }{@code <}{@link UtilityStatementType }{@code >}
     */
    @XmlElementDecl(namespace = "urn:oasis:names:specification:ubl:schema:xsd:UtilityStatement-2", name = "UtilityStatement")
    public JAXBElement<UtilityStatementType> createUtilityStatement(UtilityStatementType value) {
        return new JAXBElement<UtilityStatementType>(_UtilityStatement_QNAME, UtilityStatementType.class, null, value);
    }

}
