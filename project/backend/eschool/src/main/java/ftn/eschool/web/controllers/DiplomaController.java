package ftn.eschool.web.controllers;
import ftn.eschool.services.DiplomaService;
import ftn.eschool.web.dtos.DiplomaDto;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequiredArgsConstructor

@RestController
@RequestMapping("diplomas")
public class DiplomaController {

    private final DiplomaService diplomaService;

    @GetMapping("person/{personUCN}")
    public DiplomaDto getDiploma(@PathVariable("personUCN") String ucn) {
        return diplomaService.findStudentByUCN(ucn);
    }

}
