package com.Maps;

import java.util.function.Predicate;

public interface ProductLookupTable {
    Product lookupById(int id);

    void addProduct(Product productToAdd) throws Exception;

    void clear();
}
