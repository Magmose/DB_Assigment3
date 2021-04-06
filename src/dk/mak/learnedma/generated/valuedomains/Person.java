package dk.mak.learnedma.generated.valuedomains;

import dk.mak.learnedma.generated.LearnEDMA;
import dk.mak.learnedma.generated.valuedomains.Email;
import dk.mak.learnedma.generated.valuedomains.Mobile;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.external.EDMA_ExternalConstraints;
import dk.mak.learnedma.generated.valuedomains.impl.PersonBuilderImpl;
import dk.mak.learnedma.generated.valuedomains.impl.PersonImpl;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.IOException;
import org.abstractica.edma.valuedomains.IMetaValueDomain;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;
import org.abstractica.edma.valuedomains.userinput.ITerminal;
import org.abstractica.edma.valuedomains.userinput.ValueDomainInput;

/**
 * The representation of a value from the value domain: Person
 */
public abstract class Person implements Comparable<Person>
{
    protected static final IMetaValueDomain edma_domain = LearnEDMA.environment.getValueDomainDefinitions().getValueDomain(30);



    /**
     * Get a value from a terminal
     * @param terminal  The terminal to get the value from
     * @return          The Person from the terminal
     */
    public static Person fromTerminal(ITerminal terminal)
    {
        ValueDomainInput vdi = new ValueDomainInput(terminal, EDMA_ExternalConstraints.instance);
        return new PersonImpl(vdi.getValue(edma_domain));
    }

    /**
     * Get a value from its string representation
     * @param s  The String to parse
     * @return   The Person from the string representation
     */
    public static Person fromString(String s) throws InvalidValueException
    {
        Object res = edma_domain.valueFromString(s, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads and validates a value from a stream
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStream(DataInput in) throws IOException, InvalidValueException
    {
        Object res = edma_domain.readValue(in, EDMA_ExternalConstraints.instance);
        return new PersonImpl(res);
    }

    /**
     * Reads a value from a stream without validating the value
     * @param in  A data input interface for the stream to read from
     * @return    The Person read from the stream
     */
    public static Person fromStreamNoValidate(DataInput in) throws IOException
    {
        Object res = edma_domain.readValueNoValidate(in);
        return new PersonImpl(res);
    }

    /**
     * Starts creation of a new Person
     * @return  Builder interface to set the firstName field
     */
    public static PersonBuilderFirstName create()
    {
        return new PersonBuilderImpl();
    }



    /**
     * Writes this value to a stream
     * @param out  Interface to data output stream
     */
    public abstract void toStream(DataOutput out) throws IOException;

    /**
     * returns the value of the field firstName
     * @return  The value of the field firstName
     */
    public abstract Name firstName();

    /**
     * returns the value of the field lastName
     * @return  The value of the field lastName
     */
    public abstract Name lastName();

    /**
     * returns the value of the field middleName
     * @return  The value of the field middleName
     */
    public abstract Name middleName();

    /**
     * returns the value of the field email
     * @return  The value of the field email
     */
    public abstract Email email();

    /**
     * returns the value of the field mobile
     * @return  The value of the field mobile
     */
    public abstract Mobile mobile();


    /**
     * Builder interface for setting the firstName field of Person
     */
    public interface PersonBuilderFirstName
    {

        /**
         * sets the firstName field.
         * @param firstName  The value to assign to the firstName field
         * @return           Builder interface for setting the lastName field
         */
        public PersonBuilderLastName firstName(Name firstName);

        /**
         * sets the firstName field.
         * @param firstName  The value to assign to the firstName field
         * @return           Builder interface for setting the lastName field
         */
        public PersonBuilderLastName firstName(String firstName) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the lastName field of Person
     */
    public interface PersonBuilderLastName
    {

        /**
         * sets the lastName field.
         * @param lastName  The value to assign to the lastName field
         * @return          Builder interface for setting the middleName field
         */
        public PersonBuilderMiddleName lastName(Name lastName);

        /**
         * sets the lastName field.
         * @param lastName  The value to assign to the lastName field
         * @return          Builder interface for setting the middleName field
         */
        public PersonBuilderMiddleName lastName(String lastName) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the middleName field of Person
     */
    public interface PersonBuilderMiddleName
    {

        /**
         * sets the middleName field.
         * @param middleName  The value to assign to the middleName field
         * @return            Builder interface for setting the email field
         */
        public PersonBuilderEmail middleName(Name middleName);

        /**
         * sets the middleName field.
         * @param middleName  The value to assign to the middleName field
         * @return            Builder interface for setting the email field
         */
        public PersonBuilderEmail middleName(String middleName) throws InvalidValueException;

        /**
         * sets the fieldmiddleName to null.
         * @return  Builder interface for setting the email field
         */
        public PersonBuilderEmail noMiddleName();

    }



    /**
     * Builder interface for setting the email field of Person
     */
    public interface PersonBuilderEmail
    {

        /**
         * sets the email field.
         * @param email  The value to assign to the email field
         * @return       Builder interface for setting the mobile field
         */
        public PersonBuilderMobile email(Email email);

        /**
         * sets the email field.
         * @param email  The value to assign to the email field
         * @return       Builder interface for setting the mobile field
         */
        public PersonBuilderMobile email(String email) throws InvalidValueException;

    }



    /**
     * Builder interface for setting the mobile field of Person
     */
    public interface PersonBuilderMobile
    {

        /**
         * sets the mobile field.
         * @param mobile  The value to assign to the mobile field
         * @return        The created Person value
         */
        public Person mobile(Mobile mobile);

        /**
         * sets the mobile field.
         * @param mobile  The value to assign to the mobile field
         * @return        The created Person value
         */
        public Person mobile(String mobile) throws InvalidValueException;

    }

}
