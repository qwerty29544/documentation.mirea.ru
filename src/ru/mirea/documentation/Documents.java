package ru.mirea.documentation;


import java.util.ArrayList;
import java.util.Date;

public interface Documents {
    /*1.
    Method realizes the creation of document with existing fields
    @PARAM name - name of document
    @PARAM type - type of document
    @PARAM userID - Author's ID that creates document
    @RETURN Document - exemplar of document
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */
    public Document create(String name, String type, int userID) throws DocumentSaveException, InvalidInputDataException;

    /*2.
    Method realizes search of documents by name of it
    @PARAM name - name of document
    @RETURN Document - exemplar of document
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    public Document searchByName(String name) throws SearchDocumentException, InvalidInputDataException;

    /*3.
    Method realizes search of documents by types of it
    @PARAM type - type of document
    @RETURN ArrayList<Document> - List of document exemplars
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    public ArrayList<Document> searchByType(String type) throws SearchDocumentException, InvalidInputDataException;

    /*4.
    Method realizes search of documents by data of creation of it
    @PARAM dataCreation - data of document creation
    @RETURN ArrayList<Document> - List of document exemplars
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    public ArrayList<Document> searchByDataCreation(Date dataCreation) throws SearchDocumentException, InvalidInputDataException;

    /*5.
    Method realizes search of documents by data of edition of it
    @PARAM dataEdition - data of document edition
    @RETURN ArrayList<Document> - List of document exemplars
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    public ArrayList<Document> searchByDataEdition(Date dataEdition) throws SearchDocumentException, InvalidInputDataException;

    /*6.
    Method realizes search of documents by author's ID
    @PARAM authorID - Author's ID that creates document
    @RETURN ArrayList<Document> - List of document exemplars
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
    */

    public ArrayList<Document> searchByAuthorID(int authorID) throws SearchDocumentException, InvalidInputDataException;

    /*7.
    Method realizes search of documents by ID of document
    @PARAM DocID - ID of document
    @RETURN Document - exemplar of document
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
    */

    public Document searchByDocID(int DocID) throws SearchDocumentException, InvalidInputDataException;

    /*8.
    Method realizes document updating
    @PARAM doc - document
    @RETURN Document - exemplar of document
    @VERSION 1.0.0
    {@AUTHOR Ivan Yurchenkov e-mail: qwerty29544@gmail.com https://vk.com/van3228}
     */

    public Document updating(Document doc) throws DocumentSaveException, InvalidInputDataException;
}
