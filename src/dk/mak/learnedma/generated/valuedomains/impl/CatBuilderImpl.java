package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Cat;
import dk.mak.learnedma.generated.valuedomains.Cat.CatBuilderLifeCount;
import dk.mak.learnedma.generated.valuedomains.Cat.CatBuilderName;
import dk.mak.learnedma.generated.valuedomains.Name;
import dk.mak.learnedma.generated.valuedomains.NotNegInt;
import dk.mak.learnedma.generated.valuedomains.impl.NameImpl;
import dk.mak.learnedma.generated.valuedomains.impl.NotNegIntImpl;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class CatBuilderImpl implements CatBuilderLifeCount, CatBuilderName
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public CatBuilderImpl()
    {
        edma_value = new Object[2];
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the lifeCount field
     */
    public CatBuilderLifeCount name(Name name)
    {
        if(name == null) throw new NullPointerException("The field name in Cat may not be null");
        edma_value[0] = ((IValueInstance) name).edma_getValue();
        return this;
    }

    /**
     * sets the name field.
     * @param name  The value to assign to the name field
     * @return      Builder interface for setting the lifeCount field
     */
    public CatBuilderLifeCount name(String name) throws InvalidValueException
    {
        if(name != null) NameImpl.edma_validate(name);
        if(name == null) throw new NullPointerException();
        edma_value[0] = NameImpl.edma_create(name);
        return this;
    }

    /**
     * sets the lifeCount field.
     * @param lifeCount  The value to assign to the lifeCount field
     * @return           The created Cat value
     */
    public Cat lifeCount(NotNegInt lifeCount)
    {
        if(lifeCount == null) throw new NullPointerException("The field lifeCount in Cat may not be null");
        edma_value[1] = ((IValueInstance) lifeCount).edma_getValue();
        return new CatImpl(CatImpl.edma_create(edma_value));
    }

    /**
     * sets the lifeCount field.
     * @param lifeCount  The value to assign to the lifeCount field
     * @return           The created Cat value
     */
    public Cat lifeCount(Integer lifeCount) throws InvalidValueException
    {
        if(lifeCount != null) NotNegIntImpl.edma_validate(lifeCount);
        if(lifeCount == null) throw new NullPointerException();
        edma_value[1] = NotNegIntImpl.edma_create(lifeCount);
        return new CatImpl(CatImpl.edma_create(edma_value));
    }
}
