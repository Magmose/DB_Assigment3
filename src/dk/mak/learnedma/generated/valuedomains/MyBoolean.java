package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.MyBooleanImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: MyBoolean
 */
public abstract class MyBoolean implements Comparable<MyBoolean>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(2);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The MyBoolean from the terminal
     */
    public static MyBoolean fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new MyBooleanImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The MyBoolean from the string representation
     */
    public static MyBoolean fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new MyBooleanImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The MyBoolean read from the stream
     */
    public static MyBoolean fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new MyBooleanImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The MyBoolean read from the stream
     */
    public static MyBoolean fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new MyBooleanImpl(res);
    }

    /**
     * Call this method to create a new MyBoolean value. 
     * @param value  The value of the MyBoolean to be created.
     * @return       The newly created MyBoolean value
     */
    public static MyBoolean create(Boolean value)
    {
        return new MyBooleanImpl(MyBooleanImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided Boolean is a valid MyBoolean
     * @param value  The Boolean value to be tested
     * @return       true if the provided Boolean is a valid MyBoolean
     */
    public static boolean isValidMyBoolean(Boolean value)
    {
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the Boolean value that is stored in this MyBoolean
     * @return  The Boolean value stored in this MyBoolean
     */
    public abstract Boolean value();

    public String toJson(){
        return this.value().toString();
    }


}
