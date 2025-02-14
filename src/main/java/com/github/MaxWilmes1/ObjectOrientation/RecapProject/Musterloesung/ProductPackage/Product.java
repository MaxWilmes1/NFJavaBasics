package com.github.MaxWilmes1.ObjectOrientation.RecapProject.Musterloesung.ProductPackage;

import lombok.Builder;
import lombok.With;

@Builder
@With
public record Product(
        String id,
        String name
) {
}
