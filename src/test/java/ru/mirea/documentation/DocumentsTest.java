package ru.mirea.documentation;

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
    public void searchByName() throws Exception {

    }

    @org.junit.Test
    public void TestSearchByType() throws Exception {
    }

    @org.junit.Test
    public void searchByDataCreation() throws Exception {
    }

    @org.junit.Test
    public void searchByDataEdition() throws Exception {

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
        assertEquals(spisok.get(0).getUserID(),id);

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
        assertEquals(spisok.get(i).getUserID(),id);

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
        assertEquals(spisok.get(0).getUserID(),id);

    }


    @org.junit.Test
    public void searchByDocID() throws Exception {
    }

    @org.junit.Test
    public void update() throws Exception {
        Document a;
        a.setBody("FIRSTBODY");
        a.setDataCreation();


    }

}