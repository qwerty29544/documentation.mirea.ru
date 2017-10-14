package ru.mirea.documentation;

import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;
import static ru.mirea.documentation.DocumentType.*;

public class DocumentsTest {
    private Documents Testeddoc;
    @org.junit.Before
    public void setUp() throws Exception {


    }

    @org.junit.After
    public void tearDown() throws Exception {
    }

    @org.junit.Test
    public void TestCreateSimpleTXT() throws Exception {
        //Just creation TXT
        String a="a";
        for(int i=1;i<30;i++) a+=a;
      Testeddoc.create(a, TXT,2147483647);
    }

    @org.junit.Test
    public void TestCreateDoubleTXT() throws Exception {
        //Creation of same docs
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        Testeddoc.create(a, TXT,2147483647);
        Testeddoc.create(a, TXT,2147483647);
    }

    @org.junit.Test
    public void TestCreateSimplePDF() throws Exception {
        //Just creation PDF
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        Testeddoc.create(a, TXT,2147483647);
    }

    @org.junit.Test
    public void TestCreateSimpleRTF() throws Exception {
        //Just creation RTF
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        Testeddoc.create(a, RTF,2147483647);
    }

    @org.junit.Test
    public void TestCreateSimpleDOC() throws Exception {
        //Just creation DOC
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        Testeddoc.create(a, DOC,2147483647);
    }

    @org.junit.Test
    public void TestCreateSimpleDOCX() throws Exception {
        //Just creation DOCX
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        Testeddoc.create(a, DOCX,2147483647);
    }

    @org.junit.Test
    public void TestCreateMinusInt() throws Exception {
        //Checking if UserID<0
        String a="a";
        int id=-2147483648;
        Testeddoc.create(a, TXT,id);
    }

    @org.junit.Test
    public void TestCreateInfinityTXT() throws Exception {
        //Unlimited creation TXT
        String a="a";
        for(int i=1;i<30;i++) a+=a;
        while (1>0)
        {
            Testeddoc.create(a, TXT, 2147483647);
        }
    }

    @org.junit.Test
    public void searchByNameIfExists() throws Exception {
    Document a;
    a=Testeddoc.create("zzzz",TXT,2147483647);
    List<Document> cpisok;
    cpisok=Testeddoc.searchByName("zzzz");
    assertEquals(a.getAuthorID(),cpisok.get(0).getAuthorID());
    }

    @org.junit.Test
    public void searchByNameIfNotExists() throws Exception {
        Document a;
        a=Testeddoc.create("zzzz",TXT,2147483647);
        List<Document> cpisok;
        cpisok=Testeddoc.searchByName("zzz");
        assertEquals(cpisok.size(),0);
    }

    @org.junit.Test
    public void TestSearchByType() throws Exception {
    }

    @org.junit.Test
    public void searchByDataCreationIfExists() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataCreation();
        data.setTime(data.getTime());
        List<Document> b;
        b=Testeddoc.searchByDataCreation(data);
        assertEquals(b.get(0).getDataCreation(),a.getDataCreation());
    }

    @org.junit.Test
    public void searchByDataCreationIfNoExists() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataCreation();
        data.setTime(data.getTime()+1);
        List<Document> b;
        b=Testeddoc.searchByDataCreation(data);
        assertEquals(b.size(),0);
    }

    @org.junit.Test
    public void searchByDataEditionIfExistAndNeverEdited() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataEdition();
        data.setTime(data.getTime());
        List<Document> b;
        b=Testeddoc.searchByDataEdition(data);
        assertEquals(b.get(0).getDataEdition(),a.getDataEdition());
    }

    @org.junit.Test
    public void searchByDataEditionIfNotExistAndNeverEdited() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataEdition();
        data.setTime(data.getTime()+1);
        List<Document> b;
        b=Testeddoc.searchByDataEdition(data);
        assertEquals(b.size(),0);
    }

    @org.junit.Test
    public void searchByDataEditionIfExistAndEdited() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataCreation();
        data.setTime(data.getTime()+1);
       a =Testeddoc.update(a);
        List<Document> b;
        b=Testeddoc.searchByDataEdition(data);
        assertEquals(b.get(0).getDataEdition(),a.getDataEdition());
    }

    @org.junit.Test
    public void searchByDataEditionIfNotExistAndEdited() throws Exception {
        List<Document> spisok;
        Date data = new Date();
        Document a;
        a=Testeddoc.create("zzzz",PDF,1231212412);
        data=a.getDataEdition();
        data.setTime(data.getTime()+1);
        a =Testeddoc.update(a);
        data.setTime(data.getTime()+1);
        List<Document> b;
        b=Testeddoc.searchByDataEdition(data);
        assertEquals(b.size(),0);
    }


    @org.junit.Test
    public void TestSearchByAuthorIDIsExists() throws Exception {
        String a="zzz";
        int id=777;
        Testeddoc.create(a,TXT,id);
        List<Document> spisok;
        spisok=Testeddoc.searchByAuthorID(id);
        int size = spisok.size();
        assertEquals(size,1);
        assertEquals(spisok.get(0).getAuthorID(),id);

    }

    @org.junit.Test
    public void TestSearchByAuthorIDIsNotExists() throws Exception {
        String a="zzz";
        int id=777;
        Testeddoc.create(a,TXT,id);
        List<Document> spisok;
        spisok=Testeddoc.searchByAuthorID(1);
        int size = spisok.size();
        assertEquals(size,0);

    }

    @org.junit.Test
    public void TestSearchByAuthorIDIsExistsEveryTime() throws Exception {
        String a="zzz";
        int id=777;
        for(int i=0;i<9;i++)
        {
            Testeddoc.create(a, TXT, id);
            a+=a;
        }
        List<Document> spisok;
        spisok=Testeddoc.searchByAuthorID(id);
        int size = spisok.size();
        assertEquals(size,9);
        for (int i=0;i<9;i++)
        assertEquals(spisok.get(i).getAuthorID(),id);

    }

    @org.junit.Test
    public void TestSearchByAuthorIDIsExistsAmongOthers() throws Exception {
        String a="zzz";
        int id=777;
        int id1=id;
        for(int i=0;i<9;i++)
        {
            Testeddoc.create(a, TXT, id);
            id++;
        }
        List<Document> spisok;
        spisok=Testeddoc.searchByAuthorID(id1);
        int size = spisok.size();
        assertEquals(size,1);
        assertEquals(spisok.get(0).getAuthorID(),id);

    }


    @org.junit.Test
    public void searchByDocIDIfExists() throws Exception {
        Document a;
        a=Testeddoc.create("NATASEHTLIAH",TXT,222222222);
        int id;
        id=a.getDocID();
        Document b;
        b=Testeddoc.searchByDocID(id);
        assertEquals(b.getDocID(),a.getDocID());
        assertEquals(b.getDataEdition(),a.getDataEdition());
        assertEquals(b.getDataCreation(),a.getDataCreation());
        assertEquals(b.getName(),a.getName());
        assertEquals(b.getAuthorID(),a.getAuthorID());
    }

    @org.junit.Test
    public void update() throws Exception {



    }

}