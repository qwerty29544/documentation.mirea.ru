package ru.mirea.documentation;


import java.util.Date;
import static org.junit.Assert.*;
import static ru.mirea.documentation.DocumentType.TXT;

public class DocumentTest2 {
    private Document Testeddoc;

    @org.junit.Before
    public void setUp() throws Exception {
Testeddoc=new Document(TXT,21,"zzzz");

    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestSetGetAuthorID() throws Exception {
        int b=2147483647;
        Testeddoc.setAuthorID(b);
        int a=Testeddoc.getAuthorID();
        assertEquals(a,b);
    }

    @org.junit.Test
    public void TestSetGetName() throws Exception {
        Testeddoc.setName("zz");
        String a=Testeddoc.getName();
        assertEquals(a,"zz");
    }

    @org.junit.Test
    public void TestGetData() throws Exception {
       Date a=Testeddoc.getDataCreation();
       a=Testeddoc.getDataEdition();
    }

    @org.junit.Test
    public void TestGetDocID() throws Exception {
        Date a=Testeddoc.getDataCreation();
        a=Testeddoc.getDataEdition();
    }

    @org.junit.Test
    public void TestGetHeader() throws Exception {

    }
}