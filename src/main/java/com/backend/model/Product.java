package com.backend.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by abin on 12/12/2017.
 */
@Entity
@Table(name="product")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Product implements Serializable{

    private static long serialVersionUID=1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int productId;
    private String productName;
    private long price;
}
