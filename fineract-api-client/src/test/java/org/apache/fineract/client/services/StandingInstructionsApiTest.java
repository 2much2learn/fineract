package org.apache.fineract.client.services;

import org.apache.fineract.client.ApiClient;
import org.apache.fineract.client.models.GetStandingInstructionsResponse;
import org.apache.fineract.client.models.GetStandingInstructionsStandingInstructionIdResponse;
import org.apache.fineract.client.models.GetStandingInstructionsTemplateResponse;
import org.apache.fineract.client.models.PostStandingInstructionsRequest;
import org.apache.fineract.client.models.PostStandingInstructionsResponse;
import org.apache.fineract.client.models.PutStandingInstructionsStandingInstructionIdRequest;
import org.apache.fineract.client.models.PutStandingInstructionsStandingInstructionIdResponse;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * API tests for StandingInstructionsApi
 */
public class StandingInstructionsApiTest {

    private StandingInstructionsApi api;

    @Before
    public void setup() {
        api = new ApiClient().createService(StandingInstructionsApi.class);
    }


    /**
     * Create new Standing Instruction
     *
     * Ability to create new instruction for transfer of monetary funds from one account to another
     */
    @Test
    public void create4Test() {
        PostStandingInstructionsRequest body = null;
        // PostStandingInstructionsResponse response = api.create4(body);

        // TODO: test validations
    }

    /**
     * List Standing Instructions
     *
     * Example Requests:  standinginstructions
     */
    @Test
    public void retrieveAll18Test() {
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        Integer transferType = null;
        String clientName = null;
        Long clientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        // GetStandingInstructionsResponse response = api.retrieveAll18(sqlSearch, externalId, offset, limit, orderBy, sortOrder, transferType, clientName, clientId, fromAccountId, fromAccountType);

        // TODO: test validations
    }

    /**
     * Retrieve Standing Instruction
     *
     * Example Requests :  standinginstructions/1
     */
    @Test
    public void retrieveOne9Test() {
        Long standingInstructionId = null;
        String sqlSearch = null;
        String externalId = null;
        Integer offset = null;
        Integer limit = null;
        String orderBy = null;
        String sortOrder = null;
        // GetStandingInstructionsStandingInstructionIdResponse response = api.retrieveOne9(standingInstructionId, sqlSearch, externalId, offset, limit, orderBy, sortOrder);

        // TODO: test validations
    }

    /**
     * Retrieve Standing Instruction Template
     *
     * This is a convenience resource. It can be useful when building maintenance user interface screens for client applications. The template data returned consists of any or all of:  Field Defaults Allowed Value Lists Example Requests:  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1  standinginstructions/template?fromAccountType&#x3D;2&amp;fromOfficeId&#x3D;1&amp;fromClientId&#x3D;1&amp;transferType&#x3D;1  standinginstructions/template?fromClientId&#x3D;1&amp;fromAccountType&#x3D;2&amp;fromAccountId&#x3D;1&amp;transferType&#x3D;1
     */
    @Test
    public void template6Test() {
        Long fromOfficeId = null;
        Long fromClientId = null;
        Long fromAccountId = null;
        Integer fromAccountType = null;
        Long toOfficeId = null;
        Long toClientId = null;
        Long toAccountId = null;
        Integer toAccountType = null;
        Integer transferType = null;
        // GetStandingInstructionsTemplateResponse response = api.template6(fromOfficeId, fromClientId, fromAccountId, fromAccountType, toOfficeId, toClientId, toAccountId, toAccountType, transferType);

        // TODO: test validations
    }

    /**
     * Update Standing Instruction | Delete Standing Instruction
     *
     * Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;update   Ability to modify existing instruction for transfer of monetary funds from one account to another.  PUT https://DomainName/api/v1/standinginstructions/1?command&#x3D;delete
     */
    @Test
    public void update8Test() {
        Long standingInstructionId = null;
        PutStandingInstructionsStandingInstructionIdRequest body = null;
        String command = null;
        // PutStandingInstructionsStandingInstructionIdResponse response = api.update8(standingInstructionId, body, command);

        // TODO: test validations
    }
}
