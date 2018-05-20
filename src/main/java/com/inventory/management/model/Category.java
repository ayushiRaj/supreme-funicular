package com.inventory.management.model;

import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;

import lombok.Data;

@Embeddable
public @Data class Category {

	@Enumerated(EnumType.STRING)
	private ClothingType clothingType;
	
	@Enumerated(EnumType.STRING)
	private ClothingStyle clothingStyle;
	
}
