package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage;

import lombok.Builder;

@Builder
public record Product(
        String id,
        String name
) {
}
