package rc.entities;

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

public class Usuario {
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("rol")
    private int rol;
}
