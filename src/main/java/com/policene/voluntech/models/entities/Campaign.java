package com.policene.voluntech.models.entities;

import com.policene.voluntech.dtos.campaigns.CampaignRequestDTO;
import jakarta.persistence.*;

import java.util.Optional;

@Entity
@Table(name = "tb_campaigns")
public class Campaign {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String description;
    @ManyToOne
    @JoinColumn(name = "organization_id", nullable = false)
    private Organization organization;
    @Column(nullable = false)
    private Double goalAmount;
    private Double currentAmount;


    public Campaign(CampaignRequestDTO request, Organization organization) {
        this.name = request.name();
        this.description = request.description();
        this.goalAmount = request.goalAmount();
        this.currentAmount = 0.00;
        this.organization = organization;
    }

    public Campaign() {
        this.currentAmount = 0.00;
    }

    public void setCurrentAmount(Double currentAmount) {
        this.currentAmount = currentAmount;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setGoalAmount(Double goalAmount) {
        this.goalAmount = goalAmount;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setOrganization(Organization organization) {
        this.organization = organization;
    }

    public Double getCurrentAmount() {
        return currentAmount;
    }

    public String getDescription() {
        return description;
    }

    public Double getGoalAmount() {
        return goalAmount;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Organization getOrganization() {
        return organization;
    }
}
