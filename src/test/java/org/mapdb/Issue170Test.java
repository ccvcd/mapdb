package org.mapdb;

import org.junit.Test;

import java.util.Map;
import java.util.UUID;

@SuppressWarnings({"rawtypes","unchecked"})
public class Issue170Test {

    @Test
    public void test(){
        Map m = DBMaker.memoryDB()
                .compressionEnable()
                .transactionDisable()
                .make().treeMapCreate("test").make();
        int max = UtilsTest.scale()*100000;
        for(int i=0;i<max;i++){
            m.put(UUID.randomUUID().toString(),UUID.randomUUID().toString());
        }

    }
}
