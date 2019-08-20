package org.acme.rest

import javax.validation.constraints.NotEmpty
import javax.validation.constraints.NotNull

data class Fruit(
        @field:NotNull
        @field:NotEmpty
        var name: String = ""
)