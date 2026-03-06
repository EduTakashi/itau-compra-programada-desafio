package com.eduardomissaka.itau_compra_programada.Controller;

import com.eduardomissaka.itau_compra_programada.dtos.ClientDTO;
import com.eduardomissaka.itau_compra_programada.services.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/clients")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @PostMapping(value = "/insert")
    public ResponseEntity<ClientDTO> insert(@RequestBody ClientDTO clientDTO){
        clientDTO = clientService.insert(clientDTO);
        return ResponseEntity.ok(clientDTO);
    }
}
