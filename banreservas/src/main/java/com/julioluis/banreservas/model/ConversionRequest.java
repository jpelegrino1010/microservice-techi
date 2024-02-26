package com.julioluis.banreservas.model;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ConversionRequest {
    private LocalDate transactionDate;
}
