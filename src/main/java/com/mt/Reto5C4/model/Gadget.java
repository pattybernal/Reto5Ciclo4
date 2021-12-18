package com.mt.Reto5C4.model;

/**
 * @author  Olga Patricia Bernal
 * @since   2021-12-14
 */
import org.springframework.data.annotation.Id;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Document(collection = "gadgets")
public class Gadget {
   @Id
    private Integer id;
    private String brand;
    private String category;
    private String name;
    private String description;
    private double price;
    private boolean availability = true;
    private int quantity;
    private String photography;
}
