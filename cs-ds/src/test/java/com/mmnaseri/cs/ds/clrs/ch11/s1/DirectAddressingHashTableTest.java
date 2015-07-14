package com.mmnaseri.cs.ds.clrs.ch11.s1;

import com.mmnaseri.cs.ds.clrs.ch11.HashTable;

/**
 * @author Mohammad Milad Naseri (m.m.naseri@gmail.com)
 * @since 1.0 (7/13/15)
 */
public class DirectAddressingHashTableTest extends com.mmnaseri.cs.ds.clrs.ch11.BaseHashTableTest {

    @Override
    protected HashTable<Integer>[] getHashTables() {
        //noinspection unchecked
        return new HashTable[]{new DirectAddressingHashTable<>(10)};
    }

}