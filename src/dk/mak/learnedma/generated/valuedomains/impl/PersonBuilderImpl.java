package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Email;
import dk.mak.learnedma.generated.valuedomains.Mobile;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.Person;
import dk.mak.learnedma.generated.valuedomains.Person.PersonBuilderEmail;
import dk.mak.learnedma.generated.valuedomains.Person.PersonBuilderFirstName;
import dk.mak.learnedma.generated.valuedomains.Person.PersonBuilderLastName;
import dk.mak.learnedma.generated.valuedomains.Person.PersonBuilderMiddleName;
import dk.mak.learnedma.generated.valuedomains.Person.PersonBuilderMobile;
import dk.mak.learnedma.generated.valuedomains.impl.EmailImpl;
import dk.mak.learnedma.generated.valuedomains.impl.MobileImpl;
import dk.mak.learnedma.generated.valuedomains.impl.NameImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class PersonBuilderImpl implements PersonBuilderEmail, PersonBuilderFirstName, PersonBuilderLastName, PersonBuilderMiddleName, PersonBuilderMobile
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public PersonBuilderImpl()
    {
        edma_value = new Object[5];
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(Name firstName)
    {
        if(firstName == null) throw new NullPointerException("The field firstName in Person may not be null");
        edma_value[0] = ((IValueInstance) firstName).edma_getValue();
        return this;
    }

    /**
     * sets the firstName field.
     * @param firstName  The value to assign to the firstName field
     * @return           Builder interface for setting the lastName field
     */
    public PersonBuilderLastName firstName(String firstName) throws InvalidValueException
    {
        if(firstName != null) NameImpl.edma_validate(firstName);
        if(firstName == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(firstName);
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the middleName field
     */
    public PersonBuilderMiddleName lastName(Name lastName)
    {
        if(lastName == null) throw new NullPointerException("The field lastName in Person may not be null");
        edma_value[1] = ((IValueInstance) lastName).edma_getValue();
        return this;
    }

    /**
     * sets the lastName field.
     * @param lastName  The value to assign to the lastName field
     * @return          Builder interface for setting the middleName field
     */
    public PersonBuilderMiddleName lastName(String lastName) throws InvalidValueException
    {
        if(lastName != null) NameImpl.edma_validate(lastName);
        if(lastName == null) throw new NullPointerException();
        edma_value[1] = NameImpl.edma_create(lastName);
        return this;
    }

    /**
     * sets the middleName field.
     * @param middleName  The value to assign to the middleName field
     * @return            Builder interface for setting the email field
     */
    public PersonBuilderEmail middleName(Name middleName)
    {
        edma_value[2] = (middleName == null ? null : (((IValueInstance) middleName).edma_getValue()));
        return this;
    }

    /**
     * sets the middleName field.
     * @param middleName  The value to assign to the middleName field
     * @return            Builder interface for setting the email field
     */
    public PersonBuilderEmail middleName(String middleName) throws InvalidValueException
    {
        if(middleName != null) NameImpl.edma_validate(middleName);
        edma_value[2] = (middleName == null ? null : (NameImpl.edma_create(middleName)));
        return this;
    }

    /**
     * sets the fieldmiddleName to null.
     * @return  Builder interface for setting the email field
     */
    public PersonBuilderEmail noMiddleName()
    {
        edma_value[2] = null;
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the mobile field
     */
    public PersonBuilderMobile email(Email email)
    {
        if(email == null) throw new NullPointerException("The field email in Person may not be null");
        edma_value[3] = ((IValueInstance) email).edma_getValue();
        return this;
    }

    /**
     * sets the email field.
     * @param email  The value to assign to the email field
     * @return       Builder interface for setting the mobile field
     */
    public PersonBuilderMobile email(String email) throws InvalidValueException
    {
        if(email != null) EmailImpl.edma_validate(email);
        if(email == null) throw new NullPointerException();
        edma_value[3] = EmailImpl.edma_create(email);
        return this;
    }

    /**
     * sets the mobile field.
     * @param mobile  The value to assign to the mobile field
     * @return        The created Person value
     */
    public Person mobile(Mobile mobile)
    {
        if(mobile == null) throw new NullPointerException("The field mobile in Person may not be null");
        edma_value[4] = ((IValueInstance) mobile).edma_getValue();
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }

    /**
     * sets the mobile field.
     * @param mobile  The value to assign to the mobile field
     * @return        The created Person value
     */
    public Person mobile(String mobile) throws InvalidValueException
    {
        if(mobile != null) MobileImpl.edma_validate(mobile);
        if(mobile == null) throw new NullPointerException();
        edma_value[4] = MobileImpl.edma_create(mobile);
        return new PersonImpl(PersonImpl.edma_create(edma_value));
    }
}
