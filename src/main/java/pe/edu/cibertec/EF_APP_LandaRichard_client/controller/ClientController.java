package pe.edu.cibertec.EF_APP_LandaRichard_client.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.oauth2.client.OAuth2AuthorizedClientService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ClientController {
    @Autowired
    private OAuth2AuthorizedClientService authorizedClientService;

    @GetMapping("/api/client")
    public String client() {
        return "Este es la API del cliente";
    }
}
