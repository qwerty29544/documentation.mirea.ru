package ru.mirea.documentation;

import java.io.IOException;
import java.util.Date;
import java.util.List;


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
        Document docExample;//создание экземпляра документа
        switch (type) {
            case DOCX:
                try {
                    docExample = CreateDOCXdocument(name,userID);//метод создания DOCX документа (классы не описаны, классы не разработаны, классы protected)
                }catch (IOException e) {}
            case TXT:
                try {
                    docExample = CreateTXTdocument(name, userID);//метод создания TXT документа (классы не описаны, классы не разработаны, классы protected)
                }catch (IOException e){}
            case RTF:
                try {
                    docExample = CreateRTFdocument(name, userID);//метод создания RTF документа (классы не описаны, классы не разработаны, классы protected)
                }catch (IOException r) {}
            case PDF:
                try {
                    docExample = CreatePDFdocument(name, userID);//метод создания PDF документа (классы не описаны, классы не разработаны, классы protected)
                }catch(IOException f){}
            case DOC:
                try {
                    docExample = CreateDOCdocument(name,userID);//метод создания DOC документа (классы не описаны, классы не разработаны, классы protected)
                }catch (IOException e){}
            default:
                docExample = null;//возврат пустого класса документа
        }
        return docExample;// возврат экземпляра документа

    }

    //Реализация создания документа, возвращаемый тип Документ, Создаём ДокID внутри классов, присваимаем экземплярам документов имя и userID
    private Document CreateDOCXdocument(String name, int userID) throws IOException {
        try {
            DocumentType Docx = DocumentType.DOCX;
            Document DOCXdocumentExample = new Document(Docx, userID, name);//
            return DOCXdocumentExample;
        } catch (IOException e){
            Document DOCXdocumentExample = new Document(null,0,null);
            return DOCXdocumentExample;
        }
    }
    //Реализация создания документа, возвращаемый тип Документ, Создаём ДокID внутри классов, присваимаем экземплярам документов имя и userID
    private Document CreateTXTdocument(String name, int userID) throws IOException {
        try {
            DocumentType txt = DocumentType.TXT;
            Document TXTdocumentExample = new Document(txt, userID, name);//
            return TXTdocumentExample;
        } catch (IOException e){
            Document TXTdocumentExample = new Document(null,0,null);
            return TXTdocumentExample;
        }

    }
    //Реализация создания документа, возвращаемый тип Документ, Создаём ДокID внутри классов, присваимаем экземплярам документов имя и userID
    private Document CreateRTFdocument(String name, int userID) throws IOException {
        try {
            DocumentType Rtf = DocumentType.RTF;
            Document RTFdocumentExample = new Document(Rtf, userID, name);//
            return RTFdocumentExample;
        } catch (IOException e){
            Document RTFdocumentExample = new Document(null,0,null);
            return RTFdocumentExample;
        }
    }
    //Реализация создания документа, возвращаемый тип Документ, Создаём ДокID внутри классов, присваимаем экземплярам документов имя и userID
    private Document CreatePDFdocument(String name, int userID) throws IOException {
        try {
            DocumentType Pdf = DocumentType.PDF;
            Document PDFdocumentExample = new Document(Pdf, userID, name);//
            return PDFdocumentExample;
        } catch (IOException e){
            Document PDFdocumentExample = new Document(null,0,null);
            return PDFdocumentExample;
        }
    }
    //Реализация создания документа, возвращаемый тип Документ, Создаём ДокID внутри классов, присваимаем экземплярам документов имя и userID
    private Document CreateDOCdocument(String name, int userID) throws IOException {
        try {
            DocumentType Doc = DocumentType.DOC;
            Document DOCdocumentExample = new Document(Doc, userID, name);//
            return DOCdocumentExample;
        } catch (IOException e){
            Document DOCdocumentExample = new Document(null,0,null);
            return DOCdocumentExample;
        }
    }

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
        List<Document> listByNameExample;// создание экземпляра массива документов, выведенных по имени файла
        try {
            listByNameExample = DummySearchByName(name);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch(SearchDocumentException e) {
            //описать ошибку
        }
        return listByNameExample;//Возврат массива документов, выведенных оп имени файла
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
        List<Document> listByTypeExample;//создание экземпляра массива документов, выведенных по типу файла
        try {
            listByTypeExample = DummySearchByType(DocumentType);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByTypeExample;//Возврат экземпляра массива документов, выведенных по типу файла
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
        List<Document> listByDataCreationExample;//создание экземпляра массива документа, выведенного по дате создания файла
        try {
            listByDataCreationExample = DummySearchByDataCreation(dataCreation);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDataCreationExample;// возврат экземпляра массива документа, выведенного по дате создания файла
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
        List<Document> listByDataEditionExample;//создание экземпляра массива документа, выведенного по дате последнего изменения файла
        try {
            listByDataEditionExample = DummySearchByDataEdition(dataEdition);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDataEditionExample;//создание экземпляра массива документа, выведеннгго по дате последнего изменения файла
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
        List<Document> listByAuthorIDExample;//создание экземпляра массива документа, выведенного по уникальному номеру автора
        try {
            listByAuthorIDExample = DummySearchByAuthorID(authorID);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByAuthorIDExample;//создание экземпляра массива документа, выведенного по уникальному номеру автора
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
        Document listByDocIDExample;//создание экземпляра документа, выведенного по уникальному номеру документа
        try {
            listByDocIDExample = DummySearchByDocID(DocID);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
        } catch (SearchDocumentException e) {
            //описать ошибку
        }
        return listByDocIDExample;//создание экземпляра документа, выведенного по уникальному номеру документа
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
    public Document update(Document doc) throws DocumentSaveException {// 1. Изменение даты изменения, 2. Изменение Автора, 3. Тело(текст), 4. Заголовок, 5. Имя документа, 6. Тип документа - С чем работать
        Document updateDocExample;//создание экземпляра документа, в который будет передан файл на дальнейшее его изменеие




        updateDocExample = null;//тут заменить и вернуть что-то
        return updateDocExample;//

    }
}
