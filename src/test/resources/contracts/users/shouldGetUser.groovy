package userservice

import org.springframework.cloud.contract.spec.Contract

Contract.make {
    description("When a GET request with a User is made, the created user's ID is returned")
    request {
        method 'GET'
        url '/avengers/users/42'
    }
    response {
        status 200
        body(
                id: 42,
                firstName: "Arthur",
                lastName: "Dent",
        )
        headers {
            contentType(applicationJson())
        }
    }
}