package com.parth.consumerestwebservice.vo;

public class Menu {
	private Long id;
	private String short_name;
	private String name;
	private String description;
	private Double price_small;
	private Double price_large;
	private String small_portion_name;
	private String large_portion_name;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getShort_name() {
		return short_name;
	}
	public void setShort_name(String short_name) {
		this.short_name = short_name;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Double getPrice_small() {
		return price_small;
	}
	public void setPrice_small(Double price_small) {
		this.price_small = price_small;
	}
	public Double getPrice_large() {
		return price_large;
	}
	public void setPrice_large(Double price_large) {
		this.price_large = price_large;
	}
	public String getSmall_portion_name() {
		return small_portion_name;
	}
	public void setSmall_portion_name(String small_portion_name) {
		this.small_portion_name = small_portion_name;
	}
	public String getLarge_portion_name() {
		return large_portion_name;
	}
	public void setLarge_portion_name(String large_portion_name) {
		this.large_portion_name = large_portion_name;
	}
	
	@Override
    public String toString() {
        return "{" +
                "id=" + id +
                ", short_name='" + short_name + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price_small='" + price_small + '\'' +
                ", price_large='" + price_large + '\'' +
                ", small_portion_name='" + small_portion_name + '\'' +
                ", small_portion_name='" + small_portion_name +"},\n ";
    }
}
