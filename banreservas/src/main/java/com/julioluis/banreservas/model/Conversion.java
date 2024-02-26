package com.julioluis.banreservas.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Conversion {
    private double amountFrom;
    private double amountTo;
    private LocalDate conversionDate;
}
