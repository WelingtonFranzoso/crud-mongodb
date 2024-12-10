package com.franzoso.crud_mongodb.api.response;

public record AddressResponseDTO(String street,

                                 Long number,

                                 String neighborhood,

                                 String addressComplement,

                                 String city,

                                 String zipCode) {
}
