package by.gavaguru.resourcesservice.controller;

import by.gavaguru.resourcesservice.dto.ResourcesCheckRequestDto;
import by.gavaguru.resourcesservice.dto.ResourcesCheckResponseDto;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1/resources")
public class ResourcesController {
    @PostMapping("/check")
    @ResponseStatus(HttpStatus.CREATED)
    public ResourcesCheckResponseDto check(@RequestBody ResourcesCheckRequestDto request) {
        // Мок-логика: всегда говорим, что ресурс доступен
        return new ResourcesCheckResponseDto(
                10L,              // захардкоженный id запроса на стороне resources-service
                request.requestId(),
                true              // всегда passed = true
        );
    }
}
