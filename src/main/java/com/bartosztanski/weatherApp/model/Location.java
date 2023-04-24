package com.bartosztanski.weatherApp.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "locations")
public class Location {
	
	@Id
	@GeneratedValue (strategy = GenerationType.IDENTITY)
    @Column(name = "id")
	private Long id;
	@Column(name = "name", columnDefinition = "nvarchar(255)", nullable = false)
	private String name;
	private String country;
	private double latitude;
	private double longitude;
	private String timeZone;
}
