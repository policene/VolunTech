package com.policene.voluntech.dtos.organization;

import com.policene.voluntech.models.entities.Organization;

public record OrganizationResponseDTO(
        Long id,
        String email,
        String organizationName,
        String cnpj,
        String phone,
        String cep
) {

    public OrganizationResponseDTO(Organization organization) {
        this(organization.getId(), organization.getEmail(), organization.getOrganizationName(), organization.getCnpj(), organization.getPhone(), organization.getCep());
    }

}
