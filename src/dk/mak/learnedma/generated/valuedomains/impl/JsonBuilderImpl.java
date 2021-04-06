package dk.mak.learnedma.generated.valuedomains.impl;

import dk.mak.learnedma.generated.valuedomains.Json;
import dk.mak.learnedma.generated.valuedomains.Json.JsonBuilderPair;
import dk.mak.learnedma.generated.valuedomains.Pair;
import org.abstractica.edma.valuedomains.IValueInstance;

/**
 * 
 */
public class JsonBuilderImpl implements JsonBuilderPair
{
    private Object[] edma_value;



    /**
     * Constructor
     */
    public JsonBuilderImpl()
    {
        edma_value = new Object[1];
    }

    /**
     * sets the pair field.
     * @param pair  The value to assign to the pair field
     * @return      The created Json value
     */
    public Json pair(Pair pair)
    {
        edma_value[0] = (pair == null ? null : (((IValueInstance) pair).edma_getValue()));
        return new JsonImpl(JsonImpl.edma_create(edma_value));
    }

    /**
     * sets the fieldpair to null.
     * @return  The created Json value
     */
    public Json noPair()
    {
        edma_value[0] = null;
        return new JsonImpl(JsonImpl.edma_create(edma_value));
    }
}
