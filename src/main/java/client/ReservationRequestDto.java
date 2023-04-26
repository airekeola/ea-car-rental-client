package client;

import java.time.LocalDate;

/**
 * @author bazz
 * Apr 24 2023
 * 18:24
 */
public class ReservationRequestDto {
    private String carType;
    private LocalDate startDate;
    private LocalDate endDate;
    private Long customerNumber;

    public ReservationRequestDto() {

    }

    public Long getCustomerNumber() {
        return customerNumber;
    }

    public void setCustomerNumber(Long customerNumber) {
        this.customerNumber = customerNumber;
    }

    public String getCarType() {
        return carType;
    }

    public void setCarType(String carType) {
        this.carType = carType;
    }

    public ReservationRequestDto(String carType, Long customerNumber) {
        this.carType = carType;
        this.customerNumber = customerNumber;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }
}