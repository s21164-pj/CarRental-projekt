package pl.pjatk.carRental.DTO;

public class CustomerDTO {
    private Long id;
    private String name;
    private Double wallet;
    private String ownedCar;

    public CustomerDTO(String name, double wallet, String ownedCar) {
        this.name = name;
        this.wallet = wallet;
        this.ownedCar = ownedCar;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getWallet() {
        return wallet;
    }

    public void setWallet(Double wallet) {
        this.wallet = wallet;
    }

    public String getOwnedCar() {
        return ownedCar;
    }

    public void setOwnedCar(String ownedCar) {
        this.ownedCar = ownedCar;
    }
}
