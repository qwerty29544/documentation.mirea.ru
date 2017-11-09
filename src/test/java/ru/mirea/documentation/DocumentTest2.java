package ru.mirea.documentation;


import org.junit.Test;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import static org.junit.Assert.*;
import static ru.mirea.documentation.DocumentType.*;

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
    public void TestSetGetAuthorIDErr() throws Exception {
        int b=2147483647;
        Testeddoc.setAuthorID(b++);
        int a=Testeddoc.getAuthorID()+1;
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
       Date a=Testeddoc.getDataCreation();//Просто выов методов, т.к. устанавливать время нельзя.
       a=Testeddoc.getDataEdition();
    }

    @org.junit.Test
    public void TestGetDocID() throws Exception {
        int a=Testeddoc.getDocID();
        int b=a;
        b=Testeddoc.getDocID();
        assertEquals(a,b);
    }

    @org.junit.Test
    public  void TestBodyGetSet() throws Exception{
        byte[] b = new byte[3];
        Testeddoc.setBody(b);
        byte[] a = Testeddoc.getBody();
        assertEquals(a,b);
    }

    @org.junit.Test
    public void TestSetGetHeader() throws Exception {
    String f="fff";
    String v="vvvv";
    Map k = new HashMap<String, String>();
    Map b= new HashMap<String, String>();
    k.put(f,v);
    Testeddoc.setHeader(k);
    b=Testeddoc.getHeader();
    assertEquals(b.get(f),v);
    }

    @org.junit.Test
    public  void TestSetGetTypeTXT() throws Exception{
        Testeddoc.setType(TXT);
        DocumentType a=TXT;
        DocumentType b=Testeddoc.getType();
        assertEquals(a,b);
    }

    @org.junit.Test
    public  void TestSetGetTypeRTF() throws Exception{
        Testeddoc.setType(RTF);
        DocumentType a=RTF;
        DocumentType b=Testeddoc.getType();
        assertEquals(a,b);
    }

    @org.junit.Test
    public  void TestSetGetTypePDF() throws Exception{
        Testeddoc.setType(PDF);
        DocumentType a=PDF;
        DocumentType b=Testeddoc.getType();
        assertEquals(a,b);
    }

    @org.junit.Test
    public  void TestSetGetTypeDOC() throws Exception{
        Testeddoc.setType(DOC);
        DocumentType a=DOC;
        DocumentType b=Testeddoc.getType();
        assertEquals(a,b);
    }

    @org.junit.Test
    public  void TestSetGetTypeDOCX() throws Exception{
        Testeddoc.setType(DOCX);
        DocumentType a=DOCX;
        DocumentType b=Testeddoc.getType();
        assertEquals(a,b);
    }

    @org.junit.Test
    public void TestEqualsForSelf() throws  Exception{
        boolean a;
        a=Testeddoc.equals(Testeddoc);
        assertEquals(a,true);
    }

    @org.junit.Test
    public void TestEqualsByFields() throws Exception{
      assertEquals(Testeddoc.getBody(),Testeddoc.getBody());
      assertEquals(Testeddoc.getAuthorID(),Testeddoc.getAuthorID());
      assertEquals(Testeddoc.getType(),Testeddoc.getType());
    }

    @org.junit.Test
    public void TestEqualsByFelds() throws Exception{
        Document a = new Document(TXT,222,"zzz");
        byte[] body = new byte[21];
        a.setBody(body);
        int q=a.getAuthorID();
        assertEquals(a.getBody(),body);
        assertEquals(a.getAuthorID(),q);
        assertEquals(a.getType(),TXT);

    }
}