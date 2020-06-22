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
public class Precio {
    @JsonProperty("idPrecio")
    private int idPrecio;
    @JsonProperty("descripcion")
    private String descripcion;
    @JsonProperty("monto")
    private double monto;
}
