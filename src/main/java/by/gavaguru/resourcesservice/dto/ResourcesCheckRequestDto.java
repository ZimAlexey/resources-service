package by.gavaguru.resourcesservice.dto;

import java.time.LocalDate;

public record ResourcesCheckRequestDto(
        Long requestId,
        String type,
        String name,
        String surname,
        String cvUuid,
        LocalDate periodFrom,
        LocalDate periodTo
) {

}
