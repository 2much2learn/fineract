package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.DeleteDataTablesDatatableAppTableIdDatatableIdResponse;
import org.apache.fineract.client.models.DeleteDataTablesDatatableAppTableIdResponse;
import org.apache.fineract.client.models.DeleteDataTablesResponse;
import org.apache.fineract.client.models.GetDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.GetDataTablesResponse;
import org.apache.fineract.client.models.PostDataTablesAppTableIdRequest;
import org.apache.fineract.client.models.PostDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.PostDataTablesRegisterDatatableAppTable;
import org.apache.fineract.client.models.PostDataTablesRequest;
import org.apache.fineract.client.models.PostDataTablesResponse;
import org.apache.fineract.client.models.PutDataTablesAppTableIdDatatableIdRequest;
import org.apache.fineract.client.models.PutDataTablesAppTableIdDatatableIdResponse;
import org.apache.fineract.client.models.PutDataTablesAppTableIdRequest;
import org.apache.fineract.client.models.PutDataTablesAppTableIdResponse;
import org.apache.fineract.client.models.PutDataTablesRequest;
import org.apache.fineract.client.models.PutDataTablesResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for DataTablesApi
 */
public class DataTablesApiTest {

    private DataTablesApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(DataTablesApi.class);
    }


    /**
     * Create Data Table
     *
     * Create a new data table and registers it with the Apache Fineract Core application table.  Field Descriptions  Mandatory - datatableName :   The name of the Data Table.  Mandatory - apptableName  Application table name. Must be one of the following:  m_client  m_group  m_loan  m_office  m_saving_account  m_product_loan  m_savings_product  Mandatory - columns   An array of columns in the new Data Table.  Optional - multiRow  Allows to create multiple entries in the Data Table. Optional, defaults to false. If this property is not provided Data Table will allow only one entry.  Field Descriptions - columns  Mandatory - name  Name of the created column. Can contain only alphanumeric characters, underscores and spaces, but cannot start with a number. Cannot start or end with an underscore or space.  Mandatory - type  Column type. Must be one of the following:  Boolean  Date  DateTime  Decimal  Dropdown   Number  String  Text  Mandatory [type &#x3D; Dropdown] - code  Used in Code description fields. Column name becomes: code_cd_name. Mandatory if using type Dropdown, otherwise an error is returned.  Optional - mandatory  Determines whether this column must have a value in every entry. Optional, defaults to false.  Mandatory [type &#x3D; String] - length  Length of the text field. Mandatory if type String is used, otherwise an error is returned.
     */
    @Test
    public void createDatatableTest() {
        PostDataTablesRequest body = null;
        // PostDataTablesResponse response = api.createDatatable(body);

        // TODO: test validations
    }

    /**
     * Create Entry in Data Table
     *
     * Adds a row to the data table.  Note that the default datatable UI functionality converts any field name containing spaces to underscores when using the API. This means the field name \&quot;Business Description\&quot; is considered the same as \&quot;Business_Description\&quot;. So you shouldn&#x27;t have both \&quot;versions\&quot; in any data table.
     */
    @Test
    public void createDatatableEntryTest() {
        PostDataTablesAppTableIdRequest body = null;
        String datatable = null;
        Long apptableId = null;
        // PostDataTablesAppTableIdResponse response = api.createDatatableEntry(body, datatable, apptableId);

        // TODO: test validations
    }

    /**
     * Delete Data Table
     *
     * Deletes a data table and deregisters it from the Apache Fineract Core application table.
     */
    @Test
    public void deleteDatatableTest() {
        String datatableName = null;
        // DeleteDataTablesResponse response = api.deleteDatatable(datatableName);

        // TODO: test validations
    }

    /**
     * Delete Entry(s) in Data Table
     *
     * Deletes the entry (if it exists) for data tables that are one-to-one with the application table.  Deletes the entries (if they exist) for data tables that are one-to-many with the application table.
     */
    @Test
    public void deleteDatatableEntriesTest() {
        String datatable = null;
        Long apptableId = null;
        // DeleteDataTablesDatatableAppTableIdResponse response = api.deleteDatatableEntries(datatable, apptableId);

        // TODO: test validations
    }

    /**
     * Delete Entry in Datatable (One to Many)
     *
     * Deletes the entry (if it exists) for data tables that are one to many with the application table.  
     */
    @Test
    public void deleteDatatableEntries1Test() {
        String datatable = null;
        Long apptableId = null;
        Long datatableId = null;
        // DeleteDataTablesDatatableAppTableIdDatatableIdResponse response = api.deleteDatatableEntries1(datatable, apptableId, datatableId);

        // TODO: test validations
    }

    /**
     * Deregister Data Table
     *
     * Deregisters a data table. It will no longer be available through the API.
     */
    @Test
    public void deregisterDatatableTest() {
        String datatable = null;
        // PutDataTablesResponse response = api.deregisterDatatable(datatable);

        // TODO: test validations
    }

    /**
     * Retrieve Entry(s) from Data Table
     *
     * Gets the entry (if it exists) for data tables that are one to one with the application table.  Gets the entries (if they exist) for data tables that are one to many with the application table.  Note: The &#x27;fields&#x27; parameter is not available for datatables.  ARGUMENTS orderoptional Specifies the order in which data is returned.genericResultSetoptional, defaults to false If &#x27;true&#x27; an optimised JSON format is returned suitable for tabular display of data. This format is used by the default data tables UI functionality. Example Requests:  datatables/extra_client_details/1   datatables/extra_family_details/1?order&#x3D;&#x60;Date of Birth&#x60; desc   datatables/extra_client_details/1?genericResultSet&#x3D;true
     */
    @Test
    public void getDatatableTest() {
        String datatable = null;
        Long apptableId = null;
        String order = null;
        // GetDataTablesAppTableIdResponse response = api.getDatatable(datatable, apptableId, order);

        // TODO: test validations
    }

    /**
     * Retrieve Data Table Details
     *
     * Lists a registered data table details and the Apache Fineract Core application table they are registered to.
     */
    @Test
    public void getDatatable1Test() {
        String datatable = null;
        // GetDataTablesResponse response = api.getDatatable1(datatable);

        // TODO: test validations
    }

    /**
     * 
     *
     * 
     */
    @Test
    public void getDatatableManyEntryTest() {
        String datatable = null;
        Long apptableId = null;
        Long datatableId = null;
        String order = null;
        // String response = api.getDatatableManyEntry(datatable, apptableId, datatableId, order);

        // TODO: test validations
    }

    /**
     * List Data Tables
     *
     * Lists registered data tables and the Apache Fineract Core application table they are registered to.  ARGUMENTS  apptable  - optional The Apache Fineract core application table.  Example Requests:  datatables?apptable&#x3D;m_client   datatables
     */
    @Test
    public void getDatatablesTest() {
        String apptable = null;
        // List<GetDataTablesResponse> response = api.getDatatables(apptable);

        // TODO: test validations
    }

    /**
     * Register Data Table
     *
     * Registers a data table with the Apache Fineract Core application table. This allows the data table to be maintained through the API. In case the datatable is a PPI (survey table), a parameter category should be pass along with the request. The API currently support one category (200)
     */
    @Test
    public void registerDatatableTest() {
        String datatable = null;
        String apptable = null;
        PostDataTablesRegisterDatatableAppTable body = null;
        // PutDataTablesResponse response = api.registerDatatable(datatable, apptable, body);

        // TODO: test validations
    }

    /**
     * Update Data Table
     *
     * Modifies fields of a data table. If the apptableName parameter is passed, data table is deregistered and registered with the new application table.
     */
    @Test
    public void updateDatatableTest() {
        PutDataTablesRequest body = null;
        String datatableName = null;
        // PutDataTablesResponse response = api.updateDatatable(body, datatableName);

        // TODO: test validations
    }

    /**
     * Update Entry in Data Table (One to Many)
     *
     * Updates the row (if it exists) of the data table.
     */
    @Test
    public void updateDatatableEntryOneToManyTest() {
        PutDataTablesAppTableIdDatatableIdRequest body = null;
        String datatable = null;
        Long apptableId = null;
        Long datatableId = null;
        // PutDataTablesAppTableIdDatatableIdResponse response = api.updateDatatableEntryOneToMany(body, datatable, apptableId, datatableId);

        // TODO: test validations
    }

    /**
     * Update Entry in Data Table (One to One)
     *
     * Updates the row (if it exists) of the data table.
     */
    @Test
    public void updateDatatableEntryOnetoOneTest() {
        PutDataTablesAppTableIdRequest body = null;
        String datatable = null;
        Long apptableId = null;
        // PutDataTablesAppTableIdResponse response = api.updateDatatableEntryOnetoOne(body, datatable, apptableId);

        // TODO: test validations
    }
}
