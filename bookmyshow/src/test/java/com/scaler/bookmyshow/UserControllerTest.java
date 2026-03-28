package com.scaler.bookmyshow;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.server.LocalServerPort;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestClient;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class UserControllerTest {

    @LocalServerPort
    private int port;

    @Test
    void signUpShouldCreateUser() throws Exception {
        RestClient client = RestClient.builder()
                .baseUrl("http://localhost:" + port)
                .build();

        ResponseEntity<String> response = client.post()
                .uri("/user")
                .contentType(MediaType.APPLICATION_JSON)
                .body("""
                        {
                          "email": "signup-test@scaler.com",
                          "password": "1234"
                        }
                        """)
                .retrieve()
                .toEntity(String.class);

        assertEquals(200, response.getStatusCode().value());
        assertNotNull(response.getBody());
    }
}
