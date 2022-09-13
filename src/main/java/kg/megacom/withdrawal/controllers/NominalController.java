package kg.megacom.withdrawal.controllers;

import kg.megacom.withdrawal.service.NominalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/nominal")
public class NominalController {

    @Autowired
    private NominalService nominalService;


}
