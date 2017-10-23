package ru.mirea.documentation;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.List;
//import com.itextpdf.text.Paragraph;


public class DocumentationImpl implements Documents {
    /**
     * Method realizes the creation of document with existing fields
     *
     * @param name   - name of document
     * @param type   - type of document
     * @param userID - Author's ID that creates document
     * @return Document - exemplar of document
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public Document create(String name, DocumentType type, int userID) throws DocumentSaveException {
        try {
            Document docExample = new Document(type, userID, name);//создание экземпл¤ра документа
            return docExample;
        }catch (IOException e){
            Document docExample = null;
            try {
                docExample = new Document(null, 0, null);
            } catch (IOException e1) {
                e1.printStackTrace();
            }
            return docExample;
        }

    }

    //–еализаци¤ создани¤ документа, возвращаемый тип ƒокумент, —оздаЄм ƒокID внутри классов, присваимаем экземпл¤рам документов им¤ и userID
    //private Document CreateDOCXdocument(String name, int userID)

    //–еализаци¤ создани¤ документа, возвращаемый тип ƒокумент, —оздаЄм ƒокID внутри классов, присваимаем экземпл¤рам документов им¤ и userID
    //private Document CreateRTFdocument(String name, int userID)

    //–еализаци¤ создани¤ документа, возвращаемый тип ƒокумент, —оздаЄм ƒокID внутри классов, присваимаем экземпл¤рам документов им¤ и userID
    //private Document CreatePDFdocument(String name, int userID)


    //–еализаци¤ создани¤ документа, возвращаемый тип ƒокумент, —оздаЄм ƒокID внутри классов, присваимаем экземпл¤рам документов им¤ и userID
    //private Document CreateDOCdocument(String name, int userID)

    //–еализаци¤ создани¤ документа, возвращаемый тип ƒокумент, —оздаЄм ƒокID внутри классов, присваимаем экземпл¤рам документов им¤ и userID
    //private Document CreateTXTdocument(String name, int userID)

    /**
     * Method realizes search of documents by name of it
     *
     * @param name - name of document
     * @return Document - exemplar of document
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */
    @Override
    public List<Document> searchByName(String name) throws SearchDocumentException {
        List<Document> listByNameExample;// создание экземпл¤ра массива документов, выведенных по имени файла
        try {
            listByNameExample = DummySearchByName(name);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch(SearchDocumentException e) {
            //описать ошибку
        }
        return listByNameExample;//¬озврат массива документов, выведенных оп имени файла
    }

    /**
     * Method realizes search of documents by types of it
     *
     * @param type - type of document
     * @return List<Document> - List of document exemplars
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public List<Document> searchByType(DocumentType type) throws SearchDocumentException {
        List<Document> listByTypeExample;//создание экземпл¤ра массива документов, выведенных по типу файла
        try {
            listByTypeExample = DummySearchByType(DocumentType);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByTypeExample;//¬озврат экземпл¤ра массива документов, выведенных по типу файла
    }

    /**
     * Method realizes search of documents by data of creation of it
     *
     * @param dataCreation - data of document creation
     * @return List<Document> - List of document exemplars
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public List<Document> searchByDataCreation(Date dataCreation) throws SearchDocumentException {
        List<Document> listByDataCreationExample;//создание экземпл¤ра массива документа, выведенного по дате создани¤ файла
        try {
            listByDataCreationExample = DummySearchByDataCreation(dataCreation);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDataCreationExample;// возврат экземпл¤ра массива документа, выведенного по дате создани¤ файла
    }

    /**
     * Method realizes search of documents by data of edition of it
     *
     * @param dataEdition - data of document edition
     * @return List<Document> - List of document exemplars
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public List<Document> searchByDataEdition(Date dataEdition) throws SearchDocumentException {
        List<Document> listByDataEditionExample;//создание экземпл¤ра массива документа, выведенного по дате последнего изменени¤ файла
        try {
            listByDataEditionExample = DummySearchByDataEdition(dataEdition);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDataEditionExample;//создание экземпл¤ра массива документа, выведеннгго по дате последнего изменени¤ файла
    }

    /**
     * Method realizes search of documents by author's ID
     *
     * @param authorID - Author's ID that creates document
     * @return List<Document> - List of document exemplars
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public List<Document> searchByAuthorID(int authorID) throws SearchDocumentException {
        List<Document> listByAuthorIDExample;//создание экземпл¤ра массива документа, выведенного по уникальному номеру автора
        try {
            listByAuthorIDExample = DummySearchByAuthorID(authorID);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByAuthorIDExample;//создание экземпл¤ра массива документа, выведенного по уникальному номеру автора
    }

    /**
     * Method realizes search of documents by ID of document
     *
     * @param DocID - ID of document
     * @return Document - exemplar of document
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public Document searchByDocID(int DocID) throws SearchDocumentException {
        Document listByDocIDExample;//создание экземпл¤ра документа, выведенного по уникальному номеру документа
        try {
            listByDocIDExample = DummySearchByDocID(DocID);//»« »Ќ“≈–‘≈…—ј ’–јЌ»Ћ»÷ј
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDocIDExample;//создание экземпл¤ра документа, выведенного по уникальному номеру документа
    }

    /**
     * Method realizes document updating
     *
     * @param doc - document
     * @return Document - exemplar of document
     * @version 1.0.0
     * {@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    @Override
    public Document update(Document doc) throws DocumentSaveException {// 1. »зменение даты изменени¤, 2. »зменение јвтора, 3. “ело(текст), 4. «аголовок, 5. »м¤ документа, 6. “ип документа - — чем работать
        Document updateDocExample;//создание экземпл¤ра документа, в который будет передан файл на дальнейшее его изменеие

        updateDocExample = doc;
        return updateDocExample;

    }
}

