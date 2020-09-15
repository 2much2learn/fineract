package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesNoteIdResponse;
import org.apache.fineract.client.models.GetResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesRequest;
import org.apache.fineract.client.models.PostResourceTypeResourceIdNotesResponse;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdRequest;
import org.apache.fineract.client.models.PutResourceTypeResourceIdNotesNoteIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for NotesApi
 */
public class NotesApiTest {

    private NotesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(NotesApi.class);
    }


    /**
     * Add a Resource Note
     *
     * Adds a new note to a supported resource.  Example Requests:  clients/1/notes   groups/1/notes
     */
    @Test
    public void addNewNoteTest() {
        PostResourceTypeResourceIdNotesRequest body = null;
        String resourceType = null;
        Long resourceId = null;
        // PostResourceTypeResourceIdNotesResponse response = api.addNewNote(body, resourceType, resourceId);

        // TODO: test validations
    }

    /**
     * Delete a Resource Note
     *
     * Deletes a Resource Note
     */
    @Test
    public void deleteNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        // DeleteResourceTypeResourceIdNotesNoteIdResponse response = api.deleteNote(resourceType, resourceId, noteId);

        // TODO: test validations
    }

    /**
     * Retrieve a Resource Note
     *
     * Retrieves a Resource Note  Example Requests:  clients/1/notes/76   groups/1/notes/20   clients/1/notes/76?fields&#x3D;note,createdOn,createdByUsername   groups/1/notes/20?fields&#x3D;note,createdOn,createdByUsername
     */
    @Test
    public void retrieveNoteTest() {
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        // GetResourceTypeResourceIdNotesNoteIdResponse response = api.retrieveNote(resourceType, resourceId, noteId);

        // TODO: test validations
    }

    /**
     * Retrieve a Resource&#x27;s description
     *
     * Retrieves a Resource&#x27;s Notes  Note: Notes are returned in descending createOn order.  Example Requests:  clients/2/notes   groups/2/notes?fields&#x3D;note,createdOn,createdByUsername
     */
    @Test
    public void retrieveNotesByResourceTest() {
        String resourceType = null;
        Long resourceId = null;
        // List<GetResourceTypeResourceIdNotesResponse> response = api.retrieveNotesByResource(resourceType, resourceId);

        // TODO: test validations
    }

    /**
     * Update a Resource Note
     *
     * Updates a Resource Note
     */
    @Test
    public void updateNoteTest() {
        PutResourceTypeResourceIdNotesNoteIdRequest body = null;
        String resourceType = null;
        Long resourceId = null;
        Long noteId = null;
        // PutResourceTypeResourceIdNotesNoteIdResponse response = api.updateNote(body, resourceType, resourceId, noteId);

        // TODO: test validations
    }
}
