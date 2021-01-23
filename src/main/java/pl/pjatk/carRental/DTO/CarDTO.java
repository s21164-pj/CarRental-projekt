package pl.pjatk.carRental.DTO;

public class CarDTO {
    private Long id;
    private String mark;
    private String model;
    private String color;
    private Integer productionYear;
    private Double pricePerDay;
    private Boolean isAvailable;
    private String ownerName;

    public CarDTO(String mark, String model, String color, Integer productionYear, Double pricePerDay, Boolean isAvailable, String ownerName) {
        this.mark = mark;
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
        this.pricePerDay = pricePerDay;
        this.isAvailable = isAvailable;
        this.ownerName = ownerName;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CarDTO() {
    }

    public String getMark() {
        return mark;
    }

    public void setMark(String mark) {
        this.mark = mark;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    public Double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(Double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }

    public Boolean getAvailable() {
        return isAvailable;
    }

    public void setAvailable(Boolean available) {
        isAvailable = available;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
}
