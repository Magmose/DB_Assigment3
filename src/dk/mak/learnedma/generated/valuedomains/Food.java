package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.FoodImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Food
 */
public abstract class Food implements Comparable<Food>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(32);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Food from the terminal
     */
    public static Food fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new FoodImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Food from the string representation
     */
    public static Food fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new FoodImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Food read from the stream
     */
    public static Food fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new FoodImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Food read from the stream
     */
    public static Food fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new FoodImpl(res);
    }

    /**
     * Call this method to create a new Food value. 
     * @param value  The value of the Food to be created.
     * @return       The newly created Food value
     */
    public static Food create(String value) throws InvalidValueException
    {
        FoodImpl.edma_validate(value);
        return new FoodImpl(FoodImpl.edma_create(value));
    }

    /**
     * Call this method to test if the provided String is a valid Food
     * @param value  The String value to be tested
     * @return       true if the provided String is a valid Food
     */
    public static boolean isValidFood(String value)
    {
        try
        {
            FoodImpl.edma_validate(value);
        }
        catch(InvalidValueException e)
        {
            return false;
        }
        return true;
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the String value that is stored in this Food
     * @return  The String value stored in this Food
     */
    public abstract String value();
}
