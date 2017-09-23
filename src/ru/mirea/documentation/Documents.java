package ru.mirea.documentation;


import java.util.Date;
import java.util.List;

public interface Documents {
    /**
    *Method realizes the creation of document with existing fields
    *@param name - name of document
    *@param type - type of document
    *@param userID - Author's ID that creates document
    *@return Document - exemplar of document
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */
    Document create(String name, DocumentType type, int userID) throws DocumentSaveException;

    /**
    *Method realizes search of documents by name of it
    *@param name - name of document
    *@return Document - exemplar of document
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    List<Document> searchByName(String name) throws SearchDocumentException;

    /**
    *Method realizes search of documents by types of it
    *@param type - type of document
    *@return List<Document> - List of document exemplars
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */

    List<Document> searchByType(DocumentType type) throws SearchDocumentException;

    /**
    *Method realizes search of documents by data of creation of it
    *@param dataCreation - data of document creation
    *@return List<Document> - List of document exemplars
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */

    List<Document> searchByDataCreation(Date dataCreation) throws SearchDocumentException;

    /**
    *Method realizes search of documents by data of edition of it
    *@param dataEdition - data of document edition
    *@return List<Document> - List of document exemplars
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */

    List<Document> searchByDataEdition(Date dataEdition) throws SearchDocumentException;

    /**
    *Method realizes search of documents by author's ID
    *@param authorID - Author's ID that creates document
    *@return List<Document> - List of document exemplars
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
    */

    List<Document> searchByAuthorID(int authorID) throws SearchDocumentException;

    /**
    *Method realizes search of documents by ID of document
    *@param DocID - ID of document
    *@return Document - exemplar of document
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
    */

    Document searchByDocID(int DocID) throws SearchDocumentException;

    /**
    *Method realizes document updating
    *@param doc - document
    *@return Document - exemplar of document
    *@version 1.0.0
    *{@author Ivan Yurchenkov e-mail: <qwerty29544@gmail.com> https://vk.com/van3228}
     */

    Document update(Document doc) throws DocumentSaveException;
}
