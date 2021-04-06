package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.WetsuitSize;
import dk.mak.learnedma.generated.valuedomains.WetsuitSizeList;
import dk.mak.learnedma.generated.valuedomains.WetsuitSizeList.WetsuitSizeListBuilder;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;
import org.abstractica.edma.valuedomains.exceptions.InvalidValueException;

/**
 * 
 */
public class WetsuitSizeListBuilderImpl implements WetsuitSizeListBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public WetsuitSizeListBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param wetsuitSize  The element to be added to the list
     * @return             An interface to the builder for chaining method calls
     */
    public WetsuitSizeListBuilder add(WetsuitSize wetsuitSize)
    {
        if(wetsuitSize == null) throw new NullPointerException();
        valueList.add(((IValueInstance) wetsuitSize).edma_getValue());
        return this;
    }

    /**
     * Adds an element to the list
     * @param wetsuitSize  The element to be added to the list
     * @return             An interface to the builder for chaining method calls
     */
    public WetsuitSizeListBuilder add(String wetsuitSize) throws InvalidValueException
    {
        if(wetsuitSize == null) throw new NullPointerException();
        WetsuitSizeImpl.edma_validate(wetsuitSize);
        valueList.add(WetsuitSizeImpl.edma_create(wetsuitSize));
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public WetsuitSizeList end() throws InvalidValueException
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        WetsuitSizeListImpl.edma_validate(res);
        return new WetsuitSizeListImpl(WetsuitSizeListImpl.edma_create(res));
    }
}
