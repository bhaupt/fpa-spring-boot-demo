package demo.web;

import demo.domain.ModulInfo;
import demo.service.ModulService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

/**
 * Created by Benjamin Haupt on 07.06.15.
 */
@RestController
public class ModulController {

    @Autowired
    private ModulService modulService;

    @RequestMapping(method = RequestMethod.GET, value = "fachbereich/{fb}/modulnummer/{mnr}")
    @ResponseStatus(HttpStatus.OK)
    public ModulInfo ladeModulInfo(@PathVariable int fb, @PathVariable String mnr) {
        return modulService.ladeModulInfo(fb, mnr);
    }
}
