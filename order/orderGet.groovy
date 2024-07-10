package contracts.rest

org.springframework.cloud.contract.spec.Contract.make {
    request {
        method ''
        url ('/')
        headers {
            contentType(applicationJsonUtf8())
        }
        body(
                id: 1,
                userId: 1,
                productId: 1,
                qty: 5,
                productName: TV,
        )
    }
    response {
        status 200
        body(
                id: 1,
                stock: 5,
        )
        bodyMatchers {
            jsonPath('$.id', byRegex(nonEmpty()).asLong())
            jsonPath('$.stock', byRegex(nonEmpty()).asInteger())
        }
        headers {
            contentType(applicationJsonUtf8())
        }
    }
}

