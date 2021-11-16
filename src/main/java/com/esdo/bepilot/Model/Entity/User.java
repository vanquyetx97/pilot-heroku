package com.esdo.bepilot.Model.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "users")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(columnDefinition = "VARCHAR(100)")
    private String userKey;

    @Column(columnDefinition = "VARCHAR(100)")
    private String avatar;

    @Column(columnDefinition = "VARCHAR(100)")
    private String name;

    @Column(columnDefinition = "VARCHAR(100)")
    private String phone;

    @Column
    private BigDecimal amountMoneyReceive;

    @Column
    private BigDecimal moneyWithdrawn;

    @Column
    private BigDecimal moneyRemaining;

    @Column
    private BigDecimal numberOfMissionDone;

    @OneToMany(mappedBy = "userId",cascade = CascadeType.ALL)
    private List<MissionDetail> missionDetails;
}
