package com.julio.luis.banpopular.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ConversionResponse {
    private double amountTo;
    private LocalDate conversionDate;
}
