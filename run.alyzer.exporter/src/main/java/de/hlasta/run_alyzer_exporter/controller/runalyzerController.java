package de.hlasta.run_alyzer_exporter.controller;

import de.hlasta.run_alyzer_exporter.config.SpringDocCustomization;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import static de.hlasta.run_alyzer_exporter.config.SpringDocCustomization.*;

@RestController
@RequestMapping("/v1/runalyzer/")
public class runalyzerController {

    @Operation(summary = SpringDocCustomization.SUMMARY_GET_RUN_INFORMATIONS)
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Got Runner Informations"),
            @ApiResponse(responseCode = "400", description = "Bad Request",
                    content = @Content),
            @ApiResponse(responseCode = "404", description = "Not Found",
                    content = @Content),
            @ApiResponse(responseCode = "500", description = "Internal Server Error",
                    content = @Content)
    })
    @GetMapping("/get-run-informations")
    public Object getRunInformations() {
        return "Hello World";
    }

}
