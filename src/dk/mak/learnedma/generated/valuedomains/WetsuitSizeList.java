package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.WetsuitSizeListBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.WetsuitSizeListImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: WetsuitSizeList
 */
public abstract class WetsuitSizeList implements Comparable<WetsuitSizeList>, Iterable<WetsuitSize>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(31);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The WetsuitSizeList from the terminal
     */
    public static WetsuitSizeList fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new WetsuitSizeListImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The WetsuitSizeList from the string representation
     */
    public static WetsuitSizeList fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new WetsuitSizeListImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The WetsuitSizeList read from the stream
     */
    public static WetsuitSizeList fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new WetsuitSizeListImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The WetsuitSizeList read from the stream
     */
    public static WetsuitSizeList fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new WetsuitSizeListImpl(res);
    }

    /**
     * Starts creation of a new WetsuitSizeList
     * @return  Builder interface to build the list
     */
    public static WetsuitSizeListBuilder begin()
    {
        return new WetsuitSizeListBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * Returns the size of this list
     * @return  the size of this list
     */
    public abstract int size();

    /**
     * Returns the element on a given index in this list
     * @param index  The index of the element to be returned
     * @return       the element on the given index in this list
     */
    public abstract WetsuitSize get(int index);


    /**
     * Interface to create a list
     */
    public interface WetsuitSizeListBuilder
    {

        /**
         * Adds an element to the list
         * @param wetsuitSize  The element to be added to the list
         * @return             An interface to the builder for chaining method
         *                     calls
         */
        public WetsuitSizeListBuilder add(WetsuitSize wetsuitSize);

        /**
         * Adds an element to the list
         * @param wetsuitSize  The element to be added to the list
         * @return             An interface to the builder for chaining method
         *                     calls
         */
        public WetsuitSizeListBuilder add(String wetsuitSize) throws InvalidValueException;

        /**
         * Builds the list with the added elements
         * @return  The builded list
         */
        public WetsuitSizeList end() throws InvalidValueException;

    }

}
