package rc.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import rc.entities.property.Property;
import rc.repositories.PropertyRepository;

import java.util.List;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property createProperty(Property property) {

        return propertyRepository.save(
                Property.builder()
                        .id(property.getId())
                        .titulo(property.getTitulo())
                        .habitaciones(property.getHabitaciones())
                        .fechaPublicacion(property.getFechaPublicacion())
                        .lat(property.getLat())
                        .longitud(property.getLongitud())
                        .usuario(property.getUsuario())
                        .ubicacion(property.getUbicacion())
                        .amenities(property.getAmenities())
                        .precios(property.getPrecios())
                        .images(property.getImages())
                        .build()
        );
    }
    public Property getById(int id) {
        return propertyRepository.findById(id);
    }

    public List<Property> getAll() {
        return propertyRepository.findAll();
    }

    public Property updateProperty(Property property) {

        Property p = propertyRepository.findById(property.getId());
        p.setHabitaciones(property.getHabitaciones());
        p.setFechaPublicacion(property.getFechaPublicacion());
        p.setLat(property.getLat());
        p.setLongitud(property.getLongitud());
        p.setUsuario(property.getUsuario());
        p.setAmenities(property.getAmenities());
        p.setPrecios(property.getPrecios());
        return propertyRepository.save(p);
    }

    // Delete op
    public void deleteAll() {
        propertyRepository.deleteAll();
    }

    public void deleteProperty(int id) {
        Property p = propertyRepository.findById(id);
        propertyRepository.delete(p);
    }

}
