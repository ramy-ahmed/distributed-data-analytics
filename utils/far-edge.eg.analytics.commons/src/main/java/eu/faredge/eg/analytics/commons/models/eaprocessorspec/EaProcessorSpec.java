//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.2-147 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2017.11.13 at 03:21:40 �� EET 
//


package eu.faredge.eg.analytics.commons.models.eaprocessorspec;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.faredge.eu/ea/processor}processorType" minOccurs="0"/>
 *         &lt;element ref="{http://www.faredge.eu/ea/processor}processorLocation" minOccurs="0"/>
 *         &lt;element ref="{http://www.faredge.eu/ea/processor}processorName" minOccurs="0"/>
 *         &lt;element ref="{http://www.faredge.eu/ea/processor}ProcessorConfigs" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "processorType",
    "processorLocation",
    "processorName",
    "processorConfigs"
})
@XmlRootElement(name = "EaProcessorSpec")
public class EaProcessorSpec {

    protected String processorType;
    protected String processorLocation;
    protected String processorName;
    @XmlElement(name = "ProcessorConfigs")
    protected ProcessorConfigs processorConfigs;
    @XmlAttribute(name = "id")
    @XmlSchemaType(name = "anyURI")
    protected String id;

    /**
     * Gets the value of the processorType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorType() {
        return processorType;
    }

    /**
     * Sets the value of the processorType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorType(String value) {
        this.processorType = value;
    }

    /**
     * Gets the value of the processorLocation property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorLocation() {
        return processorLocation;
    }

    /**
     * Sets the value of the processorLocation property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorLocation(String value) {
        this.processorLocation = value;
    }

    /**
     * Gets the value of the processorName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessorName() {
        return processorName;
    }

    /**
     * Sets the value of the processorName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessorName(String value) {
        this.processorName = value;
    }

    /**
     * Gets the value of the processorConfigs property.
     * 
     * @return
     *     possible object is
     *     {@link ProcessorConfigs }
     *     
     */
    public ProcessorConfigs getProcessorConfigs() {
        return processorConfigs;
    }

    /**
     * Sets the value of the processorConfigs property.
     * 
     * @param value
     *     allowed object is
     *     {@link ProcessorConfigs }
     *     
     */
    public void setProcessorConfigs(ProcessorConfigs value) {
        this.processorConfigs = value;
    }

    /**
     * Gets the value of the id property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
        return id;
    }

    /**
     * Sets the value of the id property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setId(String value) {
        this.id = value;
    }

}