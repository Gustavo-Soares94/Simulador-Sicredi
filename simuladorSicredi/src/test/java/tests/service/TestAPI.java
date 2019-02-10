package tests.service;

import static io.restassured.RestAssured.*;
import org.junit.Test;

public class TestAPI {

    @Test
    public void Teste() {

        String uriBase = "http://5b847b30db24a100142dce1b.mockapi.io/api/v1/simulador";

        given()
                .relaxedHTTPSValidation()
                .param("id","1")
                .param("mes","[\"112\", \"124\", \"136\", \"148\"]")
                .param("valor","[\"2.802\", \"3.174\", \"3.564\", \"3.971\"]")
                .when()
                    .get(uriBase);

    }


}
