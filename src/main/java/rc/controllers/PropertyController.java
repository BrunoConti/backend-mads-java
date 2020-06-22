package rc.controllers;

import com.fasterxml.jackson.core.JsonProcessingException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import rc.entities.property.Property;
import rc.services.PropertyService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping()
    public ResponseEntity createProperty(@Valid @RequestBody Property property) throws JsonProcessingException {
        return ResponseEntity.ok(propertyService.createProperty(property));
    }

    @GetMapping("/{id}")
    public @ResponseBody
    Property getProperty(@PathVariable(value = "id") int id) {
        return propertyService.getById(id);
    }

    @GetMapping("/properties")
    public @ResponseBody
    List<Property> getAllProperty() {
        return propertyService.getAll();
    }

    @DeleteMapping("/{id}")
    public @ResponseBody
    ResponseEntity deleteProperty(@PathVariable(value = "id") int id) {
        propertyService.deleteProperty(id);
        return ResponseEntity.ok("Deleted the property " + id);
    }

    @DeleteMapping("/properties")
    public @ResponseBody
    ResponseEntity deleteAllProperties() {
        propertyService.deleteAll();
        return ResponseEntity.ok("Deleted all properties");
    }
}
