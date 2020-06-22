package rc.entities.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.mongodb.core.mapping.Document;

@Builder
@Getter
@Setter
@ToString
@Document
public class Amenities {
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("valor")
    private String valor;
}
