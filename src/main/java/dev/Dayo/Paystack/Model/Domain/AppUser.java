package dev.Dayo.Paystack.Model.Domain;

import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import org.hibernate.annotations.CreationTimestamp;

import javax.xml.crypto.Data;

public class AppUser {

   @Id
    private Long id;

   @Column(name = "username", nullable = false)
    private String username;

   @Column(name = "name", nullable = false)
    private String name;

   @Column(name = "address", nullable = false)
    private String address;

   @CreationTimestamp
   @Temporal(TemporalType.TIMESTAMP)
   @Column(name = "created_on", updatable = false, nullable = false)
    private Data createOn;
}
