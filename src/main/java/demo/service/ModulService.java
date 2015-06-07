package demo.service;

import demo.domain.ModulInfo;
import demo.domain.Status;
import org.springframework.stereotype.Service;

/**
 * Created by Benjamin Haupt on 07.06.15.
 */
@Service
public class ModulService {

    private static final String FPA_MODULNUMMER = "B18";

    public ModulInfo ladeModulInfo(int fb, String mnr) {
        if (fb == 3 && FPA_MODULNUMMER.equalsIgnoreCase(mnr)) {
            return new ModulInfo(FPA_MODULNUMMER, 5, "4 SWS (2 SWS SU + 2 SWS Ü)", 3, Status.PFLICHT);
        } else {
            throw new IllegalStateException("Fachbereich oder Modulnummer unbekannt");
        }
    }
}
