package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.MyIntegerImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: MyInteger
 */
public abstract class MyInteger implements Comparable<MyInteger>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(1);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The MyInteger from the terminal
     */
    public static MyInteger fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MyIntegerImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The MyInteger from the string representation
     */
    public static MyInteger fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MyIntegerImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The MyInteger read from the stream
     */
    public static MyInteger fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MyIntegerImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The MyInteger read from the stream
     */
    public static MyInteger fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new MyIntegerImpl(res);
    }

    /**
     * Call this method to create a new MyInteger value. 
     * @param value  The value of the MyInteger to be created.
     * @return       The newly created MyInteger value
     */
    public static MyInteger create(Integer value)
    {
        return new MyIntegerImpl(MyIntegerImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Integer is a valid MyInteger
     * @param value  The Integer value to be tested
     * @return       true if the provided Integer is a valid MyInteger
     */
    public static boolean isValidMyInteger(Integer value)
    {
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Integer value that is stored in this MyInteger
     * @return  The Integer value stored in this MyInteger
     */
    public abstract Integer value();

    public String toJson(){
        return this.value().toString();
    }
}
