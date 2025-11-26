package by.gavaguru.resourcesservice.dto;

public record ResourcesCheckResponseDto(
        Long id,
        Long requestId,
        boolean passed
) {

}
