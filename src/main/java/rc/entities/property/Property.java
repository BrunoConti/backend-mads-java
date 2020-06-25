package rc.entities.property;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.springframework.core.io.Resource;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import rc.entities.Usuario;

import java.util.Date;
import java.util.List;

@Builder
@Getter
@Setter
@ToString
@Document

public class Property {
    @Id
    private String propertyId;
    @JsonProperty("id")
    private int id;
    @JsonProperty("habitaciones")
    private int habitaciones;
    @JsonProperty("fechaPublicacion")
    private Date fechaPublicacion;
    @JsonProperty("lat")
    private String lat;
    @JsonProperty("longitud")
    private String longitud;
    @JsonProperty("usuario")
    private Usuario usuario;
    @JsonProperty("amenities")
    private List<Amenities> amenities;
    @JsonProperty("precios")
    private List<Precio> precios;
    @JsonProperty("images")
    private List<String> images;
}
