package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.NotNegInt;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.CatBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.CatImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Cat
 */
public abstract class Cat implements Comparable<Cat>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(34);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Cat from the terminal
     */
    public static Cat fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new CatImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Cat from the string representation
     */
    public static Cat fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new CatImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Cat read from the stream
     */
    public static Cat fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new CatImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Cat read from the stream
     */
    public static Cat fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new CatImpl(res);
    }

    /**
     * Starts creation of a new Cat
     * @return  Builder interface to set the name field
     */
    public static CatBuilderName create()
    {
        return new CatBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field name
     * @return  The value of the field name
     */
    public abstract Name name();

    /**
     * returns the value of the field lifeCount
     * @return  The value of the field lifeCount
     */
    public abstract NotNegInt lifeCount();


    /**
     * Builder interface for setting the name field of Cat
     */
    public interface CatBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the lifeCount field
         */
        public CatBuilderLifeCount name(Name name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the lifeCount field
         */
        public CatBuilderLifeCount name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the lifeCount field of Cat
     */
    public interface CatBuilderLifeCount
    {

        /**
         * sets the lifeCount field.
         * @param lifeCount  The value to assign to the lifeCount field
         * @return           The created Cat value
         */
        public Cat lifeCount(NotNegInt lifeCount);

        /**
         * sets the lifeCount field.
         * @param lifeCount  The value to assign to the lifeCount field
         * @return           The created Cat value
         */
        public Cat lifeCount(Integer lifeCount) throws InvalidValueException;

    }

}
