package com.esdo.bepilot.Model.Response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class MissionResponse {

    private Long id;
    private String missionKey;
    private String name;
    private String communication;
    private String missionType;
    private Integer quantity;
    private Integer quantityMade;
    private String keyWord;
    private String link;
    private Long customerId;
    private List<MissionDetailResponse> missionDetails;
    private BigDecimal priceUnit;
    private BigDecimal moneyReceived;
}
