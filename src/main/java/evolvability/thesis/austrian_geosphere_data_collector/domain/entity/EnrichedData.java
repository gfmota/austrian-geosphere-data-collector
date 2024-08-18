package evolvability.thesis.austrian_geosphere_data_collector.domain.entity;

import java.util.Map;

public record EnrichedData(Header header, Map<String, Object> metadata, Object data) {
}