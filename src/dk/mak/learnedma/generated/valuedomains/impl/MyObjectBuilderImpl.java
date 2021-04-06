package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.MyObject;
import dk.mak.learnedma.generated.valuedomains.MyObject.MyObjectBuilder;
import dk.mak.learnedma.generated.valuedomains.Pair;
import java.util.ArrayList;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class MyObjectBuilderImpl implements MyObjectBuilder
{
    private ArrayList<Object> valueList;



    /**
     * Constructor
     */
    public MyObjectBuilderImpl()
    {
        valueList = new ArrayList<Object>();
    }

    /**
     * Adds an element to the list
     * @param pair  The element to be added to the list
     * @return      An interface to the builder for chaining method calls
     */
    public MyObjectBuilder add(Pair pair)
    {
        if(pair == null) throw new NullPointerException();
        valueList.add(((IValueInstance) pair).edma_getValue());
        return this;
    }

    /**
     * Builds the list with the added elements
     * @return  The builded list
     */
    public MyObject end()
    {
        Object[] res = new Object[valueList.size()];
        int pos = 0;
        for(Object o : valueList)
        {
            res[pos++] = o;
        }
        return new MyObjectImpl(MyObjectImpl.edma_create(res));
    }
}
