package ru.mirea.documentation;

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
                docExample = CreateDOCXdocument(name,userID);//метод создания DOCX документа (классы не описаны, классы не разработаны, классы protected)
            case TXT:
                docExample = CreateTXTdocument(name,userID);//метод создания TXT документа (классы не описаны, классы не разработаны, классы protected)
            case RTF:
                docExample = CreateRTFdocument(name,userID);//метод создания RTF документа (классы не описаны, классы не разработаны, классы protected)
            case PDF:
                docExample = CreatePDFdocument(name,userID);//метод создания PDF документа (классы не описаны, классы не разработаны, классы protected)
            case DOC:
                docExample = CreateDOCdocument(name,userID);//метод создания DOC документа (классы не описаны, классы не разработаны, классы protected)
            default:
                docExample = null;//возврат пустого класса документа
        }
        return docExample;// возврат экземпляра документа

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
        listByNameExample = DummySearchByName(name);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
        listByTypeExample = DummySearchByType(DocumentType);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
        listByDataCreationExample = DummySearchByDataCreation(dataCreation);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
        listByDataEditionExample = DummySearchByDataEdition(dataEdition);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
        listByAuthorIDExample = DummySearchByAuthorID(authorID);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
        listByDocIDExample = DummySearchByDocID(DocID);//ИЗ ИНТЕРФЕЙСА ХРАНИЛИЦА
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
    public Document update(Document doc) throws DocumentSaveException {
        Document updateDocExample;//создание экземпляра документа, в который будет передан файл на дальнейшее его изменеие




        return updateDocExample;//

    }
}