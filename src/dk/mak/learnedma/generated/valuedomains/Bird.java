package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.PosInt;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.BirdBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.BirdImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Bird
 */
public abstract class Bird implements Comparable<Bird>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(35);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Bird from the terminal
     */
    public static Bird fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new BirdImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Bird from the string representation
     */
    public static Bird fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new BirdImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Bird read from the stream
     */
    public static Bird fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new BirdImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Bird read from the stream
     */
    public static Bird fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new BirdImpl(res);
    }

    /**
     * Starts creation of a new Bird
     * @return  Builder interface to set the name field
     */
    public static BirdBuilderName create()
    {
        return new BirdBuilderImpl();
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
     * returns the value of the field numberOfWings
     * @return  The value of the field numberOfWings
     */
    public abstract PosInt numberOfWings();


    /**
     * Builder interface for setting the name field of Bird
     */
    public interface BirdBuilderName
    {

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the numberOfWings field
         */
        public BirdBuilderNumberOfWings name(Name name);

        /**
         * sets the name field.
         * @param name  The value to assign to the name field
         * @return      Builder interface for setting the numberOfWings field
         */
        public BirdBuilderNumberOfWings name(String name) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the numberOfWings field of Bird
     */
    public interface BirdBuilderNumberOfWings
    {

        /**
         * sets the numberOfWings field.
         * @param numberOfWings  The value to assign to the numberOfWings field
         * @return               The created Bird value
         */
        public Bird numberOfWings(PosInt numberOfWings);

        /**
         * sets the numberOfWings field.
         * @param numberOfWings  The value to assign to the numberOfWings field
         * @return               The created Bird value
         */
        public Bird numberOfWings(Integer numberOfWings) throws InvalidValueException;

    }

}
