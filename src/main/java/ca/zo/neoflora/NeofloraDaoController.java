package ca.zo.neoflora;

import io.micronaut.http.annotation.*;

@Controller("/neofloraDao")
public class NeofloraDaoController {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}